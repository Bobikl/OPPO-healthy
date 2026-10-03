package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TextAppearanceSpan;
import androidx.annotation.StyleRes;
import com.heytap.health.health_base.R$string;
import com.heytap.health.sleep.R$style;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class hw5 {
    public static final String KEY = "\\d+.\\d+|\\d+|:|'|\"";

    public static String a(int i) {
        return d(i).toString();
    }

    public static String b(int i) {
        return e(i).toString();
    }

    public static String c(int i) {
        return b78.a().getString(R$string.health_base_time_hour, (i % 3600 == 0 ? new BigDecimal(i).divide(new BigDecimal(3600), 0, RoundingMode.HALF_UP) : new BigDecimal(i).divide(new BigDecimal(3600), 1, RoundingMode.HALF_UP)).toString());
    }

    public static SpannableString d(int i) {
        String string;
        try {
            BigDecimal bigDecimal = new BigDecimal(i);
            BigDecimal bigDecimal2 = new BigDecimal(60);
            BigDecimal bigDecimal3 = new BigDecimal(3600);
            if (i >= 3600) {
                BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal3, 0, RoundingMode.DOWN);
                BigDecimal bigDecimalDivide2 = bigDecimal.remainder(bigDecimal3).setScale(0, RoundingMode.HALF_UP).divide(bigDecimal2, 0, RoundingMode.HALF_UP);
                if (bigDecimalDivide2.intValue() == 0) {
                    string = b78.a().getString(R$string.health_base_time_hour, bigDecimalDivide.toString());
                } else if (bigDecimalDivide2.intValue() == 60) {
                    string = b78.a().getString(R$string.health_base_time_hour, bigDecimalDivide.add(new BigDecimal(1)).toString());
                } else {
                    string = b78.a().getString(R$string.health_base_hour_minute, bigDecimalDivide.toString(), bigDecimalDivide2.toString());
                }
            } else {
                BigDecimal bigDecimalDivide3 = bigDecimal.divide(bigDecimal2, 0, RoundingMode.HALF_UP);
                string = (bigDecimalDivide3.intValue() != 0 || i <= 0) ? b78.a().getString(R$string.health_base_minute, bigDecimalDivide3.toString()) : b78.a().getString(com.heytap.health.sleep.R$string.health_sleep_disturb_less_than_one_minute);
            }
            return g(string, "\\d+.\\d+|\\d+|:|'|\"", 0, R$style.health_sleep_font_card_time);
        } catch (Exception e2) {
            lw5.b("DisturbFormatter", e2.toString());
            return new SpannableString("");
        }
    }

    public static SpannableString e(int i) {
        return i > 0 ? d(i) : new SpannableString(b78.a().getString(R$string.health_base_no_data));
    }

    public static SpannableString f(int i, float f, int i2) {
        SpannableString spannableString;
        try {
            BigDecimal bigDecimal = new BigDecimal(i);
            BigDecimal bigDecimal2 = new BigDecimal(60);
            BigDecimal bigDecimal3 = new BigDecimal(3600);
            if (i >= 3600) {
                BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal3, 0, RoundingMode.DOWN);
                BigDecimal bigDecimalDivide2 = bigDecimal.remainder(bigDecimal3).setScale(0, RoundingMode.HALF_UP).divide(bigDecimal2, 0, RoundingMode.HALF_UP);
                if (bigDecimalDivide2.intValue() == 0) {
                    String string = b78.a().getString(R$string.health_base_time_hour, bigDecimalDivide.toString());
                    int iIndexOf = string.indexOf(bigDecimalDivide.toString());
                    int length = bigDecimalDivide.toString().length() + iIndexOf;
                    SpannableString spannableString2 = new SpannableString(string);
                    spannableString2.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf, length, 33);
                    return spannableString2;
                }
                if (bigDecimalDivide2.intValue() == 60) {
                    BigDecimal bigDecimalAdd = bigDecimalDivide.add(new BigDecimal(1));
                    String string2 = b78.a().getString(R$string.health_base_time_hour, bigDecimalAdd.toString());
                    int iIndexOf2 = string2.indexOf(bigDecimalAdd.toString());
                    int length2 = bigDecimalAdd.toString().length() + iIndexOf2;
                    SpannableString spannableString3 = new SpannableString(string2);
                    spannableString3.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf2, length2, 33);
                    return spannableString3;
                }
                String string3 = b78.a().getString(R$string.health_base_hour_minute, bigDecimalDivide.toString(), bigDecimalDivide2.toString());
                int iIndexOf3 = string3.indexOf(bigDecimalDivide.toString());
                int length3 = bigDecimalDivide.toString().length() + iIndexOf3;
                int iLastIndexOf = string3.lastIndexOf(bigDecimalDivide2.toString());
                int length4 = bigDecimalDivide2.toString().length() + iLastIndexOf;
                spannableString = new SpannableString(string3);
                spannableString.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf3, length3, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iLastIndexOf, length4, 33);
            } else {
                BigDecimal bigDecimalDivide3 = bigDecimal.divide(bigDecimal2, 0, RoundingMode.HALF_UP);
                if (bigDecimalDivide3.intValue() != 0 || i <= 0) {
                    String string4 = b78.a().getString(R$string.health_base_minute, bigDecimalDivide3.toString());
                    int iIndexOf4 = string4.indexOf(bigDecimalDivide3.toString());
                    int length5 = bigDecimalDivide3.toString().length() + iIndexOf4;
                    SpannableString spannableString4 = new SpannableString(string4);
                    spannableString4.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf4, length5, 33);
                    return spannableString4;
                }
                String string5 = b78.a().getString(R$string.health_base_hour_minute, "--", "--");
                int iIndexOf5 = string5.indexOf("--");
                int iLastIndexOf2 = string5.lastIndexOf("--");
                spannableString = new SpannableString(string5);
                spannableString.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf5, iIndexOf5 + 2, 33);
                spannableString.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iLastIndexOf2, iLastIndexOf2 + 2, 33);
            }
            return spannableString;
        } catch (Exception e2) {
            lw5.b("DisturbFormatter", e2.toString());
            return new SpannableString("");
        }
    }

    public static SpannableString g(String str, String str2, int i, @StyleRes int i2) {
        if (str == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(str);
        String str3 = "(" + str2 + ")";
        Context contextA = b78.a();
        if (i != 0) {
            spannableString.setSpan(new TextAppearanceSpan(contextA, i), 0, spannableString.length(), 33);
        }
        try {
            Matcher matcher = Pattern.compile(str3, 2).matcher(spannableString);
            while (matcher.find()) {
                spannableString.setSpan(new TextAppearanceSpan(contextA, i2), matcher.start(), matcher.end(), 33);
            }
        } catch (Exception e2) {
            a7b.b("DisturbFormatter", "getFormatString e:" + e2.getMessage());
        }
        return spannableString;
    }
}
