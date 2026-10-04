package com.example.opponotificationrelay;
enum CloudCategory {
    ACTIVITY("activity","日常活动","步数、活动消耗、锻炼时长与活动次数"),
    WORKOUT("workout","运动记录","运动详情、轨迹与运动统计"),
    VITALS("vitals","心率与健康指标","心率、血氧、压力、HRV、心电与体征"),
    SLEEP("sleep","睡眠","睡眠分期、评分、心率与呼吸频率"),
    BREATHING("breathing","睡眠呼吸与鼾症","鼾声统计、异常片段与呼吸风险记录"),
    OTHER("other","其他健康记录","经期、放松、听力、颈椎与其他健康记录"),
    ARCHIVES("archives","健康档案","医疗报告、指标与档案附件"),
    SETTINGS("settings","个人资料与偏好","个人资料、健康目标与支持同步的偏好");
    final String key,title,description;
    CloudCategory(String key,String title,String description){this.key=key;this.title=title;this.description=description;}
}
