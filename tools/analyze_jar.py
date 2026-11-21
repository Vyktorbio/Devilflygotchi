#!/usr/bin/env python3
"""Inventory a Java ME JAR without executing its code."""
import json, zipfile, hashlib, pathlib, struct, csv
ROOT=pathlib.Path(__file__).resolve().parent.parent
JAR=ROOT/"Devil_240x320.jar"
OUT=ROOT/"port-analysis"
OUT.mkdir(exist_ok=True)
def classify(name):
    ext=pathlib.PurePosixPath(name).suffix.lower()
    if ext==".class": return "java_bytecode"
    if ext in {".png",".jpg",".jpeg",".gif",".bmp"}: return "image"
    if ext in {".mid",".midi",".wav",".mp3",".amr",".mmf"}: return "audio"
    if ext in {".txt",".xml",".properties",".mf"}: return "text"
    return "other"
with zipfile.ZipFile(JAR) as z:
    entries=[]
    for i in z.infolist():
        if i.is_dir(): continue
        item={"name":i.filename,"bytes":i.file_size,"type":classify(i.filename)}
        if item["type"]=="image" and i.filename.lower().endswith(".png"):
            try:
                data=z.read(i)
                if data[:8]==b"\\x89PNG\\r\\n\\x1a\\n":
                    item["width"],item["height"]=struct.unpack(">II",data[16:24])
            except Exception: pass
        entries.append(item)
    manifest=next((x for x in z.namelist() if x.upper()=="META-INF/MANIFEST.MF"),None)
    manifest_text=z.read(manifest).decode("utf-8","replace") if manifest else ""
    (OUT/"manifest.txt").write_text(manifest_text,encoding="utf-8")
    resources=OUT/"resources"
    resources.mkdir(exist_ok=True)
    for i in z.infolist():
        if i.is_dir() or classify(i.filename) not in {"image","audio"}: continue
        target=(resources/i.filename).resolve()
        if not target.is_relative_to(resources.resolve()): continue
        target.parent.mkdir(parents=True,exist_ok=True)
        target.write_bytes(z.read(i))
summary={"jar":JAR.name,"sha256":hashlib.sha256(JAR.read_bytes()).hexdigest(),"entries":len(entries),"types":{k:sum(e["type"]==k for e in entries) for k in ["java_bytecode","image","audio","text","other"]},"classes":[e["name"] for e in entries if e["type"]=="java_bytecode"],"resources":[e for e in entries if e["type"] in {"image","audio"}]}
(OUT/"inventory.json").write_text(json.dumps(summary,ensure_ascii=False,indent=2),encoding="utf-8")
with (OUT/"files.csv").open("w",encoding="utf-8",newline="") as f:
    writer=csv.DictWriter(f,fieldnames=["name","bytes","type","width","height"])
    writer.writeheader()
    for e in entries: writer.writerow(e)
print(json.dumps({"entries":summary["entries"],"types":summary["types"]},indent=2))
