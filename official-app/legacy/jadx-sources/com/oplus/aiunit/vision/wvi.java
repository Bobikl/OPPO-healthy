package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import com.heytap.sports.R$style;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class wvi {
    public static final String KEY = "\\d+.\\d+|\\d+|:|'|\"";

    public static SpannableString a(int i) {
        String string = b78.a().getString(i);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new TextAppearanceSpan(b78.a(), R$style.sports_fivek_mevlue), 0, string.indexOf(":") + 1, 33);
        return spannableString;
    }

    public static SpannableString b(View view, String str, SpannableString spannableString, int i, int i2) {
        if (TextUtils.isEmpty(spannableString)) {
            return new SpannableString("");
        }
        String strE = e(str);
        Context context = view.getContext();
        if (i != 0) {
            spannableString.setSpan(new TextAppearanceSpan(context, i), 0, spannableString.length(), 33);
        }
        try {
            Matcher matcher = Pattern.compile(strE, 2).matcher(spannableString);
            while (matcher.find()) {
                spannableString.setSpan(new TextAppearanceSpan(context, i2), matcher.start(), matcher.end(), 33);
            }
        } catch (Exception e2) {
            a7b.b("StrFormatter", "getSpanModify e:" + e2.getMessage());
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(spannableString);
        }
        return spannableString;
    }

    public static SpannableString c(View view, String str, SpannableString spannableString, int i, int i2) {
        return b(view, str, spannableString, i, i2);
    }

    public static SpannableString d(View view, String str, String str2, int i, int i2) {
        if (str2 == null) {
            str2 = "";
        }
        SpannableString spannableStringC = c(view, str, new SpannableString(str2), i, i2);
        if (view instanceof TextView) {
            ((TextView) view).setText(spannableStringC);
        }
        return spannableStringC;
    }

    public static String e(String str) {
        return "(" + str + ")";
    }

    @SuppressLint({"DefaultLocale"})
    public static String f(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / 3600;
        return i5 > 0 ? String.format("%d:%02d:%02d", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)) : String.format("%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3));
    }
}
