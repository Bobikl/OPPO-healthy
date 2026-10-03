package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class dsc {
    public static long a(String str, long j2) {
        return b(str, null, j2);
    }

    public static long b(String str, String str2, long j2) {
        String str3 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str4 = "nfc_tips_card_record_closeTime";
        if (str2 != null) {
            str4 = "nfc_tips_card_record_closeTime_" + str2;
        }
        return ((Long) x0h.b(str3, str4, Long.valueOf(j2))).longValue();
    }

    public static boolean c(String str, boolean z) {
        String str2 = "nfc_tips_card_record_quickTransferNeverRemind";
        if (str != null) {
            str2 = "nfc_tips_card_record_quickTransferNeverRemind_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_watchface.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean d(boolean z) {
        return c(null, z);
    }

    public static void e(String str, long j2) {
        f(str, j2, null);
    }

    public static void f(String str, long j2, String str2) {
        String str3 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str4 = "nfc_tips_card_record_closeTime";
        if (str2 != null) {
            str4 = "nfc_tips_card_record_closeTime_" + str2;
        }
        x0h.d(str3, str4, Long.valueOf(j2));
    }

    public static void g(boolean z) {
        h(z, null);
    }

    public static void h(boolean z, String str) {
        String str2 = "nfc_tips_card_record_quickTransferNeverRemind";
        if (str != null) {
            str2 = "nfc_tips_card_record_quickTransferNeverRemind_" + str;
        }
        x0h.d("heytap_health_watchface.xml", str2, Boolean.valueOf(z));
    }
}
