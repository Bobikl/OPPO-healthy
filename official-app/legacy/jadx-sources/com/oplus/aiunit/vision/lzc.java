package com.oplus.aiunit.vision;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes15.dex */
public class lzc {
    public static String a(int i, double d) {
        return new BigDecimal(String.valueOf(d)).setScale(i, RoundingMode.DOWN).toString();
    }

    public static String b(int i, double d, double d2) {
        return new BigDecimal(String.valueOf(d)).multiply(new BigDecimal(String.valueOf(d2))).setScale(i, RoundingMode.DOWN).toString();
    }
}
