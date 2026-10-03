package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class t30 {
    public static int a(int i, int i2) {
        if (i2 == 90) {
            return Math.abs(i + i2) % 360;
        }
        if (i2 == 270) {
            return Math.abs(i2 - i);
        }
        return 0;
    }

    public static int b(float f, float f2) {
        if (Math.abs(f) <= Math.abs(f2)) {
            return (f2 <= 7.0f && f2 < -7.0f) ? 180 : 0;
        }
        if (f > 4.0f) {
            return 270;
        }
        return f < -4.0f ? 90 : 0;
    }
}
