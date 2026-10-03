package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class vr3 {
    public static final float EPSILON = 1.1920929E-7f;
    public static final float FORCE_RATIO = 1.0f;
    public static final float LINEAR_DAMPING_INTERCEPT = 2.2141f;
    public static final float LINEAR_DAMPING_SLOPE = 0.052f;
    public static final int PHYSICAL_SIZE_TO_DP_RATIO = 55;
    public static final float POSITION_VALUE_THRESHOLD = 1.0f;
    public static final float ROTATION_VALUE_THRESHOLD = 0.1f;
    public static final float SCALE_VALUE_THRESHOLD = 0.002f;
    public static final float UNSET = 0.0f;
    public static final float UNSET_FREQUENCY = 50.0f;
    public static final int VELOCITY_ITERATIONS = 4;
    public static float sPhysicalSizeToPixelsRatio = 160.0f;
    public static float sRefreshRate = 0.008333334f;
    public static float sSteadyAccuracy = 0.1f;

    public static float a(float f) {
        return (fpb.c(f) * 2.8600001f) + 2.2141f;
    }

    public static boolean b(float f) {
        return f < sSteadyAccuracy;
    }

    public static float c(float f) {
        return f * sPhysicalSizeToPixelsRatio;
    }

    public static float d(float f) {
        return f / sPhysicalSizeToPixelsRatio;
    }

    public static void e(float f) {
        sPhysicalSizeToPixelsRatio = (f * 55.0f) + 0.5f;
        sSteadyAccuracy = d(0.1f);
    }

    public static void f(float f) {
        sRefreshRate = f;
    }
}
