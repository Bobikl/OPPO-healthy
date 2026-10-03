package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class oa9 {
    public static String a(String str, String str2) {
        String str3 = "homecardspconfig_newCardMsg";
        if (str != null) {
            str3 = "homecardspconfig_newCardMsg_" + str;
        }
        return (String) x0h.b("heytap_health_healthImpl.xml", str3, str2);
    }

    public static void b(String str, String str2) {
        String str3 = "homecardspconfig_newCardMsg";
        if (str2 != null) {
            str3 = "homecardspconfig_newCardMsg_" + str2;
        }
        x0h.d("heytap_health_healthImpl.xml", str3, str);
    }
}
