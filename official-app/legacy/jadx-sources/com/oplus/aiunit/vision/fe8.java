package com.oplus.aiunit.vision;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class fe8 {
    public static final byte[] a = new byte[0];

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append("0");
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString().toUpperCase(Locale.ENGLISH).trim();
    }

    public static byte[] b(String str) {
        if (c(str)) {
            return a;
        }
        String strReplace = str.replace(" ", "");
        int length = strReplace.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) Integer.parseInt(strReplace.substring(i2, i3) + strReplace.substring(i3, i3 + 1), 16);
        }
        return bArr;
    }

    public static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
