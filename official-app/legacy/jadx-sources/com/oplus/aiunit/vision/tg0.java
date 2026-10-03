package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class tg0 {
    public static final int[] a = {121, 101, 101, 97, 98, 43, 62, 62};
    public static final int[] b = {124, 117, 97, 60, 112, 97, 97, 114, 126, 127, 119};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f16986c = {121, 116, 104, 101, 112, 97};
    public static final int[] d = {117, 126, 102, 127, 125, 126, 112, 117};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f16987e = {114, 126, 124};
    public static final int[] f = {117, 125};
    public static final int[] g = {63};
    public static final int[] h = {60, 52, 98};
    public static final int[] i = {60, 114, 127};

    public static final String a(String str) {
        if (str == null || str.isEmpty()) {
            int[] iArr = g;
            return c(a, b, iArr, f16986c, f, iArr, f16987e);
        }
        int[] iArr2 = g;
        return String.format(c(a, b, h, iArr2, f16986c, f, iArr2, f16987e), str);
    }

    public static final String b() {
        int[] iArr = g;
        return c(a, b, i, iArr, f16986c, d, iArr, f16987e);
    }

    public static final String c(int[]... iArr) {
        int length = iArr.length;
        int length2 = 0;
        for (int[] iArr2 : iArr) {
            length2 += iArr2.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            System.arraycopy(d(iArr[i2]), 0, bArr, length3, iArr[i2].length);
            length3 += iArr[i2].length;
        }
        return new String(bArr);
    }

    public static byte[] d(int[] iArr) {
        int length = iArr.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (iArr[i2] ^ 17);
        }
        return bArr;
    }
}
