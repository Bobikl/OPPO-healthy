package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes5.dex */
public class xil {
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
        a7b.b("WearableLog." + str, f(str2));
    }

    public static void d(String str, String str2) {
        a7b.f("WearableLog." + str, f(str2));
    }

    @SuppressLint({"PrivateApi"})
    public static boolean e() {
        try {
            return ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, "persist.sys.assert.panic", Boolean.FALSE)).booleanValue();
        } catch (Exception e2) {
            a7b.b("WearableLog", "isDebugEnabled e: " + e2.getMessage());
            return false;
        }
    }

    public static String f(String str) {
        return Thread.currentThread().getId() + ":" + str;
    }
}
