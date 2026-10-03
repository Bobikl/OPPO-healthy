package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public class q3d {
    public static String a = "OOBEUtil";

    public static int a(Context context, String str) {
        int iA = o1h.a(context.getApplicationContext(), "oobe_current_state/" + str);
        ml4.a(a, "getCurrentState, mac:" + str + ", state:" + iA);
        return iA;
    }

    public static String b(Context context) {
        return o1h.d(context, o1h.OOBE_MAC, "");
    }

    public static String c(Context context) {
        return o1h.d(context, o1h.OOBE_DEVICE_MODEL, "");
    }

    public static boolean d() {
        return 1 == o1h.a(null, o1h.KEY_ENTER_OOBE);
    }

    public static boolean e(String str, int i) {
        boolean z;
        String str2;
        if (((Boolean) lc5.c(str).a(new uv0())).booleanValue()) {
            z = i == 0 || 1 == i;
            str2 = "band";
        } else {
            z = (10 < i && 60 > i) || 10 == i || i == 0;
            str2 = "not band";
        }
        ml4.a(a, "oobeUndone, mac:" + str + ", type:" + str2 + ", undone:" + z + ", status:" + i);
        return z;
    }

    public static void f(Context context, String str) {
        if (TextUtils.equals(b(context), str)) {
            ml4.a(a, "has saveOOBEOrMigrateMac:" + str);
            return;
        }
        ml4.a(a, "saveOOBEMac:" + str);
        o1h.g(context, o1h.OOBE_MAC, str);
    }

    public static void g(Context context, String str) {
        if (TextUtils.equals(c(context), str)) {
            ml4.a(a, "has saveOOBEOrMigrateModel:" + str);
            return;
        }
        ml4.a(a, "saveOOBEModel:" + str);
        o1h.g(context, o1h.OOBE_DEVICE_MODEL, str);
    }

    public static void h(Context context, String str, int i) {
        ml4.a(a, "setCurrentState, mac:" + str + ", tate:" + i);
        Context applicationContext = context.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append("oobe_current_state/");
        sb.append(str);
        o1h.e(applicationContext, sb.toString(), i);
    }

    public static void i(boolean z) {
        if (d() == z) {
            StringBuilder sb = new StringBuilder();
            sb.append("has setEnterOOBE:");
            sb.append(z);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setHasEnterOOBE:");
            sb2.append(z);
            o1h.e(null, o1h.KEY_ENTER_OOBE, z ? 1 : 0);
        }
    }
}
