"""Rebuild the pinned account runtime. No application keys or user credentials are exported."""
from pathlib import Path
import argparse,hashlib,json,os,subprocess,tempfile,zipfile
HERE=Path(__file__).resolve().parent
PIN="d8163ec849de6ee121171d1d1312b05f1500c8d4ec225c19f949042ae185aeaf"
ASSETS=("open_req_feq_config.json","nx_no_content_dark.json","nx_no_content_light.json","nx_no_network_dark.json","nx_no_network_light.json")
def sha(data):return hashlib.sha256(data).hexdigest()
def write(path,text):
 path.parent.mkdir(parents=True,exist_ok=True);path.write_text(text,encoding="utf-8")
 assert path.read_text(encoding="utf-8")==text
def main():
 p=argparse.ArgumentParser(description=__doc__)
 p.add_argument("--apk",type=Path,required=True);p.add_argument("--jadx-jar",type=Path,required=True)
 p.add_argument("--java-home",type=Path,required=True);p.add_argument("--out",type=Path,default=HERE.parent/"official-account")
 a=p.parse_args();a.apk=a.apk.resolve();a.jadx_jar=a.jadx_jar.resolve();a.out=a.out.resolve()
 if sha(a.apk.read_bytes())!=PIN:raise SystemExit("Unsupported official APK")
 a.out.mkdir(parents=True,exist_ok=True);java=a.java_home/"bin"
 def run(*args):subprocess.run(list(map(str,args)),check=True)
 with tempfile.TemporaryDirectory(prefix="oppo-account-") as temporary:
  w=Path(temporary)
  run(java/"javac.exe","-J-Dfile.encoding=UTF-8","-encoding","UTF-8","-cp",a.jadx_jar,"-d",w,HERE/"RuntimeClosure.java",HERE/"RuntimeSubset.java",HERE/"ApiJar.java")
  cp=str(w)+os.pathsep+str(a.jadx_jar)
  run(java/"java.exe","-Xmx4g","-cp",cp,"RuntimeClosure",a.apk,HERE/"account-seeds.txt",w/"closure")
  closure=set((w/"closure/classes.txt").read_text(encoding="utf-8").splitlines())
  shared=set((HERE/"runtime-classes.txt").read_text(encoding="utf-8").splitlines())
  selected=sorted(closure-shared)
  if selected!=(HERE/"account-classes.txt").read_text(encoding="utf-8").splitlines():raise SystemExit("Account dependency selection changed")
  run(java/"java.exe","-Xmx3g","-cp",cp,"RuntimeSubset",a.apk,HERE/"account-classes.txt",a.out/"classes.dex")
  run(java/"java.exe","-Xmx3g","-cp",cp,"ApiJar",a.apk,HERE/"account-classes.txt",a.out/"compile-only-api.jar",w/"unused.jar")
 libraries={}
 with zipfile.ZipFile(a.apk) as archive:
  name="lib/arm64-v8a/libsqlcipher.so";data=archive.read(name)
  target=a.out/name;target.parent.mkdir(parents=True,exist_ok=True);target.write_bytes(data)
  libraries[name]={"sha256":sha(data),"bytes":len(data)}
  for name in ASSETS:
   data=archive.read("assets/"+name);json.loads(data.decode("utf-8"))
   target=HERE.parent/"app/src/main/assets"/name;target.parent.mkdir(parents=True,exist_ok=True);target.write_bytes(data)
 meta={"sourceApkSha256":PIN,"additionalClasses":len(selected),"dexSha256":sha((a.out/"classes.dex").read_bytes()),
       "configuration":"device-private encrypted migration; not bundled","libraries":libraries}
 write(a.out/"manifest.json",json.dumps(meta,indent=2)+"\n")
 print("Prepared account SDK:",len(selected),"original classes; no configuration credentials bundled")
if __name__=="__main__":main()
