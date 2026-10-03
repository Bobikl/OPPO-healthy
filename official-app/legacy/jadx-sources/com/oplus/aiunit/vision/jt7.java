package com.oplus.aiunit.vision;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes8.dex */
public class jt7 {
    public static float a(long j2, long j3, int i) {
        if (i >= 0) {
            return new BigDecimal(String.valueOf(j2)).divide(new BigDecimal(String.valueOf(j3)), i, 5).floatValue();
        }
        throw new IllegalArgumentException("scale cannot < 0");
    }
}
