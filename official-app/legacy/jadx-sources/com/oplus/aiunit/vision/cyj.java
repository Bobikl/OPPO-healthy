package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.databaseengine.apiv3.data.Element;

/* JADX INFO: loaded from: classes13.dex */
public class cyj extends bxb {
    public static final int CadenceZoneHighBondaryFieldNum = 8;
    public static final int FunctionalThresholdPowerFieldNum = 15;
    public static final int HrCalcTypeFieldNum = 10;
    public static final int HrZoneHighBoundaryFieldNum = 6;
    public static final int MaxHeartRateFieldNum = 11;
    public static final int PowerZoneHighBoundaryFieldNum = 9;
    public static final int PwrCalcTypeFieldNum = 14;
    public static final int ReferenceIndexFieldNum = 1;
    public static final int ReferenceMesgFieldNum = 0;
    public static final int RestingHeartRateFieldNum = 12;
    public static final int SpeedZoneHighBoundaryFieldNum = 7;
    public static final int ThresholdHeartRateFieldNum = 13;
    public static final int TimeInCadenceZoneFieldNum = 4;
    public static final int TimeInHrZoneFieldNum = 2;
    public static final int TimeInPowerZoneFieldNum = 5;
    public static final int TimeInSpeedZoneFieldNum = 3;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("time_in_zone", 216);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("reference_mesg", 0, 132, 1.0d, 0.0d, "", false, Profile$Type.MESG_NUM));
        bxbVar.e(new w97("reference_index", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.UINT32;
        bxbVar.e(new w97("time_in_hr_zone", 2, 134, 1000.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("time_in_speed_zone", 3, 134, 1000.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("time_in_cadence_zone", 4, 134, 1000.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("time_in_power_zone", 5, 134, 1000.0d, 0.0d, "s", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT8;
        bxbVar.e(new w97("hr_zone_high_boundary", 6, 2, 1.0d, 0.0d, "bpm", false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.UINT16;
        bxbVar.e(new w97("speed_zone_high_boundary", 7, 132, 1000.0d, 0.0d, "m/s", false, profile$Type3));
        bxbVar.e(new w97("cadence_zone_high_bondary", 8, 2, 1.0d, 0.0d, "rpm", false, profile$Type2));
        bxbVar.e(new w97("power_zone_high_boundary", 9, 132, 1.0d, 0.0d, "watts", false, profile$Type3));
        bxbVar.e(new w97("hr_calc_type", 10, 0, 1.0d, 0.0d, "", false, Profile$Type.HR_ZONE_CALC));
        bxbVar.e(new w97(Element.ELEMENT_NAME_MAX_HEART_RATE, 11, 2, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("resting_heart_rate", 12, 2, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("threshold_heart_rate", 13, 2, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("pwr_calc_type", 14, 0, 1.0d, 0.0d, "", false, Profile$Type.PWR_ZONE_CALC));
        bxbVar.e(new w97("functional_threshold_power", 15, 132, 1.0d, 0.0d, "", false, profile$Type3));
    }

    public cyj(bxb bxbVar) {
        super(bxbVar);
    }
}
