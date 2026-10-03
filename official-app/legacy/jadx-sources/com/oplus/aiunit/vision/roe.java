package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class roe {
    public static void a(String str) {
        x0h.a("heytap_health_watchface_" + x0h.c(str) + ".xml");
    }

    public static String b(String str, String str2, String str3) {
        String str4 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str5 = "pre_download_resource_resMd5";
        if (str2 != null) {
            str5 = "pre_download_resource_resMd5_" + str2;
        }
        return (String) x0h.b(str4, str5, str3);
    }

    public static String c(String str, String str2) {
        String str3 = "pre_download_resource_resMd5";
        if (str != null) {
            str3 = "pre_download_resource_resMd5_" + str;
        }
        return (String) x0h.b("heytap_health_watchface.xml", str3, str2);
    }

    public static void d(String str, String str2, String str3) {
        String str4 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str5 = "pre_download_resource_resMd5";
        if (str3 != null) {
            str5 = "pre_download_resource_resMd5_" + str3;
        }
        x0h.d(str4, str5, str2);
    }

    public static void e(String str, String str2) {
        String str3 = "pre_download_resource_resMd5";
        if (str2 != null) {
            str3 = "pre_download_resource_resMd5_" + str2;
        }
        x0h.d("heytap_health_watchface.xml", str3, str);
    }
}
