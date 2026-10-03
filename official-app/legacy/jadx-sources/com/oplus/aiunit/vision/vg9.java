package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.entity.ClickApiEntity;

/* JADX INFO: loaded from: classes13.dex */
public class vg9 extends bxb {
    public static final int TimeFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hrv", 78);
        h = bxbVar;
        bxbVar.e(new w97(ClickApiEntity.TIME, 0, 132, 1000.0d, 0.0d, "s", false, Profile$Type.UINT16));
    }

    public vg9(bxb bxbVar) {
        super(bxbVar);
    }
}
