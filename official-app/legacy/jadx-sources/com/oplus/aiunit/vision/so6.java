package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class so6 {
    public static final int[] a = {121, 101, 101, 97, 98, 43, 62, 62};
    public static final int[] b = {124, 117, 97};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f16670c = {60, 100, 97, 118, 99, 112, 117, 116};
    public static final int[] d = {60, 114, 127};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f16671e = {63, 121, 116, 104, 101, 112, 97, 124, 126, 115, 120};
    public static final int[] f = {63, 114, 126, 124};

    public static String a() {
        return b(a, b, f16670c, d, f16671e, f);
    }

    public static String b(int[]... iArr) {
        int length = iArr.length;
        int length2 = 0;
        for (int[] iArr2 : iArr) {
            length2 += iArr2.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (int i = 0; i < length; i++) {
            System.arraycopy(c(iArr[i]), 0, bArr, length3, iArr[i].length);
            length3 += iArr[i].length;
        }
        return new String(bArr);
    }

    public static byte[] c(int[] iArr) {
        int length = iArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (iArr[i] ^ 17);
        }
        return bArr;
    }
}
