package com.heytap.wearable.support.watchface.gl.math;

/* JADX INFO: loaded from: classes2.dex */
public class Interpolate {
    public static float interpolateBezier(float f, float f2, float f3, float f4, float f5) {
        float f6 = 1.0f - f;
        float f7 = f6 * f6;
        float f8 = f * f;
        return (f2 * f7 * f6) + (f3 * 3.0f * f * f7) + (f4 * 3.0f * f8 * f6) + (f5 * f8 * f);
    }

    public static float interpolateDecrease(float f, float f2, float f3) {
        return (f3 - f2) * ((2.0f * f) - (f * f));
    }

    public static float interpolateIncrease(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f * f);
    }

    public static float interpolateLinear(float f, float f2, float f3) {
        if (f2 != f3 && f > 0.0f) {
            return f >= 1.0f ? f3 : ((1.0f - f) * f2) + (f * f3);
        }
        return f2;
    }
}
