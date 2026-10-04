from pathlib import Path
import hashlib,json,sys
root=Path(sys.argv[1]);pin=json.loads((Path(__file__).parent/'osa-source.json').read_text(encoding='utf-8'))
def check(path,digest):
 if not path.is_file() or hashlib.sha256(path.read_bytes()).hexdigest()!=digest: raise SystemExit('OSA dependency mismatch: '+str(path))
check(root/'classes.dex',pin['dexSha256'])
for name,info in pin['libraries'].items(): check(root/name,info['sha256'])
print('OSA runtime verified: 28 original classes, 2 arm64 libraries')
