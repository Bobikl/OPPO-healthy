package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class ae9 {
    public static void a() {
        x0h.a("heytap_health_preference_home.xml");
    }

    public static boolean b() {
        return d(false);
    }

    public static boolean c(String str, boolean z) {
        String str2 = "home_config_healthCardHasBindDevice";
        if (str != null) {
            str2 = "home_config_healthCardHasBindDevice_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_preference_home.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean d(boolean z) {
        return c(null, z);
    }

    public static void e(boolean z) {
        f(z, null);
    }

    public static void f(boolean z, String str) {
        String str2 = "home_config_hasDisplayRecommendPage";
        if (str != null) {
            str2 = "home_config_hasDisplayRecommendPage_" + str;
        }
        x0h.d("heytap_health_preference_home.xml", str2, Boolean.valueOf(z));
    }

    public static void g(boolean z) {
        h(z, null);
    }

    public static void h(boolean z, String str) {
        String str2 = "home_config_healthCardHasDownloadVideo";
        if (str != null) {
            str2 = "home_config_healthCardHasDownloadVideo_" + str;
        }
        x0h.d("heytap_health_preference_home.xml", str2, Boolean.valueOf(z));
    }
}
