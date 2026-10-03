package com.omron;

import com.heytap.connect.cipher.AESUtil;

/* JADX INFO: loaded from: classes5.dex */
public class cv {
    private static final char[] a = AESUtil.HEX.toCharArray();
    private static final char[] b = "0123456789abcdef".toCharArray();

    public static float a(byte[] bArr, int i) {
        return bArr[i] + ((bArr[i + 1] & 255) / 256.0f);
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 0) | ((bArr[i + 0] & 255) << 8);
    }

    public static long c(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] & 255)) << 0) | (((long) (bArr[i + 0] & 255)) << 24) | (((long) (bArr[i + 1] & 255)) << 16) | (((long) (bArr[i + 2] & 255)) << 8);
    }

    public static String a(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = z ? a : b;
        char[] cArr2 = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            byte b2 = bArr[i];
            cArr2[i2] = cArr[(b2 & 240) >> 4];
            cArr2[i2 + 1] = cArr[b2 & 15];
        }
        return new String(cArr2);
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i < 0 || i2 < 0 || (i3 = i2 - i) < 0 || bArr.length < i + i3) {
            return null;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }
}
