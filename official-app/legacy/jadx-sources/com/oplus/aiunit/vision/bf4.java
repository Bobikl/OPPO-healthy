package com.oplus.aiunit.vision;

import java.math.BigInteger;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes11.dex */
public class bf4 {
    public static final int[] a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        afc.a(iArr, iArr2, iArr3);
        if (afc.q(iArr3, a)) {
            m(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        gfc.r(8, iArr, iArr2);
        if (afc.q(iArr2, a)) {
            m(iArr2);
        }
    }

    public static int c(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - 19;
        iArr[0] = (int) j2;
        long jL = j2 >> 32;
        if (jL != 0) {
            jL = gfc.l(7, iArr, 1);
        }
        long j3 = jL + (4294967295L & ((long) iArr[7])) + 2147483648L;
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] iArrM = afc.m(bigInteger);
        while (true) {
            int[] iArr = a;
            if (!afc.q(iArrM, iArr)) {
                return iArrM;
            }
            afc.G(iArr, iArrM);
        }
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrH = afc.h();
        afc.w(iArr, iArr2, iArrH);
        h(iArrH, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        afc.A(iArr, iArr2, iArr3);
        if (gfc.p(16, iArr3, b)) {
            l(iArr3);
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
        int i = iArr[7];
        gfc.C(8, iArr, 8, i, iArr2, 0);
        int iB = afc.B(19, iArr, iArr2) << 1;
        int i2 = iArr2[7];
        iArr2[7] = (i2 & Integer.MAX_VALUE) + gfc.g(7, (iB + ((i2 >>> 31) - (i >>> 31))) * 19, iArr2);
        if (afc.q(iArr2, a)) {
            m(iArr2);
        }
    }

    public static void i(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & Integer.MAX_VALUE) + gfc.g(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (afc.q(iArr, a)) {
            m(iArr);
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

    public static int l(int[] iArr) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int[] iArr2 = b;
        long j3 = j2 - (((long) iArr2[0]) & 4294967295L);
        iArr[0] = (int) j3;
        long jL = j3 >> 32;
        if (jL != 0) {
            jL = gfc.l(8, iArr, 1);
        }
        long j4 = jL + (((long) iArr[8]) & 4294967295L) + 19;
        iArr[8] = (int) j4;
        long jS = j4 >> 32;
        if (jS != 0) {
            jS = gfc.s(15, iArr, 9);
        }
        long j5 = jS + ((((long) iArr[15]) & 4294967295L) - (4294967295L & ((long) (iArr2[15] + 1))));
        iArr[15] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static int m(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j2;
        long jS = j2 >> 32;
        if (jS != 0) {
            jS = gfc.s(7, iArr, 1);
        }
        long j3 = jS + ((4294967295L & ((long) iArr[7])) - 2147483648L);
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    public static void n(int[] iArr, int[] iArr2, int[] iArr3) {
        if (afc.F(iArr, iArr2, iArr3) != 0) {
            c(iArr3);
        }
    }

    public static void o(int[] iArr, int[] iArr2) {
        gfc.D(8, iArr, 0, iArr2);
        if (afc.q(iArr2, a)) {
            m(iArr2);
        }
    }
}
