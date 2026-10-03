package com.oplus.aiunit.vision;

import com.heytap.health.protocol.fitness.FitnessProto$FitnessCmdId;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class zng {
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
        jArr[0] = j2 ^ (j3 << 59);
        jArr[1] = (j3 >>> 5) ^ (j4 << 54);
        jArr[2] = (j4 >>> 10) ^ (j5 << 49);
        jArr[3] = (j5 >>> 15) ^ (j6 << 44);
        jArr[4] = (j6 >>> 20) ^ (j7 << 39);
        jArr[5] = (j7 >>> 25) ^ (j8 << 34);
        jArr[6] = (j8 >>> 30) ^ (j9 << 29);
        jArr[7] = j9 >>> 35;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        jArr2[0] = j2 & 576460752303423487L;
        jArr2[1] = ((j2 >>> 59) ^ (j3 << 5)) & 576460752303423487L;
        jArr2[2] = ((j3 >>> 54) ^ (j4 << 10)) & 576460752303423487L;
        jArr2[3] = (j4 >>> 49) ^ (j5 << 15);
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
        jArr[i] = jArr[i] ^ (576460752303423487L & j8);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j8 >>> 59) ^ (j9 << 5));
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
        r(jArrG, 58, jArrG2);
        k(jArrG2, jArrG, jArrG2);
        r(jArrG2, 116, jArrG);
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
        long j10 = j7 ^ (j9 >>> 31);
        long j11 = (j6 ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j8 >>> 31);
        long j12 = ((j5 ^ (j9 << 23)) ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j10 >>> 31);
        long j13 = j2 ^ (j11 << 23);
        long j14 = (j3 ^ (j10 << 23)) ^ ((j11 >>> 41) ^ (j11 << 33));
        long j15 = ((j4 ^ (j8 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33))) ^ (j11 >>> 31);
        long j16 = j12 >>> 41;
        jArr2[0] = j13 ^ j16;
        jArr2[1] = (j16 << 10) ^ j14;
        jArr2[2] = j15;
        jArr2[3] = 2199023255551L & j12;
    }

    public static void n(long[] jArr, int i) {
        int i2 = i + 3;
        long j2 = jArr[i2];
        long j3 = j2 >>> 41;
        jArr[i] = jArr[i] ^ j3;
        int i3 = i + 1;
        jArr[i3] = (j3 << 10) ^ jArr[i3];
        jArr[i2] = j2 & 2199023255551L;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long jE = lea.e(jArr[0]);
        long jE2 = lea.e(jArr[1]);
        long j2 = (jE & 4294967295L) | (jE2 << 32);
        long j3 = (jE >>> 32) | (jE2 & (-4294967296L));
        long jE3 = lea.e(jArr[2]);
        long jE4 = lea.e(jArr[3]);
        long j4 = (4294967295L & jE3) | (jE4 << 32);
        long j5 = (jE3 >>> 32) | ((-4294967296L) & jE4);
        long j6 = j5 >>> 27;
        long j7 = j5 ^ ((j3 >>> 27) | (j5 << 37));
        long j8 = j3 ^ (j3 << 37);
        long[] jArrI = afc.i();
        int[] iArr = {32, 117, FitnessProto$FitnessCmdId.CMD_MCU_AUTO_PAUSE_SPORT_VALUE};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            int i3 = i2 >>> 6;
            int i4 = i2 & 63;
            jArrI[i3] = jArrI[i3] ^ (j8 << i4);
            int i5 = i3 + 1;
            int i6 = -i4;
            jArrI[i5] = jArrI[i5] ^ ((j7 << i4) | (j8 >>> i6));
            int i7 = i3 + 2;
            jArrI[i7] = jArrI[i7] ^ ((j6 << i4) | (j7 >>> i6));
            int i8 = i3 + 3;
            jArrI[i8] = jArrI[i8] ^ (j6 >>> i6);
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
