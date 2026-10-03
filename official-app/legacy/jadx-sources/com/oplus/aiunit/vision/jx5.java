package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class jx5 extends bxb {
    public static final int HeliumContentFieldNum = 0;
    public static final int MessageIndexFieldNum = 254;
    public static final int ModeFieldNum = 3;
    public static final int OxygenContentFieldNum = 1;
    public static final int StatusFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("dive_gas", 259);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("helium_content", 0, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type));
        bxbVar.e(new w97("oxygen_content", 1, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type));
        bxbVar.e(new w97("status", 2, 0, 1.0d, 0.0d, "", false, Profile$Type.DIVE_GAS_STATUS));
        bxbVar.e(new w97("mode", 3, 0, 1.0d, 0.0d, "", false, Profile$Type.DIVE_GAS_MODE));
    }

    public jx5(bxb bxbVar) {
        super(bxbVar);
    }
}
