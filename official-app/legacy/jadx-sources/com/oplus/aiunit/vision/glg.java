package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class glg {
    public static final int[] a = {-1, -1, -1, -3};
    public static final int[] b = {1, 0, 0, 4, -2, -1, 3, -4};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f11811c = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wec.a(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && wec.l(iArr3, a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (gfc.r(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && wec.l(iArr2, a))) {
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
        iArr[3] = (int) (j3 + (4294967295L & ((long) iArr[3])) + 2);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] iArrI = wec.i(bigInteger);
        if ((iArrI[3] >>> 1) >= 2147483646) {
            int[] iArr = a;
            if (wec.l(iArrI, iArr)) {
                wec.u(iArr, iArrI);
            }
        }
        return iArrI;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrE = wec.e();
        wec.q(iArr, iArr2, iArrE);
        h(iArrE, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wec.r(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && afc.q(iArr3, b))) {
            int[] iArr4 = f11811c;
            gfc.e(iArr4.length, iArr4, iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (wec.o(iArr)) {
            wec.x(iArr2);
        } else {
            wec.t(a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        long j3 = ((long) iArr[1]) & 4294967295L;
        long j4 = ((long) iArr[2]) & 4294967295L;
        long j5 = ((long) iArr[3]) & 4294967295L;
        long j6 = ((long) iArr[4]) & 4294967295L;
        long j7 = ((long) iArr[5]) & 4294967295L;
        long j8 = ((long) iArr[6]) & 4294967295L;
        long j9 = ((long) iArr[7]) & 4294967295L;
        long j10 = j5 + j9;
        long j11 = j8 + (j9 << 1);
        long j12 = j4 + j11;
        long j13 = j7 + (j11 << 1);
        long j14 = j3 + j13;
        long j15 = j6 + (j13 << 1);
        long j16 = j2 + j15;
        iArr2[0] = (int) j16;
        long j17 = j14 + (j16 >>> 32);
        iArr2[1] = (int) j17;
        long j18 = j12 + (j17 >>> 32);
        iArr2[2] = (int) j18;
        long j19 = j10 + (j15 << 1) + (j18 >>> 32);
        iArr2[3] = (int) j19;
        i((int) (j19 >>> 32), iArr2);
    }

    public static void i(int i, int[] iArr) {
        while (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + (4294967295L & ((long) iArr[3])) + (j2 << 1);
            iArr[3] = (int) j7;
            i = (int) (j7 >> 32);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrE = wec.e();
        wec.s(iArr, iArrE);
        h(iArrE, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrE = wec.e();
        wec.s(iArr, iArrE);
        h(iArrE, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            wec.s(iArr2, iArrE);
            h(iArrE, iArr2);
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
        iArr[3] = (int) (j3 + ((4294967295L & ((long) iArr[3])) - 2));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wec.t(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (gfc.D(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && wec.l(iArr2, a))) {
            c(iArr2);
        }
    }
}
