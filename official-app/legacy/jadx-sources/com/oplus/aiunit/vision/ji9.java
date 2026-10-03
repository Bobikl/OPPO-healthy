package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class ji9 extends bxb {
    public static final int HeartRateFieldNum = 2;
    public static final int ProcessingIntervalFieldNum = 0;
    public static final int StatusFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_heart_rate_data", 308);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, Profile$Type.UINT16));
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("status", 1, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("heart_rate", 2, 2, 1.0d, 0.0d, "bpm", false, profile$Type));
    }

    public ji9(bxb bxbVar) {
        super(bxbVar);
    }
}
