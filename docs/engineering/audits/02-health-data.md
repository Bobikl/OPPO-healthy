# D02：健康存储与读取

2026-10-24；当前源码关键路径静态首审，自审。未操作真实数据库。范围：HealthArchive、HealthMetricsStore、HealthDataManager、OfficialHistoryStore、HealthSyncManager；行号与源码指纹见本批 `domain-evidence.json`。

## 所有权与应保留的机制

| 实现 | 职责与当前防护 |
| --- | --- |
| HealthArchive | 私有原始包、记录和派生每日活动；设备/类型/时间键；包与投影在事务内保存，内容修订驱动缓存失效 |
| HealthMetricsStore | 官方导入投影与范围 freshness；按 scope/设备读取，ensureZone 清理失效派生范围；不是云上传确认来源 |
| OfficialHistoryStore | 完整官方结构私有副本；current stage/manifest、只读查询、表结构/完整性核对、事务合并；未知身份不猜测归属 |
| HealthDataManager | 查询、导入协调及快照发布；分开本地快照与慢导入工作，按窗口/设备/时区/代次拒绝失效发布 |
| HealthSyncManager | 独立手表归档任务；共用既有通道，有运行互斥、分页/时限、连接代次检查，完成窗口后推进游标 |

这些库是不同来源/用途的数据所有者；整改前必须列明跨库提交与修订失效顺序，不能简单删除“看似重复”的副本。

## 发现与整改切口

DATA-001：HealthDataManager 的两个 `Executors.newSingleThreadExecutor` 无队列容量；requestRange 用 pending/代次去重，calendar 每次直接排队。单线程不等于队列有界。已过期的任务会在执行时检查 current，但慢任务仍可能使后续任务排队。尚未测得实际最大队列或证明某次卡顿由此导致。

先明确“最新页面请求合并、归档不可丢、日历可取消”的不同契约，再选择有界执行/合并方案；不能简单把线程池换大以掩盖竞争。公共管理器改动需覆盖全部详情、首页、日历及 historyChanged 消费者。

## 验证与下一步

本轮 home 固定入口运行实际管理器 34 项、隔离 SQL 19 项；纯 Java 范围/时间/协议回归另见 host 日志。它们没有验证 Android SQLite 所有事务、磁盘异常、全版本升级或原始包实际写入。

深审队列取消与背压、跨库失败顺序、版本 1→6 及投影升级、账号/设备切换、时区重建；用合成隔离库覆盖唯一键冲突、提交异常、重启恢复和游标不前移，再按授权做 Android 集成。此阶段不把任何真实旧健康记录重新归到新账号。
