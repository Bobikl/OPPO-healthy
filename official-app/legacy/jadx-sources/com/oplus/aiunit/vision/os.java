package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public class os {
    public static String a() {
        return b("");
    }

    public static String b(String str) {
        return c(null, str);
    }

    public static String c(String str, String str2) {
        String str3 = "menstrual_alarm_debug_delay";
        if (str != null) {
            str3 = "menstrual_alarm_debug_delay_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static String d() {
        return e("");
    }

    public static String e(String str) {
        return f(null, str);
    }

    public static String f(String str, String str2) {
        String str3 = "menstrual_alarm_debug_end_time";
        if (str != null) {
            str3 = "menstrual_alarm_debug_end_time_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static String g() {
        return h("");
    }

    public static String h(String str) {
        return i(null, str);
    }

    public static String i(String str, String str2) {
        String str3 = "menstrual_alarm_debug_first_day_time";
        if (str != null) {
            str3 = "menstrual_alarm_debug_first_day_time_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static String j() {
        return k("");
    }

    public static String k(String str) {
        return l(null, str);
    }

    public static String l(String str, String str2) {
        String str3 = "menstrual_alarm_debug_predict_time";
        if (str != null) {
            str3 = "menstrual_alarm_debug_predict_time_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static void m(String str) {
        n(str, null);
    }

    public static void n(String str, String str2) {
        String str3 = "menstrual_alarm_debug_delay";
        if (str2 != null) {
            str3 = "menstrual_alarm_debug_delay_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static void o(String str) {
        p(str, null);
    }

    public static void p(String str, String str2) {
        String str3 = "menstrual_alarm_debug_end_time";
        if (str2 != null) {
            str3 = "menstrual_alarm_debug_end_time_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static void q(String str) {
        r(str, null);
    }

    public static void r(String str, String str2) {
        String str3 = "menstrual_alarm_debug_first_day_time";
        if (str2 != null) {
            str3 = "menstrual_alarm_debug_first_day_time_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static void s(String str) {
        t(str, null);
    }

    public static void t(String str, String str2) {
        String str3 = "menstrual_alarm_debug_predict_time";
        if (str2 != null) {
            str3 = "menstrual_alarm_debug_predict_time_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }
}
