package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class d8e {
    public static byte[] a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[(bArr.length - i) - 9];
        glj.a(bArr, 1, bArr2, 0, (bArr.length - i) - 9);
        return bArr2;
    }

    public static byte[] b(byte[] bArr, int i) {
        byte[] bArr2 = new byte[4];
        glj.a(bArr, (bArr.length - i) - 8, bArr2, 0, 4);
        return bArr2;
    }

    public static byte[] c(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        glj.a(bArr, (bArr.length - i) - 4, bArr2, 0, i);
        return bArr2;
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        glj.a(bArr, bArr.length - 4, bArr2, 0, 4);
        return bArr2;
    }

    public static byte[] e(byte[] bArr) {
        return new byte[]{bArr[0]};
    }
}
