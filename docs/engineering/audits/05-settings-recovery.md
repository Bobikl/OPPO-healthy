# D05：设置、权限与自动恢复

2026-10-24；关键路径静态首审，自审。范围：RelayConfig、SettingsActivity 的通知/防断连/诊断入口、ListenerRecovery、RootListenerCommands、BackgroundStart，以及 DeviceRepository 的状态聚合。没有执行 Root 或修改系统设置。

## 应保留的行为

RelayConfig 保存用户意图；通知使用权、组件 enabled、系统实际绑定与蓝牙就绪分别读取。ListenerRecovery 普通请求为 0/3/10 秒，15 秒结束判定，不能仅以 requestRebind 返回或 Root 命令退出 0 作为绑定成功。

自动 Root 需用户开关、普通恢复结束、权限/组件和独立通道等条件，每进程最多尝试一次；进程标志不应随页面重建复位。RootListenerCommands 固定本应用组件和数字用户，命令有 timeout 与恢复 trap。修复中断标记仅恢复本应用曾修改的组件。BackgroundStart 不创建无限看门狗，后台启动条件失败保留原设置并提示。

## SET-001：设置页承担过多操作职责

SettingsActivity 直接写配对参数、持有 transport、读取官方/权限状态、请求 Root 修复并定时刷新；不同 section 改入口时仍需理解整页副作用。RelayConfig 同时有轻量 preference 和配对/Root 相关能力，调用成本不宜只凭类名判断。

后续按已有 section 提取操作入口和只读状态聚合，页面绑定状态并表达操作；保留已有键、默认值、授权语义和恢复状态机。不要为界面搬移顺带改变实际系统权限或 Root 执行条件。已验证政策类继续共享，不能新增另一套页面条件表达式。

## 下一步验证

host 中 86 项恢复条件与 16 项 Root 命令检查是纯决策/脚本检查，未执行系统重绑。需按进程首次启动/Activity 重建区分，验证开关关闭、缺权限、官方状态未知、通道未就绪、普通恢复成功/失败、Root 超时/命令失败、回调延迟与进程中断。ROM/版本兼容须单列；不因静态条件齐全就宣布自动绑定已在当前手机验收。
