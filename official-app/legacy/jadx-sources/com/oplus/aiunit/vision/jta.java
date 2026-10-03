package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class jta {
    public static boolean a(Context context) {
        Locale locale = context.getApplicationContext().getResources().getConfiguration().getLocales().get(0);
        Locale locale2 = Locale.SIMPLIFIED_CHINESE;
        return locale != null && locale2.getCountry().equals(locale.getCountry()) && locale2.getLanguage().equals(locale.getLanguage());
    }
}
