package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.connect.cipher.AESUtil;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class ge8 {
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
        if (TextUtils.isEmpty(str)) {
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

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char[] charArray = AESUtil.HEX.toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= 0) {
            return "";
        }
        for (byte b : bytes) {
            sb.append(charArray[(b & 240) >> 4]);
            sb.append(charArray[b & 15]);
        }
        return sb.toString().trim();
    }
}
