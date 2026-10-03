package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class jog {
    public static final long[] a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrD = bfc.d(bigInteger);
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
        jArr[0] = j2 ^ (j3 << 57);
        jArr[1] = (j3 >>> 7) ^ (j4 << 50);
        jArr[2] = (j4 >>> 14) ^ (j5 << 43);
        jArr[3] = (j5 >>> 21) ^ (j6 << 36);
        jArr[4] = (j6 >>> 28) ^ (j7 << 29);
        jArr[5] = (j7 >>> 35) ^ (j8 << 22);
        jArr[6] = (j8 >>> 42) ^ (j9 << 15);
        jArr[7] = (j9 >>> 49) ^ (j10 << 8);
        jArr[8] = (j10 >>> 56) ^ (j11 << 1);
        jArr[9] = j11 >>> 63;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        jArr2[0] = j2 & 144115188075855871L;
        jArr2[1] = ((j2 >>> 57) ^ (j3 << 7)) & 144115188075855871L;
        jArr2[2] = ((j3 >>> 50) ^ (j4 << 14)) & 144115188075855871L;
        jArr2[3] = ((j4 >>> 43) ^ (j5 << 21)) & 144115188075855871L;
        jArr2[4] = (j5 >>> 36) ^ (j6 << 28);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        long[] jArr6 = new long[26];
        h(jArr4[0], jArr5[0], jArr6, 0);
        h(jArr4[1], jArr5[1], jArr6, 2);
        h(jArr4[2], jArr5[2], jArr6, 4);
        h(jArr4[3], jArr5[3], jArr6, 6);
        h(jArr4[4], jArr5[4], jArr6, 8);
        long j2 = jArr4[0];
        long j3 = j2 ^ jArr4[1];
        long j4 = jArr5[0];
        long j5 = j4 ^ jArr5[1];
        long j6 = jArr4[2];
        long j7 = j2 ^ j6;
        long j8 = jArr5[2];
        long j9 = j4 ^ j8;
        long j10 = jArr4[4];
        long j11 = j6 ^ j10;
        long j12 = jArr5[4];
        long j13 = j8 ^ j12;
        long j14 = jArr4[3];
        long j15 = j14 ^ j10;
        long j16 = jArr5[3];
        long j17 = j16 ^ j12;
        h(j7 ^ j14, j9 ^ j16, jArr6, 18);
        h(j11 ^ jArr4[1], j13 ^ jArr5[1], jArr6, 20);
        long j18 = j3 ^ j15;
        long j19 = j5 ^ j17;
        long j20 = j18 ^ jArr4[2];
        long j21 = jArr5[2] ^ j19;
        h(j18, j19, jArr6, 22);
        h(j20, j21, jArr6, 24);
        h(j3, j5, jArr6, 10);
        h(j7, j9, jArr6, 12);
        h(j11, j13, jArr6, 14);
        h(j15, j17, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j22 = jArr6[0];
        long j23 = jArr6[1] ^ j22;
        long j24 = jArr6[2] ^ j23;
        long j25 = jArr6[10] ^ j24;
        jArr3[1] = j25;
        long j26 = jArr6[3] ^ jArr6[4];
        long j27 = j24 ^ (j26 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j27;
        long j28 = j23 ^ j26;
        long j29 = jArr6[5] ^ jArr6[6];
        long j30 = jArr6[8];
        long j31 = (j28 ^ j29) ^ j30;
        long j32 = jArr6[13] ^ jArr6[14];
        long j33 = jArr6[18];
        long j34 = jArr6[22];
        long j35 = jArr6[24];
        jArr3[3] = (j31 ^ j32) ^ ((j33 ^ j34) ^ j35);
        long j36 = jArr6[7] ^ j30;
        long j37 = jArr6[9];
        long j38 = j36 ^ j37;
        long j39 = j38 ^ jArr6[17];
        jArr3[8] = j39;
        long j40 = (j38 ^ j29) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j40;
        long j41 = j40 ^ j25;
        long j42 = jArr6[19] ^ jArr6[20];
        long j43 = jArr6[25];
        long j44 = j43 ^ j35;
        long j45 = jArr6[23];
        long j46 = j42 ^ j44;
        jArr3[4] = (j46 ^ (j33 ^ j45)) ^ j41;
        long j47 = jArr6[21];
        jArr3[5] = ((j27 ^ j39) ^ j46) ^ (j47 ^ j34);
        jArr3[6] = (((((j31 ^ j22) ^ j37) ^ j32) ^ j47) ^ j45) ^ j43;
        e(jArr3);
    }

    public static void h(long j2, long j3, long[] jArr, int i) {
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

    public static void i(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 4; i++) {
            lea.c(jArr[i], jArr2, i << 1);
        }
        jArr2[8] = lea.b((int) jArr[4]);
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (bfc.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrA = bfc.a();
        long[] jArrA2 = bfc.a();
        p(jArr, jArrA);
        k(jArrA, jArr, jArrA);
        r(jArrA, 2, jArrA2);
        k(jArrA2, jArrA, jArrA2);
        r(jArrA2, 4, jArrA);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 8, jArrA2);
        k(jArrA2, jArrA, jArrA2);
        p(jArrA2, jArrA2);
        k(jArrA2, jArr, jArrA2);
        r(jArrA2, 17, jArrA);
        k(jArrA, jArrA2, jArrA);
        p(jArrA, jArrA);
        k(jArrA, jArr, jArrA);
        r(jArrA, 35, jArrA2);
        k(jArrA2, jArrA, jArrA2);
        r(jArrA2, 70, jArrA);
        k(jArrA, jArrA2, jArrA);
        p(jArrA, jArrA);
        k(jArrA, jArr, jArrA);
        r(jArrA, 141, jArrA2);
        k(jArrA2, jArrA, jArrA2);
        p(jArrA2, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = bfc.b();
        g(jArr, jArr2, jArrB);
        m(jArrB, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = bfc.b();
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
        long j10 = jArr[8];
        long j11 = j6 ^ ((((j10 >>> 27) ^ (j10 >>> 22)) ^ (j10 >>> 20)) ^ (j10 >>> 15));
        long j12 = j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49));
        long j13 = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        long j14 = j11 >>> 27;
        jArr2[0] = (((j12 ^ j14) ^ (j14 << 5)) ^ (j14 << 7)) ^ (j14 << 12);
        jArr2[1] = j13;
        jArr2[2] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[3] = (j5 ^ ((((j10 << 37) ^ (j10 << 42)) ^ (j10 << 44)) ^ (j10 << 49))) ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        jArr2[4] = 134217727 & j11;
    }

    public static void n(long[] jArr, int i) {
        int i2 = i + 4;
        long j2 = jArr[i2];
        long j3 = j2 >>> 27;
        jArr[i] = ((j3 << 12) ^ (((j3 << 5) ^ j3) ^ (j3 << 7))) ^ jArr[i];
        jArr[i2] = j2 & 134217727;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArrA = bfc.a();
        long jE = lea.e(jArr[0]);
        long jE2 = lea.e(jArr[1]);
        long j2 = (jE & 4294967295L) | (jE2 << 32);
        jArrA[0] = (jE >>> 32) | (jE2 & (-4294967296L));
        long jE3 = lea.e(jArr[2]);
        long jE4 = lea.e(jArr[3]);
        long j3 = (jE3 & 4294967295L) | (jE4 << 32);
        jArrA[1] = (jE3 >>> 32) | ((-4294967296L) & jE4);
        long jE5 = lea.e(jArr[4]);
        jArrA[2] = jE5 >>> 32;
        k(jArrA, a, jArr2);
        jArr2[0] = jArr2[0] ^ j2;
        jArr2[1] = jArr2[1] ^ j3;
        jArr2[2] = jArr2[2] ^ (4294967295L & jE5);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrJ = gfc.j(9);
        i(jArr, jArrJ);
        m(jArrJ, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] jArrJ = gfc.j(9);
        i(jArr, jArrJ);
        b(jArr2, jArrJ, jArr2);
    }

    public static void r(long[] jArr, int i, long[] jArr2) {
        long[] jArrJ = gfc.j(9);
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
