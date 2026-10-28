# 测试入口与适用范围

- `run_tests.py`：当前实际纯 Java 协议、策略、状态与文件检查。不能代替 Android 服务、数据库或真实设备验收。
- `run_health_home_tests.py`：实际管理器加隔离 Android/存储边界与 SQLite 查询检查；不读取真实健康数据库。
- `run_defensive_tests.py`：由 `run_tests.py` 调用，直接执行资源 API 分支、归属失败后的原包保留、云重试、服务回执、Cookie 清理和 OSA 读取的生产方法；平台边界使用隔离桩，不代表真机验收。JSON 使用已安装的 `org.json` 库，默认复用 Android Studio 的 `plugins/grazie/lib/org.json-json.jar`，其他安装位置通过 `JSON_JAR` 指定；不打包进应用。
- `test_quality_gate.py`：本地范围、记录、编码、失败退出、构建必需检查及检查中源码变化的反例。
- `verify_v106.py`、`verify_v108.py`、`verify_v109.py`：仅针对历史 1.0.6、1.0.8、1.0.9 的源码/旧 APK 检查，必须显式传 `--historical`，禁止优化模式；不作为当前交付验收。旧产物或源码不匹配时失败是正常保护，不应删除断言使之通过。
- `*Instrumentation.java`：Android 专用探针，范围各异，部分需要设备、真实连接或可写隔离库。运行前逐个审查其副作用、目标版本及输出；不可批量安装/执行后把它们全部算作通过。

当前构建须传本任务 `-Baseline`、`-ChangeRecord`；构建入口强制执行 self/host/home 三组本地检查。成功构建产生 APK 及 `.build.json` 清单，其中保存版本、APK 哈希和本次 preflight 证据路径。真实运行验收单列，不以打包成功替代。
