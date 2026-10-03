package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class csc {
    public static int a(String str, int i) {
        return b(str, null, i);
    }

    public static int b(String str, String str2, int i) {
        String str3 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str4 = "nfc_tap_support_record_phoneSupport";
        if (str2 != null) {
            str4 = "nfc_tap_support_record_phoneSupport_" + str2;
        }
        return ((Integer) x0h.b(str3, str4, Integer.valueOf(i))).intValue();
    }

    public static void c(String str, int i) {
        d(str, i, null);
    }

    public static void d(String str, int i, String str2) {
        String str3 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str4 = "nfc_tap_support_record_phoneSupport";
        if (str2 != null) {
            str4 = "nfc_tap_support_record_phoneSupport_" + str2;
        }
        x0h.d(str3, str4, Integer.valueOf(i));
    }
}
