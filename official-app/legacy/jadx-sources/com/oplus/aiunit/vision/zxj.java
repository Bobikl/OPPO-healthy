package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes3.dex */
public class zxj {
    public static int HOUR = 3600000;
    public static int MIN = 60000;
    public static final String TAG = "TimeFormatUtils";

    public static int a(int i) {
        return (i & 65280) >> 8;
    }

    public static int b(int i, int i2) {
        return (i << 8) | (i2 & 255);
    }

    public static int c(int i) {
        return i & 255;
    }
}
