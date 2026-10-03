package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class zmg {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrJ = wec.j(bigInteger);
        l(jArrJ, 0);
        return jArrJ;
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = ((jArr[1] << 7) ^ (j2 >>> 57)) & 144115188075855871L;
        long j4 = j2 & 144115188075855871L;
        long j5 = jArr2[0];
        long j6 = ((jArr2[1] << 7) ^ (j5 >>> 57)) & 144115188075855871L;
        long j7 = 144115188075855871L & j5;
        long[] jArr4 = new long[6];
        f(j4, j7, jArr4, 0);
        f(j3, j6, jArr4, 2);
        f(j4 ^ j3, j7 ^ j6, jArr4, 4);
        long j8 = jArr4[1] ^ jArr4[2];
        long j9 = jArr4[0];
        long j10 = jArr4[3];
        long j11 = (jArr4[4] ^ j9) ^ j8;
        long j12 = j8 ^ (jArr4[5] ^ j10);
        jArr3[0] = j9 ^ (j11 << 57);
        jArr3[1] = (j11 >>> 7) ^ (j12 << 50);
        jArr3[2] = (j12 >>> 14) ^ (j10 << 43);
        jArr3[3] = j10 >>> 21;
    }

    public static void f(long j2, long j3, long[] jArr, int i) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j4 << 1;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        long j8 = jArr2[((int) j2) & 7];
        long j9 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j2 >>> i2);
            long j10 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j8 ^= j10 << i2;
            j9 ^= j10 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j8;
        jArr[i + 1] = (((((j2 & 72198606942111744L) & ((j3 << 7) >> 63)) >>> 8) ^ j9) << 7) ^ (j8 >>> 57);
    }

    public static void g(long[] jArr, long[] jArr2) {
        lea.c(jArr[0], jArr2, 0);
        lea.c(jArr[1], jArr2, 2);
    }

    public static void h(long[] jArr, long[] jArr2) {
        if (wec.p(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrD = wec.d();
        long[] jArrD2 = wec.d();
        n(jArr, jArrD);
        i(jArrD, jArr, jArrD);
        n(jArrD, jArrD);
        i(jArrD, jArr, jArrD);
        p(jArrD, 3, jArrD2);
        i(jArrD2, jArrD, jArrD2);
        n(jArrD2, jArrD2);
        i(jArrD2, jArr, jArrD2);
        p(jArrD2, 7, jArrD);
        i(jArrD, jArrD2, jArrD);
        p(jArrD, 14, jArrD2);
        i(jArrD2, jArrD, jArrD2);
        p(jArrD2, 28, jArrD);
        i(jArrD, jArrD2, jArrD);
        p(jArrD, 56, jArrD2);
        i(jArrD2, jArrD, jArrD2);
        n(jArrD2, jArr2);
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrF = wec.f();
        e(jArr, jArr2, jArrF);
        k(jArrF, jArr3);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrF = wec.f();
        e(jArr, jArr2, jArrF);
        b(jArr3, jArrF, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = j4 ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j7 = j2 ^ ((j6 << 15) ^ (j6 << 24));
        long j8 = (j3 ^ ((j5 << 15) ^ (j5 << 24))) ^ ((j6 >>> 40) ^ (j6 >>> 49));
        long j9 = j8 >>> 49;
        jArr2[0] = (j7 ^ j9) ^ (j9 << 9);
        jArr2[1] = 562949953421311L & j8;
    }

    public static void l(long[] jArr, int i) {
        int i2 = i + 1;
        long j2 = jArr[i2];
        long j3 = j2 >>> 49;
        jArr[i] = (j3 ^ (j3 << 9)) ^ jArr[i];
        jArr[i2] = j2 & 562949953421311L;
    }

    public static void m(long[] jArr, long[] jArr2) {
        long jE = lea.e(jArr[0]);
        long jE2 = lea.e(jArr[1]);
        long j2 = (4294967295L & jE) | (jE2 << 32);
        long j3 = (jE >>> 32) | (jE2 & (-4294967296L));
        jArr2[0] = ((j3 << 57) ^ j2) ^ (j3 << 5);
        jArr2[1] = (j3 >>> 59) ^ (j3 >>> 7);
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] jArrF = wec.f();
        g(jArr, jArrF);
        k(jArrF, jArr2);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArrF = wec.f();
        g(jArr, jArrF);
        b(jArr2, jArrF, jArr2);
    }

    public static void p(long[] jArr, int i, long[] jArr2) {
        long[] jArrF = wec.f();
        g(jArr, jArrF);
        k(jArrF, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            g(jArr2, jArrF);
            k(jArrF, jArr2);
        }
    }
}
