package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class gti {
    public static String a() {
        return b("");
    }

    public static String b(String str) {
        return c(null, str);
    }

    public static String c(String str, String str2) {
        String str3 = "step_detail_config_hasClickStepResNoRemind";
        if (str != null) {
            str3 = "step_detail_config_hasClickStepResNoRemind_" + str;
        }
        return (String) x0h.b("heytap_health_step.xml", str3, str2);
    }

    public static String d() {
        return e("");
    }

    public static String e(String str) {
        return f(null, str);
    }

    public static String f(String str, String str2) {
        String str3 = "step_detail_config_lastStepResShow";
        if (str != null) {
            str3 = "step_detail_config_lastStepResShow_" + str;
        }
        return (String) x0h.b("heytap_health_step.xml", str3, str2);
    }

    public static void g(String str) {
        h(str, null);
    }

    public static void h(String str, String str2) {
        String str3 = "step_detail_config_hasClickStepResNoRemind";
        if (str2 != null) {
            str3 = "step_detail_config_hasClickStepResNoRemind_" + str2;
        }
        x0h.d("heytap_health_step.xml", str3, str);
    }

    public static void i(String str) {
        j(str, null);
    }

    public static void j(String str, String str2) {
        String str3 = "step_detail_config_lastStepResShow";
        if (str2 != null) {
            str3 = "step_detail_config_lastStepResShow_" + str2;
        }
        x0h.d("heytap_health_step.xml", str3, str);
    }
}
