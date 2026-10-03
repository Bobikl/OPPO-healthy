package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;

/* JADX INFO: loaded from: classes13.dex */
public class ng3 extends bxb {
    public static final int ClimbCategoryFieldNum = 4;
    public static final int ClimbNumberFieldNum = 3;
    public static final int ClimbProEventFieldNum = 2;
    public static final int CurrentDistFieldNum = 5;
    public static final int PositionLatFieldNum = 0;
    public static final int PositionLongFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("climb_pro", 317);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.SINT32;
        bxbVar.e(new w97("position_lat", 0, 133, 1.0d, 0.0d, "semicircles", false, profile$Type));
        bxbVar.e(new w97("position_long", 1, 133, 1.0d, 0.0d, "semicircles", false, profile$Type));
        bxbVar.e(new w97("climb_pro_event", 2, 0, 1.0d, 0.0d, "", false, Profile$Type.CLIMB_PRO_EVENT));
        bxbVar.e(new w97("climb_number", 3, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("climb_category", 4, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        bxbVar.e(new w97("current_dist", 5, 136, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, Profile$Type.FLOAT32));
    }

    public ng3(bxb bxbVar) {
        super(bxbVar);
    }
}
