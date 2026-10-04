from pathlib import Path
import hashlib,json,sys,zipfile
root=Path(sys.argv[1]);pin=json.loads((Path(__file__).parent/"account-source.json").read_text(encoding="utf-8"))
def check(path,digest):
 if not path.is_file() or hashlib.sha256(path.read_bytes()).hexdigest()!=digest:raise SystemExit("Account runtime mismatch: "+str(path))
check(root/"classes.dex",pin["dexSha256"])
for name,entry in pin["libraries"].items():check(root/name,entry["sha256"])
print("Account runtime verified:",pin["additionalClasses"],"original classes, encrypted configuration only")
