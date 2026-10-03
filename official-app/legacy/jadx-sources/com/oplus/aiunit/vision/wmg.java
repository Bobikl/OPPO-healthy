package com.oplus.aiunit.vision;

import androidx.core.app.FrameMetricsAggregator;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class wmg {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, FrameMetricsAggregator.EVERY_DURATION};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int iA = gfc.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iA > 511 || (iA == 511 && gfc.m(16, iArr3, a))) {
            iA = (iA + gfc.q(16, iArr3)) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr3[16] = iA;
    }

    public static void b(int[] iArr, int[] iArr2) {
        int iR = gfc.r(16, iArr, iArr2) + iArr[16];
        if (iR > 511 || (iR == 511 && gfc.m(16, iArr2, a))) {
            iR = (iR + gfc.q(16, iArr2)) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr2[16] = iR;
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrN = gfc.n(521, bigInteger);
        if (gfc.m(17, iArrN, a)) {
            gfc.P(17, iArrN);
        }
        return iArrN;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        efc.a(iArr, iArr2, iArr3);
        int i = iArr[16];
        int i2 = iArr2[16];
        iArr3[32] = gfc.w(16, i, iArr2, i2, iArr, iArr3, 16) + (i * i2);
    }

    public static void e(int[] iArr, int[] iArr2) {
        efc.b(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = gfc.x(16, i << 1, iArr, 0, iArr2, 16) + (i * i);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrI = gfc.i(33);
        d(iArr, iArr2, iArrI);
        h(iArrI, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (gfc.v(17, iArr)) {
            gfc.P(17, iArr2);
        } else {
            gfc.J(17, a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int iA = (gfc.A(16, iArr, 16, 9, i, iArr2, 0) >>> 23) + (i >>> 9) + gfc.e(16, iArr, iArr2);
        if (iA > 511 || (iA == 511 && gfc.m(16, iArr2, a))) {
            iA = (iA + gfc.q(16, iArr2)) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr2[16] = iA;
    }

    public static void i(int[] iArr) {
        int i = iArr[16];
        int iG = gfc.g(16, i >>> 9, iArr) + (i & FrameMetricsAggregator.EVERY_DURATION);
        if (iG > 511 || (iG == 511 && gfc.m(16, iArr, a))) {
            iG = (iG + gfc.q(16, iArr)) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr[16] = iG;
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrI = gfc.i(33);
        e(iArr, iArrI);
        h(iArrI, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrI = gfc.i(33);
        e(iArr, iArrI);
        h(iArrI, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            e(iArr2, iArrI);
            h(iArrI, iArr2);
        }
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        int iJ = (gfc.J(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iJ < 0) {
            iJ = (iJ + gfc.k(16, iArr3)) & FrameMetricsAggregator.EVERY_DURATION;
        }
        iArr3[16] = iJ;
    }

    public static void m(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (gfc.D(16, iArr, i << 23, iArr2) | (i << 1)) & FrameMetricsAggregator.EVERY_DURATION;
    }
}
