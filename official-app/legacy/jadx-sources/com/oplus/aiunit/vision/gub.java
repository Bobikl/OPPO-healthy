package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public class gub {
    public static boolean A(String str, boolean z) {
        String str2 = "menstrual_config_switch_remind";
        if (str != null) {
            str2 = "menstrual_config_switch_remind_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_null.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean B(boolean z) {
        return A(null, z);
    }

    public static long C() {
        return D(0L);
    }

    public static long D(long j2) {
        return E(null, j2);
    }

    public static long E(String str, long j2) {
        String str2 = "menstrual_config_symptomLastSyncTime";
        if (str != null) {
            str2 = "menstrual_config_symptomLastSyncTime_" + str;
        }
        return ((Long) x0h.b("heytap_health_null.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static int F() {
        return G(0);
    }

    public static int G(int i) {
        return H(null, i);
    }

    public static int H(String str, int i) {
        String str2 = "menstrual_config_wrist_temperature_tip_last_show_date";
        if (str != null) {
            str2 = "menstrual_config_wrist_temperature_tip_last_show_date_" + str;
        }
        return ((Integer) x0h.b("heytap_health_null.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static int I() {
        return J(0);
    }

    public static int J(int i) {
        return K(null, i);
    }

    public static int K(String str, int i) {
        String str2 = "menstrual_config_wrist_temperature_tip_last_show_time";
        if (str != null) {
            str2 = "menstrual_config_wrist_temperature_tip_last_show_time_" + str;
        }
        return ((Integer) x0h.b("heytap_health_null.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static int L() {
        return M(0);
    }

    public static int M(int i) {
        return N(null, i);
    }

    public static int N(String str, int i) {
        String str2 = "menstrual_config_wrist_temperature_tip_show_count";
        if (str != null) {
            str2 = "menstrual_config_wrist_temperature_tip_show_count_" + str;
        }
        return ((Integer) x0h.b("heytap_health_null.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void O(int i, String str) {
        String str2 = "menstrual_config_algo_cycle__days";
        if (str != null) {
            str2 = "menstrual_config_algo_cycle__days_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Integer.valueOf(i));
    }

    public static void P(int i, String str) {
        String str2 = "menstrual_config_algo_period_days";
        if (str != null) {
            str2 = "menstrual_config_algo_period_days_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Integer.valueOf(i));
    }

    public static void Q(String str) {
        R(str, null);
    }

    public static void R(String str, String str2) {
        String str3 = "menstrual_config_cycle_correction_closed";
        if (str2 != null) {
            str3 = "menstrual_config_cycle_correction_closed_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static void S(int i, String str) {
        String str2 = "menstrual_config_cycle_setting_days";
        if (str != null) {
            str2 = "menstrual_config_cycle_setting_days_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Integer.valueOf(i));
    }

    public static void T(long j2, String str) {
        String str2 = "menstrual_config_last_period_days";
        if (str != null) {
            str2 = "menstrual_config_last_period_days_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Long.valueOf(j2));
    }

    public static void U(String str) {
        V(str, null);
    }

    public static void V(String str, String str2) {
        String str3 = "menstrual_config_last_sent_device_cycle_data";
        if (str2 != null) {
            str3 = "menstrual_config_last_sent_device_cycle_data_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static void W(String str) {
        X(str, null);
    }

    public static void X(String str, String str2) {
        String str3 = "menstrual_config_last_sent_device_cycle_data_v1";
        if (str2 != null) {
            str3 = "menstrual_config_last_sent_device_cycle_data_v1_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static void Y(String str) {
        Z(str, null);
    }

    public static void Z(String str, String str2) {
        String str3 = "menstrual_config_last_sent_device_symptom_data";
        if (str2 != null) {
            str3 = "menstrual_config_last_sent_device_symptom_data_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static int a(String str, int i) {
        String str2 = "menstrual_config_algo_cycle__days";
        if (str != null) {
            str2 = "menstrual_config_algo_cycle__days_" + str;
        }
        return ((Integer) x0h.b("heytap_health_null.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void a0(String str) {
        b0(str, null);
    }

    public static int b(String str, int i) {
        String str2 = "menstrual_config_algo_period_days";
        if (str != null) {
            str2 = "menstrual_config_algo_period_days_" + str;
        }
        return ((Integer) x0h.b("heytap_health_null.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void b0(String str, String str2) {
        String str3 = "menstrual_config_marked_symptom";
        if (str2 != null) {
            str3 = "menstrual_config_marked_symptom_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static String c() {
        return d("");
    }

    public static void c0(String str) {
        d0(str, null);
    }

    public static String d(String str) {
        return e(null, str);
    }

    public static void d0(String str, String str2) {
        String str3 = "menstrual_config_menstrual_cycle_predictive_data";
        if (str2 != null) {
            str3 = "menstrual_config_menstrual_cycle_predictive_data_" + str2;
        }
        x0h.d("heytap_health_null.xml", str3, str);
    }

    public static String e(String str, String str2) {
        String str3 = "menstrual_config_cycle_correction_closed";
        if (str != null) {
            str3 = "menstrual_config_cycle_correction_closed_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static void e0(int i, String str) {
        String str2 = "menstrual_config_period_setting_days";
        if (str != null) {
            str2 = "menstrual_config_period_setting_days_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Integer.valueOf(i));
    }

    public static int f(String str, int i) {
        String str2 = "menstrual_config_cycle_setting_days";
        if (str != null) {
            str2 = "menstrual_config_cycle_setting_days_" + str;
        }
        return ((Integer) x0h.b("heytap_health_null.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void f0(long j2, String str) {
        String str2 = "menstrual_config_setting_create_time";
        if (str != null) {
            str2 = "menstrual_config_setting_create_time_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Long.valueOf(j2));
    }

    public static long g(String str, long j2) {
        String str2 = "menstrual_config_last_period_days";
        if (str != null) {
            str2 = "menstrual_config_last_period_days_" + str;
        }
        return ((Long) x0h.b("heytap_health_null.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static void g0(long j2, String str) {
        String str2 = "menstrual_config_setting_modify_time";
        if (str != null) {
            str2 = "menstrual_config_setting_modify_time_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Long.valueOf(j2));
    }

    public static String h() {
        return i("");
    }

    public static void h0(boolean z) {
        i0(z, null);
    }

    public static String i(String str) {
        return j(null, str);
    }

    public static void i0(boolean z, String str) {
        String str2 = "menstrual_config_switch_remind";
        if (str != null) {
            str2 = "menstrual_config_switch_remind_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Boolean.valueOf(z));
    }

    public static String j(String str, String str2) {
        String str3 = "menstrual_config_last_sent_device_cycle_data";
        if (str != null) {
            str3 = "menstrual_config_last_sent_device_cycle_data_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static void j0(long j2) {
        k0(j2, null);
    }

    public static String k() {
        return l("");
    }

    public static void k0(long j2, String str) {
        String str2 = "menstrual_config_symptomLastSyncTime";
        if (str != null) {
            str2 = "menstrual_config_symptomLastSyncTime_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Long.valueOf(j2));
    }

    public static String l(String str) {
        return m(null, str);
    }

    public static void l0(int i) {
        m0(i, null);
    }

    public static String m(String str, String str2) {
        String str3 = "menstrual_config_last_sent_device_cycle_data_v1";
        if (str != null) {
            str3 = "menstrual_config_last_sent_device_cycle_data_v1_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static void m0(int i, String str) {
        String str2 = "menstrual_config_wrist_temperature_tip_last_show_date";
        if (str != null) {
            str2 = "menstrual_config_wrist_temperature_tip_last_show_date_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Integer.valueOf(i));
    }

    public static String n() {
        return o("");
    }

    public static void n0(int i) {
        o0(i, null);
    }

    public static String o(String str) {
        return p(null, str);
    }

    public static void o0(int i, String str) {
        String str2 = "menstrual_config_wrist_temperature_tip_last_show_time";
        if (str != null) {
            str2 = "menstrual_config_wrist_temperature_tip_last_show_time_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Integer.valueOf(i));
    }

    public static String p(String str, String str2) {
        String str3 = "menstrual_config_last_sent_device_symptom_data";
        if (str != null) {
            str3 = "menstrual_config_last_sent_device_symptom_data_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static void p0(int i) {
        q0(i, null);
    }

    public static String q() {
        return r("");
    }

    public static void q0(int i, String str) {
        String str2 = "menstrual_config_wrist_temperature_tip_show_count";
        if (str != null) {
            str2 = "menstrual_config_wrist_temperature_tip_show_count_" + str;
        }
        x0h.d("heytap_health_null.xml", str2, Integer.valueOf(i));
    }

    public static String r(String str) {
        return s(null, str);
    }

    public static String s(String str, String str2) {
        String str3 = "menstrual_config_marked_symptom";
        if (str != null) {
            str3 = "menstrual_config_marked_symptom_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static String t() {
        return u("");
    }

    public static String u(String str) {
        return v(null, str);
    }

    public static String v(String str, String str2) {
        String str3 = "menstrual_config_menstrual_cycle_predictive_data";
        if (str != null) {
            str3 = "menstrual_config_menstrual_cycle_predictive_data_" + str;
        }
        return (String) x0h.b("heytap_health_null.xml", str3, str2);
    }

    public static int w(String str, int i) {
        String str2 = "menstrual_config_period_setting_days";
        if (str != null) {
            str2 = "menstrual_config_period_setting_days_" + str;
        }
        return ((Integer) x0h.b("heytap_health_null.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static long x(String str, long j2) {
        String str2 = "menstrual_config_setting_create_time";
        if (str != null) {
            str2 = "menstrual_config_setting_create_time_" + str;
        }
        return ((Long) x0h.b("heytap_health_null.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static long y(String str, long j2) {
        String str2 = "menstrual_config_setting_modify_time";
        if (str != null) {
            str2 = "menstrual_config_setting_modify_time_" + str;
        }
        return ((Long) x0h.b("heytap_health_null.xml", str2, Long.valueOf(j2))).longValue();
    }

    public static boolean z() {
        return B(true);
    }
}
