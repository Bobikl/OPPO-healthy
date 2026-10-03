package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class ld9 {
    public static void A(String str, String str2) {
        String str3 = "home_rank_config_homeRankCity";
        if (str2 != null) {
            str3 = "home_rank_config_homeRankCity_" + str2;
        }
        x0h.d("heytap_health_preference_home.xml", str3, str);
    }

    public static void B(int i) {
        C(i, null);
    }

    public static void C(int i, String str) {
        String str2 = "home_rank_config_homeRankDate";
        if (str != null) {
            str2 = "home_rank_config_homeRankDate_" + str;
        }
        x0h.d("heytap_health_preference_home.xml", str2, Integer.valueOf(i));
    }

    public static void D(boolean z) {
        E(z, null);
    }

    public static void E(boolean z, String str) {
        String str2 = "home_rank_config_homeRankFirstOpen";
        if (str != null) {
            str2 = "home_rank_config_homeRankFirstOpen_" + str;
        }
        x0h.d("heytap_health_preference_home.xml", str2, Boolean.valueOf(z));
    }

    public static void F(String str) {
        G(str, null);
    }

    public static void G(String str, String str2) {
        String str3 = "home_rank_config_homeRankLatitude";
        if (str2 != null) {
            str3 = "home_rank_config_homeRankLatitude_" + str2;
        }
        x0h.d("heytap_health_preference_home.xml", str3, str);
    }

    public static void H(String str) {
        I(str, null);
    }

    public static void I(String str, String str2) {
        String str3 = "home_rank_config_homeRankList";
        if (str2 != null) {
            str3 = "home_rank_config_homeRankList_" + str2;
        }
        x0h.d("heytap_health_preference_home.xml", str3, str);
    }

    public static void J(String str) {
        K(str, null);
    }

    public static void K(String str, String str2) {
        String str3 = "home_rank_config_homeRankLocation";
        if (str2 != null) {
            str3 = "home_rank_config_homeRankLocation_" + str2;
        }
        x0h.d("heytap_health_preference_home.xml", str3, str);
    }

    public static void L(String str) {
        M(str, null);
    }

    public static void M(String str, String str2) {
        String str3 = "home_rank_config_homeRankLongtitude";
        if (str2 != null) {
            str3 = "home_rank_config_homeRankLongtitude_" + str2;
        }
        x0h.d("heytap_health_preference_home.xml", str3, str);
    }

    public static void N(boolean z) {
        O(z, null);
    }

    public static void O(boolean z, String str) {
        String str2 = "home_rank_config_homeRankPermission";
        if (str != null) {
            str2 = "home_rank_config_homeRankPermission_" + str;
        }
        x0h.d("heytap_health_preference_home.xml", str2, Boolean.valueOf(z));
    }

    public static void P(String str) {
        Q(str, null);
    }

    public static void Q(String str, String str2) {
        String str3 = "home_rank_config_homeRankRanking";
        if (str2 != null) {
            str3 = "home_rank_config_homeRankRanking_" + str2;
        }
        x0h.d("heytap_health_preference_home.xml", str3, str);
    }

    public static void R(long j2) {
        S(j2, null);
    }

    public static void S(long j2, String str) {
        String str2 = "home_rank_config_homeRankTimeStamp";
        if (str != null) {
            str2 = "home_rank_config_homeRankTimeStamp_" + str;
        }
        x0h.d("heytap_health_preference_home.xml", str2, Long.valueOf(j2));
    }

    public static void T(boolean z) {
        U(z, null);
    }

    public static void U(boolean z, String str) {
        String str2 = "home_rank_config_isMigrate";
        if (str != null) {
            str2 = "home_rank_config_isMigrate_" + str;
        }
        x0h.d("heytap_health_preference_home.xml", str2, Boolean.valueOf(z));
    }

    public static String a() {
        return b("");
    }

    public static String b(String str) {
        return c(null, str);
    }

    public static String c(String str, String str2) {
        String str3 = "home_rank_config_area";
        if (str != null) {
            str3 = "home_rank_config_area_" + str;
        }
        return (String) x0h.b("heytap_health_preference_home.xml", str3, str2);
    }

    public static String d() {
        return e("");
    }

    public static String e(String str) {
        return f(null, str);
    }

    public static String f(String str, String str2) {
        String str3 = "home_rank_config_city";
        if (str != null) {
            str3 = "home_rank_config_city_" + str;
        }
        return (String) x0h.b("heytap_health_preference_home.xml", str3, str2);
    }

    public static boolean g(String str, boolean z) {
        String str2 = "home_rank_config_homeRankFirstOpen";
        if (str != null) {
            str2 = "home_rank_config_homeRankFirstOpen_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_preference_home.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean h(boolean z) {
        return g(null, z);
    }

    public static boolean i() {
        return k(false);
    }

    public static boolean j(String str, boolean z) {
        String str2 = "home_rank_config_homeRankPermission";
        if (str != null) {
            str2 = "home_rank_config_homeRankPermission_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_preference_home.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean k(boolean z) {
        return j(null, z);
    }

    public static String l() {
        return m("");
    }

    public static String m(String str) {
        return n(null, str);
    }

    public static String n(String str, String str2) {
        String str3 = "home_rank_config_homeRankRanking";
        if (str != null) {
            str3 = "home_rank_config_homeRankRanking_" + str;
        }
        return (String) x0h.b("heytap_health_preference_home.xml", str3, str2);
    }

    public static long o() {
        return p(0L);
    }

    public static long p(long j2) {
        return q(null, j2);
    }

    public static long q(String str, long j2) {
        String str2 = "home_rank_config_homeRankTimeStamp";
        if (str != null) {
            str2 = "home_rank_config_homeRankTimeStamp_" + str;
        }
        return ((Long) x0h.b("heytap_health_preference_home.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static boolean r(String str, boolean z) {
        String str2 = "home_rank_config_isMigrate";
        if (str != null) {
            str2 = "home_rank_config_isMigrate_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_preference_home.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean s(boolean z) {
        return r(null, z);
    }

    public static void t(String str) {
        u(str, null);
    }

    public static void u(String str, String str2) {
        String str3 = "home_rank_config_area";
        if (str2 != null) {
            str3 = "home_rank_config_area_" + str2;
        }
        x0h.d("heytap_health_preference_home.xml", str3, str);
    }

    public static void v(String str) {
        w(str, null);
    }

    public static void w(String str, String str2) {
        String str3 = "home_rank_config_city";
        if (str2 != null) {
            str3 = "home_rank_config_city_" + str2;
        }
        x0h.d("heytap_health_preference_home.xml", str3, str);
    }

    public static void x(String str) {
        y(str, null);
    }

    public static void y(String str, String str2) {
        String str3 = "home_rank_config_homeRankAdcode";
        if (str2 != null) {
            str3 = "home_rank_config_homeRankAdcode_" + str2;
        }
        x0h.d("heytap_health_preference_home.xml", str3, str);
    }

    public static void z(String str) {
        A(str, null);
    }
}
