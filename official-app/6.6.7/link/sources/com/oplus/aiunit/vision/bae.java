package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class bae {
    public static byte[] a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[(bArr.length - i) - 9];
        fpj.a(bArr, 1, bArr2, 0, (bArr.length - i) - 9);
        return bArr2;
    }

    public static byte[] b(byte[] bArr, int i) {
        byte[] bArr2 = new byte[4];
        fpj.a(bArr, (bArr.length - i) - 8, bArr2, 0, 4);
        return bArr2;
    }

    public static byte[] c(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        fpj.a(bArr, (bArr.length - i) - 4, bArr2, 0, i);
        return bArr2;
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        fpj.a(bArr, bArr.length - 4, bArr2, 0, 4);
        return bArr2;
    }

    public static byte[] e(byte[] bArr) {
        return new byte[]{bArr[0]};
    }
}
