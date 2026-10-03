package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class zh9 extends bxb {
    public static final int AccelXFieldNum = 2;
    public static final int AccelYFieldNum = 3;
    public static final int AccelZFieldNum = 4;
    public static final int SamplingIntervalFieldNum = 1;
    public static final int Timestamp32kFieldNum = 5;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_accelerometer_data", 302);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("sampling_interval", 1, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.SINT16;
        bxbVar.e(new w97("accel_x", 2, 131, 1.024d, 0.0d, "mG", false, profile$Type2));
        bxbVar.e(new w97("accel_y", 3, 131, 1.024d, 0.0d, "mG", false, profile$Type2));
        bxbVar.e(new w97("accel_z", 4, 131, 1.024d, 0.0d, "mG", false, profile$Type2));
        bxbVar.e(new w97("timestamp_32k", 5, 134, 1.0d, 0.0d, "", false, Profile$Type.UINT32));
    }

    public zh9(bxb bxbVar) {
        super(bxbVar);
    }
}
