package com.heytap.log.util;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes19.dex */
public class AESUtils {
    private static byte[] decodeHex(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static String decryptByKey(int[] iArr, String str) throws Exception {
        String str2 = String2IntUtil.tostring(iArr);
        byte[] bArrDecodeHex = decodeHex(str);
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str2, 2), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(str2.getBytes());
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArrDecodeHex));
    }

    private static String encodeHex(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append("0123456789abcdef".charAt((bArr[i] >> 4) & 15));
            sb.append("0123456789abcdef".charAt(bArr[i] & 15));
        }
        return sb.toString();
    }

    public static String encryptByKey(int[] iArr, String str) throws Exception {
        String str2 = String2IntUtil.tostring(iArr);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(str2.getBytes());
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str2, 2), "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return encodeHex(cipher.doFinal(str.getBytes()));
    }
}
