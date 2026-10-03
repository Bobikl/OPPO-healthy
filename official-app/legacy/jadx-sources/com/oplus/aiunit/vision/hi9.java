package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class hi9 extends bxb {
    public static final int GyroXFieldNum = 2;
    public static final int GyroYFieldNum = 3;
    public static final int GyroZFieldNum = 4;
    public static final int SamplingIntervalFieldNum = 1;
    public static final int Timestamp32kFieldNum = 5;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_gyroscope_data", ixb.HSA_GYROSCOPE_DATA);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("sampling_interval", 1, 132, 1.0d, 0.0d, "1/32768 s", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.SINT16;
        bxbVar.e(new w97("gyro_x", 2, 131, 28.57143d, 0.0d, "deg/s", false, profile$Type2));
        bxbVar.e(new w97("gyro_y", 3, 131, 28.57143d, 0.0d, "deg/s", false, profile$Type2));
        bxbVar.e(new w97("gyro_z", 4, 131, 28.57143d, 0.0d, "deg/s", false, profile$Type2));
        bxbVar.e(new w97("timestamp_32k", 5, 134, 1.0d, 0.0d, "1/32768 s", false, Profile$Type.UINT32));
    }

    public hi9(bxb bxbVar) {
        super(bxbVar);
    }
}
