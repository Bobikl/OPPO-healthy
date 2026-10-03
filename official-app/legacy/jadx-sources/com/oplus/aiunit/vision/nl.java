package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class nl extends bxb {
    public static final int AccelXFieldNum = 2;
    public static final int AccelYFieldNum = 3;
    public static final int AccelZFieldNum = 4;
    public static final int CalibratedAccelXFieldNum = 5;
    public static final int CalibratedAccelYFieldNum = 6;
    public static final int CalibratedAccelZFieldNum = 7;
    public static final int CompressedCalibratedAccelXFieldNum = 8;
    public static final int CompressedCalibratedAccelYFieldNum = 9;
    public static final int CompressedCalibratedAccelZFieldNum = 10;
    public static final int SampleTimeOffsetFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("accelerometer_data", 165);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("sample_time_offset", 1, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("accel_x", 2, 132, 1.0d, 0.0d, "counts", false, profile$Type));
        bxbVar.e(new w97("accel_y", 3, 132, 1.0d, 0.0d, "counts", false, profile$Type));
        bxbVar.e(new w97("accel_z", 4, 132, 1.0d, 0.0d, "counts", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.FLOAT32;
        bxbVar.e(new w97("calibrated_accel_x", 5, 136, 1.0d, 0.0d, b2n.f, false, profile$Type2));
        bxbVar.e(new w97("calibrated_accel_y", 6, 136, 1.0d, 0.0d, b2n.f, false, profile$Type2));
        bxbVar.e(new w97("calibrated_accel_z", 7, 136, 1.0d, 0.0d, b2n.f, false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.SINT16;
        bxbVar.e(new w97("compressed_calibrated_accel_x", 8, 131, 1.0d, 0.0d, "mG", false, profile$Type3));
        bxbVar.e(new w97("compressed_calibrated_accel_y", 9, 131, 1.0d, 0.0d, "mG", false, profile$Type3));
        bxbVar.e(new w97("compressed_calibrated_accel_z", 10, 131, 1.0d, 0.0d, "mG", false, profile$Type3));
    }

    public nl(bxb bxbVar) {
        super(bxbVar);
    }
}
