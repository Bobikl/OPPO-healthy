package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class fi9 extends bxb {
    public static final int EventIdFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_event", 315);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97(of5.ARG_EVENT_ID, 0, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
    }

    public fi9(bxb bxbVar) {
        super(bxbVar);
    }
}
