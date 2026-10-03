package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.connect.cipher.AESUtil;

/* JADX INFO: loaded from: classes6.dex */
public class vj {
    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte b(char c2) {
        return (byte) AESUtil.HEX.indexOf(c2);
    }

    public static byte[] c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (b(charArray[i2 + 1]) | (b(charArray[i2]) << 4));
        }
        return bArr;
    }
}
