package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class v8h extends bxb {
    public static final int AverageStressDuringSleepFieldNum = 15;
    public static final int AwakeTimeScoreFieldNum = 1;
    public static final int AwakeningsCountFieldNum = 11;
    public static final int AwakeningsCountScoreFieldNum = 2;
    public static final int CombinedAwakeScoreFieldNum = 0;
    public static final int DeepSleepScoreFieldNum = 3;
    public static final int InterruptionsScoreFieldNum = 14;
    public static final int LightSleepScoreFieldNum = 5;
    public static final int OverallSleepScoreFieldNum = 6;
    public static final int RemSleepScoreFieldNum = 9;
    public static final int SleepDurationScoreFieldNum = 4;
    public static final int SleepQualityScoreFieldNum = 7;
    public static final int SleepRecoveryScoreFieldNum = 8;
    public static final int SleepRestlessnessScoreFieldNum = 10;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("sleep_assessment", ixb.SLEEP_ASSESSMENT);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("combined_awake_score", 0, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("awake_time_score", 1, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("awakenings_count_score", 2, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("deep_sleep_score", 3, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("sleep_duration_score", 4, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("light_sleep_score", 5, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("overall_sleep_score", 6, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("sleep_quality_score", 7, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("sleep_recovery_score", 8, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("rem_sleep_score", 9, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("sleep_restlessness_score", 10, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("awakenings_count", 11, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("interruptions_score", 14, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("average_stress_during_sleep", 15, 132, 100.0d, 0.0d, "", false, Profile$Type.UINT16));
    }

    public v8h(bxb bxbVar) {
        super(bxbVar);
    }
}
