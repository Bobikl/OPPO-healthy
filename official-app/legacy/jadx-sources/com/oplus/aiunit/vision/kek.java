package com.oplus.aiunit.vision;

import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class kek {
    public static String a() {
        String strB = ukj.b("persist.sys.oppo.region", "CN");
        return "OC".equalsIgnoreCase(strB) ? "CN" : strB;
    }

    public static String b() {
        return Locale.getDefault().getLanguage();
    }

    public static String c() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return "id-ID".equalsIgnoreCase(languageTag) ? "in-ID" : languageTag;
    }
}
