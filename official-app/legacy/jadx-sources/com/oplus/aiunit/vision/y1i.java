package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class y1i extends bxb {
    public static final int MessageIndexFieldNum = 254;
    public static final int PartNumberFieldNum = 5;
    public static final int VersionFieldNum = 3;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("software", 35);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("version", 3, 132, 100.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("part_number", 5, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public y1i(bxb bxbVar) {
        super(bxbVar);
    }
}
