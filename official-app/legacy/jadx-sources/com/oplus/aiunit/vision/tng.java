package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class tng {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrN = afc.n(bigInteger);
        n(jArrN, 0);
        return jArrN;
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
        jArr[0] = j2 ^ (j3 << 49);
        jArr[1] = (j3 >>> 15) ^ (j4 << 34);
        jArr[2] = (j4 >>> 30) ^ (j5 << 19);
        jArr[3] = ((j5 >>> 45) ^ (j6 << 4)) ^ (j7 << 53);
        jArr[4] = ((j6 >>> 60) ^ (j8 << 38)) ^ (j7 >>> 11);
        jArr[5] = (j8 >>> 26) ^ (j9 << 23);
        jArr[6] = j9 >>> 41;
        jArr[7] = 0;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        jArr2[0] = j2 & 562949953421311L;
        jArr2[1] = ((j2 >>> 49) ^ (j3 << 15)) & 562949953421311L;
        jArr2[2] = ((j3 >>> 34) ^ (j4 << 30)) & 562949953421311L;
        jArr2[3] = (j4 >>> 19) ^ (j5 << 45);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        h(jArr4[0], jArr5[0], jArr3, 0);
        h(jArr4[1], jArr5[1], jArr3, 1);
        h(jArr4[2], jArr5[2], jArr3, 2);
        h(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        h(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        h(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j2 = jArr4[0] ^ jArr4[2];
        long j3 = jArr4[1] ^ jArr4[3];
        long j4 = jArr5[0] ^ jArr5[2];
        long j5 = jArr5[1] ^ jArr5[3];
        h(j2 ^ j3, j4 ^ j5, jArr3, 3);
        long[] jArr6 = new long[3];
        h(j2, j4, jArr6, 0);
        h(j3, j5, jArr6, 1);
        long j6 = jArr6[0];
        long j7 = jArr6[1];
        long j8 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j6;
        jArr3[3] = (j6 ^ j7) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j8 ^ j7);
        jArr3[5] = jArr3[5] ^ j8;
        e(jArr3);
    }

    public static void h(long j2, long j3, long[] jArr, int i) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j4 << 1;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        int i2 = (int) j2;
        long j8 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j9 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j2 >>> i3);
            long j10 = (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9)) ^ (jArr2[(i4 >>> 12) & 7] << 12);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j8);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j8 >>> 49) ^ (j9 << 15));
    }

    public static void i(long[] jArr, long[] jArr2) {
        lea.c(jArr[0], jArr2, 0);
        lea.c(jArr[1], jArr2, 2);
        lea.c(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (afc.u(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrG = afc.g();
        long[] jArrG2 = afc.g();
        p(jArr, jArrG);
        r(jArrG, 1, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG2, 1, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 3, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 6, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 12, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 24, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 48, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 96, jArrG2);
        k(jArrG, jArrG2, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrI = afc.i();
        g(jArr, jArr2, jArrI);
        m(jArrI, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrI = afc.i();
        g(jArr, jArr2, jArrI);
        b(jArr3, jArrI, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = j6 ^ (j8 >>> 50);
        long j10 = (j5 ^ ((j8 >>> 1) ^ (j8 << 14))) ^ (j7 >>> 50);
        long j11 = j2 ^ (j9 << 63);
        long j12 = (j3 ^ (j7 << 63)) ^ ((j9 >>> 1) ^ (j9 << 14));
        long j13 = ((j4 ^ (j8 << 63)) ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j9 >>> 50);
        long j14 = j10 >>> 1;
        jArr2[0] = (j11 ^ j14) ^ (j14 << 15);
        jArr2[1] = (j14 >>> 49) ^ j12;
        jArr2[2] = j13;
        jArr2[3] = 1 & j10;
    }

    public static void n(long[] jArr, int i) {
        int i2 = i + 3;
        long j2 = jArr[i2];
        long j3 = j2 >>> 1;
        jArr[i] = jArr[i] ^ ((j3 << 15) ^ j3);
        int i3 = i + 1;
        jArr[i3] = (j3 >>> 49) ^ jArr[i3];
        jArr[i2] = j2 & 1;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long jE = lea.e(jArr[0]);
        long jE2 = lea.e(jArr[1]);
        long j2 = (jE & 4294967295L) | (jE2 << 32);
        long j3 = (jE >>> 32) | (jE2 & (-4294967296L));
        long jE3 = lea.e(jArr[2]);
        long j4 = (jE3 & 4294967295L) ^ (jArr[3] << 32);
        long j5 = jE3 >>> 32;
        jArr2[0] = j2 ^ (j3 << 8);
        jArr2[1] = ((j4 ^ (j5 << 8)) ^ (j3 >>> 56)) ^ (j3 << 33);
        jArr2[2] = (j3 >>> 31) ^ ((j5 >>> 56) ^ (j5 << 33));
        jArr2[3] = j5 >>> 31;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrI = afc.i();
        i(jArr, jArrI);
        m(jArrI, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] jArrI = afc.i();
        i(jArr, jArrI);
        b(jArr2, jArrI, jArr2);
    }

    public static void r(long[] jArr, int i, long[] jArr2) {
        long[] jArrI = afc.i();
        i(jArr, jArrI);
        m(jArrI, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            i(jArr2, jArrI);
            m(jArrI, jArr2);
        }
    }
}
