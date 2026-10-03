package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class ulg {
    public static final int[] a = {-4553, -2, -1, -1, -1, -1};
    public static final int[] b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f17514c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (yec.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && yec.p(iArr3, a))) {
            gfc.b(6, 4553, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (gfc.r(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && yec.p(iArr2, a))) {
            gfc.b(6, 4553, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrL = yec.l(bigInteger);
        if (iArrL[5] == -1) {
            int[] iArr = a;
            if (yec.p(iArrL, iArr)) {
                yec.E(iArr, iArrL);
            }
        }
        return iArrL;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrG = yec.g();
        yec.v(iArr, iArr2, iArrG);
        g(iArrG, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (yec.z(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && gfc.p(12, iArr3, b))) {
            int[] iArr4 = f17514c;
            if (gfc.e(iArr4.length, iArr4, iArr3) != 0) {
                gfc.s(12, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (yec.s(iArr)) {
            yec.H(iArr2);
        } else {
            yec.D(a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (yec.x(4553, yec.w(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && yec.p(iArr2, a))) {
            gfc.b(6, 4553, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || yec.y(4553, i, iArr, 0) == 0) && !(iArr[5] == -1 && yec.p(iArr, a))) {
            return;
        }
        gfc.b(6, 4553, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrG = yec.g();
        yec.B(iArr, iArrG);
        g(iArrG, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrG = yec.g();
        yec.B(iArr, iArrG);
        g(iArrG, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            yec.B(iArr2, iArrG);
            g(iArrG, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (yec.D(iArr, iArr2, iArr3) != 0) {
            gfc.K(6, 4553, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (gfc.D(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && yec.p(iArr2, a))) {
            gfc.b(6, 4553, iArr2);
        }
    }
}
