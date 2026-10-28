# D01：健康小卡、详情和公共控制审查

日期：2026-10-24；基线为当前 1.0.114 源码。方式：源码/调用顺序核对，复核上一批同源码隔离复现证据；没有重新进行手机操作、性能基准或运行时整改。自审，无独立评审者。

后续入口追踪更正：睡眠趋势 metric=6 在 onUiCreate 先跳转 SleepDetailActivity 并 finish，原表达式求值没有证明实际入口有错。原始腕温确有问题；本轮已将日历改为显式指标。原审查下表描述的是 1.0.114 旧实现，当前整改与证据见 [整改记录](REMEDIATION-20261024.md)。

## 入口与已共用机制

11 种小卡：健康趋势、心率、睡眠、血氧、腕温、身心状态、放松、日照、体重、血糖、睡眠呼吸暂停。它们使用 7 类详情控制器，加上原始腕温与每日活动两类，共 9 类：`HeartDetailActivity`、`SleepDetailActivity`、`VitalsDetailActivity`、`WellnessDetailActivity`、`AdditionalHealthActivity`、`HealthTrendActivity`、`TrendMetricActivity`、`WristRawDetailActivity`、`DailyActivityDetailActivity`。趋势下钻指标与两个补充入口分别核对，不能仅以 Activity 数目当作卡片覆盖数。

已有共享层包括：`OfficialUiActivity` 资源/生命周期基础、`HealthDataManager` 快照与后台读、`HealthSnapshotWindow` 范围、`HealthPageTransition` 过渡、`HealthUi/HealthCalendar` 日期控件、`OfficialChartSupport` 图表基础设置、`OfficialHomeSmallCard` 首页绑定。应在这些共同机制上补清契约，避免另起一套平行实现。

目前仍有页面自行管理的监听注册、目标范围、加载状态、完整性判断、计时与构建。这些共同策略的分散造成了可重复的接入缺陷。

## 问题与消费者

| 编号 | 位置与已核实路径 | 受影响范围 / 整改边界 |
| --- | --- | --- |
| UI-001 | `HealthDataManager.java:24` 的 add 可立即回调旧快照；9 详情 onUiStart 在建立目标需求前注册；`HealthPageTransition.java:15` 仅 pending 时校验范围 | 同一天日快照进入月页等首次路径；公共会话必须先建立身份/目标范围，再注册并校验缓存 |
| UI-002 | `HealthCalendar.java:20` 用 instanceof/metric 猜类型；原始腕温与睡眠趋势 metric=6 回退 steps | 明确指标身份与可用日期口径，检查全部调用方；综合趋势不能随意用步数代表所有指标 |
| UI-003 | `VitalsDetailActivity.java:27` 仅血氧使用 locallyReady 加完整性校验；其余仍以 settled 为呈现门槛 | 其余页存在本地就绪但受后台任务拖延的代码路径；逐指标声明完整性，公共层决定缓存优先 |
| UI-004 | 9 类详情 build 中 setContentView；`SleepTimelineView.java:20` 单独复用并跳过相同数据 | 固定页面壳、状态区与绘制宿主可共用；图表适配器保留必要数据/绘制差异。实际逐卡帧耗时待测 |
| UI-005 | Vitals 顶部加载、WristRaw 底部状态、Trend 内容提示、部分页面 data=null 时进入空态 | 建立首次读取、缓存可用后台刷新、确认空日期、读取失败状态；布局稳定，覆盖 View/Compose/列表 |
| UI-006 | OfficialChartSupport 只覆盖部分设置；血氧、进度条和 Compose 动画分别维护；首页 2 秒、心率 3 秒检查及进入同步各自触发 | 允许不同图形需要不同交互，但必须声明；公共策略管理首次/切日/同日更新、刷新触发与释放 |

UI-001/002 已有隔离反例：

```text
ENTRY_WINDOW_AUDIT initialIncompleteAccepted=true selectedIncompleteRejected=true
CALENDAR_ROUTE_AUDIT rawWrist=steps sleepTrend=steps sleepDetail=sleep
```

前者调用实际 `HealthPageTransition`；后者提取当前 Java 路由表达式执行，未打开手机日历。入口、日志与 17 个源码指纹保留在 `analysis/card-consistency-v114/audit.py`、`EntryWindowAudit.java`、`audit.log`、`audit.json`。本批再次比较这些指纹与当前源码，结果记录 `analysis/engineering-governance/repository-checks.json`；不把历史输出冒充本轮重新执行。

UI-003 是等待条件差异与可达代码路径；除先前已测血氧，不声称其他每张卡均在真机复现相同时长。UI-004/006 的实际掉帧与触摸表现仍需同条件测量，代码不同不直接等于全部有同一种卡顿。

## 整改顺序与公共回归

1. 先修 UI-001/002：公共目标初始化、显式指标日历契约；以9类详情及全部指标入口做消费者矩阵。增加首次跨页、短窗口、未就绪、错误设备/时区与日历口径反例。
2. 然后处理 UI-003/005：共用选择/加载会话，区分目标日期与已呈现日期；完整缓存提前呈现，缺失数据不伪装为空日期，失效请求不覆盖新选择。
3. 再处理 UI-004/006：固定壳与更新策略，按 View、Compose、列表宿主分批核对。保留各图形数据语义，测量实际收益后继续，不一次重写所有图表。

同一组场景应参数化覆盖：首次进入、连续前后点按和反向选择、跨周期、完整缓存后台慢读、缺明细、同日更新、同数据不重复绘制、离开返回、设备/时区变化、日历记录标记、状态区不挤动图表和生命周期退订。

1.0.114 的健康首页复用与血氧连续切换已有特定设备/场景证据，见 `analysis/health-performance-v114/`；这些结果不替代其他卡片验收。本批仍运行既有主机与 home 回归，结果由本批门禁日志标识；它们不是全部官方图表的 Android 渲染测试。
