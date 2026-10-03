package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class sq3 {
    public static long a() {
        return b(0L);
    }

    public static long b(long j2) {
        return c(null, j2);
    }

    public static long c(String str, long j2) {
        String str2 = "community_latestFollowPostId";
        if (str != null) {
            str2 = "community_latestFollowPostId_" + str;
        }
        return ((Long) x0h.b("heytap_health_community.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static String d(String str) {
        return e(null, str);
    }

    public static String e(String str, String str2) {
        String str3 = "community_saturationConfig";
        if (str != null) {
            str3 = "community_saturationConfig_" + str;
        }
        return (String) x0h.b("heytap_health_community.xml", str3, str2);
    }

    public static int f(String str, int i) {
        String str2 = "community_tipShownTimes";
        if (str != null) {
            str2 = "community_tipShownTimes_" + str;
        }
        return ((Integer) x0h.b("heytap_health_community.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void g(long j2) {
        h(j2, null);
    }

    public static void h(long j2, String str) {
        String str2 = "community_latestFollowPostId";
        if (str != null) {
            str2 = "community_latestFollowPostId_" + str;
        }
        x0h.d("heytap_health_community.xml", str2, Long.valueOf(j2));
    }

    public static void i(String str) {
        j(str, null);
    }

    public static void j(String str, String str2) {
        String str3 = "community_saturationConfig";
        if (str2 != null) {
            str3 = "community_saturationConfig_" + str2;
        }
        x0h.d("heytap_health_community.xml", str3, str);
    }

    public static void k(int i, String str) {
        String str2 = "community_tipShownTimes";
        if (str != null) {
            str2 = "community_tipShownTimes_" + str;
        }
        x0h.d("heytap_health_community.xml", str2, Integer.valueOf(i));
    }
}
