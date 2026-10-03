package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class gkh extends bxb {
    public static final int SleepLevelFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("sleep_level", ixb.SLEEP_LEVEL);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("sleep_level", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.SLEEP_LEVEL));
    }

    public gkh(bxb bxbVar) {
        super(bxbVar);
    }
}
