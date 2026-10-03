package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class wtf extends bxb {
    public static final int RespirationRateFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("respiration_rate", ixb.RESPIRATION_RATE);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("respiration_rate", 0, 131, 100.0d, 0.0d, "breaths/min", false, Profile$Type.SINT16));
    }

    public wtf(bxb bxbVar) {
        super(bxbVar);
    }
}
