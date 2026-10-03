package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class pi9 extends bxb {
    public static final int ProcessingIntervalFieldNum = 0;
    public static final int StepsFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_step_data", 304);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, Profile$Type.UINT16));
        bxbVar.e(new w97("steps", 1, 134, 1.0d, 0.0d, "steps", false, Profile$Type.UINT32));
    }

    public pi9(bxb bxbVar) {
        super(bxbVar);
    }
}
