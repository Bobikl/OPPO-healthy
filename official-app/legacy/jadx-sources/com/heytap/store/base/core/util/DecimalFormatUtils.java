package com.heytap.store.base.core.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes3.dex */
public class DecimalFormatUtils {
    private static DecimalFormat format0 = new DecimalFormat("#0");
    private static DecimalFormat format1 = new DecimalFormat("#0.0");
    private static DecimalFormat format2 = new DecimalFormat("#0.00");

    public static String format0(double d) {
        return String.format("¥%s", format0.format(d));
    }

    public static String format1(double d) {
        return String.format("¥%s", format1.format(d));
    }

    public static String format2(double d) {
        return String.format("¥%s", format2.format(d));
    }

    public static String format3(double d) {
        return format0.format(d);
    }

    public static String format4(double d) {
        return format2.format(d);
    }

    public static String priceFormat(Double d) {
        return priceFormat(d, true);
    }

    public static String toPrice(double d) {
        return new DecimalFormat("#.##").format(d);
    }

    public static String priceFormat(Double d, boolean z) {
        if (d == null) {
            return "";
        }
        BigDecimal scale = BigDecimal.valueOf(BigDecimal.valueOf(d.doubleValue()).setScale(2, RoundingMode.HALF_DOWN).doubleValue() * 100.0d).setScale(0, 5);
        if (((int) Math.floor(scale.doubleValue())) % 10 != 0) {
            return z ? format2(d.doubleValue()) : format2.format(d);
        }
        if (((int) Math.floor(scale.doubleValue())) % 100 != 0) {
            return z ? format1(d.doubleValue()) : format1.format(d);
        }
        return z ? format0(d.doubleValue()) : format0.format(d);
    }
}
