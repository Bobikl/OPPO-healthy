package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class kmg {
    public static final int[] a = {-977, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f13356c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (afc.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && afc.q(iArr3, a))) {
            gfc.b(8, 977, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (gfc.r(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && afc.q(iArr2, a))) {
            gfc.b(8, 977, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrM = afc.m(bigInteger);
        if (iArrM[7] == -1) {
            int[] iArr = a;
            if (afc.q(iArrM, iArr)) {
                afc.G(iArr, iArrM);
            }
        }
        return iArrM;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrH = afc.h();
        afc.w(iArr, iArr2, iArrH);
        g(iArrH, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (afc.A(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && gfc.p(16, iArr3, b))) {
            int[] iArr4 = f13356c;
            if (gfc.e(iArr4.length, iArr4, iArr3) != 0) {
                gfc.s(16, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (afc.t(iArr)) {
            afc.J(iArr2);
        } else {
            afc.F(a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (afc.y(977, afc.x(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && afc.q(iArr2, a))) {
            gfc.b(8, 977, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || afc.z(977, i, iArr, 0) == 0) && !(iArr[7] == -1 && afc.q(iArr, a))) {
            return;
        }
        gfc.b(8, 977, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrH = afc.h();
        afc.D(iArr, iArrH);
        g(iArrH, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrH = afc.h();
        afc.D(iArr, iArrH);
        g(iArrH, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            afc.D(iArr2, iArrH);
            g(iArrH, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (afc.F(iArr, iArr2, iArr3) != 0) {
            gfc.K(8, 977, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (gfc.D(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && afc.q(iArr2, a))) {
            gfc.b(8, 977, iArr2);
        }
    }
}
