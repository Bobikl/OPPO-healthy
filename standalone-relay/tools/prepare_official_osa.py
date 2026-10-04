from pathlib import Path
import argparse, hashlib, json, os, subprocess, tempfile, zipfile
HERE=Path(__file__).resolve().parent
PIN='d8163ec849de6ee121171d1d1312b05f1500c8d4ec225c19f949042ae185aeaf'
def write(path,text):
    path.parent.mkdir(parents=True,exist_ok=True)
    path.write_text(text,encoding='utf-8')
    assert path.read_text(encoding='utf-8')==text
def sha(data): return hashlib.sha256(data).hexdigest()
def main():
    p=argparse.ArgumentParser(description='Prepare pinned OSA JNI runtime and libraries without duplicating shared UI classes.')
    p.add_argument('--apk',required=True,type=Path);p.add_argument('--jadx-jar',required=True,type=Path)
    p.add_argument('--java-home',required=True,type=Path);p.add_argument('--out',type=Path,default=HERE.parent/'official-osa')
    a=p.parse_args();a.apk=a.apk.resolve();a.jadx_jar=a.jadx_jar.resolve()
    if sha(a.apk.read_bytes())!=PIN: raise SystemExit('Official APK hash mismatch')
    java=a.java_home/'bin';out=a.out.resolve();out.mkdir(parents=True,exist_ok=True)
    def run(*args): subprocess.run(list(map(str,args)),check=True)
    with tempfile.TemporaryDirectory(prefix='oppo-osa-') as tmp:
        w=Path(tmp)
        run(java/'javac.exe','-J-Dfile.encoding=UTF-8','-encoding','UTF-8','-cp',a.jadx_jar,'-d',w,HERE/'RuntimeClosure.java',HERE/'RuntimeSubset.java',HERE/'ApiJar.java')
        cp=str(w)+os.pathsep+str(a.jadx_jar)
        run(java/'java.exe','-Xmx3g','-cp',cp,'RuntimeClosure',a.apk,HERE/'osa-seeds.txt',w/'closure')
        all_types=set((w/'closure/classes.txt').read_text(encoding='utf-8').splitlines())
        shared=set((HERE/'runtime-classes.txt').read_text(encoding='utf-8').splitlines())
        selected=sorted(all_types-shared)
        expected=(HERE/'osa-classes.txt').read_text(encoding='utf-8').splitlines()
        if selected!=expected: raise SystemExit('OSA class closure changed; review before packaging')
        external=(w/'closure/external-types.txt').read_text(encoding='utf-8').splitlines()
        if any(not s.startswith(('Ljava/','Ljavax/','Landroid/','Ldalvik/','Lorg/xml/','Lorg/w3c/')) for s in external):
            raise SystemExit('Unresolved OSA external class')
        run(java/'java.exe','-Xmx3g','-cp',cp,'RuntimeSubset',a.apk,HERE/'osa-classes.txt',out/'classes.dex')
        run(java/'java.exe','-Xmx3g','-cp',cp,'ApiJar',a.apk,HERE/'osa-classes.txt',out/'compile-only-api.jar',w/'unused-compat.jar')
        libraries={}
        with zipfile.ZipFile(a.apk) as src:
            for name in ('lib/arm64-v8a/liblibOsahsSDK.so','lib/arm64-v8a/libOSALib.so'):
                data=src.read(name);target=out/name;target.parent.mkdir(parents=True,exist_ok=True);target.write_bytes(data)
                assert target.read_bytes()==data
                libraries[name]={'sha256':sha(data),'bytes':len(data)}
        manifest={'sourceApkSha256':PIN,'classes':selected,'sharedClasses':len(all_types&shared),'dexSha256':sha((out/'classes.dex').read_bytes()),'libraries':libraries}
        write(out/'manifest.json',json.dumps(manifest,ensure_ascii=False,indent=2)+'\n')
    print('Prepared original OSA runtime:',len(selected),'classes')
if __name__=='__main__': main()