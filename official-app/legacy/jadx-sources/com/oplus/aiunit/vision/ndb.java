package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class ndb extends bxb {
    public static final int CalibratedMagXFieldNum = 5;
    public static final int CalibratedMagYFieldNum = 6;
    public static final int CalibratedMagZFieldNum = 7;
    public static final int MagXFieldNum = 2;
    public static final int MagYFieldNum = 3;
    public static final int MagZFieldNum = 4;
    public static final int SampleTimeOffsetFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("magnetometer_data", 208);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("sample_time_offset", 1, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("mag_x", 2, 132, 1.0d, 0.0d, "counts", false, profile$Type));
        bxbVar.e(new w97("mag_y", 3, 132, 1.0d, 0.0d, "counts", false, profile$Type));
        bxbVar.e(new w97("mag_z", 4, 132, 1.0d, 0.0d, "counts", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.FLOAT32;
        bxbVar.e(new w97("calibrated_mag_x", 5, 136, 1.0d, 0.0d, "G", false, profile$Type2));
        bxbVar.e(new w97("calibrated_mag_y", 6, 136, 1.0d, 0.0d, "G", false, profile$Type2));
        bxbVar.e(new w97("calibrated_mag_z", 7, 136, 1.0d, 0.0d, "G", false, profile$Type2));
    }

    public ndb(bxb bxbVar) {
        super(bxbVar);
    }
}
