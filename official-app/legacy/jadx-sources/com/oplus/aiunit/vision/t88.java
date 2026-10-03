package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes13.dex */
public class t88 extends bxb {
    public static final int EnabledFieldNum = 10;
    public static final int EndDateFieldNum = 3;
    public static final int MessageIndexFieldNum = 254;
    public static final int RecurrenceFieldNum = 8;
    public static final int RecurrenceValueFieldNum = 9;
    public static final int RepeatFieldNum = 6;
    public static final int SourceFieldNum = 11;
    public static final int SportFieldNum = 0;
    public static final int StartDateFieldNum = 2;
    public static final int SubSportFieldNum = 1;
    public static final int TargetValueFieldNum = 7;
    public static final int TypeFieldNum = 4;
    public static final int ValueFieldNum = 5;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("goal", 15);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("sport", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("sub_sport", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("start_date", 2, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("end_date", 3, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("type", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.GOAL));
        Profile$Type profile$Type2 = Profile$Type.UINT32;
        bxbVar.e(new w97("value", 5, 134, 1.0d, 0.0d, "", false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.BOOL;
        bxbVar.e(new w97("repeat", 6, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("target_value", 7, 134, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("recurrence", 8, 0, 1.0d, 0.0d, "", false, Profile$Type.GOAL_RECURRENCE));
        bxbVar.e(new w97("recurrence_value", 9, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97(ViewEntity.ENABLED, 10, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("source", 11, 0, 1.0d, 0.0d, "", false, Profile$Type.GOAL_SOURCE));
    }

    public t88(bxb bxbVar) {
        super(bxbVar);
    }
}
