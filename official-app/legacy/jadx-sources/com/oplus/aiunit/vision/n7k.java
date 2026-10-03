package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes2.dex */
public class n7k {
    public static String a(String str, String str2) {
        String str3 = "trackani_trackStyle";
        if (str != null) {
            str3 = "trackani_trackStyle_" + str;
        }
        return (String) x0h.b("heytap_health_sport.xml", str3, str2);
    }

    public static String b(String str, String str2) {
        String str3 = "trackani_trackStyleCache";
        if (str != null) {
            str3 = "trackani_trackStyleCache_" + str;
        }
        return (String) x0h.b("heytap_health_sport.xml", str3, str2);
    }

    public static void c(String str, String str2) {
        String str3 = "trackani_trackStyle";
        if (str2 != null) {
            str3 = "trackani_trackStyle_" + str2;
        }
        x0h.d("heytap_health_sport.xml", str3, str);
    }

    public static void d(String str, String str2) {
        String str3 = "trackani_trackStyleCache";
        if (str2 != null) {
            str3 = "trackani_trackStyleCache_" + str2;
        }
        x0h.d("heytap_health_sport.xml", str3, str);
    }
}
