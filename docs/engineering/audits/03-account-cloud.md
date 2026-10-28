# D03：账号、云同步与合并

2026-10-24；关键路径静态首审，自审。已读 HealthAccountStore、AccountSdk、CloudSyncEngine/Triggers、CloudUpload、CloudStore 主要提交点、CloudNativeProducer、CloudPreferences、CloudHttp；未向官方服务器发送请求。

## 已核实的边界

- 会话由 HealthAccountStore 用私有加密 AtomicFile 保存；operation 与已提交 generation 分开。退出先持久 revoked，再撤销任务，防止 SDK 清理影响新会话。
- CloudSyncEngine 捕获任务 epoch、设置修订与账号代次；CloudStore 的最终提交检查资格，页面和游标保存有事务边界。未知上传结果不能靠缺少服务器记录判为未发送。
- CloudUpload 持久 SENDING 后发送，不可变 mutation payload/client ID 跨重试；回读同身份/业务字段与正服务器版本才 ACK。旧 ACK 不清除新修订，冲突/未知保留。
- 充电/Wi-Fi 监听建立当前基线后消费连接边沿，设置变化重置任务；进程终止期间的边沿无法由这些进程监听补放。开启类别不应触发立即同步。
- 自有 HTTPS 请求有限额/超时/截止时间、可选 Job Network、取消检查及关闭；固定账号 SDK 仅能前后校验默认网络和取消，不能假定内部可即时中断。

## 能力与限制

**CLOUD-001**：CloudNativeProducer.kind 明确仅映射 ACTIVITY、ACTIVITY_SUMMARY、HEART。其他已注册官方表的旧记录上传能力，不代表新手表原始记录可以转换上传。应逐类型列“本机采集→规范转换→上传→云确认→下载→本地合并”，每格保存证据；未接入项目不得标全同步完成。

**CLOUD-002**：CloudPreferences 在写前重新查询并合并局部字段，写后回读，确认后按原修订清除待同步；请求中未核实服务端 CAS。两端读到同一基线后再写仍存在窗口。后续先核实协议/产品冲突策略，再设计竞争测试，不能在客户端加锁后宣称跨设备原子性。

CLOUD_SYNC_STATUS.md、SYNC_REVIEW_FIXES.md 是标明版本的历史结果：上传恢复、隔离探针、真实下载与各类剩余项应分别保留。没有在本批重新执行旧真机探针，也未修改既有云端记录。

## 下一步验证

全部 DTO/业务键、加密/版本语义、旧队列迁移与附件仍需逐类型深审；随后以合成隔离库验证 ACK_UNKNOWN、旧 ACK/新编辑、取消/账号切换、重复页、事务失败和未知字段保留。真实云验收只能使用授权真实记录、先备份、分类型有限执行，并独立核对上传确认与回拉合并。已有 host 检查通过不能代替当前 Android CloudStore 事务或真实云验收。
