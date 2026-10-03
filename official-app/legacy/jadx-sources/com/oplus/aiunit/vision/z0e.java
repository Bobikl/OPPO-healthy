package com.oplus.aiunit.vision;

import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z0e {
    public static byte[] a(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i = 0; i != cArr.length; i++) {
            int i2 = i * 2;
            char c2 = cArr[i];
            bArr[i2] = (byte) (c2 >>> '\b');
            bArr[i2 + 1] = (byte) c2;
        }
        return bArr;
    }

    public static byte[] b(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] c(char[] cArr) {
        return cArr != null ? Strings.h(cArr) : new byte[0];
    }
}
