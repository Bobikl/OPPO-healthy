package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class iei extends bxb {
    public static final int NameFieldNum = 3;
    public static final int SportFieldNum = 0;
    public static final int SubSportFieldNum = 1;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("sport", 12);
        h = bxbVar;
        bxbVar.e(new w97("sport", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("sub_sport", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        bxbVar.e(new w97("name", 3, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public iei(bxb bxbVar) {
        super(bxbVar);
    }
}
