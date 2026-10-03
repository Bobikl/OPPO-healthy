package com.oplus.aiunit.vision;

import android.text.TextUtils;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes19.dex */
public class smc {
    public static String a = "AES/CBC/PKCS5Padding";
    public static String b = "UTF-8";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f16650c = "AES";

    public static String a(String str, String str2, String str3) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(b), f16650c);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(b));
        Cipher cipher = Cipher.getInstance(a);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(f(str)), b);
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return a(str2, e(str), d(str));
        } catch (Exception e2) {
            t6b.c(e2.getLocalizedMessage());
            return "";
        }
    }

    public static String c(String str, String str2, String str3) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(b), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(b));
        Cipher cipher = Cipher.getInstance(a);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes(b));
        StringBuilder sb = new StringBuilder(bArrDoFinal.length);
        for (byte b2 : bArrDoFinal) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static String d(String str) {
        return str.substring(52, 68);
    }

    public static String e(String str) {
        return str.substring(20, 36);
    }

    public static byte[] f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
        }
        return bArr;
    }
}
