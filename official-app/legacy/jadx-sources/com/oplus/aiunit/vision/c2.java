package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.smartenginehelper.entity.ClickApiEntity;

/* JADX INFO: loaded from: classes13.dex */
public class c2 extends bxb {
    public static final int EnergyTotalFieldNum = 1;
    public static final int InstanceFieldNum = 3;
    public static final int TimeAboveThresholdFieldNum = 4;
    public static final int TimeFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final int ZeroCrossCntFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("aad_accel_features", ixb.AAD_ACCEL_FEATURES);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97(ClickApiEntity.TIME, 0, 132, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("energy_total", 1, 134, 1.0d, 0.0d, "", false, Profile$Type.UINT32));
        bxbVar.e(new w97("zero_cross_cnt", 2, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("instance", 3, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
        bxbVar.e(new w97("time_above_threshold", 4, 132, 25.0d, 0.0d, "s", false, profile$Type));
    }

    public c2(bxb bxbVar) {
        super(bxbVar);
    }
}
