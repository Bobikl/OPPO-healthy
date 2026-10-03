package com.oplus.aiunit.vision;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import com.heytap.health.health_base.R$string;

/* JADX INFO: loaded from: classes16.dex */
public class z05 {
    public static String a(int i, boolean z) {
        if (i <= 0 && z) {
            return String.format(b78.a().getString(R$string.health_base_time_hour), "-- ");
        }
        if (i % 60 <= 0) {
            return String.format(b78.a().getString(R$string.health_base_time_hour), String.valueOf(i / 60));
        }
        return String.format(b78.a().getString(R$string.health_base_time_hour), String.valueOf(Math.floor(((double) (i / 60.0f)) * 10.0d) / 10.0d));
    }

    public static String b(long j2) {
        return c(j2, false);
    }

    public static String c(long j2, boolean z) {
        if (j2 <= 0 && z) {
            return String.format(b78.a().getString(R$string.health_base_minute), "-- ");
        }
        if (j2 < 60) {
            return String.format(b78.a().getString(R$string.health_base_minute), String.valueOf(j2));
        }
        long j3 = j2 / 60;
        long j4 = j2 % 60;
        return j4 <= 0 ? String.format(b78.a().getString(R$string.health_base_time_hour), String.valueOf(j3)) : String.format(b78.a().getString(R$string.health_base_hour_minute), String.valueOf(j3), String.valueOf(j4));
    }

    public static SpannableString d(long j2, float f, int i, boolean z, int i2) {
        return e(j2, f, i, z, i2, false);
    }

    public static SpannableString e(long j2, float f, int i, boolean z, int i2, boolean z2) {
        boolean z3 = true;
        if (!z ? j2 >= 0 : j2 > 0) {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                String str = String.format(b78.a().getString(R$string.health_base_minute), "--");
                int iIndexOf = str.indexOf("--");
                int i3 = iIndexOf + 2;
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf, i3, 33);
                spannableString.setSpan(new TextAppearanceSpan(b78.a(), i), iIndexOf, i3, 33);
                spannableString.setSpan(new StyleSpan(i2), iIndexOf, i3, 33);
                return spannableString;
            }
            String str2 = String.format(b78.a().getString(R$string.health_base_hour_minute), "--", "--");
            int iIndexOf2 = str2.indexOf("--");
            int i4 = iIndexOf2 + 2;
            int iLastIndexOf = str2.lastIndexOf("--");
            int i5 = iLastIndexOf + 2;
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf2, i4, 33);
            spannableString2.setSpan(new TextAppearanceSpan(b78.a(), i), iIndexOf2, i4, 33);
            spannableString2.setSpan(new StyleSpan(i2), iIndexOf2, i4, 33);
            spannableString2.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iLastIndexOf, i5, 33);
            spannableString2.setSpan(new TextAppearanceSpan(b78.a(), i), iLastIndexOf, i5, 33);
            spannableString2.setSpan(new StyleSpan(i2), iLastIndexOf, i5, 33);
            return spannableString2;
        }
        if (j2 < 60) {
            String strValueOf = String.valueOf(j2);
            String str3 = String.format(b78.a().getString(R$string.health_base_minute), strValueOf);
            int iIndexOf3 = str3.indexOf(strValueOf);
            int length = strValueOf.length() + iIndexOf3;
            SpannableString spannableString3 = new SpannableString(str3);
            spannableString3.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf3, length, 33);
            spannableString3.setSpan(new StyleSpan(i2), iIndexOf3, length, 33);
            spannableString3.setSpan(new TextAppearanceSpan(b78.a(), i), 0, String.valueOf(j2).length(), 33);
            spannableString3.setSpan(new StyleSpan(i2), 0, String.valueOf(j2).length(), 33);
            return spannableString3;
        }
        String strValueOf2 = String.valueOf(j2 / 60);
        long j3 = j2 % 60;
        String strValueOf3 = String.valueOf(j3);
        if (j3 <= 0) {
            String str4 = String.format(b78.a().getString(R$string.health_base_time_hour), strValueOf2);
            int iIndexOf4 = str4.indexOf(strValueOf2);
            int length2 = strValueOf2.length() + iIndexOf4;
            SpannableString spannableString4 = new SpannableString(str4);
            spannableString4.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf4, length2, 33);
            spannableString4.setSpan(new TextAppearanceSpan(b78.a(), i), iIndexOf4, length2, 33);
            spannableString4.setSpan(new StyleSpan(i2), iIndexOf4, length2, 33);
            return spannableString4;
        }
        String str5 = String.format(b78.a().getString(R$string.health_base_hour_minute), strValueOf2, strValueOf3);
        int iIndexOf5 = str5.indexOf(strValueOf2);
        int length3 = strValueOf2.length() + iIndexOf5;
        int iLastIndexOf2 = str5.lastIndexOf(strValueOf3);
        int length4 = strValueOf3.length() + iLastIndexOf2;
        SpannableString spannableString5 = new SpannableString(str5);
        spannableString5.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iIndexOf5, length3, 33);
        spannableString5.setSpan(new TextAppearanceSpan(b78.a(), i), iIndexOf5, length3, 33);
        spannableString5.setSpan(new StyleSpan(i2), iIndexOf5, length3, 33);
        spannableString5.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), iLastIndexOf2, length4, 33);
        spannableString5.setSpan(new TextAppearanceSpan(b78.a(), i), iLastIndexOf2, length4, 33);
        spannableString5.setSpan(new StyleSpan(i2), iLastIndexOf2, length4, 33);
        return spannableString5;
    }
}
