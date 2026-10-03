package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.health.bloodpressure.util.ResearchAppHelper;

/* JADX INFO: loaded from: classes13.dex */
public class fq1 extends bxb {
    public static final int DiastolicPressureFieldNum = 1;
    public static final int HeartRateFieldNum = 6;
    public static final int HeartRateTypeFieldNum = 7;
    public static final int Map3SampleMeanFieldNum = 3;
    public static final int MapEveningValuesFieldNum = 5;
    public static final int MapMorningValuesFieldNum = 4;
    public static final int MeanArterialPressureFieldNum = 2;
    public static final int StatusFieldNum = 8;
    public static final int SystolicPressureFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final int UserProfileIndexFieldNum = 9;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb(ResearchAppHelper.SP_KEY_BLOOD_PRESSURE, 51);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("systolic_pressure", 0, 132, 1.0d, 0.0d, "mmHg", false, profile$Type));
        bxbVar.e(new w97("diastolic_pressure", 1, 132, 1.0d, 0.0d, "mmHg", false, profile$Type));
        bxbVar.e(new w97("mean_arterial_pressure", 2, 132, 1.0d, 0.0d, "mmHg", false, profile$Type));
        bxbVar.e(new w97("map_3_sample_mean", 3, 132, 1.0d, 0.0d, "mmHg", false, profile$Type));
        bxbVar.e(new w97("map_morning_values", 4, 132, 1.0d, 0.0d, "mmHg", false, profile$Type));
        bxbVar.e(new w97("map_evening_values", 5, 132, 1.0d, 0.0d, "mmHg", false, profile$Type));
        bxbVar.e(new w97("heart_rate", 6, 2, 1.0d, 0.0d, "bpm", false, Profile$Type.UINT8));
        bxbVar.e(new w97("heart_rate_type", 7, 0, 1.0d, 0.0d, "", false, Profile$Type.HR_TYPE));
        bxbVar.e(new w97("status", 8, 0, 1.0d, 0.0d, "", false, Profile$Type.BP_STATUS));
        bxbVar.e(new w97("user_profile_index", 9, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
    }

    public fq1(bxb bxbVar) {
        super(bxbVar);
    }
}
