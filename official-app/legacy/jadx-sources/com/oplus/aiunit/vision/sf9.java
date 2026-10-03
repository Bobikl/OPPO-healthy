package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class sf9 extends bxb {
    public static final int HighBpmFieldNum = 1;
    public static final int MessageIndexFieldNum = 254;
    public static final int NameFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hr_zone", 8);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("high_bpm", 1, 2, 1.0d, 0.0d, "bpm", false, Profile$Type.UINT8));
        bxbVar.e(new w97("name", 2, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public sf9(bxb bxbVar) {
        super(bxbVar);
    }
}
