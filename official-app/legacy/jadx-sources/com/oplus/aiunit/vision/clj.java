package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public class clj {
    public static volatile Method a;

    public static String a(String str, String str2) {
        try {
            if (a == null) {
                synchronized (clj.class) {
                    if (a == null) {
                        a = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class);
                    }
                }
            }
            return (String) a.invoke(null, str, str2);
        } catch (Throwable th) {
            q7b.f(clj.class.getSimpleName(), "get system properties failed!", th);
            return str2;
        }
    }
}
