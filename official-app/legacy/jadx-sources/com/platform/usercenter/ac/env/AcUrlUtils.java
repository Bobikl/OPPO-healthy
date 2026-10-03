package com.platform.usercenter.ac.env;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public class AcUrlUtils {
    public static String encrypt(String str, int i) {
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
