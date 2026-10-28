"""Read-back UTF-8 and integration checks; does not operate a phone."""
import sys
if not __debug__ or "--historical" not in sys.argv:
    raise SystemExit("Historical v1.0.6 checks only; pass --historical without Python optimization. Not current-release acceptance.")
from pathlib import Path
import xml.etree.ElementTree as ET

root = Path(__file__).resolve().parents[1]
source = root / "app/src/main/java/com/example/opponotificationrelay"
for name in ("MainActivity", "ListenerRecovery", "RecentsVisibility", "RootListenerCommands"):
    text = (source / (name + ".java")).read_text(encoding="utf-8")
    assert "\ufffd" not in text, name
main = (source / "MainActivity.java").read_text(encoding="utf-8")
assert "退到后台后隐藏最近任务卡片" in main
assert "Root 系统级重绑通知监听" in main
recent = (source / "RecentsVisibility.java").read_text(encoding="utf-8")
assert "setExcludeFromRecents(enabled(c))" in recent
assert "finishAndRemoveTask" not in recent
assert 'getBoolean(KEY,false)' in recent
recovery = (source / "ListenerRecovery.java").read_text(encoding="utf-8")
assert 'Process.myUid()/100000' in recovery
assert '系统仍未实际绑定' in recovery
manifest = ET.parse(root / "app/src/main/AndroidManifest.xml").getroot()
android = "{http://schemas.android.com/apk/res/android}"
assert manifest.find("application").get(android + "name") == ".RecentsVisibility"
print("UTF-8 and v1.0.6 integration checks passed")
