package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class fng {
    public static final long[] a = {2791191049453778211L, 2791191049453778402L, 6};

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
        jArr3[4] = jArr2[4] ^ jArr[4];
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
        jArr[0] = j2 ^ (j3 << 44);
        jArr[1] = (j3 >>> 20) ^ (j4 << 24);
        jArr[2] = ((j4 >>> 40) ^ (j5 << 4)) ^ (j6 << 48);
        jArr[3] = ((j5 >>> 60) ^ (j7 << 28)) ^ (j6 >>> 16);
        jArr[4] = j7 >>> 36;
        jArr[5] = 0;
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = ((jArr[2] << 40) ^ (j3 >>> 24)) & 17592186044415L;
        long j5 = ((j3 << 20) ^ (j2 >>> 44)) & 17592186044415L;
        long j6 = j2 & 17592186044415L;
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = ((j8 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j10 = ((j7 >>> 44) ^ (j8 << 20)) & 17592186044415L;
        long j11 = j7 & 17592186044415L;
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
        long j21 = (j17 ^ (j19 << 1)) ^ j18;
        long j22 = jArr4[0];
        long j23 = jArr4[1];
        long j24 = (j23 ^ j22) ^ jArr4[4];
        long j25 = j23 ^ jArr4[5];
        long j26 = jArr4[2];
        long j27 = ((j20 ^ j22) ^ (j26 << 4)) ^ (j26 << 1);
        long j28 = jArr4[3];
        long j29 = (((j24 ^ j21) ^ (j28 << 4)) ^ (j28 << 1)) ^ (j27 >>> 44);
        long j30 = (j25 ^ j19) ^ (j29 >>> 44);
        long j31 = j29 & 17592186044415L;
        long j32 = ((j27 & 17592186044415L) >>> 1) ^ ((j31 & 1) << 43);
        long j33 = j32 ^ (j32 << 1);
        long j34 = j33 ^ (j33 << 2);
        long j35 = j34 ^ (j34 << 4);
        long j36 = j35 ^ (j35 << 8);
        long j37 = j36 ^ (j36 << 16);
        long j38 = (j37 ^ (j37 << 32)) & 17592186044415L;
        long j39 = ((j31 >>> 1) ^ ((j30 & 1) << 43)) ^ (j38 >>> 43);
        long j40 = j39 ^ (j39 << 1);
        long j41 = j40 ^ (j40 << 2);
        long j42 = j41 ^ (j41 << 4);
        long j43 = j42 ^ (j42 << 8);
        long j44 = j43 ^ (j43 << 16);
        long j45 = (j44 ^ (j44 << 32)) & 17592186044415L;
        long j46 = (j45 >>> 43) ^ (j30 >>> 1);
        long j47 = j46 ^ (j46 << 1);
        long j48 = j47 ^ (j47 << 2);
        long j49 = j48 ^ (j48 << 4);
        long j50 = j49 ^ (j49 << 8);
        long j51 = j50 ^ (j50 << 16);
        long j52 = j51 ^ (j51 << 32);
        jArr3[0] = j22;
        jArr3[1] = (j24 ^ j38) ^ j26;
        jArr3[2] = ((j25 ^ j45) ^ j38) ^ j28;
        jArr3[3] = j52 ^ j45;
        jArr3[4] = jArr4[2] ^ j52;
        jArr3[5] = jArr4[3];
        e(jArr3);
    }

    public static void g(long j2, long j3, long[] jArr, int i) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j4 << 1;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        int i2 = (int) j2;
        long j8 = (jArr2[(i2 >>> 6) & 7] << 6) ^ (jArr2[i2 & 7] ^ (jArr2[(i2 >>> 3) & 7] << 3));
        long j9 = 0;
        int i3 = 33;
        do {
            int i4 = (int) (j2 >>> i3);
            long j10 = ((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 12;
        } while (i3 > 0);
        jArr[i] = 17592186044415L & j8;
        jArr[i + 1] = (j8 >>> 44) ^ (j9 << 20);
    }

    public static void h(long[] jArr, long[] jArr2) {
        lea.c(jArr[0], jArr2, 0);
        lea.c(jArr[1], jArr2, 2);
        jArr2[4] = ((long) lea.d((int) jArr[2])) & 4294967295L;
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (yec.t(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrF = yec.f();
        long[] jArrF2 = yec.f();
        o(jArr, jArrF);
        j(jArrF, jArr, jArrF);
        q(jArrF, 2, jArrF2);
        j(jArrF2, jArrF, jArrF2);
        q(jArrF2, 4, jArrF);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 8, jArrF2);
        j(jArrF2, jArrF, jArrF2);
        q(jArrF2, 16, jArrF);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 32, jArrF2);
        j(jArrF2, jArrF, jArrF2);
        o(jArrF2, jArrF2);
        j(jArrF2, jArr, jArrF2);
        q(jArrF2, 65, jArrF);
        j(jArrF, jArrF2, jArrF);
        o(jArrF, jArr2);
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
        long j7 = j5 ^ (j6 >>> 59);
        long j8 = j2 ^ ((j7 << 61) ^ (j7 << 63));
        long j9 = (j3 ^ ((j6 << 61) ^ (j6 << 63))) ^ ((((j7 >>> 3) ^ (j7 >>> 1)) ^ j7) ^ (j7 << 5));
        long j10 = (j4 ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5))) ^ (j7 >>> 59);
        long j11 = j10 >>> 3;
        jArr2[0] = (((j8 ^ j11) ^ (j11 << 2)) ^ (j11 << 3)) ^ (j11 << 8);
        jArr2[1] = (j11 >>> 56) ^ j9;
        jArr2[2] = 7 & j10;
    }

    public static void m(long[] jArr, int i) {
        int i2 = i + 2;
        long j2 = jArr[i2];
        long j3 = j2 >>> 3;
        jArr[i] = jArr[i] ^ ((((j3 << 2) ^ j3) ^ (j3 << 3)) ^ (j3 << 8));
        int i3 = i + 1;
        jArr[i3] = (j3 >>> 56) ^ jArr[i3];
        jArr[i2] = j2 & 7;
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
        long[] jArrJ = gfc.j(5);
        h(jArr, jArrJ);
        l(jArrJ, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrJ = gfc.j(5);
        h(jArr, jArrJ);
        b(jArr2, jArrJ, jArr2);
    }

    public static void q(long[] jArr, int i, long[] jArr2) {
        long[] jArrJ = gfc.j(5);
        h(jArr, jArrJ);
        l(jArrJ, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            h(jArr2, jArrJ);
            l(jArrJ, jArr2);
        }
    }
}
