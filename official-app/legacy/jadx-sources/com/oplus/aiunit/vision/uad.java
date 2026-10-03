package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class uad extends bxb {
    public static final int PidDataSizeFieldNum = 4;
    public static final int PidFieldNum = 2;
    public static final int RawDataFieldNum = 3;
    public static final int StartTimestampFieldNum = 6;
    public static final int StartTimestampMsFieldNum = 7;
    public static final int SystemTimeFieldNum = 5;
    public static final int TimeOffsetFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("obdii_data", 174);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT16;
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, profile$Type2));
        bxbVar.e(new w97("time_offset", 1, 132, 1.0d, 0.0d, "ms", false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.BYTE;
        bxbVar.e(new w97("pid", 2, 13, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("raw_data", 3, 13, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("pid_data_size", 4, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        bxbVar.e(new w97("system_time", 5, 134, 1.0d, 0.0d, "", false, Profile$Type.UINT32));
        bxbVar.e(new w97("start_timestamp", 6, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("start_timestamp_ms", 7, 132, 1.0d, 0.0d, "ms", false, profile$Type2));
    }

    public uad(bxb bxbVar) {
        super(bxbVar);
    }
}
