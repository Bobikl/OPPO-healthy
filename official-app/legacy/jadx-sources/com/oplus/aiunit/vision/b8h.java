package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class b8h extends bxb {
    public static final int Average7DayDeviationFieldNum = 2;
    public static final int AverageDeviationFieldNum = 1;
    public static final int LocalTimestampFieldNum = 0;
    public static final int NightlyValueFieldNum = 4;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("skin_temp_overnight", ixb.SKIN_TEMP_OVERNIGHT);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("local_timestamp", 0, 134, 1.0d, 0.0d, "", false, Profile$Type.LOCAL_DATE_TIME));
        Profile$Type profile$Type = Profile$Type.FLOAT32;
        bxbVar.e(new w97("average_deviation", 1, 136, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("average_7_day_deviation", 2, 136, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("nightly_value", 4, 136, 1.0d, 0.0d, "", false, profile$Type));
    }

    public b8h(bxb bxbVar) {
        super(bxbVar);
    }
}
