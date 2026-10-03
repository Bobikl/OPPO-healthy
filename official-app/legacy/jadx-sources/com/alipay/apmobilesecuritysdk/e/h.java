package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;
import com.oplus.aiunit.vision.fcm;
import com.oplus.aiunit.vision.fhm;
import com.oplus.aiunit.vision.hsm;
import com.oplus.aiunit.vision.vam;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class h {
    public static String a = "";

    public static long a(Context context) {
        String strA = fcm.a(context, "vkeyid_settings", "update_time_interval");
        if (!vam.f(strA)) {
            return 86400000L;
        }
        try {
            return Long.parseLong(strA);
        } catch (Exception unused) {
            return 86400000L;
        }
    }

    public static String b(Context context) {
        return fcm.a(context, "vkeyid_settings", "last_apdid_env");
    }

    public static void c(Context context, String str) {
        a(context, "last_apdid_env", str);
    }

    public static String d(Context context) {
        return fcm.a(context, "vkeyid_settings", "dynamic_key");
    }

    public static String e(Context context) {
        return fcm.a(context, "vkeyid_settings", "apse_degrade");
    }

    public static String f(Context context) {
        String str;
        SharedPreferences.Editor editorEdit;
        synchronized (h.class) {
            if (vam.c(a)) {
                String strA = hsm.a(context, "alipay_vkey_random", "random", "");
                a = strA;
                if (vam.c(strA)) {
                    String strA2 = fhm.a(UUID.randomUUID().toString());
                    a = strA2;
                    if (strA2 != null && (editorEdit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                        editorEdit.putString("random", strA2);
                        editorEdit.commit();
                    }
                }
            }
            str = a;
        }
        return str;
    }

    public static void g(Context context, String str) {
        a(context, "apse_degrade", str);
    }

    public static long h(Context context, String str) {
        try {
            String strA = fcm.a(context, "vkeyid_settings", "vkey_valid" + str);
            if (vam.c(strA)) {
                return 0L;
            }
            return Long.parseLong(strA);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static void a(Context context, String str) {
        a(context, "update_time_interval", str);
    }

    public static void b(Context context, String str) {
        a(context, "last_machine_boot_time", str);
    }

    public static boolean c(Context context) {
        String strA = fcm.a(context, "vkeyid_settings", "log_switch");
        return strA != null && "1".equals(strA);
    }

    public static void d(Context context, String str) {
        a(context, "agent_switch", str);
    }

    public static void e(Context context, String str) {
        a(context, "dynamic_key", str);
    }

    public static void f(Context context, String str) {
        a(context, "webrtc_url", str);
    }

    public static void a(Context context, String str, long j2) {
        fcm.b(context, "vkeyid_settings", "vkey_valid" + str, String.valueOf(j2));
    }

    public static void a(Context context, String str, String str2) {
        fcm.b(context, "vkeyid_settings", str, str2);
    }

    public static void a(Context context, boolean z) {
        a(context, "log_switch", z ? "1" : "0");
    }
}
