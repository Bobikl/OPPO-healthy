package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class bkg {
    public static String a(String str, String str2) {
        String str3 = "search_history";
        if (str != null) {
            str3 = "search_history_" + str;
        }
        return (String) x0h.b("heytap_health_watchface.xml", str3, str2);
    }

    public static void b(String str, String str2) {
        String str3 = "search_history";
        if (str2 != null) {
            str3 = "search_history_" + str2;
        }
        x0h.d("heytap_health_watchface.xml", str3, str);
    }
}
