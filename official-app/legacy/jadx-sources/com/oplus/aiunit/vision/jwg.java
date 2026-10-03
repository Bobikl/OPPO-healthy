package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class jwg extends bxb {
    public static final int CategoryFieldNum = 7;
    public static final int CategorySubtypeFieldNum = 8;
    public static final int DurationFieldNum = 0;
    public static final int MessageIndexFieldNum = 10;
    public static final int RepetitionsFieldNum = 3;
    public static final int SetTypeFieldNum = 5;
    public static final int StartTimeFieldNum = 6;
    public static final int TimestampFieldNum = 254;
    public static final int WeightDisplayUnitFieldNum = 9;
    public static final int WeightFieldNum = 4;
    public static final int WktStepIndexFieldNum = 11;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("set", 225);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 254, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("duration", 0, 134, 1000.0d, 0.0d, "s", false, Profile$Type.UINT32));
        Profile$Type profile$Type2 = Profile$Type.UINT16;
        bxbVar.e(new w97("repetitions", 3, 132, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("weight", 4, 132, 16.0d, 0.0d, "kg", false, profile$Type2));
        bxbVar.e(new w97("set_type", 5, 2, 1.0d, 0.0d, "", false, Profile$Type.SET_TYPE));
        bxbVar.e(new w97("start_time", 6, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("category", 7, 132, 1.0d, 0.0d, "", false, Profile$Type.EXERCISE_CATEGORY));
        bxbVar.e(new w97("category_subtype", 8, 132, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("weight_display_unit", 9, 132, 1.0d, 0.0d, "", false, Profile$Type.FIT_BASE_UNIT));
        Profile$Type profile$Type3 = Profile$Type.MESSAGE_INDEX;
        bxbVar.e(new w97("message_index", 10, 132, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("wkt_step_index", 11, 132, 1.0d, 0.0d, "", false, profile$Type3));
    }

    public jwg(bxb bxbVar) {
        super(bxbVar);
    }
}
