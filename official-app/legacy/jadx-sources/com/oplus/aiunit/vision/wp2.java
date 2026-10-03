package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class wp2 {
    public static String a() {
        return b("");
    }

    public static String b(String str) {
        return c(null, str);
    }

    public static String c(String str, String str2) {
        String str3 = "calendardatasync_macAddress";
        if (str != null) {
            str3 = "calendardatasync_macAddress_" + str;
        }
        return (String) x0h.b("heytap_health_calendar.xml", str3, str2);
    }

    public static void d(String str) {
        e(str, null);
    }

    public static void e(String str, String str2) {
        String str3 = "calendardatasync_macAddress";
        if (str2 != null) {
            str3 = "calendardatasync_macAddress_" + str2;
        }
        x0h.d("heytap_health_calendar.xml", str3, str);
    }
}
