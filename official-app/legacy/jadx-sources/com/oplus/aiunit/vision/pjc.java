package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class pjc {
    public static int a(int i, int i2, int i3) {
        float f = i3 * 0.3731f;
        return i + ((int) (((double) f) * Math.tanh(((i2 / 1.5f) * 2.5f) / (f * 0.9f))));
    }

    public static int b(int i, int i2, int i3) {
        return (int) (((i * (1.0f - Math.min((Math.abs(i2) * 1.0f) / i3, 1.0f))) / 5.0f) * 2.0f);
    }
}
