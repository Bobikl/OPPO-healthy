package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class qlg {
    public static final int[] a = {-21389, -2, -1, -1, -1};
    public static final int[] b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f15846c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (xec.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && xec.h(iArr3, a))) {
            gfc.b(5, 21389, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (gfc.r(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && xec.h(iArr2, a))) {
            gfc.b(5, 21389, iArr2);
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
            int[] iArr4 = f15846c;
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
        if (xec.m(21389, xec.l(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && xec.h(iArr2, a))) {
            gfc.b(5, 21389, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || xec.n(21389, i, iArr, 0) == 0) && !(iArr[4] == -1 && xec.h(iArr, a))) {
            return;
        }
        gfc.b(5, 21389, iArr);
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
            gfc.K(5, 21389, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (gfc.D(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && xec.h(iArr2, a))) {
            gfc.b(5, 21389, iArr2);
        }
    }
}
