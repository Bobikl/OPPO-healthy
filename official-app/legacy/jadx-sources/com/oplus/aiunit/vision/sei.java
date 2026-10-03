package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class sei {
    public static boolean a() {
        return c(false);
    }

    public static boolean b(String str, boolean z) {
        String str2 = "sports_config_miniAppIgnoreActivityRecognition";
        if (str != null) {
            str2 = "sports_config_miniAppIgnoreActivityRecognition_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean c(boolean z) {
        return b(null, z);
    }

    public static boolean d() {
        return f(false);
    }

    public static boolean e(String str, boolean z) {
        String str2 = "sports_config_miniAppIgnoreBackgroundLocation";
        if (str != null) {
            str2 = "sports_config_miniAppIgnoreBackgroundLocation_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean f(boolean z) {
        return e(null, z);
    }

    public static boolean g() {
        return i(false);
    }

    public static boolean h(String str, boolean z) {
        String str2 = "sports_config_tipsIgnore";
        if (str != null) {
            str2 = "sports_config_tipsIgnore_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean i(boolean z) {
        return h(null, z);
    }

    public static boolean j() {
        return l(false);
    }

    public static boolean k(String str, boolean z) {
        String str2 = "sports_config_trackTipsIgnore";
        if (str != null) {
            str2 = "sports_config_trackTipsIgnore_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean l(boolean z) {
        return k(null, z);
    }

    public static boolean m() {
        return o(false);
    }

    public static boolean n(String str, boolean z) {
        String str2 = "sports_config_windowtipsIgnore";
        if (str != null) {
            str2 = "sports_config_windowtipsIgnore_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean o(boolean z) {
        return n(null, z);
    }

    public static void p(boolean z) {
        q(z, null);
    }

    public static void q(boolean z, String str) {
        String str2 = "sports_config_miniAppIgnoreActivityRecognition";
        if (str != null) {
            str2 = "sports_config_miniAppIgnoreActivityRecognition_" + str;
        }
        x0h.d("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z));
    }

    public static void r(boolean z) {
        s(z, null);
    }

    public static void s(boolean z, String str) {
        String str2 = "sports_config_miniAppIgnoreBackgroundLocation";
        if (str != null) {
            str2 = "sports_config_miniAppIgnoreBackgroundLocation_" + str;
        }
        x0h.d("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z));
    }

    public static void t(boolean z) {
        u(z, null);
    }

    public static void u(boolean z, String str) {
        String str2 = "sports_config_tipsIgnore";
        if (str != null) {
            str2 = "sports_config_tipsIgnore_" + str;
        }
        x0h.d("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z));
    }

    public static void v(boolean z) {
        w(z, null);
    }

    public static void w(boolean z, String str) {
        String str2 = "sports_config_trackTipsIgnore";
        if (str != null) {
            str2 = "sports_config_trackTipsIgnore_" + str;
        }
        x0h.d("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z));
    }

    public static void x(boolean z) {
        y(z, null);
    }

    public static void y(boolean z, String str) {
        String str2 = "sports_config_windowtipsIgnore";
        if (str != null) {
            str2 = "sports_config_windowtipsIgnore_" + str;
        }
        x0h.d("heytap_health_preference_sports.xml", str2, Boolean.valueOf(z));
    }
}
