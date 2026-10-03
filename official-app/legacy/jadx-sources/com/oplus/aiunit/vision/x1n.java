package com.oplus.aiunit.vision;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
public final class x1n {
    public static byte[] a;
    public static String[] b = {"kp6SsA", "cHE4dQ", "JKekrA", "XBxOHQ", "CSnpKw", "VwcThw", "wkp6Sg", "1cHE4Q"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int[] f18475c = null;

    public static int a(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 >> 1) | Integer.MIN_VALUE;
        }
        return (i << i2) | ((i & i3) >>> (32 - i2));
    }

    public static String b() {
        SecureRandom secureRandom = new SecureRandom();
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(w0n.t("EQUVT"));
            keyGenerator.init(128, secureRandom);
            return s1n.a(keyGenerator.generateKey().getEncoded());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            char c2 = (char) ((i >>> (i2 * 8)) & 255);
            cArr[(4 - i2) - 1] = c2;
            String str = " ";
            for (int i3 = 0; i3 < 32; i3++) {
                str = str + (((Integer.MIN_VALUE >>> i3) & c2) >>> (31 - i3));
            }
        }
        return new String(cArr);
    }

    public static String d(String str) {
        return t0n.d(str);
    }

    public static String e(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                sb.append(c(a(g(iArr[i]), i)));
            }
        }
        return sb.toString();
    }

    public static byte[] f(byte[] bArr) {
        try {
            if (a == null) {
                a = w0n.t("YAAAAAAAAAAAAAAAAAAAAAA").getBytes();
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a);
            SecretKeySpec secretKeySpec = new SecretKeySpec(e(i()).getBytes("UTF-8"), w0n.t("EQUVT"));
            Cipher cipher = Cipher.getInstance(w0n.t("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int g(int i) {
        int i2 = 1;
        for (int i3 = 0; i3 < 15; i3++) {
            i2 = (i2 << 2) | 1;
        }
        return ((i & i2) << 1) | (((i2 << 1) & i) >>> 1);
    }

    public static String h(String str) {
        try {
            return s1n.a(f(str.getBytes("UTF-8")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int[] i() {
        int[] iArr = f18475c;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[8];
        int i = 0;
        while (true) {
            String[] strArr = b;
            if (i >= strArr.length) {
                return iArr2;
            }
            byte[] bArrG = q0n.g(strArr[i]);
            iArr2[i] = ((bArrG[0] & 255) << 24) | (bArrG[3] & 255) | ((bArrG[2] & 255) << 8) | ((bArrG[1] & 255) << 16);
            i++;
        }
    }
}
