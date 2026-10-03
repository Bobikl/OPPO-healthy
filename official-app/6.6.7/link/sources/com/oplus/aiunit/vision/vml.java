package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class vml {
    public static void a(String str) {
        if (e()) {
            f(str);
        }
    }

    public static void b(String str, String str2) {
        if (e()) {
            StringBuilder sb = new StringBuilder();
            sb.append("WearableLog.");
            sb.append(str);
            f(str2);
        }
    }

    public static void c(String str, String str2) {
        m8b.b("WearableLog." + str, f(str2));
    }

    public static void d(String str, String str2) {
        m8b.f("WearableLog." + str, f(str2));
    }

    @SuppressLint({"PrivateApi"})
    public static boolean e() {
        try {
            return ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, "persist.sys.assert.panic", Boolean.FALSE)).booleanValue();
        } catch (Exception e) {
            m8b.b("WearableLog", "isDebugEnabled e: " + e.getMessage());
            return false;
        }
    }

    public static String f(String str) {
        return Thread.currentThread().getId() + ":" + str;
    }
}
