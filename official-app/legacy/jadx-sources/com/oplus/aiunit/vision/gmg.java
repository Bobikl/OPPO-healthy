package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class gmg {
    public static final int[] a = {1, 0, 0, -1, -1, -1, -1};
    public static final int[] b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f11816c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zec.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && zec.i(iArr3, a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (gfc.r(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && zec.i(iArr2, a))) {
            c(iArr2);
        }
    }

    public static void c(int[] iArr) {
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
        long j6 = j3 + (4294967295L & ((long) iArr[3])) + 1;
        iArr[3] = (int) j6;
        if ((j6 >> 32) != 0) {
            gfc.s(7, iArr, 4);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] iArrG = zec.g(bigInteger);
        if (iArrG[6] == -1) {
            int[] iArr = a;
            if (zec.i(iArrG, iArr)) {
                zec.s(iArr, iArrG);
            }
        }
        return iArrG;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrE = zec.e();
        zec.l(iArr, iArr2, iArrE);
        h(iArrE, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zec.p(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && gfc.p(14, iArr3, b))) {
            int[] iArr4 = f11816c;
            if (gfc.e(iArr4.length, iArr4, iArr3) != 0) {
                gfc.s(14, iArr3, iArr4.length);
            }
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (zec.k(iArr)) {
            zec.u(iArr2);
        } else {
            zec.r(a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[10]) & 4294967295L;
        long j3 = ((long) iArr[11]) & 4294967295L;
        long j4 = ((long) iArr[12]) & 4294967295L;
        long j5 = ((long) iArr[13]) & 4294967295L;
        long j6 = ((((long) iArr[7]) & 4294967295L) + j3) - 1;
        long j7 = (((long) iArr[8]) & 4294967295L) + j4;
        long j8 = (((long) iArr[9]) & 4294967295L) + j5;
        long j9 = ((((long) iArr[0]) & 4294967295L) - j6) + 0;
        long j10 = j9 & 4294967295L;
        long j11 = (j9 >> 32) + ((((long) iArr[1]) & 4294967295L) - j7);
        int i = (int) j11;
        iArr2[1] = i;
        long j12 = (j11 >> 32) + ((((long) iArr[2]) & 4294967295L) - j8);
        int i2 = (int) j12;
        iArr2[2] = i2;
        long j13 = (j12 >> 32) + (((((long) iArr[3]) & 4294967295L) + j6) - j2);
        long j14 = j13 & 4294967295L;
        long j15 = (j13 >> 32) + (((((long) iArr[4]) & 4294967295L) + j7) - j3);
        iArr2[4] = (int) j15;
        long j16 = (j15 >> 32) + (((((long) iArr[5]) & 4294967295L) + j8) - j4);
        iArr2[5] = (int) j16;
        long j17 = (j16 >> 32) + (((((long) iArr[6]) & 4294967295L) + j2) - j5);
        iArr2[6] = (int) j17;
        long j18 = (j17 >> 32) + 1;
        long j19 = j14 + j18;
        long j20 = j10 - j18;
        iArr2[0] = (int) j20;
        long j21 = j20 >> 32;
        if (j21 != 0) {
            long j22 = j21 + (((long) i) & 4294967295L);
            iArr2[1] = (int) j22;
            long j23 = (j22 >> 32) + (4294967295L & ((long) i2));
            iArr2[2] = (int) j23;
            j19 += j23 >> 32;
        }
        iArr2[3] = (int) j19;
        if (((j19 >> 32) == 0 || gfc.s(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && zec.i(iArr2, a))) {
            return;
        }
        c(iArr2);
    }

    public static void i(int i, int[] iArr) {
        long j2;
        if (i != 0) {
            long j3 = ((long) i) & 4294967295L;
            long j4 = ((((long) iArr[0]) & 4294967295L) - j3) + 0;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j6;
                long j7 = (j6 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j7;
                j5 = j7 >> 32;
            }
            long j8 = j5 + (4294967295L & ((long) iArr[3])) + j3;
            iArr[3] = (int) j8;
            j2 = j8 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || gfc.s(7, iArr, 4) == 0) && !(iArr[6] == -1 && zec.i(iArr, a))) {
            return;
        }
        c(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrE = zec.e();
        zec.q(iArr, iArrE);
        h(iArrE, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrE = zec.e();
        zec.q(iArr, iArrE);
        h(iArrE, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            zec.q(iArr2, iArrE);
            h(iArrE, iArr2);
        }
    }

    public static void l(int[] iArr) {
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
        long j6 = j3 + ((4294967295L & ((long) iArr[3])) - 1);
        iArr[3] = (int) j6;
        if ((j6 >> 32) != 0) {
            gfc.l(7, iArr, 4);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zec.r(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (gfc.D(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && zec.i(iArr2, a))) {
            c(iArr2);
        }
    }
}
