package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class moe extends bxb {
    public static final int HighValueFieldNum = 1;
    public static final int MessageIndexFieldNum = 254;
    public static final int NameFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("power_zone", 9);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("high_value", 1, 132, 1.0d, 0.0d, "watts", false, Profile$Type.UINT16));
        bxbVar.e(new w97("name", 2, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public moe(bxb bxbVar) {
        super(bxbVar);
    }
}
