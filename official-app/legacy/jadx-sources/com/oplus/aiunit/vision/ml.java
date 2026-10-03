package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class ml {
    public static String a(String str) {
        return b(str, 8);
    }

    public static String b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            bytes[i2] = (byte) (bytes[i2] ^ i);
        }
        return new String(bytes);
    }
}
