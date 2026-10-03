package com.oplus.aiunit.vision;

import java.math.BigDecimal;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class lu7 {
    public static float a(long j, long j2, int i) {
        if (i >= 0) {
            return new BigDecimal(String.valueOf(j)).divide(new BigDecimal(String.valueOf(j2)), i, 5).floatValue();
        }
        throw new IllegalArgumentException("scale cannot < 0");
    }
}
