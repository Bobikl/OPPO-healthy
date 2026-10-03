package com.client.platform.opensdk.pay.download.util;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes13.dex */
public class FloatDivUtil {
    public static float div(float f, float f2, int i) {
        if (i >= 0) {
            return new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(f2)), i, 4).floatValue();
        }
        throw new IllegalArgumentException("scale cannot < 0");
    }

    public static float div(int i, int i2, int i3) {
        if (i3 >= 0) {
            return new BigDecimal(Integer.toString(i)).divide(new BigDecimal(Integer.toString(i2)), i3, 4).floatValue();
        }
        throw new IllegalArgumentException("scale cannot < 0");
    }

    public static float div(long j2, long j3, int i) {
        if (i >= 0) {
            return new BigDecimal(Long.toString(j2)).divide(new BigDecimal(Long.toString(j3)), i, 5).floatValue();
        }
        throw new IllegalArgumentException("scale cannot < 0");
    }
}
