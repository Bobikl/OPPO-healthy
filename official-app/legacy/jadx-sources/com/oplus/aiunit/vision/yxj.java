package com.oplus.aiunit.vision;

import com.heytap.health.device_settings.impl.R$string;

/* JADX INFO: loaded from: classes17.dex */
public class yxj {
    public static final String TAG = "TimeFormatUtils";

    public static String a(int i) {
        return b(c(i), e(i));
    }

    public static String b(int i, int i2) {
        return String.format(g07.b(R$string.band_settings_time_format), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static int c(int i) {
        return (i & 65280) >> 8;
    }

    public static int d(int i, int i2) {
        return (i << 8) | (i2 & 255);
    }

    public static int e(int i) {
        return i & 255;
    }
}
