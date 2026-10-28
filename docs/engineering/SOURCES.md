# 参考资料与采用范围

查阅日期：2026-10-24。以下为公开的一手资料。项目规则是结合当前实现作出的约定，不把建议写成外部强制认证要求。

| 来源 | 采用的原则 | 本项目落点 |
| --- | --- | --- |
| [Android 架构建议](https://developer.android.com/topic/architecture/recommendations) | 关注点分离、明确状态来源、单向数据流；按应用实际采用 | 页面展示、会话控制、存储提交和连接服务明确所有者；不因文档示例引入框架或改语言 |
| [Google 代码审查标准](https://google.github.io/eng-practices/review/reviewer/standard.html) | 以代码健康和技术事实评判；设计取舍需要理由 | 可对需求和实现提出有证据的异议；不追求一次改完所有遗留问题 |
| [Google 小批变更](https://google.github.io/eng-practices/review/developer/small-cls.html) | 独立目标、小而完整的变更便于理解、审查和回退 | 一批一个可验证目标；不设机械行数上限，不把必要测试拆走 |
| [Google 审查内容](https://google.github.io/eng-practices/review/reviewer/looking-for.html) | 核对设计、功能、并发、复杂度和测试有效性 | 必查其他消费者、生命周期和错误路径；避免为未知将来设计通用框架 |
| [Android 测试策略](https://developer.android.com/training/testing/fundamentals/strategies) | 写清分层策略和测试范围，结合不同环境的检查 | 静态、隔离主机、Android 集成、真机与真实云验收分别记录 |
| [Android 性能基准概览](https://developer.android.com/topic/performance/benchmarking/benchmarking-overview) | 按启动、交互、动画等实际场景选取测量方式 | 区分方法耗时与完整用户操作；同条件前后对照，逐卡验证，保留设备与版本信息 |
| [NIST SSDF 1.1 最终版](https://csrc.nist.gov/pubs/sp/800/218/final) | 将安全实践纳入开发过程，分析根因和防止复发 | 身份隔离、依赖来源、隐私、错误处理纳入各领域审查；不声称本项目通过 SSDF 认证 |

这些资料不能证明现有代码已经符合规范，也不能替代对官方协议、数据语义与实际设备行为的验证。既有三层迁移设计另见根目录 `04-three-layer-architecture.md`，其目标选择继续保留；本批不执行迁移。
