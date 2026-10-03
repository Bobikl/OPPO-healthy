package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class ylg {
    public static final int[] a = {-1, -1, -2, -1, -1, -1};
    public static final int[] b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f19060c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (yec.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && yec.p(iArr3, a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (gfc.r(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && yec.p(iArr2, a))) {
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
            j3 = j4 >> 32;
        }
        long j5 = j3 + (4294967295L & ((long) iArr[2])) + 1;
        iArr[2] = (int) j5;
        if ((j5 >> 32) != 0) {
            gfc.s(6, iArr, 3);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] iArrL = yec.l(bigInteger);
        if (iArrL[5] == -1) {
            int[] iArr = a;
            if (yec.p(iArrL, iArr)) {
                yec.E(iArr, iArrL);
            }
        }
        return iArrL;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrG = yec.g();
        yec.v(iArr, iArr2, iArrG);
        h(iArrG, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (yec.z(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && gfc.p(12, iArr3, b))) {
            int[] iArr4 = f19060c;
            if (gfc.e(iArr4.length, iArr4, iArr3) != 0) {
                gfc.s(12, iArr3, iArr4.length);
            }
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (yec.s(iArr)) {
            yec.H(iArr2);
        } else {
            yec.D(a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[10]) & 4294967295L) + j2;
        long j7 = (((long) iArr[11]) & 4294967295L) + j3;
        long j8 = (((long) iArr[0]) & 4294967295L) + j6 + 0;
        int i = (int) j8;
        long j9 = (j8 >> 32) + (((long) iArr[1]) & 4294967295L) + j7;
        int i2 = (int) j9;
        iArr2[1] = i2;
        long j10 = j6 + j4;
        long j11 = j7 + j5;
        long j12 = (j9 >> 32) + (((long) iArr[2]) & 4294967295L) + j10;
        long j13 = j12 & 4294967295L;
        long j14 = (j12 >> 32) + (((long) iArr[3]) & 4294967295L) + j11;
        iArr2[3] = (int) j14;
        long j15 = j11 - j3;
        long j16 = (j14 >> 32) + (((long) iArr[4]) & 4294967295L) + (j10 - j2);
        iArr2[4] = (int) j16;
        long j17 = (j16 >> 32) + (((long) iArr[5]) & 4294967295L) + j15;
        iArr2[5] = (int) j17;
        long j18 = j17 >> 32;
        long j19 = j13 + j18;
        long j20 = j18 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j20;
        long j21 = j20 >> 32;
        if (j21 != 0) {
            long j22 = j21 + (4294967295L & ((long) i2));
            iArr2[1] = (int) j22;
            j19 += j22 >> 32;
        }
        iArr2[2] = (int) j19;
        if (((j19 >> 32) == 0 || gfc.s(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && yec.p(iArr2, a))) {
            return;
        }
        c(iArr2);
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
                j5 = j6 >> 32;
            }
            long j7 = j5 + (4294967295L & ((long) iArr[2])) + j3;
            iArr[2] = (int) j7;
            j2 = j7 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || gfc.s(6, iArr, 3) == 0) && !(iArr[5] == -1 && yec.p(iArr, a))) {
            return;
        }
        c(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrG = yec.g();
        yec.B(iArr, iArrG);
        h(iArrG, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrG = yec.g();
        yec.B(iArr, iArrG);
        h(iArrG, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            yec.B(iArr2, iArrG);
            h(iArrG, iArr2);
        }
    }

    public static void l(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + ((4294967295L & ((long) iArr[2])) - 1);
        iArr[2] = (int) j5;
        if ((j5 >> 32) != 0) {
            gfc.l(6, iArr, 3);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (yec.D(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (gfc.D(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && yec.p(iArr2, a))) {
            c(iArr2);
        }
    }
}
