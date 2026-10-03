package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class e3c extends bxb {
    public static final int CurrentDayRestingHeartRateFieldNum = 1;
    public static final int RestingHeartRateFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("monitoring_hr_data", 211);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("resting_heart_rate", 0, 2, 1.0d, 0.0d, "bpm", false, profile$Type));
        bxbVar.e(new w97("current_day_resting_heart_rate", 1, 2, 1.0d, 0.0d, "bpm", false, profile$Type));
    }

    public e3c(bxb bxbVar) {
        super(bxbVar);
    }
}
