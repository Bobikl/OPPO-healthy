package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.oplus.deepthinker.sdk.app.awareness.capability.impl.ActivityRecognizeEvent;

/* JADX INFO: loaded from: classes13.dex */
public class g3c extends bxb {
    public static final int ActivityTypeFieldNum = 1;
    public static final int CyclesToCaloriesFieldNum = 4;
    public static final int CyclesToDistanceFieldNum = 3;
    public static final int LocalTimestampFieldNum = 0;
    public static final int RestingMetabolicRateFieldNum = 5;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("monitoring_info", 103);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("local_timestamp", 0, 134, 1.0d, 0.0d, "s", false, Profile$Type.LOCAL_DATE_TIME));
        bxbVar.e(new w97(ActivityRecognizeEvent.BUNDLE_KEY_ACTIVITY_TYPE, 1, 0, 1.0d, 0.0d, "", false, Profile$Type.ACTIVITY_TYPE));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("cycles_to_distance", 3, 132, 5000.0d, 0.0d, "m/cycle", false, profile$Type));
        bxbVar.e(new w97("cycles_to_calories", 4, 132, 5000.0d, 0.0d, "kcal/cycle", false, profile$Type));
        bxbVar.e(new w97("resting_metabolic_rate", 5, 132, 1.0d, 0.0d, "kcal / day", false, profile$Type));
    }

    public g3c(bxb bxbVar) {
        super(bxbVar);
    }
}
