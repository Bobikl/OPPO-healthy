package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class pjk {
    public static String a(String str) {
        return b(str, "");
    }

    public static String b(String str, String str2) {
        return c(str, null, str2);
    }

    public static String c(String str, String str2, String str3) {
        String str4 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str5 = "update_item_items";
        if (str2 != null) {
            str5 = "update_item_items_" + str2;
        }
        return (String) x0h.b(str4, str5, str3);
    }

    public static void d(String str, String str2) {
        e(str, str2, null);
    }

    public static void e(String str, String str2, String str3) {
        String str4 = "heytap_health_watchface_" + x0h.c(str) + ".xml";
        String str5 = "update_item_items";
        if (str3 != null) {
            str5 = "update_item_items_" + str3;
        }
        x0h.d(str4, str5, str2);
    }
}
