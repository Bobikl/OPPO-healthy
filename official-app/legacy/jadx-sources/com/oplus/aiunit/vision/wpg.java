package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class wpg {
    public static final int LENGTH_MAX_SERVICE_UUID = 7;
    public static final int LENGTH_STRING_HEAD = 5;
    public static final int LENGTH_STRING_TAIL = 5;

    public static boolean a(int i) {
        return i >= 4 || d3d.g();
    }

    public static String b(String str, int i, int i2) {
        int length;
        if (TextUtils.isEmpty(str) || i < 0 || i2 < 0 || (length = str.length()) <= i + i2) {
            return str;
        }
        return str.substring(0, i) + "***" + str.substring(length - i2);
    }

    public static String c(String str) {
        int length;
        if (TextUtils.isEmpty(str) || (length = str.length()) == 1) {
            return str;
        }
        if (length <= 8) {
            StringBuilder sb = new StringBuilder();
            int i = length - (length / 2);
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 < i) {
                    sb.append("*");
                } else {
                    sb.append(str.charAt(i2));
                }
            }
            return sb.toString();
        }
        StringBuilder sbA = zqm.a("*(");
        int i3 = length - (length / 2);
        sbA.append(i3);
        sbA.append(")");
        StringBuilder sb2 = new StringBuilder(sbA.toString());
        while (i3 < length) {
            sb2.append(str.charAt(i3));
            i3++;
        }
        return sb2.toString();
    }

    public static String d(byte[] bArr) {
        return c(nxm.a(bArr));
    }

    public static String e(String str) {
        return f(str, 4);
    }

    public static String f(String str, int i) {
        return !a(i) ? "DEBUG NOT PRINT." : c(str);
    }

    public static String g(byte[] bArr) {
        return h(bArr, 4);
    }

    public static String h(byte[] bArr, int i) {
        return !a(i) ? "DEBUG NOT PRINT." : d(bArr);
    }
}
