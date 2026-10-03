"""Recreate the pinned UI dependencies from a locally supplied official APK."""
from pathlib import Path
import argparse
import hashlib
import json
import os
import shutil
import subprocess
import sys
import tempfile
import zipfile

sys.stdout.reconfigure(encoding="utf-8")
sys.stderr.reconfigure(encoding="utf-8")
HERE = Path(__file__).resolve().parent


def sha(path):
    return hashlib.sha256(path.read_bytes()).hexdigest()


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--apk", type=Path, required=True)
    parser.add_argument("--jadx-jar", type=Path, required=True, help="jadx-1.5.6-all.jar")
    parser.add_argument("--sdk", type=Path, default=os.environ.get("ANDROID_HOME"))
    parser.add_argument("--java-home", type=Path, default=os.environ.get("JAVA_HOME"))
    parser.add_argument("--out", type=Path, default=HERE.parent / "official-ui")
    args = parser.parse_args()
    if not args.sdk or not args.java_home:
        parser.error("Set ANDROID_HOME and JAVA_HOME, or pass --sdk and --java-home.")
    meta = json.loads((HERE / "ui-source.json").read_text(encoding="utf-8"))
    apk, jadx = args.apk.resolve(), args.jadx_jar.resolve()
    if sha(apk) != meta["sourceApkSha256"]:
        raise SystemExit("APK hash mismatch: this adapter targets the pinned official 6.6.7 APK.")
    java = args.java_home.resolve() / "bin"
    sdk = args.sdk.resolve()
    platform = sdk / "platforms/android-35/android.jar"
    d8 = sdk / "build-tools/36.0.0/d8.bat"
    for item in [jadx, java / "java.exe", java / "javac.exe", platform, d8]:
        if not item.is_file():
            raise SystemExit(f"Missing build dependency: {item}")
    output = args.out.resolve()
    output.mkdir(parents=True, exist_ok=True)

    def run(command):
        subprocess.run(list(map(str, command)), check=True)

    with tempfile.TemporaryDirectory(prefix="oppo-ui-source-") as temporary:
        work = Path(temporary)
        run([java / "javac.exe", "-J-Dfile.encoding=UTF-8", "-encoding", "UTF-8", "-cp", jadx, "-d", work,
             HERE / "ApiJar.java", HERE / "RuntimeClosure.java"])
        cp = str(work) + os.pathsep + str(jadx)
        api, compat = work / "api.jar", work / "compat.jar"
        run([java / "java.exe", "-Xmx3g", "-cp", cp, "ApiJar", apk, HERE / "runtime-classes.txt", api, compat])
        compat_dex = work / "compat-dex"
        compat_dex.mkdir()
        run([d8, "--min-api", "30", "--lib", platform, "--output", compat_dex, compat])
        runtime = work / "runtime"
        run([java / "java.exe", "-Xmx3g", "-cp", cp, "RuntimeClosure", apk,
             HERE / "runtime-seeds.txt", runtime, compat_dex / "classes.dex"])
        expected = (HERE / "runtime-classes.txt").read_text(encoding="utf-8").splitlines()
        actual = (runtime / "classes.txt").read_text(encoding="utf-8").splitlines()
        if actual != expected:
            raise SystemExit("Unexpected runtime closure: dependency pin needs review.")
        for item in runtime.glob("*.dex"):
            with item.open("rb") as stream:
                if stream.read(8) != b"dex\n039\x00":
                    raise SystemExit("DEX 039 is required for the original Compose interface methods.")
        resource = work / "official-ui-resources.apk"
        groups = meta["resourceTimestampGroups"]
        group_index = 0
        index = 0
        with zipfile.ZipFile(apk) as src, zipfile.ZipFile(resource, "w", zipfile.ZIP_DEFLATED, compresslevel=6) as dst:
            for source in src.infolist():
                name = source.filename
                if name not in ("AndroidManifest.xml", "resources.arsc") and not name.startswith(("res/", "assets/fonts/", "assets/coui_")):
                    continue
                if group_index + 1 < len(groups) and index >= groups[group_index + 1][0]:
                    group_index += 1
                info = zipfile.ZipInfo(name, tuple(groups[group_index][1]))
                info.create_system = 0
                method = zipfile.ZIP_STORED if name.endswith((".ogg", ".wav", ".mp3", ".ttf", ".otf")) else zipfile.ZIP_DEFLATED
                dst.writestr(info, src.read(source), compress_type=method, compresslevel=6)
                index += 1
        if sha(resource) != meta["resourceSha256"]:
            raise SystemExit("Resource archive does not match the pinned hash; no outputs were replaced.")
        with zipfile.ZipFile(apk) as src:
            for name, digest in meta["javaResources"].items():
                data = src.read(name)
                if hashlib.sha256(data).hexdigest() != digest:
                    raise SystemExit("Service loader descriptor mismatch")
                target = output / "java-resources" / name
                target.parent.mkdir(parents=True, exist_ok=True)
                target.write_bytes(data)
        (output / "assets").mkdir(exist_ok=True)
        (output / "dex").mkdir(exist_ok=True)
        expected_names = {item.name for item in runtime.glob("*.dex")}
        if any(item.name not in expected_names for item in (output / "dex").glob("*.dex")):
            raise SystemExit("Output contains extra DEX files; choose a fresh --out directory.")
        shutil.copy2(api, output / "compile-only-api.jar")
        shutil.copy2(resource, output / "assets" / resource.name)
        for item in runtime.glob("*.dex"):
            shutil.copy2(item, output / "dex" / item.name)
        manifest = {key: meta[key] for key in ("sourceApkSha256", "resourceSha256", "classes", "compatibilityOverrides", "javaResources")}
        manifest["dex"] = {item.name: sha(item) for item in sorted((output / "dex").glob("*.dex"))}
        text = json.dumps(manifest, ensure_ascii=False, indent=2) + "\n"
        target = output / "manifest.json"
        target.write_text(text, encoding="utf-8")
        assert target.read_text(encoding="utf-8") == text
    print(f"Prepared {len(actual)} original UI classes in {output}")


if __name__ == "__main__":
    main()
