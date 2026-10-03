package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class pog {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrD = dfc.d(bigInteger);
        n(jArrD, 0);
        return jArrD;
    }

    public static void e(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = jArr[8];
        long j11 = jArr[9];
        long j12 = jArr[10];
        long j13 = jArr[11];
        long j14 = jArr[12];
        long j15 = jArr[13];
        jArr[0] = j2 ^ (j3 << 59);
        jArr[1] = (j3 >>> 5) ^ (j4 << 54);
        jArr[2] = (j4 >>> 10) ^ (j5 << 49);
        jArr[3] = (j5 >>> 15) ^ (j6 << 44);
        jArr[4] = (j6 >>> 20) ^ (j7 << 39);
        jArr[5] = (j7 >>> 25) ^ (j8 << 34);
        jArr[6] = (j8 >>> 30) ^ (j9 << 29);
        jArr[7] = (j9 >>> 35) ^ (j10 << 24);
        jArr[8] = (j10 >>> 40) ^ (j11 << 19);
        jArr[9] = (j11 >>> 45) ^ (j12 << 14);
        jArr[10] = (j12 >>> 50) ^ (j13 << 9);
        jArr[11] = ((j13 >>> 55) ^ (j14 << 4)) ^ (j15 << 63);
        jArr[12] = (j14 >>> 60) ^ (j15 >>> 1);
        jArr[13] = 0;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        jArr2[0] = j2 & 576460752303423487L;
        jArr2[1] = ((j2 >>> 59) ^ (j3 << 5)) & 576460752303423487L;
        jArr2[2] = ((j3 >>> 54) ^ (j4 << 10)) & 576460752303423487L;
        jArr2[3] = ((j4 >>> 49) ^ (j5 << 15)) & 576460752303423487L;
        jArr2[4] = ((j5 >>> 44) ^ (j6 << 20)) & 576460752303423487L;
        jArr2[5] = ((j6 >>> 39) ^ (j7 << 25)) & 576460752303423487L;
        jArr2[6] = (j7 >>> 34) ^ (j8 << 30);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        for (int i = 0; i < 7; i++) {
            h(jArr4, jArr5[i], jArr3, i);
        }
        e(jArr3);
    }

    public static void h(long[] jArr, long j2, long[] jArr2, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j3 << 1;
        long j6 = j4 << 1;
        long[] jArr3 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        for (int i2 = 0; i2 < 7; i2++) {
            long j7 = jArr[i2];
            int i3 = (int) j7;
            long j8 = jArr3[i3 & 7] ^ (jArr3[(i3 >>> 3) & 7] << 3);
            long j9 = 0;
            int i4 = 54;
            do {
                int i5 = (int) (j7 >>> i4);
                long j10 = jArr3[i5 & 7] ^ (jArr3[(i5 >>> 3) & 7] << 3);
                j8 ^= j10 << i4;
                j9 ^= j10 >>> (-i4);
                i4 -= 6;
            } while (i4 > 0);
            int i6 = i + i2;
            jArr2[i6] = jArr2[i6] ^ (576460752303423487L & j8);
            int i7 = i6 + 1;
            jArr2[i7] = jArr2[i7] ^ ((j8 >>> 59) ^ (j9 << 5));
        }
    }

    public static void i(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            lea.c(jArr[i], jArr2, i << 1);
        }
        jArr2[12] = lea.b((int) jArr[6]);
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (dfc.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrA = dfc.a();
        long[] jArrA2 = dfc.a();
        long[] jArrA3 = dfc.a();
        p(jArr, jArrA);
        r(jArrA, 1, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA2, 1, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 3, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 6, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 12, jArrA2);
        k(jArrA, jArrA2, jArrA3);
        r(jArrA3, 24, jArrA);
        r(jArrA, 24, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 48, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 96, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 192, jArrA2);
        k(jArrA, jArrA2, jArrA);
        k(jArrA, jArrA3, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = dfc.b();
        g(jArr, jArr2, jArrB);
        m(jArrB, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = dfc.b();
        g(jArr, jArr2, jArrB);
        b(jArr3, jArrB, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = jArr[12];
        long j11 = j7 ^ (j10 << 39);
        long j12 = j8 ^ ((j10 >>> 25) ^ (j10 << 62));
        long j13 = j9 ^ (j10 >>> 2);
        long j14 = jArr[11];
        long j15 = j6 ^ (j14 << 39);
        long j16 = j11 ^ ((j14 >>> 25) ^ (j14 << 62));
        long j17 = j12 ^ (j14 >>> 2);
        long j18 = jArr[10];
        long j19 = j5 ^ (j18 << 39);
        long j20 = j15 ^ ((j18 >>> 25) ^ (j18 << 62));
        long j21 = j16 ^ (j18 >>> 2);
        long j22 = jArr[9];
        long j23 = j4 ^ (j22 << 39);
        long j24 = j19 ^ ((j22 >>> 25) ^ (j22 << 62));
        long j25 = j20 ^ (j22 >>> 2);
        long j26 = jArr[8];
        long j27 = j2 ^ (j13 << 39);
        long j28 = (j3 ^ (j26 << 39)) ^ ((j13 >>> 25) ^ (j13 << 62));
        long j29 = (j23 ^ ((j26 >>> 25) ^ (j26 << 62))) ^ (j13 >>> 2);
        long j30 = j17 >>> 25;
        jArr2[0] = j27 ^ j30;
        jArr2[1] = (j30 << 23) ^ j28;
        jArr2[2] = j29;
        jArr2[3] = j24 ^ (j26 >>> 2);
        jArr2[4] = j25;
        jArr2[5] = j21;
        jArr2[6] = j17 & 33554431;
    }

    public static void n(long[] jArr, int i) {
        int i2 = i + 6;
        long j2 = jArr[i2];
        long j3 = j2 >>> 25;
        jArr[i] = jArr[i] ^ j3;
        int i3 = i + 1;
        jArr[i3] = (j3 << 23) ^ jArr[i3];
        jArr[i2] = j2 & 33554431;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long jE = lea.e(jArr[0]);
        long jE2 = lea.e(jArr[1]);
        long j2 = (jE & 4294967295L) | (jE2 << 32);
        long j3 = (jE >>> 32) | (jE2 & (-4294967296L));
        long jE3 = lea.e(jArr[2]);
        long jE4 = lea.e(jArr[3]);
        long j4 = (jE3 & 4294967295L) | (jE4 << 32);
        long j5 = (jE3 >>> 32) | (jE4 & (-4294967296L));
        long jE5 = lea.e(jArr[4]);
        long jE6 = lea.e(jArr[5]);
        long j6 = (jE5 >>> 32) | (jE6 & (-4294967296L));
        long jE7 = lea.e(jArr[6]);
        long j7 = jE7 & 4294967295L;
        long j8 = jE7 >>> 32;
        jArr2[0] = j2 ^ (j3 << 44);
        jArr2[1] = (j4 ^ (j5 << 44)) ^ (j3 >>> 20);
        jArr2[2] = (((jE5 & 4294967295L) | (jE6 << 32)) ^ (j6 << 44)) ^ (j5 >>> 20);
        jArr2[3] = (((j8 << 44) ^ j7) ^ (j6 >>> 20)) ^ (j3 << 13);
        jArr2[4] = (j3 >>> 51) ^ ((j8 >>> 20) ^ (j5 << 13));
        jArr2[5] = (j6 << 13) ^ (j5 >>> 51);
        jArr2[6] = (j8 << 13) ^ (j6 >>> 51);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrJ = gfc.j(13);
        i(jArr, jArrJ);
        m(jArrJ, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] jArrJ = gfc.j(13);
        i(jArr, jArrJ);
        b(jArr2, jArrJ, jArr2);
    }

    public static void r(long[] jArr, int i, long[] jArr2) {
        long[] jArrJ = gfc.j(13);
        i(jArr, jArrJ);
        m(jArrJ, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            i(jArr2, jArrJ);
            m(jArrJ, jArr2);
        }
    }
}
