package com.platform.usercenter.oauth.util;

import android.text.TextUtils;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcXORUtils {
    public static String encrypt(String str) {
        return encrypt(str, 8);
    }

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
