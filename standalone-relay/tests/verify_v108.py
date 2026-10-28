"""Static integration, UTF-8 read-back and packaged helper closure checks."""
import sys
if not __debug__ or "--historical" not in sys.argv:
    raise SystemExit("Historical v1.0.8 checks only; pass --historical without Python optimization. Not current-release acceptance.")
from pathlib import Path
from io import BytesIO
from zipfile import ZipFile

root = Path(__file__).resolve().parents[1]
source = root / "app/src/main/java/com/example/opponotificationrelay"
files = list(source.glob("*.java"))
for path in files:
    assert "\ufffd" not in path.read_text(encoding="utf-8"), path
transport = (source / "RfcommWearTransport.java").read_text(encoding="utf-8")
assert "Thread.sleep" not in transport and "queue.poll(1" not in transport
assert "retrySignal.await(retryCheckpoint,receiverRegistered ? 0 : 300000)" in transport
assert "run(token,generationQueue)" in transport
assert "queue.close(sendSession)" in transport
logger = (source / "FileLogger.java").read_text(encoding="utf-8")
assert "2*1024*1024,4096,5000" in logger
assert "文件日志不可用，保留系统日志" in logger
with ZipFile(root.parent / "oppo-notification-relay-v1.0.8-debug.apk") as apk:
    main = apk.read("classes.dex")
    with ZipFile(BytesIO(apk.read("assets/root-observer.jar"))) as helper:
        dex = helper.read("classes.dex")
        assert b"RootHealthObserver" in dex
        assert b"MainActivity" not in dex and b"RfcommWearTransport" not in dex
        assert len(dex) < len(main)
        print(f"Main DEX: {len(main)} bytes; helper DEX: {len(dex)} bytes")
print(f"UTF-8 read-back: {len(files)} Java files; v1.0.8 integration checks passed")
