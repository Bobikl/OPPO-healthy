"""Host-side pure Java tests. No phone credentials or Health APK required."""
import pathlib
import subprocess
import os
import shutil
import sys
sys.stdout.reconfigure(encoding="utf-8")

ROOT = pathlib.Path(__file__).resolve().parents[1]
if os.environ.get("JAVA_HOME"):
    JAVA = pathlib.Path(os.environ["JAVA_HOME"]) / "bin"
else:
    JAVA = pathlib.Path(r"C:\Program Files (x86)\jdk-17.0.6+10\bin")
    if not JAVA.is_dir():
        executable = shutil.which("javac")
        if not executable:
            raise SystemExit("Set JAVA_HOME to JDK 17, or put javac/java on PATH.")
        JAVA = pathlib.Path(executable).resolve().parent
SOURCE = ROOT / "app/src/main/java/com/example/opponotificationrelay"
BUILD = ROOT / "tests/build"
BUILD.mkdir(exist_ok=True)
extra = [str(ROOT / "tests/ConnectionQueueTest.java"),str(ROOT / "tests/ResourcePolicyTest.java"),str(ROOT / "tests/UidOptimizationTest.java")]
extra.append(str(ROOT / "tests/ScreenFilterTest.java"))
extra.append(str(ROOT / "tests/RecoveryBoundaryTest.java"))
extra.append(str(ROOT / "tests/HealthReadWindowTest.java"))
extra.append(str(ROOT / "tests/HealthTimeTest.java"))
extra.append(str(ROOT / "tests/HealthChannelLockTest.java"))
names = ["HealthTime","HealthSnapshotWindow","HealthReadWindow","OafCrypto", "OafWire", "OafSession", "RelayPayloadEncoder", "RelayEvent", "HandoverPolicy", "ObserverMessage", "RelayIcon", "WatchIconBitmap", "PairingRecord", "HandoverNoticePolicy", "ScreenForwardPolicy", "StartupPolicy", "RootListenerCommands"]
names.extend(["ConnectionQueue", "NotificationSwitchPolicy", "NapQuietPolicy", "OafTraceMetadata", "MessageBudget", "ConnectionState", "SendDeadline", "BoundedWorker", "EventStatistics"])
extra.append(str(ROOT / "tests/NotificationSwitchTest.java"))
extra.append(str(ROOT / "tests/NotificationControlsTest.java"))
names.extend(["NotificationForwardPolicy","ActivityBridgePolicy","HealthMetricsData","WatchSleepProjection"])
extra.append(str(ROOT / "tests/HealthMetricsTest.java"))
names.append("OxygenChartData")
extra.append(str(ROOT / "tests/OxygenChartDataTest.java"))
extra.append(str(ROOT / "tests/SleepProjectionTest.java"))
extra.append(str(ROOT / "tests/ActivityBridgePolicyTest.java"))
extra.append(str(ROOT / "tests/OafTraceMetadataTest.java"))
extra.append(str(ROOT / "tests/NapQuietTest.java"))
extra.append(str(ROOT / "tests/NativeLaunchTest.java"))
extra.append(str(ROOT / "tests/MessageBudgetTest.java"))
extra.append(str(ROOT / "tests/ConnectionSafetyTest.java"))
extra.append(str(ROOT / "tests/BackgroundWorkTest.java"))
names.extend(["RollingLogSink", "ReconnectPolicy", "RetrySignal", "ObserverLaunch"])
names.extend(["CoalescedRecheck","ObserverStateGate"])
names.extend(["ObserverRegistration","PairingImportLaunch"])
names.extend(["OfficialSettingsPreview", "SettingsPreviewProtocol", "MmkvSnapshot"])
names.extend(["SettingsImportPlan","NapWritePolicy","ServiceLease"])
names.extend(["DeviceUiState","DeviceIdentity","DeviceTelemetry","DeviceStatusProtocol","OafDeviceChannel"])
names.extend(["HealthProto","HealthSyncProtocol","HealthSetting","HealthSettingsProtocol","SleepSettingsProtocol","OafHealthChannel"])
extra.append(str(ROOT / "tests/HealthSettingsTest.java"))
extra.append(str(ROOT / "tests/SleepSettingsTest.java"))
extra.append(str(ROOT / "tests/HealthSyncTest.java"))
extra.append(str(ROOT / "tests/DeviceUiStateTest.java"))
extra.append(str(ROOT / "tests/DeviceStatusTest.java"))
extra.append(str(ROOT / "tests/ServiceLeaseTest.java"))
extra.append(str(ROOT / "tests/NapWriteTest.java"))
extra.append(str(ROOT / "tests/SettingsImportTest.java"))
extra.extend([str(ROOT / "tests/SettingsPreviewTest.java"), str(ROOT / "tests/MmkvSnapshotTest.java")])
names.extend(["SnoreWavWriter", "OsaWatchProtocol"])
extra.append(str(ROOT / "tests/SnoreWavTest.java"))
extra.append(str(ROOT / "tests/OsaWatchProtocolTest.java"))
subprocess.run([str(JAVA / "javac.exe"), "-J-Dfile.encoding=UTF-8", "-encoding", "UTF-8", "-d", str(BUILD), *extra,
                *[str(SOURCE / (name + ".java")) for name in names], str(ROOT / "tests/OafProtocolTest.java"), str(ROOT / "tests/RootListenerCommandsTest.java")],
               check=True, encoding="utf-8")
subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.ScreenFilterTest"], check=True, timeout=15, encoding="utf-8")
subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.OafProtocolTest"], check=True, timeout=15, encoding="utf-8")
subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.RootListenerCommandsTest"], check=True, timeout=15, encoding="utf-8")
subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.ConnectionQueueTest"], check=True, timeout=15, encoding="utf-8")
subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.ResourcePolicyTest"], check=True, timeout=15, encoding="utf-8")
subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.UidOptimizationTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.NotificationSwitchTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.OafTraceMetadataTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.NapQuietTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.NativeLaunchTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.MessageBudgetTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.ConnectionSafetyTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.BackgroundWorkTest"], check=True, timeout=15, encoding="utf-8")

for test in ["SettingsPreviewTest", "MmkvSnapshotTest", "SettingsImportTest", "NapWriteTest", "ServiceLeaseTest"]:
    fixtures = BUILD / "settings-synthetic"
    fixtures.mkdir(exist_ok=True)
    subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                    "com.example.opponotificationrelay." + test, str(fixtures)],
                   check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.DeviceUiStateTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.DeviceStatusTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD),
                "com.example.opponotificationrelay.NotificationControlsTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.HealthSettingsTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.SleepSettingsTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.HealthSyncTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.ActivityBridgePolicyTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.HealthMetricsTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.SleepProjectionTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.OxygenChartDataTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.RecoveryBoundaryTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.HealthReadWindowTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.HealthTimeTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.HealthChannelLockTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.SnoreWavTest"], check=True, timeout=15, encoding="utf-8")

subprocess.run([str(JAVA / "java.exe"), "-Dfile.encoding=UTF-8", "-cp", str(BUILD), "com.example.opponotificationrelay.OsaWatchProtocolTest"], check=True, timeout=15, encoding="utf-8")
