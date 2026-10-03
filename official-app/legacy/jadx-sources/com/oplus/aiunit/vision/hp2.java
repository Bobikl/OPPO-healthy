package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class hp2 extends bxb {
    public static final int HighValueFieldNum = 0;
    public static final int MessageIndexFieldNum = 254;
    public static final int NameFieldNum = 1;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("cadence_zone", 131);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("high_value", 0, 2, 1.0d, 0.0d, "rpm", false, Profile$Type.UINT8));
        bxbVar.e(new w97("name", 1, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public hp2(bxb bxbVar) {
        super(bxbVar);
    }
}
