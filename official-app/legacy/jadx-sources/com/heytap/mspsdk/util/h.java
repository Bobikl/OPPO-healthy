package com.heytap.mspsdk.util;

import android.annotation.SuppressLint;
import com.heytap.mspsdk.log.MspLog;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes19.dex */
public class h {
    public static Class<?> a;

    @SuppressLint({"PrivateApi"})
    public static Class<?> a() {
        try {
            return Class.forName("android.os.SystemProperties");
        } catch (ClassNotFoundException e2) {
            MspLog.w("SystemPropertyReflect", e2.getMessage());
            return null;
        }
    }

    public static String b(String str, String str2) {
        if (!c()) {
            return str2;
        }
        try {
            return (String) a.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            MspLog.w("SystemPropertyReflect", th.getMessage());
            return str2;
        }
    }

    public static boolean c() {
        if (a != null) {
            return true;
        }
        Class<?> clsA = a();
        a = clsA;
        return clsA != null;
    }
}
