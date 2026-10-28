import sys
if not __debug__ or "--historical" not in sys.argv:
    raise SystemExit("Historical v1.0.9 checks only; pass --historical without Python optimization. Not current-release acceptance.")
from pathlib import Path
from io import BytesIO
from zipfile import ZipFile

root = Path(__file__).resolve().parents[1]
source = root / "app/src/main/java/com/example/opponotificationrelay"
for path in source.glob("*.java"):
    assert "\ufffd" not in path.read_text(encoding="utf-8"), path
observer = (source / "RootHealthObserver.java").read_text(encoding="utf-8")
assert '.invoke(am,observer,flags,cutpoint,"com.android.shell",selected)' in observer
assert 'revision!=uidChanges.revision()' in observer
assert 'request!=0 && uidChanges.pending()' in observer
assert 'uidChanges.signal()' in observer
assert 'publishState(request,reason)' in observer
with ZipFile(root.parent / "oppo-notification-relay-v1.0.9-debug.apk") as apk:
    with ZipFile(BytesIO(apk.read("assets/root-observer.jar"))) as helper:
        dex = helper.read("classes.dex")
        for name in (b"RootHealthObserver",b"ObserverStateGate",b"CoalescedRecheck"):
            assert name in dex, name
        assert b"MainActivity" not in dex
print("v1.0.9 UTF-8, integration and helper DEX closure checks passed")
