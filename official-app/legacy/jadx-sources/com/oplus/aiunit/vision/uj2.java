package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class uj2 {
    public static int a(int i, int i2, int i3) {
        float f = i3 * 0.3731f;
        return i + ((int) (((double) (i2 * f)) / Math.sqrt((i2 * i2) + (f * f))));
    }

    public static int b(int i, int i2, int i3) {
        return (int) (((i * (1.0f - Math.min((Math.abs(i2) * 1.0f) / i3, 1.0f))) / 5.0f) * 2.0f);
    }
}
