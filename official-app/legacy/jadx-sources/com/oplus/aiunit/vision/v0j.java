package com.oplus.aiunit.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class v0j {
    public static String a(String str, int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (str == null || str.length() <= i + i2) {
            return str;
        }
        char[] charArray = str.toCharArray();
        Arrays.fill(charArray, i, charArray.length - i2, '*');
        return new String(charArray);
    }

    public static String b(String str) {
        return a(str, 0, 2);
    }

    public static String c(String str) {
        return a(str, 3, 2);
    }
}
