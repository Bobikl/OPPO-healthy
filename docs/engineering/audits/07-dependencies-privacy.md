# D07：官方复用、原生、历史模块与隐私

2026-10-24；关键边界静态首审，自审。范围：Manifest、OfficialUiResources/Activity、AccountSdk、FileLogger、NativeObserver、native 构建/观察器入口、官方依赖 pin/校验脚本，并盘点历史 LSPosed 的 Manifest/HookEntry 入口。没有执行 Root 观察器、历史 Hook、抓包或原生构建。

## 已核实的防护

- 主应用 allowBackup=false；普通详情/录音/账号组件不导出，系统监听与 Job 服务声明对应绑定权限。历史 LSPosed 为独立包，声明 signature CONTROL 权限，不能与独立通知链路混成同一验收。
- 官方 UI 资源由固定 SHA-256 校验并隔离 Resources；异步失败在 OfficialUiActivity 显示重试；UI 类、Compose、账号 SDK 和 JNI 仍有固定版本内部 API/反射依赖。
- OSA、账号 DEX/arm64 库有 source.json pin，实际 build.ps1 调用对应 hash 校验并检查退出码。本轮只读重跑两个验证脚本，均退出 0；没有据此声明全部依赖无漏洞或跨 ABI 兼容。
- AccountSdk 在初始化前关闭已核实的日志/trace helper；FileLogger 轮换容量并限制临时详细日志时间。云请求使用 HTTPS、固定路径和受限错误元数据。静态关闭几个 helper 不能证明整个第三方 SDK 的所有运行数据流。
- 原生观察器要求 Root、限制目标 UID/参数并核对系统回调来源；Java/旧平台回退需要继续保留兼容验证。

## DEP-001：原生缓存复用缺少内容校验

NativeObserver.path 的已存在文件路径为 observer-安装更新时间；只要 isFile 且 length>0 就返回。与官方 UI 的 hash 校验相比，这里不能识别同版本非空损坏缓存。后续需在正确的构建/提取边界确定预期内容与恢复策略，并用错误非空文件做故障注入。

本轮没有证据证明其他应用可写该私有目录或存在实际攻击，不将完整性缺口描述为已发生的越权。

## 下一步深审

补齐所有 bundled 组件、来源/版本/哈希、用途、ABI、生成入口和更新条件的依赖清单；按实际网络/日志/导出路径审查数据类别、调用条件与保存范围，必要动态验证。源码中的 INTERNET/应用列表权限或 URL 不能单独证明实际上传。

未逐行审查第三方闭包和整个 native/LSPosed 分支；未进行漏洞扫描、许可证结论、所有导出组件 intent 模糊测试或全部 Android/ROM 兼容测试。依赖升级必须同时核对资源 ID、反射签名、DEX 闭包、JNI ABI、隐私开关和产品回归，不允许只换库文件后以编译通过交付。
