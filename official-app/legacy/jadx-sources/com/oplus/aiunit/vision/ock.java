package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class ock {
    public static boolean a(String str, String str2, boolean z) {
        String str3 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str4 = "try_req_for_watch_err_record_isHaveTry";
        if (str2 != null) {
            str4 = "try_req_for_watch_err_record_isHaveTry_" + str2;
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
        String str3 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str4 = "try_req_for_watch_err_record_isHaveTry";
        if (str2 != null) {
            str4 = "try_req_for_watch_err_record_isHaveTry_" + str2;
        }
        x0h.d(str3, str4, Boolean.valueOf(z));
    }
}
