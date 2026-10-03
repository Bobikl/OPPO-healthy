package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;

/* JADX INFO: loaded from: classes13.dex */
public class c2m extends bxb {
    public static final int FirstStepIndexFieldNum = 3;
    public static final int MessageIndexFieldNum = 254;
    public static final int NumValidStepsFieldNum = 2;
    public static final int PoolLengthFieldNum = 4;
    public static final int PoolLengthUnitFieldNum = 5;
    public static final int SportFieldNum = 0;
    public static final int SubSportFieldNum = 1;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("workout_session", 158);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("sport", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("sub_sport", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("num_valid_steps", 2, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("first_step_index", 3, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("pool_length", 4, 132, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        bxbVar.e(new w97("pool_length_unit", 5, 0, 1.0d, 0.0d, "", false, Profile$Type.DISPLAY_MEASURE));
    }

    public c2m(bxb bxbVar) {
        super(bxbVar);
    }
}
