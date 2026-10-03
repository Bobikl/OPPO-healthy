package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class omg {
    public static final int[] a = {-1, -1, -1, 0, 0, 0, 1, -1};
    public static final int[] b = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (afc.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && afc.q(iArr3, a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (gfc.r(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && afc.q(iArr2, a))) {
            c(iArr2);
        }
    }

    public static void c(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = j3 + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j6;
        long j7 = j6 >> 32;
        if (j7 != 0) {
            long j8 = j7 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j9;
            j7 = j9 >> 32;
        }
        long j10 = j7 + ((((long) iArr[6]) & 4294967295L) - 1);
        iArr[6] = (int) j10;
        iArr[7] = (int) ((j10 >> 32) + (4294967295L & ((long) iArr[7])) + 1);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] iArrM = afc.m(bigInteger);
        if (iArrM[7] == -1) {
            int[] iArr = a;
            if (afc.q(iArrM, iArr)) {
                afc.G(iArr, iArrM);
            }
        }
        return iArrM;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrH = afc.h();
        afc.w(iArr, iArr2, iArrH);
        h(iArrH, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (afc.A(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && gfc.p(16, iArr3, b))) {
            gfc.M(16, b, iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (afc.t(iArr)) {
            afc.J(iArr2);
        } else {
            afc.F(a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[8]) & 4294967295L;
        long j3 = ((long) iArr[9]) & 4294967295L;
        long j4 = ((long) iArr[10]) & 4294967295L;
        long j5 = ((long) iArr[11]) & 4294967295L;
        long j6 = ((long) iArr[12]) & 4294967295L;
        long j7 = ((long) iArr[13]) & 4294967295L;
        long j8 = ((long) iArr[14]) & 4294967295L;
        long j9 = ((long) iArr[15]) & 4294967295L;
        long j10 = j2 - 6;
        long j11 = j10 + j3;
        long j12 = j3 + j4;
        long j13 = (j4 + j5) - j9;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = j8 + j9;
        long j18 = j16 - j11;
        long j19 = (((((long) iArr[0]) & 4294967295L) - j14) - j18) + 0;
        iArr2[0] = (int) j19;
        long j20 = (j19 >> 32) + ((((((long) iArr[1]) & 4294967295L) + j12) - j15) - j17);
        iArr2[1] = (int) j20;
        long j21 = (j20 >> 32) + (((((long) iArr[2]) & 4294967295L) + j13) - j16);
        iArr2[2] = (int) j21;
        long j22 = (j21 >> 32) + ((((((long) iArr[3]) & 4294967295L) + (j14 << 1)) + j18) - j17);
        iArr2[3] = (int) j22;
        long j23 = (j22 >> 32) + ((((((long) iArr[4]) & 4294967295L) + (j15 << 1)) + j8) - j12);
        iArr2[4] = (int) j23;
        long j24 = (j23 >> 32) + (((((long) iArr[5]) & 4294967295L) + (j16 << 1)) - j13);
        iArr2[5] = (int) j24;
        long j25 = (j24 >> 32) + (((long) iArr[6]) & 4294967295L) + (j17 << 1) + j18;
        iArr2[6] = (int) j25;
        long j26 = (j25 >> 32) + (((((((long) iArr[7]) & 4294967295L) + (j9 << 1)) + j10) - j13) - j15);
        iArr2[7] = (int) j26;
        i((int) ((j26 >> 32) + 6), iArr2);
    }

    public static void i(int i, int[] iArr) {
        long j2;
        if (i != 0) {
            long j3 = ((long) i) & 4294967295L;
            long j4 = (((long) iArr[0]) & 4294967295L) + j3 + 0;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j6;
                long j7 = (j6 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j7;
                j5 = j7 >> 32;
            }
            long j8 = j5 + ((((long) iArr[3]) & 4294967295L) - j3);
            iArr[3] = (int) j8;
            long j9 = j8 >> 32;
            if (j9 != 0) {
                long j10 = j9 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j11;
                j9 = j11 >> 32;
            }
            long j12 = j9 + ((((long) iArr[6]) & 4294967295L) - j3);
            iArr[6] = (int) j12;
            long j13 = (j12 >> 32) + (4294967295L & ((long) iArr[7])) + j3;
            iArr[7] = (int) j13;
            j2 = j13 >> 32;
        } else {
            j2 = 0;
        }
        if (j2 != 0 || (iArr[7] == -1 && afc.q(iArr, a))) {
            c(iArr);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrH = afc.h();
        afc.D(iArr, iArrH);
        h(iArrH, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrH = afc.h();
        afc.D(iArr, iArrH);
        h(iArrH, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            afc.D(iArr2, iArrH);
            h(iArrH, iArr2);
        }
    }

    public static void l(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = j3 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j6;
        long j7 = j6 >> 32;
        if (j7 != 0) {
            long j8 = j7 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j9;
            j7 = j9 >> 32;
        }
        long j10 = j7 + (((long) iArr[6]) & 4294967295L) + 1;
        iArr[6] = (int) j10;
        iArr[7] = (int) ((j10 >> 32) + ((4294967295L & ((long) iArr[7])) - 1));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (afc.F(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (gfc.D(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && afc.q(iArr2, a))) {
            c(iArr2);
        }
    }
}
