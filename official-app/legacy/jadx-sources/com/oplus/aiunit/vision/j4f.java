package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes17.dex */
public class j4f {
    public static String a(String str) {
        return b(null, str);
    }

    public static String b(String str, String str2) {
        String str3 = "question_cache";
        if (str != null) {
            str3 = "question_cache_" + str;
        }
        return (String) x0h.b("heytap_health_operation.xml", str3, str2);
    }

    public static boolean c() {
        return e(false);
    }

    public static boolean d(String str, boolean z) {
        String str2 = "question_needQuestion";
        if (str != null) {
            str2 = "question_needQuestion_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_operation.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean e(boolean z) {
        return d(null, z);
    }

    public static int f() {
        return g(0);
    }

    public static int g(int i) {
        return h(null, i);
    }

    public static int h(String str, int i) {
        String str2 = "question_scroll";
        if (str != null) {
            str2 = "question_scroll_" + str;
        }
        return ((Integer) x0h.b("heytap_health_operation.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static boolean i(String str, boolean z) {
        String str2 = "question_showTips";
        if (str != null) {
            str2 = "question_showTips_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_operation.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean j(boolean z) {
        return i(null, z);
    }

    public static void k(String str) {
        l(str, null);
    }

    public static void l(String str, String str2) {
        String str3 = "question_cache";
        if (str2 != null) {
            str3 = "question_cache_" + str2;
        }
        x0h.d("heytap_health_operation.xml", str3, str);
    }

    public static void m(boolean z) {
        n(z, null);
    }

    public static void n(boolean z, String str) {
        String str2 = "question_needQuestion";
        if (str != null) {
            str2 = "question_needQuestion_" + str;
        }
        x0h.d("heytap_health_operation.xml", str2, Boolean.valueOf(z));
    }

    public static void o(int i) {
        p(i, null);
    }

    public static void p(int i, String str) {
        String str2 = "question_scroll";
        if (str != null) {
            str2 = "question_scroll_" + str;
        }
        x0h.d("heytap_health_operation.xml", str2, Integer.valueOf(i));
    }

    public static void q(boolean z) {
        r(z, null);
    }

    public static void r(boolean z, String str) {
        String str2 = "question_showTips";
        if (str != null) {
            str2 = "question_showTips_" + str;
        }
        x0h.d("heytap_health_operation.xml", str2, Boolean.valueOf(z));
    }
}
