package com.oplus.aiunit.vision;

import com.badlogic.gdx.math.RandomXS128;
import java.util.Random;

/* JADX INFO: loaded from: classes13.dex */
public final class onb {
    public static final float E = 2.7182817f;
    public static final float FLOAT_ROUNDING_ERROR = 1.0E-6f;
    public static final float HALF_PI = 1.5707964f;
    public static final float PI = 3.1415927f;
    public static final float PI2 = 6.2831855f;
    public static final float degRad = 0.017453292f;
    public static final float degreesToRadians = 0.017453292f;
    public static final float nanoToSec = 1.0E-9f;
    public static final float radDeg = 57.295776f;
    public static final float radiansToDegrees = 57.295776f;
    public static Random random = new RandomXS128();

    public static class a {
        public static final float[] a = new float[16384];

        static {
            for (int i = 0; i < 16384; i++) {
                a[i] = (float) Math.sin(((i + 0.5f) / 16384.0f) * 6.2831855f);
            }
            float[] fArr = a;
            fArr[0] = 0.0f;
            fArr[4096] = 1.0f;
            fArr[8192] = 0.0f;
            fArr[12288] = -1.0f;
        }
    }

    public static float a(float f, float f2) {
        float f3 = f / f2;
        if (f3 != f3) {
            f3 = f == f2 ? 1.0f : -1.0f;
        } else {
            float f4 = f3 - f3;
            if (f4 != f4) {
                f2 = 0.0f;
            }
        }
        if (f2 > 0.0f) {
            return b(f3);
        }
        if (f2 < 0.0f) {
            return f >= 0.0f ? b(f3) + 3.1415927f : b(f3) - 3.1415927f;
        }
        if (f > 0.0f) {
            return f2 + 1.5707964f;
        }
        return f < 0.0f ? f2 - 1.5707964f : f2 + f;
    }

    public static float b(double d) {
        double dAbs = Math.abs(d);
        double d2 = (dAbs - 1.0d) / (dAbs + 1.0d);
        double d3 = d2 * d2;
        double d4 = d2 * d3;
        double d5 = d4 * d3;
        double d6 = d5 * d3;
        double d7 = d6 * d3;
        return (float) (Math.signum(d) * (((((((d2 * 0.99997726d) - (d4 * 0.33262347d)) + (d5 * 0.19354346d)) - (d6 * 0.11643287d)) + (d7 * 0.05265332d)) - ((d3 * d7) * 0.0117212d)) + 0.7853981633974483d));
    }

    public static float c(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int d(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static float e(float f) {
        return a.a[((int) ((f + 1.5707964f) * 2607.5945f)) & 16383];
    }

    public static float f(float f) {
        return a.a[((int) ((f + 90.0f) * 45.511112f)) & 16383];
    }

    public static boolean g(float f, float f2) {
        return Math.abs(f - f2) <= 1.0E-6f;
    }

    public static boolean h(float f, float f2, float f3) {
        return Math.abs(f - f2) <= f3;
    }

    public static boolean i(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public static boolean j(float f) {
        return Math.abs(f) <= 1.0E-6f;
    }

    public static boolean k(float f, float f2) {
        return Math.abs(f) <= f2;
    }

    public static int l(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    public static float m() {
        return random.nextFloat();
    }

    public static float n(float f, float f2) {
        return f + (random.nextFloat() * (f2 - f));
    }

    public static int o(float f) {
        return (int) (f + 0.5f);
    }

    public static float p(float f) {
        return a.a[((int) (f * 2607.5945f)) & 16383];
    }

    public static float q(float f) {
        return a.a[((int) (f * 45.511112f)) & 16383];
    }
}
