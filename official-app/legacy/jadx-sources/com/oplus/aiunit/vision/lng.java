package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class lng {
    public static final long[] a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrM = yec.m(bigInteger);
        m(jArrM, 0);
        return jArrM;
    }

    public static void e(long[] jArr) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        jArr[0] = j2 ^ (j3 << 55);
        jArr[1] = (j3 >>> 9) ^ (j4 << 46);
        jArr[2] = (j4 >>> 18) ^ (j5 << 37);
        jArr[3] = (j5 >>> 27) ^ (j6 << 28);
        jArr[4] = (j6 >>> 36) ^ (j7 << 19);
        jArr[5] = j7 >>> 45;
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = (jArr[2] << 18) ^ (j3 >>> 46);
        long j5 = ((j3 << 9) ^ (j2 >>> 55)) & 36028797018963967L;
        long j6 = j2 & 36028797018963967L;
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = (j8 >>> 46) ^ (jArr2[2] << 18);
        long j10 = ((j7 >>> 55) ^ (j8 << 9)) & 36028797018963967L;
        long j11 = j7 & 36028797018963967L;
        long[] jArr4 = new long[10];
        g(j6, j11, jArr4, 0);
        g(j4, j9, jArr4, 2);
        long j12 = (j6 ^ j5) ^ j4;
        long j13 = (j11 ^ j10) ^ j9;
        g(j12, j13, jArr4, 4);
        long j14 = (j5 << 1) ^ (j4 << 2);
        long j15 = (j10 << 1) ^ (j9 << 2);
        g(j6 ^ j14, j11 ^ j15, jArr4, 6);
        g(j12 ^ j14, j13 ^ j15, jArr4, 8);
        long j16 = jArr4[6];
        long j17 = jArr4[8] ^ j16;
        long j18 = jArr4[7];
        long j19 = jArr4[9] ^ j18;
        long j20 = (j17 << 1) ^ j16;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j20 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ ((j17 ^ (j19 << 1)) ^ j18)) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 55);
        long j29 = (j24 ^ j19) ^ (j28 >>> 55);
        long j30 = j28 & 36028797018963967L;
        long j31 = ((j26 & 36028797018963967L) >>> 1) ^ ((j30 & 1) << 54);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 36028797018963967L;
        long j38 = ((j30 >>> 1) ^ ((j29 & 1) << 54)) ^ (j37 >>> 54);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = (j43 ^ (j43 << 32)) & 36028797018963967L;
        long j45 = (j29 >>> 1) ^ (j44 >>> 54);
        long j46 = j45 ^ (j45 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j50 = j49 ^ (j49 << 16);
        long j51 = j50 ^ (j50 << 32);
        jArr3[0] = j21;
        jArr3[1] = (j23 ^ j37) ^ j25;
        jArr3[2] = ((j24 ^ j44) ^ j37) ^ j27;
        jArr3[3] = j51 ^ j44;
        jArr3[4] = jArr4[2] ^ j51;
        jArr3[5] = jArr4[3];
        e(jArr3);
    }

    public static void g(long j2, long j3, long[] jArr, int i) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j4 << 1;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        long j8 = jArr2[((int) j2) & 3];
        long j9 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j2 >>> i2);
            long j10 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j8 ^= j10 << i2;
            j9 ^= j10 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 36028797018963967L & j8;
        jArr[i + 1] = (j8 >>> 55) ^ (j9 << 9);
    }

    public static void h(long[] jArr, long[] jArr2) {
        lea.c(jArr[0], jArr2, 0);
        lea.c(jArr[1], jArr2, 2);
        long j2 = jArr[2];
        jArr2[4] = lea.b((int) j2);
        jArr2[5] = ((long) lea.d((int) (j2 >>> 32))) & 4294967295L;
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (yec.t(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrF = yec.f();
        long[] jArrF2 = yec.f();
        o(jArr, jArrF);
        q(jArrF, 1, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF2, 1, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 3, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF2, 3, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 9, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF2, 9, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 27, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF2, 27, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 81, jArrF2);
        j(jArrF, jArrF2, jArr2);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrH = yec.h();
        f(jArr, jArr2, jArrH);
        l(jArrH, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrH = yec.h();
        f(jArr, jArr2, jArrH);
        b(jArr3, jArrH, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = j5 ^ ((((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)) ^ (j7 >>> 28));
        long j9 = (j4 ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36))) ^ ((j6 >>> 28) ^ (((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)));
        long j10 = j2 ^ ((((j8 << 29) ^ (j8 << 32)) ^ (j8 << 35)) ^ (j8 << 36));
        long j11 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j8 >>> 28) ^ (((j8 >>> 35) ^ (j8 >>> 32)) ^ (j8 >>> 29)));
        long j12 = j9 >>> 35;
        jArr2[0] = (((j10 ^ j12) ^ (j12 << 3)) ^ (j12 << 6)) ^ (j12 << 7);
        jArr2[1] = j11;
        jArr2[2] = 34359738367L & j9;
    }

    public static void m(long[] jArr, int i) {
        int i2 = i + 2;
        long j2 = jArr[i2];
        long j3 = j2 >>> 35;
        jArr[i] = ((j3 << 7) ^ (((j3 << 3) ^ j3) ^ (j3 << 6))) ^ jArr[i];
        jArr[i2] = j2 & 34359738367L;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] jArrF = yec.f();
        long jE = lea.e(jArr[0]);
        long jE2 = lea.e(jArr[1]);
        long j2 = (jE & 4294967295L) | (jE2 << 32);
        jArrF[0] = (jE >>> 32) | (jE2 & (-4294967296L));
        long jE3 = lea.e(jArr[2]);
        jArrF[1] = jE3 >>> 32;
        j(jArrF, a, jArr2);
        jArr2[0] = jArr2[0] ^ j2;
        jArr2[1] = jArr2[1] ^ (jE3 & 4294967295L);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArrH = yec.h();
        h(jArr, jArrH);
        l(jArrH, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrH = yec.h();
        h(jArr, jArrH);
        b(jArr2, jArrH, jArr2);
    }

    public static void q(long[] jArr, int i, long[] jArr2) {
        long[] jArrH = yec.h();
        h(jArr, jArrH);
        l(jArrH, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            h(jArr2, jArrH);
            l(jArrH, jArr2);
        }
    }
}
