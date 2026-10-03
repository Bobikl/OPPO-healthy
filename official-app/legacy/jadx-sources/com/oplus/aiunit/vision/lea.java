package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class lea {
    public static int a(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    public static long b(int i) {
        int i2 = ((i >>> 8) ^ i) & 65280;
        int i3 = i ^ (i2 ^ (i2 << 8));
        int i4 = ((i3 >>> 4) ^ i3) & 15728880;
        int i5 = i3 ^ (i4 ^ (i4 << 4));
        int i6 = ((i5 >>> 2) ^ i5) & 202116108;
        int i7 = i5 ^ (i6 ^ (i6 << 2));
        int i8 = ((i7 >>> 1) ^ i7) & 572662306;
        int i9 = i7 ^ (i8 ^ (i8 << 1));
        return ((((long) (i9 >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) i9));
    }

    public static void c(long j2, long[] jArr, int i) {
        long j3 = ((j2 >>> 16) ^ j2) & 4294901760L;
        long j4 = j2 ^ (j3 ^ (j3 << 16));
        long j5 = ((j4 >>> 8) ^ j4) & 280375465148160L;
        long j6 = j4 ^ (j5 ^ (j5 << 8));
        long j7 = ((j6 >>> 4) ^ j6) & 67555025218437360L;
        long j8 = j6 ^ (j7 ^ (j7 << 4));
        long j9 = ((j8 >>> 2) ^ j8) & 868082074056920076L;
        long j10 = j8 ^ (j9 ^ (j9 << 2));
        long j11 = ((j10 >>> 1) ^ j10) & 2459565876494606882L;
        long j12 = j10 ^ (j11 ^ (j11 << 1));
        jArr[i] = j12 & 6148914691236517205L;
        jArr[i + 1] = (j12 >>> 1) & 6148914691236517205L;
    }

    public static int d(int i) {
        int i2 = i & 255;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        return (i4 | (i4 << 1)) & 21845;
    }

    public static long e(long j2) {
        long j3 = ((j2 >>> 1) ^ j2) & 2459565876494606882L;
        long j4 = j2 ^ (j3 ^ (j3 << 1));
        long j5 = ((j4 >>> 2) ^ j4) & 868082074056920076L;
        long j6 = j4 ^ (j5 ^ (j5 << 2));
        long j7 = ((j6 >>> 4) ^ j6) & 67555025218437360L;
        long j8 = j6 ^ (j7 ^ (j7 << 4));
        long j9 = ((j8 >>> 8) ^ j8) & 280375465148160L;
        long j10 = j8 ^ (j9 ^ (j9 << 8));
        long j11 = ((j10 >>> 16) ^ j10) & 4294901760L;
        return j10 ^ (j11 ^ (j11 << 16));
    }
}
