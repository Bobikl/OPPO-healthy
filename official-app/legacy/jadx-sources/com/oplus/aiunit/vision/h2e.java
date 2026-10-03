package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h2e {
    public static int a(byte[] bArr, int i) {
        int i2 = bArr[i] << 24;
        int i3 = i + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 16);
        int i5 = i3 + 1;
        return (bArr[i5 + 1] & 255) | i4 | ((bArr[i5] & 255) << 8);
    }

    public static long b(byte[] bArr, int i) {
        int iA = a(bArr, i);
        return (((long) a(bArr, i + 4)) & 4294967295L) | ((((long) iA) & 4294967295L) << 32);
    }

    public static void c(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void d(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static int e(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = i + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = i3 + 1;
        return (bArr[i5 + 1] << 24) | i4 | ((bArr[i5] & 255) << 16);
    }

    public static long f(byte[] bArr, int i) {
        return ((((long) e(bArr, i + 4)) & 4294967295L) << 32) | (((long) e(bArr, i)) & 4294967295L);
    }

    public static short g(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static void h(long j2, byte[] bArr, int i) {
        c((int) (j2 >>> 32), bArr, i);
        c((int) (j2 & 4294967295L), bArr, i + 4);
    }

    public static byte[] i(long j2) {
        byte[] bArr = new byte[8];
        h(j2, bArr, 0);
        return bArr;
    }

    public static void j(long j2, byte[] bArr, int i) {
        d((int) (4294967295L & j2), bArr, i);
        d((int) (j2 >>> 32), bArr, i + 4);
    }

    public static void k(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            j(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static byte[] l(long j2) {
        byte[] bArr = new byte[8];
        j(j2, bArr, 0);
        return bArr;
    }

    public static void m(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >>> 8);
    }
}
