package com.heytap.mspsdk.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class g {
    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static String b(String str) {
        byte[] bArrA = a(str);
        return bArrA == null ? "" : new String(bArrA);
    }
}
