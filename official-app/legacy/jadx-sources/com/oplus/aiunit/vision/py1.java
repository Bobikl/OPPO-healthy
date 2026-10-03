package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class py1 {
    public static int a(String str, int i) {
        String str2 = "health_body_fat_config_weightPrecision";
        if (str != null) {
            str2 = "health_body_fat_config_weightPrecision_" + str;
        }
        return ((Integer) x0h.b("heytap_health_null.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static int b(String str, int i) {
        String str2 = "health_body_fat_config_weightUnit";
        if (str != null) {
            str2 = "health_body_fat_config_weightUnit_" + str;
        }
        return ((Integer) x0h.b("heytap_health_null.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void c(int i, String str) {
        String str2 = "health_body_fat_config_weightPrecision";
        if (str != null) {
            str2 = "health_body_fat_config_weightPrecision_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Integer.valueOf(i));
    }

    public static void d(int i, String str) {
        String str2 = "health_body_fat_config_weightUnit";
        if (str != null) {
            str2 = "health_body_fat_config_weightUnit_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Integer.valueOf(i));
    }
}
