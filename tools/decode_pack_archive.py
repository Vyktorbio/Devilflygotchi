"""Decode PNG archives packNN.bin from Tamagotchi Monster Java ME.
Format established from packs 17, 19, 21 and 26.
"""
from pathlib import Path
import argparse
import json
import struct

PNG = b'\x89PNG\r\n\x1a\n'

def parse_pack(data):
    if len(data) < 6:
        raise ValueError("Truncated pack")
    count = int.from_bytes(data[:2], "big")
    end_table = 2 + 4 * count
    if not count or end_table > len(data):
        raise ValueError("Invalid offset table")
    offsets = [int.from_bytes(data[2+4*i:6+4*i], "big") for i in range(count)]
    if offsets != sorted(offsets) or offsets[0] < end_table or offsets[-1] > len(data):
        raise ValueError("Invalid offsets")
    entries = []
    for index, start in enumerate(offsets):
        end = offsets[index+1] if index+1 < count else len(data)
        if start == end:
            continue
        blob = data[start:end]
        if not blob.startswith(PNG):
            raise ValueError(f"Entry {index} is not a PNG")
        pos = len(PNG)
        while True:
            if pos + 12 > len(blob):
                raise ValueError(f"Truncated PNG {index}")
            size = struct.unpack_from(">I", blob, pos)[0]
            kind = blob[pos+4:pos+8]
            pos += 12 + size
            if pos > len(blob):
                raise ValueError(f"Invalid PNG chunk {index}")
            if kind == b"IEND":
                break
        if blob[pos:].strip(b'\x00'):
            raise ValueError(f"Unexpected bytes after PNG {index}")
        entries.append((index, blob[:pos]))
    return count, entries

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("packs", nargs="+", type=Path)
    parser.add_argument("--out", type=Path, default=Path("extracted"))
    args = parser.parse_args()
    args.out.mkdir(parents=True, exist_ok=True)
    manifest = []
    for path in args.packs:
        slots, entries = parse_pack(path.read_bytes())
        for slot, blob in entries:
            filename = f"{path.stem}_{slot:03}.png"
            (args.out / filename).write_bytes(blob)
            manifest.append({"pack":path.stem,"slot":slot,"file":filename,"bytes":len(blob)})
        print(f"{path.name}: {len(entries)} PNGs / {slots} slots")
    (args.out / "manifest.json").write_text(json.dumps(manifest,indent=2),encoding="utf-8")

if __name__ == "__main__":
    main()
