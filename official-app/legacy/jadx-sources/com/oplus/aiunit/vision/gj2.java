package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class gj2 {
    public static int a(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    public static int b(int i, int i2) {
        return i - (a(i, i2) * i2);
    }
}
