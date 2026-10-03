package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes2.dex */
public class zji {
    public static int a(int i) {
        return b(null, i);
    }

    public static int b(String str, int i) {
        String str2 = "sports_impl_config_coachTipsLastTab";
        if (str != null) {
            str2 = "sports_impl_config_coachTipsLastTab_" + str;
        }
        return ((Integer) x0h.b("heytap_health_sport.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static boolean c() {
        return e(false);
    }

    public static boolean d(String str, boolean z) {
        String str2 = "sports_impl_config_exerciseLoadUsed";
        if (str != null) {
            str2 = "sports_impl_config_exerciseLoadUsed_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_sport.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean e(boolean z) {
        return d(null, z);
    }

    public static boolean f() {
        return h(false);
    }

    public static boolean g(String str, boolean z) {
        String str2 = "sports_impl_config_hasTipsCoachNoSleepData";
        if (str != null) {
            str2 = "sports_impl_config_hasTipsCoachNoSleepData_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_sport.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean h(boolean z) {
        return g(null, z);
    }

    public static int i() {
        return j(0);
    }

    public static int j(int i) {
        return k(null, i);
    }

    public static int k(String str, int i) {
        String str2 = "sports_impl_config_homeSportsTabLastSportMode";
        if (str != null) {
            str2 = "sports_impl_config_homeSportsTabLastSportMode_" + str;
        }
        return ((Integer) x0h.b("heytap_health_sport.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static String l(String str, String str2) {
        String str3 = "sports_impl_config_sportRecordNotificationFlag";
        if (str != null) {
            str3 = "sports_impl_config_sportRecordNotificationFlag_" + str;
        }
        return (String) x0h.b("heytap_health_sport.xml", str3, str2);
    }

    public static boolean m(String str, boolean z) {
        String str2 = "sports_impl_config_thirdIntensityShowed";
        if (str != null) {
            str2 = "sports_impl_config_thirdIntensityShowed_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_sport.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static void n(int i) {
        o(i, null);
    }

    public static void o(int i, String str) {
        String str2 = "sports_impl_config_coachTipsLastTab";
        if (str != null) {
            str2 = "sports_impl_config_coachTipsLastTab_" + str;
        }
        x0h.d("heytap_health_sport.xml", str2, Integer.valueOf(i));
    }

    public static void p(boolean z) {
        q(z, null);
    }

    public static void q(boolean z, String str) {
        String str2 = "sports_impl_config_exerciseLoadUsed";
        if (str != null) {
            str2 = "sports_impl_config_exerciseLoadUsed_" + str;
        }
        x0h.d("heytap_health_sport.xml", str2, Boolean.valueOf(z));
    }

    public static void r(boolean z) {
        s(z, null);
    }

    public static void s(boolean z, String str) {
        String str2 = "sports_impl_config_hasTipsCoachNoSleepData";
        if (str != null) {
            str2 = "sports_impl_config_hasTipsCoachNoSleepData_" + str;
        }
        x0h.d("heytap_health_sport.xml", str2, Boolean.valueOf(z));
    }

    public static void t(int i) {
        u(i, null);
    }

    public static void u(int i, String str) {
        String str2 = "sports_impl_config_homeSportsTabLastSportMode";
        if (str != null) {
            str2 = "sports_impl_config_homeSportsTabLastSportMode_" + str;
        }
        x0h.d("heytap_health_sport.xml", str2, Integer.valueOf(i));
    }

    public static void v(String str, String str2) {
        String str3 = "sports_impl_config_sportRecordNotificationFlag";
        if (str2 != null) {
            str3 = "sports_impl_config_sportRecordNotificationFlag_" + str2;
        }
        x0h.d("heytap_health_sport.xml", str3, str);
    }

    public static void w(boolean z, String str) {
        String str2 = "sports_impl_config_thirdIntensityShowed";
        if (str != null) {
            str2 = "sports_impl_config_thirdIntensityShowed_" + str;
        }
        x0h.d("heytap_health_sport.xml", str2, Boolean.valueOf(z));
    }
}
