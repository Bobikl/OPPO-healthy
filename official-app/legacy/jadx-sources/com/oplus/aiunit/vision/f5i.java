package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class f5i {
    public static final String NUM_FLOAT = "\\d+.\\d+|\\d+|\\+|[k]";
    public static final String NUM_KEY = "\\d+.\\d+|\\d+|:|'|\"";

    public static SpannableString a(View view, String str, SpannableString spannableString, int i, int i2) {
        if (TextUtils.isEmpty(spannableString)) {
            return new SpannableString("");
        }
        String strG = g(str);
        Context context = view != null ? view.getContext() : op.n().p();
        if (context == null) {
            context = b78.a();
        }
        if (i != 0) {
            spannableString.setSpan(new TextAppearanceSpan(context, i), 0, spannableString.length(), 33);
        }
        try {
            Matcher matcher = Pattern.compile(strG, 2).matcher(spannableString);
            while (matcher.find()) {
                spannableString.setSpan(new TextAppearanceSpan(context, i2), matcher.start(), matcher.end(), 33);
            }
        } catch (Exception e2) {
            yha.j(e2);
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(spannableString);
        }
        return spannableString;
    }

    public static SpannableString b(View view, String str, String str2, int i, int i2) {
        return a(view, str, new SpannableString(str2), i, i2);
    }

    public static SpannableString c(View view, String str, String str2, int i) {
        SpannableString spannableStringE = e(str, str2, i);
        if (view instanceof TextView) {
            ((TextView) view).setText(spannableStringE);
        }
        return spannableStringE;
    }

    public static SpannableString d(String str, SpannableString spannableString, int i) {
        return a(null, str, spannableString, 0, i);
    }

    public static SpannableString e(String str, String str2, int i) {
        return d(str, new SpannableString(str2), i);
    }

    public static String f(String str) {
        return "(" + str + ")";
    }

    public static String g(String str) {
        return f(str);
    }
}
