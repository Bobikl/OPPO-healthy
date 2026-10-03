package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public class blj {
    public static volatile Method a;

    public static String a(String str, String str2) {
        try {
            if (a == null) {
                synchronized (blj.class) {
                    if (a == null) {
                        a = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class);
                    }
                }
            }
            return (String) a.invoke(null, str, str2);
        } catch (Throwable th) {
            bn.c(blj.class.getSimpleName(), "get system properties failed! exception:" + th.getMessage());
            return str2;
        }
    }
}
