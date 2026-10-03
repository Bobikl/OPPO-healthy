package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class li9 extends bxb {
    public static final int ProcessingIntervalFieldNum = 0;
    public static final int RespirationRateFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_respiration_data", 307);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, Profile$Type.UINT16));
        bxbVar.e(new w97("respiration_rate", 1, 131, 100.0d, 0.0d, "breaths/min", false, Profile$Type.SINT16));
    }

    public li9(bxb bxbVar) {
        super(bxbVar);
    }
}
