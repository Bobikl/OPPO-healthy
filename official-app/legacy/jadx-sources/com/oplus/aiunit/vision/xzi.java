package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class xzi extends bxb {
    public static final int StressLevelTimeFieldNum = 1;
    public static final int StressLevelValueFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("stress_level", 227);
        h = bxbVar;
        bxbVar.e(new w97("stress_level_value", 0, 131, 1.0d, 0.0d, "", false, Profile$Type.SINT16));
        bxbVar.e(new w97("stress_level_time", 1, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
    }

    public xzi(bxb bxbVar) {
        super(bxbVar);
    }
}
