package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes13.dex */
public class led extends bxb {
    public static final int EnabledFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("ohr_settings", 188);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97(ViewEntity.ENABLED, 0, 0, 1.0d, 0.0d, "", false, Profile$Type.SWITCH));
    }

    public led(bxb bxbVar) {
        super(bxbVar);
    }
}
