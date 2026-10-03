package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class ly0 extends bxb {
    public static final int BaroPresFieldNum = 2;
    public static final int SampleTimeOffsetFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("barometer_data", 209);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("sample_time_offset", 1, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("baro_pres", 2, 134, 1.0d, 0.0d, "Pa", false, Profile$Type.UINT32));
    }

    public ly0(bxb bxbVar) {
        super(bxbVar);
    }
}
