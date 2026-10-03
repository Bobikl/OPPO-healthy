package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class fog {
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
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
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
        jArr[0] = j2 ^ (j3 << 60);
        jArr[1] = (j3 >>> 4) ^ (j4 << 56);
        jArr[2] = (j4 >>> 8) ^ (j5 << 52);
        jArr[3] = (j5 >>> 12) ^ (j6 << 48);
        jArr[4] = (j6 >>> 16) ^ (j7 << 44);
        jArr[5] = (j7 >>> 20) ^ (j8 << 40);
        jArr[6] = (j8 >>> 24) ^ (j9 << 36);
        jArr[7] = j9 >>> 28;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        jArr2[0] = j2 & 1152921504606846975L;
        jArr2[1] = ((j2 >>> 60) ^ (j3 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j3 >>> 56) ^ (j4 << 8)) & 1152921504606846975L;
        jArr2[3] = (j4 >>> 52) ^ (j5 << 12);
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
        int i3 = 54;
        do {
            int i4 = (int) (j2 >>> i3);
            long j10 = jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (1152921504606846975L & j8);
        int i5 = i + 1;
        jArr[i5] = ((((((j2 & 585610922974906400L) & ((j3 << 4) >> 63)) >>> 5) ^ j9) << 4) ^ (j8 >>> 60)) ^ jArr[i5];
    }

    public static void i(long[] jArr, long[] jArr2) {
        lea.c(jArr[0], jArr2, 0);
        lea.c(jArr[1], jArr2, 2);
        lea.c(jArr[2], jArr2, 4);
        long j2 = jArr[3];
        jArr2[6] = lea.b((int) j2);
        jArr2[7] = ((long) lea.a((int) (j2 >>> 32))) & 4294967295L;
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (afc.u(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrG = afc.g();
        long[] jArrG2 = afc.g();
        p(jArr, jArrG);
        k(jArrG, jArr, jArrG);
        p(jArrG, jArrG);
        k(jArrG, jArr, jArrG);
        r(jArrG, 3, jArrG2);
        k(jArrG2, jArrG, jArrG2);
        p(jArrG2, jArrG2);
        k(jArrG2, jArr, jArrG2);
        r(jArrG2, 7, jArrG);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 14, jArrG2);
        k(jArrG2, jArrG, jArrG2);
        p(jArrG2, jArrG2);
        k(jArrG2, jArr, jArrG2);
        r(jArrG2, 29, jArrG);
        k(jArrG, jArrG2, jArrG);
        p(jArrG, jArrG);
        k(jArrG, jArr, jArrG);
        r(jArrG, 59, jArrG2);
        k(jArrG2, jArrG, jArrG2);
        p(jArrG2, jArrG2);
        k(jArrG2, jArr, jArrG2);
        r(jArrG2, 119, jArrG);
        k(jArrG, jArrG2, jArrG);
        p(jArrG, jArr2);
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
        long j9 = jArr[7];
        long j10 = j8 ^ (j9 >>> 17);
        long j11 = (j7 ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = ((j6 ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j13 = j2 ^ (j12 << 17);
        long j14 = (j3 ^ (j11 << 17)) ^ (j12 >>> 47);
        long j15 = ((j4 ^ (j10 << 17)) ^ (j11 >>> 47)) ^ (j12 << 47);
        long j16 = (((j5 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47)) ^ (j12 >>> 17);
        long j17 = j16 >>> 47;
        jArr2[0] = j13 ^ j17;
        jArr2[1] = j14;
        jArr2[2] = (j17 << 30) ^ j15;
        jArr2[3] = 140737488355327L & j16;
    }

    public static void n(long[] jArr, int i) {
        int i2 = i + 3;
        long j2 = jArr[i2];
        long j3 = j2 >>> 47;
        jArr[i] = jArr[i] ^ j3;
        int i3 = i + 2;
        jArr[i3] = (j3 << 30) ^ jArr[i3];
        jArr[i2] = j2 & 140737488355327L;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long jE = lea.e(jArr[0]);
        long jE2 = lea.e(jArr[1]);
        long j2 = (jE & 4294967295L) | (jE2 << 32);
        long j3 = (jE >>> 32) | (jE2 & (-4294967296L));
        int i = 2;
        long jE3 = lea.e(jArr[2]);
        long jE4 = lea.e(jArr[3]);
        long j4 = (jE3 & 4294967295L) | (jE4 << 32);
        long j5 = (jE4 & (-4294967296L)) | (jE3 >>> 32);
        long j6 = j5 >>> 49;
        long j7 = (j3 >>> 49) | (j5 << 15);
        long j8 = j5 ^ (j3 << 15);
        long[] jArrI = afc.i();
        int[] iArr = {39, 120};
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            jArrI[i4] = jArrI[i4] ^ (j3 << i5);
            int i6 = i4 + 1;
            int[] iArr2 = iArr;
            int i7 = -i5;
            jArrI[i6] = jArrI[i6] ^ ((j8 << i5) | (j3 >>> i7));
            int i8 = i4 + 2;
            jArrI[i8] = jArrI[i8] ^ ((j7 << i5) | (j8 >>> i7));
            int i9 = i4 + 3;
            jArrI[i9] = jArrI[i9] ^ ((j6 << i5) | (j7 >>> i7));
            int i10 = i4 + 4;
            jArrI[i10] = jArrI[i10] ^ (j6 >>> i7);
            i2++;
            i = 2;
            iArr = iArr2;
        }
        m(jArrI, jArr2);
        jArr2[0] = jArr2[0] ^ j2;
        jArr2[1] = jArr2[1] ^ j4;
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
