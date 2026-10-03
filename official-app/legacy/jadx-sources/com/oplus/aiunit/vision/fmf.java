package com.oplus.aiunit.vision;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.heytap.health.relax.R$array;
import com.heytap.health.relax.R$drawable;
import com.heytap.health.relax.R$plurals;
import com.heytap.health.relax.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes17.dex */
public class fmf {
    public static final String EMPTY = "- -";

    public static String a(int i) {
        if (i == 1) {
            return b78.a().getString(R$string.health_relax_hour, 0, 6);
        }
        if (i == 3) {
            return b78.a().getString(R$string.health_relax_hour, 6, 12);
        }
        if (i != 5) {
            return i != 7 ? "" : b78.a().getString(R$string.health_relax_hour, 18, 24);
        }
        return b78.a().getString(R$string.health_relax_hour, 12, 18);
    }

    public static SpannableString b(long j2) {
        String string;
        int length;
        if (j2 > 0) {
            BigDecimal bigDecimal = new BigDecimal(60);
            BigDecimal bigDecimalDivide = new BigDecimal(j2).divide(bigDecimal, 0, RoundingMode.HALF_UP);
            if (bigDecimalDivide.compareTo(bigDecimal) >= 0) {
                BigDecimal bigDecimalDivide2 = bigDecimalDivide.divide(bigDecimal, 1, RoundingMode.HALF_UP);
                string = b78.a().getString(R$string.health_relax_total_hour, bigDecimalDivide2.toString());
                length = bigDecimalDivide2.toString().length();
            } else {
                string = b78.a().getString(com.heytap.health.health_base.R$string.health_base_minute_noblank, bigDecimalDivide.toString());
                length = bigDecimalDivide.toString().length();
            }
        } else {
            string = b78.a().getString(R$string.health_relax_total_minute_empty);
            length = 2;
        }
        return d(string, length);
    }

    public static SpannableString c(long j2, int i) {
        String string;
        BigDecimal bigDecimal = new BigDecimal(60);
        BigDecimal bigDecimalDivide = new BigDecimal(j2).divide(bigDecimal, 0, RoundingMode.HALF_UP);
        if (j2 <= 0 && i <= 0) {
            string = b78.a().getString(R$string.health_relax_total_minute_and_times_empty);
        } else if (bigDecimalDivide.compareTo(bigDecimal) >= 0) {
            string = String.format(b78.a().getResources().getQuantityString(R$plurals.health_relax_total_hour_and_times_v2, i), bigDecimalDivide.divide(bigDecimal, 1, RoundingMode.HALF_UP), Integer.valueOf(i));
        } else {
            string = String.format(b78.a().getResources().getQuantityString(R$plurals.health_relax_total_minute_and_times_v2, i), bigDecimalDivide, Integer.valueOf(i));
        }
        SpannableString spannableString = new SpannableString(string);
        int iIndexOf = string.indexOf("(");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("（");
        }
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, iIndexOf, 17);
        return spannableString;
    }

    public static SpannableString d(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(26, true), 0, i, 17);
        return spannableString;
    }

    public static int e(int i, int i2) {
        if (i != 1) {
            return R$drawable.health_relax_icon_meditation;
        }
        if (i2 == 1) {
            return R$drawable.health_relax_icon_conscious;
        }
        if (i2 == 2) {
            return R$drawable.health_relax_icon_beep;
        }
        return i2 == 3 ? R$drawable.health_relax_icon_sleep : R$drawable.health_relax_icon_conscious;
    }

    public static String f(int i, int i2) {
        String[] stringArray;
        if (i != 1) {
            stringArray = i != 2 ? new String[0] : b78.a().getResources().getStringArray(R$array.health_relax_subtype_meditation);
        } else {
            stringArray = b78.a().getResources().getStringArray(R$array.health_relax_subtype_breath);
        }
        return stringArray.length == 0 ? "" : stringArray[i2 - 1];
    }

    public static SpannableString g(int i) {
        String string;
        int length;
        if (i > 0) {
            string = b78.a().getResources().getQuantityString(R$plurals.health_relax_times_unit_v2, i);
            length = String.valueOf(i).length();
        } else {
            string = b78.a().getString(R$string.health_relax_total_times_empty);
            length = 2;
        }
        return d(String.format(string, Integer.valueOf(i)), length);
    }
}
