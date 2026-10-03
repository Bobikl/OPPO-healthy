package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class l0k extends bxb {
    public static final int FractionalSystemTimestampFieldNum = 2;
    public static final int FractionalTimestampFieldNum = 0;
    public static final int LocalTimestampFieldNum = 3;
    public static final int SystemTimestampFieldNum = 1;
    public static final int SystemTimestampMsFieldNum = 5;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 4;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("timestamp_correlation", 162);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT16;
        bxbVar.e(new w97("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97("system_timestamp", 1, 134, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("fractional_system_timestamp", 2, 132, 32768.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97("local_timestamp", 3, 134, 1.0d, 0.0d, "s", false, Profile$Type.LOCAL_DATE_TIME));
        bxbVar.e(new w97("timestamp_ms", 4, 132, 1.0d, 0.0d, "ms", false, profile$Type2));
        bxbVar.e(new w97("system_timestamp_ms", 5, 132, 1.0d, 0.0d, "ms", false, profile$Type2));
    }

    public l0k(bxb bxbVar) {
        super(bxbVar);
    }
}
