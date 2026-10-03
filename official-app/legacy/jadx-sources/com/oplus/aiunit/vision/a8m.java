package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.databaseengine.apiv3.data.Element;

/* JADX INFO: loaded from: classes13.dex */
public class a8m extends bxb {
    public static final int FunctionalThresholdPowerFieldNum = 3;
    public static final int HrCalcTypeFieldNum = 5;
    public static final int MaxHeartRateFieldNum = 1;
    public static final int PwrCalcTypeFieldNum = 7;
    public static final int ThresholdHeartRateFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("zones_target", 7);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97(Element.ELEMENT_NAME_MAX_HEART_RATE, 1, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("threshold_heart_rate", 2, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("functional_threshold_power", 3, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("hr_calc_type", 5, 0, 1.0d, 0.0d, "", false, Profile$Type.HR_ZONE_CALC));
        bxbVar.e(new w97("pwr_calc_type", 7, 0, 1.0d, 0.0d, "", false, Profile$Type.PWR_ZONE_CALC));
    }

    public a8m(bxb bxbVar) {
        super(bxbVar);
    }
}
