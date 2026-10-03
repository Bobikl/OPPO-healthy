package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.sports.record.details.bean.SportSummaryBean;

/* JADX INFO: loaded from: classes13.dex */
public class bb3 extends bxb {
    public static final int AvgSpeedFieldNum = 2;
    public static final int GrainWeightFieldNum = 5;
    public static final int MaxSpeedFieldNum = 1;
    public static final int MinSpeedFieldNum = 0;
    public static final int ProjectileTypeFieldNum = 4;
    public static final int ShotCountFieldNum = 3;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("chrono_shot_session", ixb.CHRONO_SHOT_SESSION);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT32;
        bxbVar.e(new w97("min_speed", 0, 134, 1000.0d, 0.0d, "m/s", false, profile$Type));
        bxbVar.e(new w97(SportSummaryBean.MAX_SPEED, 1, 134, 1000.0d, 0.0d, "m/s", false, profile$Type));
        bxbVar.e(new w97(SportSummaryBean.AVG_SPEED, 2, 134, 1000.0d, 0.0d, "m/s", false, profile$Type));
        bxbVar.e(new w97("shot_count", 3, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("projectile_type", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.PROJECTILE_TYPE));
        bxbVar.e(new w97("grain_weight", 5, 134, 10.0d, 0.0d, "gr", false, profile$Type));
    }

    public bb3(bxb bxbVar) {
        super(bxbVar);
    }
}
