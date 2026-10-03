package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public class c0n {
    public static String a = "G0";

    public static boolean a(byte b) {
        return (b >= 48 && b <= 57) || (b >= 97 && b <= 122) || (b >= 65 && b <= 90);
    }

    public static boolean b(String str) {
        if (str == null) {
            return true;
        }
        return "".equals(str.trim());
    }

    @SuppressLint({"DefaultLocale"})
    public static String c(String str) {
        if (b(str)) {
            return str;
        }
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (!a(bytes[i])) {
                bytes[i] = 48;
            }
        }
        String strB = ubb.b(Build.MODEL + new String(bytes));
        if (TextUtils.isEmpty(strB)) {
            strB = "";
        }
        return a + strB + "," + ln2.a(strB.getBytes());
    }
}
