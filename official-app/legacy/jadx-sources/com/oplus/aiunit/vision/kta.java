package com.oplus.aiunit.vision;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class kta {
    public static String a() {
        Locale localeD = d();
        StringBuilder sb = new StringBuilder();
        sb.append("[getLocale] language: ");
        sb.append(localeD.getLanguage());
        sb.append("_");
        sb.append(localeD.getCountry());
        return localeD.getLanguage() + "_" + localeD.getCountry();
    }

    public static String b() {
        Locale localeD = d();
        StringBuilder sb = new StringBuilder();
        sb.append("[getLocale] language: ");
        sb.append(localeD.getLanguage());
        sb.append("-");
        sb.append(localeD.getCountry());
        return localeD.getLanguage() + "-" + localeD.getCountry();
    }

    public static String c() {
        Locale localeD = d();
        StringBuilder sb = new StringBuilder();
        sb.append("localeLanguage : ");
        sb.append(localeD.getLanguage());
        return localeD.getLanguage();
    }

    public static Locale d() {
        Locale locale = b78.a().getResources().getConfiguration().getLocales().get(0);
        return locale == null ? Locale.getDefault() : locale;
    }

    public static String e() {
        String strA = a();
        return !Arrays.asList("zh_CN", "zh_TW", "en_US", "zh_HK").contains(strA) ? "en_US" : strA;
    }

    @Deprecated
    public static boolean f() {
        return Locale.CHINA.getLanguage().equals(c());
    }

    @Deprecated
    public static boolean g() {
        return Locale.ENGLISH.getLanguage().equals(c());
    }

    @Deprecated
    public static boolean h(String str) {
        String strC = c();
        StringBuilder sb = new StringBuilder();
        sb.append("isTagLanguage locale：");
        sb.append(strC);
        return str.equals(strC);
    }

    @Deprecated
    public static boolean i() {
        return "ug".equals(c());
    }
}
