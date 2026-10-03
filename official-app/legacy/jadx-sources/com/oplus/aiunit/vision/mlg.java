package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class mlg {
    public static final int[] a = {Integer.MAX_VALUE, -1, -1, -1, -1};
    public static final int[] b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f14120c = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xec.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && xec.h(iArr3, a))) {
            gfc.g(5, -2147483647, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (gfc.r(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && xec.h(iArr2, a))) {
            gfc.g(5, -2147483647, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrF = xec.f(bigInteger);
        if (iArrF[4] == -1) {
            int[] iArr = a;
            if (xec.h(iArrF, iArr)) {
                xec.s(iArr, iArrF);
            }
        }
        return iArrF;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrD = xec.d();
        xec.k(iArr, iArr2, iArrD);
        g(iArrD, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xec.o(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && gfc.p(10, iArr3, b))) {
            int[] iArr4 = f14120c;
            if (gfc.e(iArr4.length, iArr4, iArr3) != 0) {
                gfc.s(10, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (xec.j(iArr)) {
            xec.u(iArr2);
        } else {
            xec.r(a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[5]) & 4294967295L;
        long j3 = ((long) iArr[6]) & 4294967295L;
        long j4 = ((long) iArr[7]) & 4294967295L;
        long j5 = ((long) iArr[8]) & 4294967295L;
        long j6 = ((long) iArr[9]) & 4294967295L;
        long j7 = (((long) iArr[0]) & 4294967295L) + j2 + (j2 << 31) + 0;
        iArr2[0] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[1]) & 4294967295L) + j3 + (j3 << 31);
        iArr2[1] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[2]) & 4294967295L) + j4 + (j4 << 31);
        iArr2[2] = (int) j9;
        long j10 = (j9 >>> 32) + (((long) iArr[3]) & 4294967295L) + j5 + (j5 << 31);
        iArr2[3] = (int) j10;
        long j11 = (j10 >>> 32) + (4294967295L & ((long) iArr[4])) + j6 + (j6 << 31);
        iArr2[4] = (int) j11;
        h((int) (j11 >>> 32), iArr2);
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || xec.p(-2147483647, i, iArr, 0) == 0) && !(iArr[4] == -1 && xec.h(iArr, a))) {
            return;
        }
        gfc.g(5, -2147483647, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrD = xec.d();
        xec.q(iArr, iArrD);
        g(iArrD, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrD = xec.d();
        xec.q(iArr, iArrD);
        g(iArrD, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            xec.q(iArr2, iArrD);
            g(iArrD, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xec.r(iArr, iArr2, iArr3) != 0) {
            gfc.N(5, -2147483647, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (gfc.D(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && xec.h(iArr2, a))) {
            gfc.g(5, -2147483647, iArr2);
        }
    }
}
