#!/usr/bin/env python3
"""Extract PNG chunks embedded in the game's proprietary pack*.bin files."""
import pathlib, re, struct, zipfile, json
ROOT=pathlib.Path(__file__).resolve().parent.parent
JAR=ROOT/"Devil_240x320.jar"
OUT=ROOT/"web-assets"
PNG=b"\x89PNG\r\n\x1a\n"
def extract_png(data,start):
    pos=start+8
    while pos+12<=len(data):
        length=struct.unpack(">I",data[pos:pos+4])[0]
        if length>len(data) or pos+12+length>len(data): return None
        kind=data[pos+4:pos+8]
        pos+=12+length
        if kind==b"IEND": return data[start:pos]
    return None
def main():
    OUT.mkdir(exist_ok=True)
    found=[]
    with zipfile.ZipFile(JAR) as z:
        for name in z.namelist():
            if not re.search(r"(?:^|/)pack\d+\.bin$",name): continue
            data=z.read(name)
            pack=pathlib.Path(name).stem
            for index,match in enumerate(re.finditer(re.escape(PNG),data)):
                png=extract_png(data,match.start())
                if png is None: continue
                target=OUT/f"{pack}_{index:03}.png"
                target.write_bytes(png)
                found.append({"file":target.name,"pack":pack,"offset":match.start(),"bytes":len(png)})
    (OUT/"manifest.json").write_text(json.dumps(found,indent=2),encoding="utf-8")
    print(f"Extracted {len(found)} PNG images from game packs into {OUT}")
if __name__=="__main__":main()
