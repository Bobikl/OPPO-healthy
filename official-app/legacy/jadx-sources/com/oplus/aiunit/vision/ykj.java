package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes19.dex */
public class ykj {
    public static final ykj INSTANCE;
    public static Class a;

    static {
        ykj ykjVar = new ykj();
        INSTANCE = ykjVar;
        a = ykjVar.a("android.os.SystemProperties");
    }

    public final Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "findClassError";
            }
            Log.w("SysteProperty", message, e2);
            return null;
        }
    }

    public final String b(String str, String str2) {
        Class cls = a;
        if (cls == null) {
            return str2;
        }
        try {
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "getError";
            }
            Log.w("SysteProperty", message, th);
            return str2;
        }
    }
}
