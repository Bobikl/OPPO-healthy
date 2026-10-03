package com.oplus.aiunit.vision;

import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class t4b {
    public static final Locale a = Locale.ENGLISH;

    public static String a() {
        Locale locale = a;
        LocaleList locales = b78.a().getResources().getConfiguration().getLocales();
        if (locales != null && locales.size() > 0) {
            locale = locales.get(0);
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    public static boolean b() {
        Locale locale = a;
        LocaleList locales = b78.a().getResources().getConfiguration().getLocales();
        if (!locales.isEmpty()) {
            locale = locales.get(0);
        }
        return TextUtils.equals(locale.getLanguage(), "zh");
    }
}
