package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class a7m {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (bytes[i] ^ 8);
        }
        return new String(bytes);
    }
}
