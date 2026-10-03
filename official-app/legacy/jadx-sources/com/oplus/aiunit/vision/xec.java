package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xec {
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
        return (int) (j6 >>> 32);
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
        return (int) (j6 >>> 32);
    }

    public static int[] c() {
        return new int[5];
    }

    public static int[] d() {
        return new int[10];
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] f(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] iArrC = c();
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArrC[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArrC;
    }

    public static int g(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 5) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean h(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
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

    public static boolean i(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr[0]) & 4294967295L;
        long j8 = (j7 * j2) + 0;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j3);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j4);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j5);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j6);
        iArr3[4] = (int) j12;
        iArr3[5] = (int) (j12 >>> 32);
        for (int i2 = 5; i < i2; i2 = 5) {
            long j13 = ((long) iArr[i]) & 4294967295L;
            int i3 = i + 0;
            long j14 = (j13 * j2) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j14;
            int i4 = i + 1;
            long j15 = j3;
            long j16 = (j14 >>> 32) + (j13 * j3) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j16;
            int i5 = i + 2;
            long j17 = j6;
            long j18 = (j16 >>> 32) + (j13 * j4) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j18;
            int i6 = i + 3;
            long j19 = (j18 >>> 32) + (j13 * j5) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j19;
            int i7 = i + 4;
            long j20 = (j19 >>> 32) + (j13 * j17) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j20;
            iArr3[i + 5] = (int) (j20 >>> 32);
            i = i4;
            j6 = j17;
            j2 = j2;
            j3 = j15;
        }
    }

    public static long l(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
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
        long j13 = (j11 >>> 32) + (j2 * j12) + j10 + (4294967295L & ((long) iArr2[i3 + 4]));
        iArr3[i4 + 4] = (int) j13;
        return (j13 >>> 32) + j12;
    }

    public static int m(int i, long j2, int[] iArr, int i2) {
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
        return gfc.t(5, iArr, i2, 4);
    }

    public static int n(int i, int i2, int[] iArr, int i3) {
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
        return gfc.t(5, iArr, i3, 3);
    }

    public static int o(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[0]) & 4294967295L;
        long j4 = ((long) iArr2[1]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[3]) & 4294967295L;
        long j7 = ((long) iArr2[4]) & 4294967295L;
        long j8 = 0;
        while (i < 5) {
            long j9 = ((long) iArr[i]) & j2;
            int i2 = i + 0;
            long j10 = (j9 * j3) + (((long) iArr3[i2]) & j2) + 0;
            iArr3[i2] = (int) j10;
            int i3 = i + 1;
            long j11 = j4;
            long j12 = (j10 >>> 32) + (j9 * j4) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j12;
            int i4 = i + 2;
            long j13 = j5;
            long j14 = (j12 >>> 32) + (j9 * j5) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j14;
            int i5 = i + 3;
            long j15 = (j14 >>> 32) + (j9 * j6) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j15;
            int i6 = i + 4;
            long j16 = (j15 >>> 32) + (j9 * j7) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j16;
            int i7 = i + 5;
            long j17 = (j16 >>> 32) + j8 + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j17;
            j8 = j17 >>> 32;
            i = i3;
            j2 = 4294967295L;
            j3 = j3;
            j5 = j13;
            j4 = j11;
        }
        return (int) j8;
    }

    public static int p(int i, int i2, int[] iArr, int i3) {
        long j2 = (((long) i2) & 4294967295L) * (((long) i) & 4294967295L);
        int i4 = i3 + 0;
        long j3 = j2 + (((long) iArr[i4]) & 4294967295L) + 0;
        iArr[i4] = (int) j3;
        int i5 = i3 + 1;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[i5]));
        iArr[i5] = (int) j4;
        if ((j4 >>> 32) == 0) {
            return 0;
        }
        return gfc.t(5, iArr, i3, 2);
    }

    public static void q(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
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
                int i9 = i8 >>> 31;
                long j15 = j12 + (j14 >>> 32) + (j11 * j7);
                long j16 = j13 + (j15 >>> 32);
                long j17 = ((long) iArr[3]) & 4294967295L;
                long j18 = (((long) iArr2[5]) & 4294967295L) + (j16 >>> 32);
                long j19 = (((long) iArr2[6]) & 4294967295L) + (j18 >>> 32);
                long j20 = (j15 & 4294967295L) + (j17 * j2);
                int i10 = (int) j20;
                iArr2[3] = (i10 << 1) | i9;
                int i11 = i10 >>> 31;
                long j21 = (j16 & 4294967295L) + (j20 >>> 32) + (j17 * j7);
                long j22 = (j18 & 4294967295L) + (j21 >>> 32) + (j17 * j11);
                long j23 = j19 + (j22 >>> 32);
                long j24 = ((long) iArr[4]) & 4294967295L;
                long j25 = (((long) iArr2[7]) & 4294967295L) + (j23 >>> 32);
                long j26 = j23 & 4294967295L;
                long j27 = (((long) iArr2[8]) & 4294967295L) + (j25 >>> 32);
                long j28 = (j21 & 4294967295L) + (j2 * j24);
                int i12 = (int) j28;
                iArr2[4] = (i12 << 1) | i11;
                long j29 = (j22 & 4294967295L) + (j28 >>> 32) + (j24 * j7);
                long j30 = j26 + (j29 >>> 32) + (j24 * j11);
                long j31 = (4294967295L & j25) + (j30 >>> 32) + (j24 * j17);
                long j32 = j27 + (j31 >>> 32);
                int i13 = (int) j29;
                iArr2[5] = (i12 >>> 31) | (i13 << 1);
                int i14 = (int) j30;
                iArr2[6] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j31;
                iArr2[7] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j32;
                iArr2[8] = i17 | (i18 << 1);
                iArr2[9] = (i18 >>> 31) | ((iArr2[9] + ((int) (j32 >>> 32))) << 1);
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
        return (int) (j6 >> 32);
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
        long j6 = (j5 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (4294967295L & ((long) iArr[4])));
        iArr2[4] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static BigInteger t(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h2e.c(i2, bArr, (4 - i) << 2);
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
    }
}
