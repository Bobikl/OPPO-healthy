package com.oplus.aiunit.vision;

import com.oplus.backup.sdk.common.utils.ModuleType;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class smg {
    public static final int[] a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f16655c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (gfc.a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && gfc.p(12, iArr3, a))) {
            d(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (gfc.a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && gfc.p(24, iArr3, b))) {
            int[] iArr4 = f16655c;
            if (gfc.e(iArr4.length, iArr4, iArr3) != 0) {
                gfc.s(24, iArr3, iArr4.length);
            }
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        if (gfc.r(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && gfc.p(12, iArr2, a))) {
            d(iArr2);
        }
    }

    public static void d(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[1]) & 4294967295L) - 1);
        iArr[1] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            long j5 = j4 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j5;
            j4 = j5 >> 32;
        }
        long j6 = j4 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j6;
        long j7 = (j6 >> 32) + (4294967295L & ((long) iArr[4])) + 1;
        iArr[4] = (int) j7;
        if ((j7 >> 32) != 0) {
            gfc.s(12, iArr, 5);
        }
    }

    public static int[] e(BigInteger bigInteger) {
        int[] iArrN = gfc.n(ModuleType.TYPE_SYSTEM_SETTING, bigInteger);
        if (iArrN[11] == -1) {
            int[] iArr = a;
            if (gfc.p(12, iArrN, iArr)) {
                gfc.M(12, iArr, iArrN);
            }
        }
        return iArrN;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrI = gfc.i(24);
        cfc.a(iArr, iArr2, iArrI);
        h(iArrI, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (gfc.v(12, iArr)) {
            gfc.P(12, iArr2);
        } else {
            gfc.J(12, a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[16]) & 4294967295L;
        long j3 = ((long) iArr[17]) & 4294967295L;
        long j4 = ((long) iArr[18]) & 4294967295L;
        long j5 = ((long) iArr[19]) & 4294967295L;
        long j6 = ((long) iArr[20]) & 4294967295L;
        long j7 = ((long) iArr[21]) & 4294967295L;
        long j8 = ((long) iArr[22]) & 4294967295L;
        long j9 = ((long) iArr[23]) & 4294967295L;
        long j10 = ((((long) iArr[12]) & 4294967295L) + j6) - 1;
        long j11 = (((long) iArr[13]) & 4294967295L) + j8;
        long j12 = (((long) iArr[14]) & 4294967295L) + j8 + j9;
        long j13 = (((long) iArr[15]) & 4294967295L) + j9;
        long j14 = j3 + j7;
        long j15 = j7 - j9;
        long j16 = j8 - j9;
        long j17 = j10 + j15;
        long j18 = (((long) iArr[0]) & 4294967295L) + j17 + 0;
        iArr2[0] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[1]) & 4294967295L) + j9) - j10) + j11;
        iArr2[1] = (int) j19;
        long j20 = (j19 >> 32) + (((((long) iArr[2]) & 4294967295L) - j7) - j11) + j12;
        iArr2[2] = (int) j20;
        long j21 = (j20 >> 32) + ((((long) iArr[3]) & 4294967295L) - j12) + j13 + j17;
        iArr2[3] = (int) j21;
        long j22 = (j21 >> 32) + (((((((long) iArr[4]) & 4294967295L) + j2) + j7) + j11) - j13) + j17;
        iArr2[4] = (int) j22;
        long j23 = (j22 >> 32) + ((((long) iArr[5]) & 4294967295L) - j2) + j11 + j12 + j14;
        iArr2[5] = (int) j23;
        long j24 = (j23 >> 32) + (((((long) iArr[6]) & 4294967295L) + j4) - j3) + j12 + j13;
        iArr2[6] = (int) j24;
        long j25 = (j24 >> 32) + ((((((long) iArr[7]) & 4294967295L) + j2) + j5) - j4) + j13;
        iArr2[7] = (int) j25;
        long j26 = (j25 >> 32) + (((((((long) iArr[8]) & 4294967295L) + j2) + j3) + j6) - j5);
        iArr2[8] = (int) j26;
        long j27 = (j26 >> 32) + (((((long) iArr[9]) & 4294967295L) + j4) - j6) + j14;
        iArr2[9] = (int) j27;
        long j28 = (j27 >> 32) + ((((((long) iArr[10]) & 4294967295L) + j4) + j5) - j15) + j16;
        iArr2[10] = (int) j28;
        long j29 = (j28 >> 32) + ((((((long) iArr[11]) & 4294967295L) + j5) + j6) - j16);
        iArr2[11] = (int) j29;
        i((int) ((j29 >> 32) + 1), iArr2);
    }

    public static void i(int i, int[] iArr) {
        long j2;
        if (i != 0) {
            long j3 = ((long) i) & 4294967295L;
            long j4 = (((long) iArr[0]) & 4294967295L) + j3 + 0;
            iArr[0] = (int) j4;
            long j5 = (j4 >> 32) + ((((long) iArr[1]) & 4294967295L) - j3);
            iArr[1] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j7;
                j6 = j7 >> 32;
            }
            long j8 = j6 + (((long) iArr[3]) & 4294967295L) + j3;
            iArr[3] = (int) j8;
            long j9 = (j8 >> 32) + (4294967295L & ((long) iArr[4])) + j3;
            iArr[4] = (int) j9;
            j2 = j9 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || gfc.s(12, iArr, 5) == 0) && !(iArr[11] == -1 && gfc.p(12, iArr, a))) {
            return;
        }
        d(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrI = gfc.i(24);
        cfc.b(iArr, iArrI);
        h(iArrI, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrI = gfc.i(24);
        cfc.b(iArr, iArrI);
        h(iArrI, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            cfc.b(iArr2, iArrI);
            h(iArrI, iArr2);
        }
    }

    public static void l(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j2;
        long j3 = (j2 >> 32) + (((long) iArr[1]) & 4294967295L) + 1;
        iArr[1] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            long j5 = j4 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j5;
            j4 = j5 >> 32;
        }
        long j6 = j4 + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j6;
        long j7 = (j6 >> 32) + ((4294967295L & ((long) iArr[4])) - 1);
        iArr[4] = (int) j7;
        if ((j7 >> 32) != 0) {
            gfc.l(12, iArr, 5);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (gfc.J(12, iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (gfc.D(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && gfc.p(12, iArr2, a))) {
            d(iArr2);
        }
    }
}
