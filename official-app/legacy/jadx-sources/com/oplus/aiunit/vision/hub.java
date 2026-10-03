package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public class hub {
    public static long a() {
        return b(0L);
    }

    public static long b(long j2) {
        return c(null, j2);
    }

    public static long c(String str, long j2) {
        String str2 = "menstrual_symptom_config_notify_symptom_notify_time";
        if (str != null) {
            str2 = "menstrual_symptom_config_notify_symptom_notify_time_" + str;
        }
        return ((Long) x0h.b("heytap_health_null.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static String d() {
        return e("");
    }

    public static String e(String str) {
        return f(null, str);
    }

    public static String f(String str, String str2) {
        String str3 = "menstrual_symptom_config_symptom_config";
        if (str != null) {
            str3 = "menstrual_symptom_config_symptom_config_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static long g() {
        return h(0L);
    }

    public static long h(long j2) {
        return i(null, j2);
    }

    public static long i(String str, long j2) {
        String str2 = "menstrual_symptom_config_symptom_config_get_time";
        if (str != null) {
            str2 = "menstrual_symptom_config_symptom_config_get_time_" + str;
        }
        return ((Long) x0h.b("heytap_health_null.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static void j(long j2) {
        k(j2, null);
    }

    public static void k(long j2, String str) {
        String str2 = "menstrual_symptom_config_notify_symptom_notify_time";
        if (str != null) {
            str2 = "menstrual_symptom_config_notify_symptom_notify_time_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Long.valueOf(j2));
    }

    public static void l(String str) {
        m(str, null);
    }

    public static void m(String str, String str2) {
        String str3 = "menstrual_symptom_config_symptom_config";
        if (str2 != null) {
            str3 = "menstrual_symptom_config_symptom_config_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static void n(long j2) {
        o(j2, null);
    }

    public static void o(long j2, String str) {
        String str2 = "menstrual_symptom_config_symptom_config_get_time";
        if (str != null) {
            str2 = "menstrual_symptom_config_symptom_config_get_time_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Long.valueOf(j2));
    }
}
