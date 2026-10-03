package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class sb4 extends bxb {
    public static final int CapabilitiesFieldNum = 6;
    public static final int NameFieldNum = 5;
    public static final int SportFieldNum = 4;
    public static final int SubSportFieldNum = 7;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("course", 31);
        h = bxbVar;
        bxbVar.e(new w97("sport", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("name", 5, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("capabilities", 6, 140, 1.0d, 0.0d, "", false, Profile$Type.COURSE_CAPABILITIES));
        bxbVar.e(new w97("sub_sport", 7, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
    }

    public sb4(bxb bxbVar) {
        super(bxbVar);
    }
}
