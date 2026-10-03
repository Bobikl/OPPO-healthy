package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class yj {
    public static volatile Method a;

    public static String a(String str, String str2) {
        try {
            if (a == null) {
                synchronized (yj.class) {
                    if (a == null) {
                        a = Class.forName("android.os.SystemProperties").getDeclaredMethod(ParserTag.TAG_GET, String.class, String.class);
                    }
                }
            }
            return (String) a.invoke(null, str, str2);
        } catch (Throwable th) {
            AcLogUtil.e("AcSystemPropertyUtils", th.toString());
            return str2;
        }
    }
}
