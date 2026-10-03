package com.oplus.aiunit.vision;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.heytap.health.base.R$color;
import com.heytap.health.hearing.R$string;
import com.heytap.health.hearing.util.HearingChart;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes16.dex */
public class ey8 {
    public static final String EMPTY = "- -";
    public static final String KEY_1 = "/";
    public static final String KEY_2 = "\\d+.\\d+|\\d+|:|'|\"";

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HearingChart.values().length];
            a = iArr;
            try {
                iArr[HearingChart.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HearingChart.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HearingChart.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HearingChart.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static SpannableString a(double d, double d2) {
        String string;
        String strValueOf = d == 0.0d ? "- -" : String.valueOf(new BigDecimal(d).setScale(0, RoundingMode.HALF_UP).intValue());
        if (d2 > 60.0d) {
            BigDecimal bigDecimal = new BigDecimal(d2);
            BigDecimal bigDecimal2 = new BigDecimal(60);
            string = String.format(b78.a().getString(R$string.health_hearing_db_and_hour), strValueOf, bigDecimal.divide(bigDecimal2, 0, RoundingMode.DOWN).toString(), bigDecimal.remainder(bigDecimal2).setScale(1, RoundingMode.HALF_UP).toString());
        } else if (d2 == 0.0d) {
            string = b78.a().getString(R$string.health_hearing_db_and_minute, strValueOf, "- -");
        } else {
            string = b78.a().getString(R$string.health_hearing_db_and_minute, strValueOf, new BigDecimal(d2).setScale(1, RoundingMode.HALF_UP).toString());
        }
        SpannableString spannableString = new SpannableString(string);
        int iIndexOf = string.indexOf("(");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("（");
        }
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        spannableString.setSpan(new StyleSpan(1), 0, iIndexOf, 34);
        spannableString.setSpan(new ForegroundColorSpan(b78.a().getColor(R$color.lib_base_color_text_black_F0)), 0, iIndexOf, 34);
        return spannableString;
    }

    public static String b(double d) {
        String strValueOf = String.valueOf(new BigDecimal(d).setScale(0, RoundingMode.HALF_UP).intValue());
        if (d == 0.0d) {
            strValueOf = "- -";
        }
        return b78.a().getString(R$string.health_hearing_db, strValueOf);
    }

    public static String c(double d, double d2) {
        String string = b78.a().getString(R$string.health_hearing_db);
        if (d == 0.0d && d2 == 0.0d) {
            return String.format(string, "- -");
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        BigDecimal bigDecimal2 = new BigDecimal(d2);
        return String.format(string + "-" + string, Integer.valueOf(bigDecimal.setScale(0, RoundingMode.HALF_UP).intValue()), Integer.valueOf(bigDecimal2.setScale(0, RoundingMode.HALF_UP).intValue()));
    }

    public static boolean d(double d, HearingChart hearingChart) {
        int i = a.a[hearingChart.ordinal()];
        if (i == 1) {
            return d <= 0.23d;
        }
        if (i == 2) {
            return d <= 1.6d;
        }
        if (i != 3) {
            return i != 4 || d <= 83.4d;
        }
        return d <= 6.86d;
    }
}
