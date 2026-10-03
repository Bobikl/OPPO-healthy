package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class bi9 extends bxb {
    public static final int ChargedFieldNum = 2;
    public static final int LevelFieldNum = 1;
    public static final int ProcessingIntervalFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final int UnchargedFieldNum = 3;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("hsa_body_battery_data", 314);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, Profile$Type.UINT16));
        bxbVar.e(new w97("level", 1, 1, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, Profile$Type.SINT8));
        Profile$Type profile$Type = Profile$Type.SINT16;
        bxbVar.e(new w97("charged", 2, 131, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("uncharged", 3, 131, 1.0d, 0.0d, "", false, profile$Type));
    }

    public bi9(bxb bxbVar) {
        super(bxbVar);
    }
}
