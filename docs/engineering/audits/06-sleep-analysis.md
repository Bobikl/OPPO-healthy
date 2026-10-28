# D06：睡眠录音、文件与本机分析

2026-10-24；关键路径静态首审，自审。范围：SnoreRecordingService、SnoreCaptureSession、SnoreSessionStore、OsaNativeAdapter、OsaAnalysisRepository、OsaLocalAnalysis、OsaRiskAdapter，以及 OsaWatchSync 的读取边界。未启动麦克风或分析真实健康值。

## 所有权与现有防护

录音由不可导出的麦克风前台服务所有，START_NOT_STICKY；私有会话 slot 限定单活动录音，文件与会话 ID 对应，页面离开不擅自删除。捕获引擎检查空间、时长/样本、空读、客户端静音与无效输出，周期检查点；恢复 abandoned 会话按文件状态结束。WAV 使用 partial/最终文件流程。

OsaNativeAdapter 约束主线程、唯一 native owner、调用线程和固定帧长，finish/close 释放状态。本机分析与导入官方结果分开保存；OsaRiskAdapter 检查支持型号和结果形状，无效/不足结果不补造结论。复用官方算法与空默认资料不能单独证明健康结果准确性。

## ANALYSIS-001：分析身份未统一冻结时区

OsaLocalAnalysis.run 捕获设备和日期；refresh 与 load 又分别读取 ZoneId.systemDefault() 计算晚间范围，最后提交主要检查设备/日期/取消。若同一任务期间改变时区，阶段间输入区间可能不同，尚缺统一的冻结 zone/interval 提交校验。

这是可定位的静态风险，尚未做 Android 时区变更复现，不能声称已观察到错误诊断。下一批先定义一个分析上下文，冻结设备、日期、时区、区间及必要连接代次，覆盖每个保存/发布点；不要用修改进程全局默认时区的方式消除测试失败。

## 验证与剩余范围

本轮 host 包含 12 项 WAV、36 项 OSA 手表协议检查；没有执行完整录音引擎、JNI、真实 AudioRecord、长时间低存储、来电/静音、服务被杀、算法有效性或文件升级验证。后续用合成声音/输入验证状态与恢复，再做授权设备长时检查。真实呼吸风险结果的有效性需要额外证据，不把文件生成成功当作分析正确。
