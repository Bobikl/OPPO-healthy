package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class zm {
    public static void a() {
        x0h.a("heytap_health_preference_account.xml");
    }

    public static String b() {
        return c("");
    }

    public static String c(String str) {
        return d(null, str);
    }

    public static String d(String str, String str2) {
        String str3 = "sp_account_info_accountName";
        if (str != null) {
            str3 = "sp_account_info_accountName_" + str;
        }
        return (String) x0h.b("heytap_health_preference_account.xml", str3, str2);
    }

    public static String e() {
        return f("");
    }

    public static String f(String str) {
        return g(null, str);
    }

    public static String g(String str, String str2) {
        String str3 = "sp_account_info_userName";
        if (str != null) {
            str3 = "sp_account_info_userName_" + str;
        }
        return (String) x0h.b("heytap_health_preference_account.xml", str3, str2);
    }

    public static void h(String str) {
        i(str, null);
    }

    public static void i(String str, String str2) {
        String str3 = "sp_account_info_accountName";
        if (str2 != null) {
            str3 = "sp_account_info_accountName_" + str2;
        }
        x0h.d("heytap_health_preference_account.xml", str3, str);
    }

    public static void j(String str) {
        k(str, null);
    }

    public static void k(String str, String str2) {
        String str3 = "sp_account_info_userName";
        if (str2 != null) {
            str3 = "sp_account_info_userName_" + str2;
        }
        x0h.d("heytap_health_preference_account.xml", str3, str);
    }
}
