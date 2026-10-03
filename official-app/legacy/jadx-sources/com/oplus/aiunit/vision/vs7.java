package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class vs7 {
    public static boolean a(String str, String str2, boolean z) {
        String str3 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str4 = "flexible_variable_record_used";
        if (str2 != null) {
            str4 = "flexible_variable_record_used_" + str2;
        }
        return ((Boolean) x0h.b(str3, str4, Boolean.valueOf(z))).booleanValue();
    }

    public static void b(String str, boolean z, String str2) {
        String str3 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str4 = "flexible_variable_record_used";
        if (str2 != null) {
            str4 = "flexible_variable_record_used_" + str2;
        }
        x0h.d(str3, str4, Boolean.valueOf(z));
    }
}
