package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class u6b {
    public static void a(String str) {
        try {
            if (rqk.b() == null || !p04.DEBUG) {
                return;
            }
            e6b.a("upgrade_debug", "-->" + str);
        } catch (Exception e2) {
            e6b.a("upgrade_LogUtil", "debugMsg failed : " + e2.getMessage());
        }
    }

    public static void b(String str, String str2) {
        try {
            if (rqk.b() != null) {
                e6b.a("upgrade_key_msg", "-->" + str + " " + str2);
            }
        } catch (Exception e2) {
            e6b.a("upgrade_LogUtil", "keyMsg failed : " + e2.getMessage());
        }
    }
}
