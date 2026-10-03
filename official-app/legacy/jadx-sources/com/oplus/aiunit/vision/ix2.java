package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class ix2 extends bxb {
    public static final int ConnectivitySupportedFieldNum = 23;
    public static final int LanguagesFieldNum = 0;
    public static final int SportsFieldNum = 1;
    public static final int WorkoutsSupportedFieldNum = 21;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("capabilities", 1);
        h = bxbVar;
        bxbVar.e(new w97("languages", 0, 10, 1.0d, 0.0d, "", false, Profile$Type.UINT8Z));
        bxbVar.e(new w97("sports", 1, 10, 1.0d, 0.0d, "", false, Profile$Type.SPORT_BITS_0));
        bxbVar.e(new w97("workouts_supported", 21, 140, 1.0d, 0.0d, "", false, Profile$Type.WORKOUT_CAPABILITIES));
        bxbVar.e(new w97("connectivity_supported", 23, 140, 1.0d, 0.0d, "", false, Profile$Type.CONNECTIVITY_CAPABILITIES));
    }

    public ix2(bxb bxbVar) {
        super(bxbVar);
    }
}
