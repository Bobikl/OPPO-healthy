package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes12.dex */
public class zxm {
    public static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
