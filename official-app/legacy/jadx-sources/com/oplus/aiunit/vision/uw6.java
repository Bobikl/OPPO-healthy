package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class uw6 extends bxb {
    public static final int ExerciseCategoryFieldNum = 0;
    public static final int ExerciseNameFieldNum = 1;
    public static final int MessageIndexFieldNum = 254;
    public static final int WktStepNameFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("exercise_title", ixb.EXERCISE_TITLE);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("exercise_category", 0, 132, 1.0d, 0.0d, "", false, Profile$Type.EXERCISE_CATEGORY));
        bxbVar.e(new w97("exercise_name", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("wkt_step_name", 2, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
    }

    public uw6(bxb bxbVar) {
        super(bxbVar);
    }
}
