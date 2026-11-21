#!/usr/bin/env python3
"""Exporta os roteiros binários originais do JAR sem atribuir significados não verificados."""
import base64
import json
import struct
import sys
import zipfile
from pathlib import Path

jar = Path(sys.argv[1] if len(sys.argv) > 1 else "Devil_240x320.jar")
dest = Path(sys.argv[2] if len(sys.argv) > 2 else "original-data")
dest.mkdir(parents=True, exist_ok=True)

with zipfile.ZipFile(jar) as archive:
    for number in (0, 1):
        data = archive.read(f"pack{number}.bin")
        if len(data) < 6:
            raise ValueError(f"pack{number}: cabeçalho incompleto")
        count = struct.unpack_from(">H", data, 0)[0]
        header_end = 2 + (count + 1) * 4
        if header_end > len(data):
            raise ValueError(f"pack{number}: tabela de offsets incompleta")
        offsets = struct.unpack_from(f">{count + 1}I", data, 2)
        if not all(header_end <= x <= len(data) for x in offsets):
            raise ValueError(f"pack{number}: offset fora do arquivo")
        if any(a > b for a, b in zip(offsets, offsets[1:])):
            raise ValueError(f"pack{number}: offsets fora de ordem")
        entries = []
        for index in range(count):
            blob = data[offsets[index]:offsets[index + 1]]
            entries.append({
                "index": index,
                "offset": offsets[index],
                "length": len(blob),
                "base64": base64.b64encode(blob).decode("ascii"),
            })
        result = {
            "source": f"Devil_240x320.jar/pack{number}.bin",
            "format": "original-binary-entries",
            "byteOrder": "big-endian",
            "count": count,
            "entries": entries,
            "warning": "Dados originais preservados; sem interpretação semântica presumida.",
        }
        (dest / f"pack{number}.json").write_text(
            json.dumps(result, ensure_ascii=False, separators=(",", ":")) + "\n",
            encoding="utf-8",
        )
        print(f"pack{number}: {count} entradas, {len(data)} bytes")
