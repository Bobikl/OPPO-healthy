package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class c9l {
    public static boolean a(String str, String str2, boolean z) {
        String str3 = "heytap_health_null_" + x0h.c(str) + ".xml";
        String str4 = "watchappstatus_isMusicInstalled";
        if (str2 != null) {
            str4 = "watchappstatus_isMusicInstalled_" + str2;
        }
        return ((Boolean) x0h.b(str3, str4, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean b(String str, boolean z) {
        return a(str, null, z);
    }

    public static void c(String str, boolean z) {
        d(str, z, null);
    }

    public static void d(String str, boolean z, String str2) {
        String str3 = "heytap_health_null_" + x0h.c(str) + ".xml";
        String str4 = "watchappstatus_isMusicInstalled";
        if (str2 != null) {
            str4 = "watchappstatus_isMusicInstalled_" + str2;
        }
        x0h.d(str3, str4, Boolean.valueOf(z));
    }

    public static void e(String str, boolean z) {
        f(str, z, null);
    }

    public static void f(String str, boolean z, String str2) {
        String str3 = "heytap_health_null_" + x0h.c(str) + ".xml";
        String str4 = "watchappstatus_isWeatherInstalled";
        if (str2 != null) {
            str4 = "watchappstatus_isWeatherInstalled_" + str2;
        }
        x0h.d(str3, str4, Boolean.valueOf(z));
    }
}
