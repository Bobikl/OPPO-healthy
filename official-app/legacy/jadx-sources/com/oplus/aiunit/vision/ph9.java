package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class ph9 extends bxb {
    public static final int TimestampFieldNum = 253;
    public static final int ValueFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hrv_value", ixb.HRV_VALUE);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("value", 0, 132, 128.0d, 0.0d, "ms", false, Profile$Type.UINT16));
    }

    public ph9(bxb bxbVar) {
        super(bxbVar);
    }
}
