# D04：蓝牙、接管与通知

2026-10-24；关键路径静态首审，自审。范围：RfcommWearTransport、OfficialHealthMonitor、RelayNotificationListenerService、ConnectionQueue，并核对 HealthSyncManager、OsaAnalysisRepository、OsaWatchSync 调用边界。未连接设备或发送通知。

## 已核实机制

连接由 RfcommWearTransport 所有；DeviceLink 绑定 token/MAC/socket/queue。OfficialHealthMonitor 用 UID/Binder 事件与 epoch 核对官方存在状态；未知状态不直接取得独立所有权。发送前核对连接代次、所有权、目标设备和通知设置修订。

通知提取和发送使用有条数/字节上限的队列，后台处理再次核对 listener epoch 与有效期；断开清队列/会话关闭，蓝牙 connect 与发送有超时关闭路径。日志明确“已提交发送队列”不等于手表已收到。已有这些防护不应在重构时移除。

## LINK-001：请求编排分散

HealthSyncManager.read、OsaAnalysisRepository.read 和 OsaWatchSync.read 分别实现等待健康通道就绪、100ms 等待、CountDownLatch、连接代次、取消/截止时间与结果校验；分页策略又在各任务循环里。命令和时间预算确有差异，但共同前置条件和失效处理缺少统一请求所有者。

当前仍共用同一连接，并非每个任务各建蓝牙 socket。应先明确并发任务仲裁、交互优先、任务取消与已入通道请求的处理，再提取共同流程；协议请求/解析器保留独立。仅复制一份“更完整”的等待循环不能消除长期维护分叉。

另一个扩展限制：连接状态目前只有一个 setOnStatusChangeListener 槽位，由 SettingsActivity resume/pause 设置；设备页主要读快照。若后续改成多页面订阅，必须设计有所有者的注册/退订，不能再加一个覆盖同一槽位的消费者。本轮未证实普通单窗口导航发生监听丢失，不将其记为现有运行事故。

## 验证边界

本轮 host 回归包含连接/队列、预算、分片、恢复条件与协议检查；它们不能证明当前 ROM 的 UID/Binder、蓝牙 I/O 关闭或手表收到通知。下一步用参数化时序覆盖官方启动/退出/未知、旧回调、断开重连、通道忙、健康任务竞争及权限撤销，再按目标设备做受控验收，不干扰其他项目的手机。
