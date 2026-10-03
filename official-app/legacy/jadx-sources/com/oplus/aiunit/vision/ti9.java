package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class ti9 extends bxb {
    public static final int ProcessingIntervalFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final int ValueFieldNum = 1;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_wrist_temperature_data", 409);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("value", 1, 132, 1000.0d, 0.0d, "degC", false, profile$Type));
    }

    public ti9(bxb bxbVar) {
        super(bxbVar);
    }
}
