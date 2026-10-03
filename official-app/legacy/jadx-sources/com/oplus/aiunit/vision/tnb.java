package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class tnb extends bxb {
    public static final int CalibratedDataFieldNum = 9;
    public static final int HrSourceFieldNum = 12;
    public static final int MaxMetCategoryFieldNum = 8;
    public static final int SpeedSourceFieldNum = 13;
    public static final int SportFieldNum = 5;
    public static final int SubSportFieldNum = 6;
    public static final int UpdateTimeFieldNum = 0;
    public static final int Vo2MaxFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("max_met_data", 229);
        h = bxbVar;
        bxbVar.e(new w97("update_time", 0, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("vo2_max", 2, 132, 10.0d, 0.0d, "mL/kg/min", false, Profile$Type.UINT16));
        bxbVar.e(new w97("sport", 5, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("sub_sport", 6, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        bxbVar.e(new w97("max_met_category", 8, 0, 1.0d, 0.0d, "", false, Profile$Type.MAX_MET_CATEGORY));
        bxbVar.e(new w97("calibrated_data", 9, 0, 1.0d, 0.0d, "", false, Profile$Type.BOOL));
        bxbVar.e(new w97("hr_source", 12, 0, 1.0d, 0.0d, "", false, Profile$Type.MAX_MET_HEART_RATE_SOURCE));
        bxbVar.e(new w97("speed_source", 13, 0, 1.0d, 0.0d, "", false, Profile$Type.MAX_MET_SPEED_SOURCE));
    }

    public tnb(bxb bxbVar) {
        super(bxbVar);
    }
}
