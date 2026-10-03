package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class lh9 extends bxb {
    public static final int BaselineBalancedLowerFieldNum = 4;
    public static final int BaselineBalancedUpperFieldNum = 5;
    public static final int BaselineLowUpperFieldNum = 3;
    public static final int LastNight5MinHighFieldNum = 2;
    public static final int LastNightAverageFieldNum = 1;
    public static final int StatusFieldNum = 6;
    public static final int TimestampFieldNum = 253;
    public static final int WeeklyAverageFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hrv_status_summary", ixb.HRV_STATUS_SUMMARY);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("weekly_average", 0, 132, 128.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("last_night_average", 1, 132, 128.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("last_night_5_min_high", 2, 132, 128.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("baseline_low_upper", 3, 132, 128.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("baseline_balanced_lower", 4, 132, 128.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("baseline_balanced_upper", 5, 132, 128.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("status", 6, 0, 1.0d, 0.0d, "", false, Profile$Type.HRV_STATUS));
    }

    public lh9(bxb bxbVar) {
        super(bxbVar);
    }
}
