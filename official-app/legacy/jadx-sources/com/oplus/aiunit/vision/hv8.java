package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;

/* JADX INFO: loaded from: classes18.dex */
public class hv8 {
    public static SpannableString a(String str, float f, int i, String str2, int i2) {
        SpannableString spannableString = new SpannableString(str);
        if (!str.contains(str2)) {
            return spannableString;
        }
        int iIndexOf = str.indexOf(str2);
        spannableString.setSpan(new AbsoluteSizeSpan(ejg.a(b78.a(), f), false), 0, iIndexOf, 33);
        spannableString.setSpan(new TextAppearanceSpan(b78.a(), i), 0, iIndexOf, 33);
        spannableString.setSpan(new StyleSpan(i2), 0, iIndexOf, 33);
        return spannableString;
    }

    public static SpannableString b(String str, int i, int i2, Drawable drawable) {
        String str2 = str + " #";
        SpannableString spannableString = new SpannableString(str2);
        drawable.setBounds(0, 0, i, i2);
        spannableString.setSpan(new ImageSpan(drawable, 0), str2.length() - 1, str2.length(), 33);
        return spannableString;
    }

    public static SpannableString c(String str, String str2, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        if (!str.contains(str2)) {
            return spannableString;
        }
        int iIndexOf = str.indexOf(str2) + 1;
        spannableString.setSpan(new ForegroundColorSpan(i), 0, iIndexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(i2), iIndexOf + 1, str.length(), 33);
        return spannableString;
    }
}
