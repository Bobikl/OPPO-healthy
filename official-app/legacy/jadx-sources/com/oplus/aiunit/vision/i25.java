package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class i25 {
    public static final String ACTION_LOG_STATUS = "heytap.intent.action.LOG_COLLECT";
    public static final String PARAM_LOG_STATUS = "collect";
    public static final boolean a;
    public static boolean b;

    static {
        boolean zD = d();
        a = zD;
        b = zD;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return "[" + str + "]" + str2;
    }

    public static void b(String str, String str2) {
        if (b) {
            Log.d("WF", a(str, str2));
        }
    }

    public static void c(String str, String str2) {
        Log.e("WF", a(str, str2));
    }

    public static boolean d() {
        try {
            return ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, "persist.sys.assert.panic", Boolean.FALSE)).booleanValue();
        } catch (Exception e2) {
            Log.e("WF", "isDebugEnabled e: " + e2.getMessage());
            return false;
        }
    }

    public static void e(boolean z) {
        b = z;
    }
}
