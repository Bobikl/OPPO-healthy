package com.heytap.store.base.core.util;

import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class SystemPropertyUtils {
    private static volatile Method get;
    private static volatile Method set;

    public static String get(String str, String str2) {
        try {
            if (get == null) {
                synchronized (SystemPropertyUtils.class) {
                    if (get == null) {
                        get = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class);
                    }
                }
            }
            return (String) get.invoke(null, str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }

    public static void set(String str, String str2) {
        try {
            if (set == null) {
                synchronized (SystemPropertyUtils.class) {
                    if (set == null) {
                        set = Class.forName("android.os.SystemProperties").getDeclaredMethod("set", String.class, String.class);
                    }
                }
            }
            set.invoke(null, str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
