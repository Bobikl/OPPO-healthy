package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class yoj {
    public static volatile Method a;

    public static String a(String str, String str2) {
        try {
            if (a == null) {
                synchronized (yoj.class) {
                    if (a == null) {
                        a = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class);
                    }
                }
            }
            return (String) a.invoke(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
