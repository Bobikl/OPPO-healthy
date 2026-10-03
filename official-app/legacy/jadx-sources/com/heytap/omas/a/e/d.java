package com.heytap.omas.a.e;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class d {
    private static final String a = "BaseConversionUtil";

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            i.b(a, "byteArrayToHexString", "parameter invalid,byteArray must not be null.");
            return null;
        }
        String str = "";
        for (byte b : bArr) {
            str = str + String.format("%02X", Integer.valueOf(Byte.valueOf(b).intValue() & 255));
        }
        return str;
    }

    public static byte[] a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Parameter cannot be null or empty.";
        } else {
            int length = str.length();
            if (length % 2 == 0) {
                byte[] bArr = new byte[length / 2];
                for (int i = 0; i < length; i += 2) {
                    try {
                        bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
                    } catch (Exception e2) {
                        i.b("", "hexStringToByteArray", "exception,detail:" + e2);
                    }
                }
                return bArr;
            }
            str2 = "Parameter invalid, length of hexString not divisible by 2.length=" + length;
        }
        i.b(a, "hexStringToByteArray", str2);
        return null;
    }
}
