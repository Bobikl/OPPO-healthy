package com.oplus.aiunit.vision;

import com.heytap.connect.cipher.AESUtil;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.Utf8;

/* JADX INFO: loaded from: classes12.dex */
public class iam {
    public static String a(String str) {
        byte[] bArrF;
        try {
            bArrF = f(d(), str.getBytes());
        } catch (Exception unused) {
            bArrF = null;
        }
        if (bArrF != null) {
            return b(bArrF);
        }
        return null;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            c(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    public static void c(StringBuffer stringBuffer, byte b) {
        stringBuffer.append(AESUtil.HEX.charAt((b >> 4) & 15));
        stringBuffer.append(AESUtil.HEX.charAt(b & 15));
    }

    public static byte[] d() throws Exception {
        return rsm.b(new byte[]{33, 83, -50, -89, -84, -114, 80, 99, 10, Utf8.REPLACEMENT_BYTE, 22, -65, -11, 30, 101, -118});
    }

    public static byte[] e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance(AESUtil.AES_PADDING);
        cipher.init(1, secretKeySpec, new IvParameterSpec(h()));
        return cipher.doFinal(bArr2);
    }

    public static String g(String str) {
        try {
            return new String(i(d(), e(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] h() {
        try {
            byte[] bArrA = tgm.a("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8"), 2);
            if (bArrA != null) {
                return rsm.b(bArrA);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance(AESUtil.AES_PADDING);
        cipher.init(2, secretKeySpec, new IvParameterSpec(h()));
        return cipher.doFinal(bArr2);
    }
}
