package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class a88 {
    public static float a(float f) {
        float fFloor;
        float f2;
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f < 20.0f) {
            return f / 10.0f;
        }
        if (f < 50.0f) {
            fFloor = ((float) Math.floor(((f - 20.0f) * 10.0f) / 5.0f)) / 10.0f;
            f2 = 2.0f;
        } else if (f < 80.0f) {
            fFloor = ((float) Math.floor(((f - 50.0f) * 10.0f) / 30.0f)) / 10.0f;
            f2 = 8.0f;
        } else {
            if (f >= 100.0f) {
                return f >= 100.0f ? 10.0f : 0.0f;
            }
            fFloor = ((float) Math.floor(((f - 80.0f) * 10.0f) / 20.0f)) / 10.0f;
            f2 = 9.0f;
        }
        return f2 + fFloor;
    }

    public static float b(float f) {
        float f2;
        float f3;
        if (f < 0.0f) {
            return 0.0f;
        }
        double d = f;
        if (d < 2.0d) {
            return f * 10.0f;
        }
        if (d < 8.0d) {
            return ((f - 2.0f) * 5.0f) + 20.0f;
        }
        if (d < 9.0d) {
            f2 = (f - 8.0f) * 30.0f;
            f3 = 50.0f;
        } else {
            if (f >= 10.0f) {
                return f >= 100.0f ? 100.0f : 0.0f;
            }
            f2 = (f - 9.0f) * 20.0f;
            f3 = 80.0f;
        }
        return f3 + f2;
    }

    public static float c(float f) {
        if (f < 10.0f) {
            return 0.0f;
        }
        if (f < 20.0f) {
            return 2.0f;
        }
        if (f < 25.0f) {
            return 3.0f;
        }
        if (f < 30.0f) {
            return 5.0f;
        }
        if (f < 35.0f) {
            return 6.0f;
        }
        if (f < 40.0f) {
            return 7.0f;
        }
        if (f < 45.0f) {
            return 12.0f;
        }
        if (f < 50.0f) {
            return 15.0f;
        }
        return f < 80.0f ? 21.0f : 28.0f;
    }
}
