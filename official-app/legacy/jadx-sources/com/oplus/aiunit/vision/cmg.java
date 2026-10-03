package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class cmg {
    public static final int[] a = {-6803, -2, -1, -1, -1, -1, -1};
    public static final int[] b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10152c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zec.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && zec.i(iArr3, a))) {
            gfc.b(7, 6803, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (gfc.r(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && zec.i(iArr2, a))) {
            gfc.b(7, 6803, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrG = zec.g(bigInteger);
        if (iArrG[6] == -1 && zec.i(iArrG, a)) {
            gfc.b(7, 6803, iArrG);
        }
        return iArrG;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrE = zec.e();
        zec.l(iArr, iArr2, iArrE);
        g(iArrE, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zec.p(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && gfc.p(14, iArr3, b))) {
            int[] iArr4 = f10152c;
            if (gfc.e(iArr4.length, iArr4, iArr3) != 0) {
                gfc.s(14, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (zec.k(iArr)) {
            zec.u(iArr2);
        } else {
            zec.r(a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (zec.n(6803, zec.m(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && zec.i(iArr2, a))) {
            gfc.b(7, 6803, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || zec.o(6803, i, iArr, 0) == 0) && !(iArr[6] == -1 && zec.i(iArr, a))) {
            return;
        }
        gfc.b(7, 6803, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrE = zec.e();
        zec.q(iArr, iArrE);
        g(iArrE, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrE = zec.e();
        zec.q(iArr, iArrE);
        g(iArrE, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            zec.q(iArr2, iArrE);
            g(iArrE, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zec.r(iArr, iArr2, iArr3) != 0) {
            gfc.K(7, 6803, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (gfc.D(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && zec.i(iArr2, a))) {
            gfc.b(7, 6803, iArr2);
        }
    }
}
