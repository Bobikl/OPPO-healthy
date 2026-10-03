package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class pr6 {
    public static void a(String str) {
        x0h.a("heytap_health_esim_" + x0h.c(str) + ".xml");
    }

    public static boolean b(String str, boolean z) {
        String str2 = "esim_cmccPrivacyShow";
        if (str != null) {
            str2 = "esim_cmccPrivacyShow_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_esim.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean c(boolean z) {
        return b(null, z);
    }

    public static int d(String str) {
        return e(str, 0);
    }

    public static int e(String str, int i) {
        return f(str, null, i);
    }

    public static int f(String str, String str2, int i) {
        String str3 = "heytap_health_esim_" + x0h.c(str) + ".xml";
        String str4 = "esim_active";
        if (str2 != null) {
            str4 = "esim_active_" + str2;
        }
        return ((Integer) x0h.b(str3, str4, Integer.valueOf(i))).intValue();
    }

    public static String g(String str) {
        return h(str, "");
    }

    public static String h(String str, String str2) {
        return i(str, null, str2);
    }

    public static String i(String str, String str2, String str3) {
        String str4 = "heytap_health_esim_" + x0h.c(str) + ".xml";
        String str5 = "esim_eid";
        if (str2 != null) {
            str5 = "esim_eid_" + str2;
        }
        return (String) x0h.b(str4, str5, str3);
    }

    public static String j(String str) {
        return k(str, "");
    }

    public static String k(String str, String str2) {
        return l(str, null, str2);
    }

    public static String l(String str, String str2, String str3) {
        String str4 = "heytap_health_esim_" + x0h.c(str) + ".xml";
        String str5 = "esim_iccid";
        if (str2 != null) {
            str5 = "esim_iccid_" + str2;
        }
        return (String) x0h.b(str4, str5, str3);
    }

    public static String m(String str) {
        return n(str, "");
    }

    public static String n(String str, String str2) {
        return o(str, null, str2);
    }

    public static String o(String str, String str2, String str3) {
        String str4 = "heytap_health_esim_" + x0h.c(str) + ".xml";
        String str5 = "esim_imei";
        if (str2 != null) {
            str5 = "esim_imei_" + str2;
        }
        return (String) x0h.b(str4, str5, str3);
    }

    public static void p(boolean z) {
        q(z, null);
    }

    public static void q(boolean z, String str) {
        String str2 = "esim_cmccPrivacyShow";
        if (str != null) {
            str2 = "esim_cmccPrivacyShow_" + str;
        }
        x0h.d("heytap_health_esim.xml", str2, Boolean.valueOf(z));
    }

    public static void r(String str, int i) {
        s(str, i, null);
    }

    public static void s(String str, int i, String str2) {
        String str3 = "heytap_health_esim_" + x0h.c(str) + ".xml";
        String str4 = "esim_active";
        if (str2 != null) {
            str4 = "esim_active_" + str2;
        }
        x0h.d(str3, str4, Integer.valueOf(i));
    }

    public static void t(String str, String str2) {
        u(str, str2, null);
    }

    public static void u(String str, String str2, String str3) {
        String str4 = "heytap_health_esim_" + x0h.c(str) + ".xml";
        String str5 = "esim_eid";
        if (str3 != null) {
            str5 = "esim_eid_" + str3;
        }
        x0h.d(str4, str5, str2);
    }

    public static void v(String str, String str2) {
        w(str, str2, null);
    }

    public static void w(String str, String str2, String str3) {
        String str4 = "heytap_health_esim_" + x0h.c(str) + ".xml";
        String str5 = "esim_iccid";
        if (str3 != null) {
            str5 = "esim_iccid_" + str3;
        }
        x0h.d(str4, str5, str2);
    }

    public static void x(String str, String str2) {
        y(str, str2, null);
    }

    public static void y(String str, String str2, String str3) {
        String str4 = "heytap_health_esim_" + x0h.c(str) + ".xml";
        String str5 = "esim_imei";
        if (str3 != null) {
            str5 = "esim_imei_" + str3;
        }
        x0h.d(str4, str5, str2);
    }
}
