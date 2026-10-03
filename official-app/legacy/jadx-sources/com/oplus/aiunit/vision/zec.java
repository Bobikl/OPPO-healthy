package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class zec {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static void c(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] d() {
        return new int[7];
    }

    public static int[] e() {
        return new int[14];
    }

    public static boolean f(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] g(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArrD = d();
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArrD[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArrD;
    }

    public static int h(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean i(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean j(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = (j9 * j2) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j3);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j4);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j5);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j6);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j7);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j8);
        iArr3[6] = (int) j16;
        iArr3[7] = (int) (j16 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j17 = ((long) iArr[i]) & 4294967295L;
            int i3 = i + 0;
            long j18 = (j17 * j2) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j18;
            int i4 = i + 1;
            long j19 = j3;
            long j20 = (j18 >>> 32) + (j17 * j3) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j20;
            int i5 = i + 2;
            long j21 = j7;
            long j22 = (j20 >>> 32) + (j17 * j4) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j22;
            int i6 = i + 3;
            long j23 = (j22 >>> 32) + (j17 * j5) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j23;
            int i7 = i + 4;
            long j24 = (j23 >>> 32) + (j17 * j6) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j24;
            int i8 = i + 5;
            long j25 = (j24 >>> 32) + (j17 * j21) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j25;
            int i9 = i + 6;
            long j26 = (j25 >>> 32) + (j17 * j8) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j26;
            iArr3[i + 7] = (int) (j26 >>> 32);
            i = i4;
            j2 = j2;
            j3 = j19;
            j7 = j21;
        }
    }

    public static long m(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = ((long) iArr[i2 + 0]) & 4294967295L;
        long j4 = (j2 * j3) + (((long) iArr2[i3 + 0]) & 4294967295L) + 0;
        iArr3[i4 + 0] = (int) j4;
        long j5 = ((long) iArr[i2 + 1]) & 4294967295L;
        long j6 = (j4 >>> 32) + (j2 * j5) + j3 + (((long) iArr2[i3 + 1]) & 4294967295L);
        iArr3[i4 + 1] = (int) j6;
        long j7 = j6 >>> 32;
        long j8 = ((long) iArr[i2 + 2]) & 4294967295L;
        long j9 = j7 + (j2 * j8) + j5 + (((long) iArr2[i3 + 2]) & 4294967295L);
        iArr3[i4 + 2] = (int) j9;
        long j10 = ((long) iArr[i2 + 3]) & 4294967295L;
        long j11 = (j9 >>> 32) + (j2 * j10) + j8 + (((long) iArr2[i3 + 3]) & 4294967295L);
        iArr3[i4 + 3] = (int) j11;
        long j12 = ((long) iArr[i2 + 4]) & 4294967295L;
        long j13 = (j11 >>> 32) + (j2 * j12) + j10 + (((long) iArr2[i3 + 4]) & 4294967295L);
        iArr3[i4 + 4] = (int) j13;
        long j14 = ((long) iArr[i2 + 5]) & 4294967295L;
        long j15 = (j13 >>> 32) + (j2 * j14) + j12 + (((long) iArr2[i3 + 5]) & 4294967295L);
        iArr3[i4 + 5] = (int) j15;
        long j16 = ((long) iArr[i2 + 6]) & 4294967295L;
        long j17 = (j15 >>> 32) + (j2 * j16) + j14 + (4294967295L & ((long) iArr2[i3 + 6]));
        iArr3[i4 + 6] = (int) j17;
        return (j17 >>> 32) + j16;
    }

    public static int n(int i, long j2, int[] iArr, int i2) {
        long j3 = ((long) i) & 4294967295L;
        long j4 = j2 & 4294967295L;
        int i3 = i2 + 0;
        long j5 = (j3 * j4) + (((long) iArr[i3]) & 4294967295L) + 0;
        iArr[i3] = (int) j5;
        long j6 = j2 >>> 32;
        long j7 = (j3 * j6) + j4;
        int i4 = i2 + 1;
        long j8 = (j5 >>> 32) + j7 + (((long) iArr[i4]) & 4294967295L);
        iArr[i4] = (int) j8;
        int i5 = i2 + 2;
        long j9 = (j8 >>> 32) + j6 + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j9;
        int i6 = i2 + 3;
        long j10 = (j9 >>> 32) + (4294967295L & ((long) iArr[i6]));
        iArr[i6] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return gfc.t(7, iArr, i2, 4);
    }

    public static int o(int i, int i2, int[] iArr, int i3) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = ((long) i2) & 4294967295L;
        int i4 = i3 + 0;
        long j4 = (j2 * j3) + (((long) iArr[i4]) & 4294967295L) + 0;
        iArr[i4] = (int) j4;
        int i5 = i3 + 1;
        long j5 = (j4 >>> 32) + j3 + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j5;
        long j6 = j5 >>> 32;
        int i6 = i3 + 2;
        long j7 = j6 + (((long) iArr[i6]) & 4294967295L);
        iArr[i6] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return gfc.t(7, iArr, i3, 3);
    }

    public static int p(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[0]) & 4294967295L;
        long j4 = ((long) iArr2[1]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[3]) & 4294967295L;
        long j7 = ((long) iArr2[4]) & 4294967295L;
        long j8 = ((long) iArr2[5]) & 4294967295L;
        long j9 = ((long) iArr2[6]) & 4294967295L;
        long j10 = 0;
        int i = 0;
        while (i < 7) {
            long j11 = j9;
            long j12 = ((long) iArr[i]) & j2;
            int i2 = i + 0;
            long j13 = j8;
            long j14 = (j12 * j3) + (((long) iArr3[i2]) & j2) + 0;
            iArr3[i2] = (int) j14;
            int i3 = i + 1;
            long j15 = j4;
            long j16 = (j14 >>> 32) + (j12 * j4) + (((long) iArr3[i3]) & j2);
            iArr3[i3] = (int) j16;
            int i4 = i + 2;
            long j17 = (j16 >>> 32) + (j12 * j5) + (((long) iArr3[i4]) & j2);
            iArr3[i4] = (int) j17;
            int i5 = i + 3;
            long j18 = (j17 >>> 32) + (j12 * j6) + (((long) iArr3[i5]) & j2);
            iArr3[i5] = (int) j18;
            int i6 = i + 4;
            long j19 = (j18 >>> 32) + (j12 * j7) + (((long) iArr3[i6]) & j2);
            iArr3[i6] = (int) j19;
            int i7 = i + 5;
            long j20 = (j19 >>> 32) + (j12 * j13) + (((long) iArr3[i7]) & j2);
            iArr3[i7] = (int) j20;
            int i8 = i + 6;
            long j21 = (j20 >>> 32) + (j12 * j11) + (((long) iArr3[i8]) & j2);
            iArr3[i8] = (int) j21;
            int i9 = i + 7;
            long j22 = (j21 >>> 32) + j10 + (((long) iArr3[i9]) & j2);
            iArr3[i9] = (int) j22;
            j10 = j22 >>> 32;
            i = i3;
            j9 = j11;
            j8 = j13;
            j4 = j15;
            j2 = 4294967295L;
        }
        return (int) j10;
    }

    public static void q(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
        while (true) {
            int i4 = i3 - 1;
            long j3 = ((long) iArr[i3]) & 4294967295L;
            long j4 = j3 * j3;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j4 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j4 >>> 1);
            int i6 = (int) j4;
            if (i4 <= 0) {
                long j5 = j2 * j2;
                long j6 = (((long) (i6 << 31)) & 4294967295L) | (j5 >>> 33);
                iArr2[0] = (int) j5;
                long j7 = ((long) iArr[1]) & 4294967295L;
                long j8 = ((long) iArr2[2]) & 4294967295L;
                long j9 = j6 + (j7 * j2);
                int i7 = (int) j9;
                iArr2[1] = (i7 << 1) | (((int) (j5 >>> 32)) & 1);
                long j10 = j8 + (j9 >>> 32);
                long j11 = ((long) iArr[2]) & 4294967295L;
                long j12 = ((long) iArr2[3]) & 4294967295L;
                long j13 = ((long) iArr2[4]) & 4294967295L;
                long j14 = j10 + (j11 * j2);
                int i8 = (int) j14;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long j15 = j12 + (j14 >>> 32) + (j11 * j7);
                long j16 = j13 + (j15 >>> 32);
                long j17 = ((long) iArr[3]) & 4294967295L;
                long j18 = (((long) iArr2[5]) & 4294967295L) + (j16 >>> 32);
                long j19 = j16 & 4294967295L;
                long j20 = (((long) iArr2[6]) & 4294967295L) + (j18 >>> 32);
                long j21 = (j15 & 4294967295L) + (j17 * j2);
                int i9 = (int) j21;
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
                long j22 = j19 + (j21 >>> 32) + (j17 * j7);
                long j23 = (j18 & 4294967295L) + (j22 >>> 32) + (j17 * j11);
                long j24 = j20 + (j23 >>> 32);
                long j25 = j23 & 4294967295L;
                long j26 = ((long) iArr[4]) & 4294967295L;
                long j27 = (((long) iArr2[7]) & 4294967295L) + (j24 >>> 32);
                long j28 = j24 & 4294967295L;
                long j29 = (((long) iArr2[8]) & 4294967295L) + (j27 >>> 32);
                long j30 = (j22 & 4294967295L) + (j26 * j2);
                int i10 = (int) j30;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                long j31 = j25 + (j30 >>> 32) + (j26 * j7);
                long j32 = j28 + (j31 >>> 32) + (j26 * j11);
                long j33 = (j27 & 4294967295L) + (j32 >>> 32) + (j26 * j17);
                long j34 = j29 + (j33 >>> 32);
                long j35 = ((long) iArr[5]) & 4294967295L;
                long j36 = (((long) iArr2[9]) & 4294967295L) + (j34 >>> 32);
                long j37 = j34 & 4294967295L;
                long j38 = (((long) iArr2[10]) & 4294967295L) + (j36 >>> 32);
                long j39 = (j31 & 4294967295L) + (j35 * j2);
                int i11 = (int) j39;
                iArr2[5] = (i11 << 1) | (i10 >>> 31);
                long j40 = (j32 & 4294967295L) + (j39 >>> 32) + (j35 * j7);
                long j41 = (j33 & 4294967295L) + (j40 >>> 32) + (j35 * j11);
                long j42 = j37 + (j41 >>> 32) + (j35 * j17);
                long j43 = (j36 & 4294967295L) + (j42 >>> 32) + (j35 * j26);
                long j44 = j38 + (j43 >>> 32);
                long j45 = j43 & 4294967295L;
                long j46 = ((long) iArr[6]) & 4294967295L;
                long j47 = (((long) iArr2[11]) & 4294967295L) + (j44 >>> 32);
                long j48 = j44 & 4294967295L;
                long j49 = (((long) iArr2[12]) & 4294967295L) + (j47 >>> 32);
                long j50 = (j40 & 4294967295L) + (j2 * j46);
                int i12 = (int) j50;
                iArr2[6] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long j51 = (j41 & 4294967295L) + (j50 >>> 32) + (j7 * j46);
                long j52 = (j42 & 4294967295L) + (j51 >>> 32) + (j46 * j11);
                long j53 = j45 + (j52 >>> 32) + (j46 * j17);
                long j54 = j48 + (j53 >>> 32) + (j46 * j26);
                long j55 = (j47 & 4294967295L) + (j54 >>> 32) + (j46 * j35);
                long j56 = j49 + (j55 >>> 32);
                int i14 = (int) j51;
                iArr2[7] = i13 | (i14 << 1);
                int i15 = (int) j52;
                iArr2[8] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j53;
                iArr2[9] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) j54;
                iArr2[10] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j55;
                iArr2[11] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j56;
                iArr2[12] = i22 | (i23 << 1);
                iArr2[13] = (i23 >>> 31) | ((iArr2[13] + ((int) (j56 >>> 32))) << 1);
                return;
            }
            i3 = i4;
            i2 = i6;
        }
    }

    public static int r(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int s(int[] iArr, int[] iArr2) {
        long j2 = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (4294967295L & ((long) iArr[6])));
        iArr2[6] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger t(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h2e.c(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void u(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }
}
