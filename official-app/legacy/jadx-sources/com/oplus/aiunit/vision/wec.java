package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class wec {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j5;
        return (int) (j5 >>> 32);
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
        return (int) (j5 >>> 32);
    }

    public static int[] c() {
        return new int[4];
    }

    public static long[] d() {
        return new long[2];
    }

    public static int[] e() {
        return new int[8];
    }

    public static long[] f() {
        return new long[4];
    }

    public static boolean g(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] i(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
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

    public static long[] j(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] jArrD = d();
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArrD[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArrD;
    }

    public static int k(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 4) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean l(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
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

    public static boolean m(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean o(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr[0]) & 4294967295L;
        long j7 = (j6 * j2) + 0;
        iArr3[0] = (int) j7;
        char c2 = StringUtil.SPACE;
        long j8 = (j7 >>> 32) + (j6 * j3);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j4);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j5);
        iArr3[3] = (int) j10;
        iArr3[4] = (int) (j10 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j11 = ((long) iArr[i]) & 4294967295L;
            int i3 = i + 0;
            int i4 = i;
            long j12 = (j11 * j2) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j12;
            int i5 = i4 + 1;
            long j13 = j2;
            long j14 = (j12 >>> c2) + (j11 * j3) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j14;
            int i6 = i4 + 2;
            long j15 = (j14 >>> 32) + (j11 * j4) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j15;
            c2 = StringUtil.SPACE;
            int i7 = i4 + 3;
            long j16 = (j15 >>> 32) + (j11 * j5) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j16;
            iArr3[i4 + 4] = (int) (j16 >>> 32);
            i = i5;
            j2 = j13;
            j3 = j3;
        }
    }

    public static int r(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[0]) & 4294967295L;
        long j4 = ((long) iArr2[1]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[3]) & 4294967295L;
        long j7 = 0;
        while (i < 4) {
            long j8 = ((long) iArr[i]) & j2;
            int i2 = i + 0;
            long j9 = (j8 * j3) + (((long) iArr3[i2]) & j2) + 0;
            iArr3[i2] = (int) j9;
            int i3 = i + 1;
            long j10 = (j9 >>> 32) + (j8 * j4) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j10;
            int i4 = i + 2;
            long j11 = (j10 >>> 32) + (j8 * j5) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j11;
            int i5 = i + 3;
            long j12 = (j11 >>> 32) + (j8 * j6) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j12;
            int i6 = i + 4;
            long j13 = (j12 >>> 32) + j7 + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j13;
            j7 = j13 >>> 32;
            i = i3;
            j2 = 4294967295L;
            j3 = j3;
            j4 = j4;
        }
        return (int) j7;
    }

    public static void s(int[] iArr, int[] iArr2) {
        long j2 = 4294967295L;
        long j3 = ((long) iArr[0]) & 4294967295L;
        char c2 = 3;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j4 = ((long) iArr[i3]) & j2;
            long j5 = j4 * j4;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j5 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j5 >>> 1);
            int i6 = (int) j5;
            if (i4 <= 0) {
                long j6 = j3 * j3;
                long j7 = (((long) (i6 << 31)) & j2) | (j6 >>> 33);
                iArr2[0] = (int) j6;
                long j8 = ((long) iArr[1]) & j2;
                long j9 = ((long) iArr2[2]) & j2;
                long j10 = j7 + (j8 * j3);
                int i7 = (int) j10;
                iArr2[1] = (i7 << 1) | (((int) (j6 >>> 32)) & 1);
                long j11 = j9 + (j10 >>> 32);
                long j12 = ((long) iArr[2]) & j2;
                long j13 = ((long) iArr2[c2]) & j2;
                long j14 = ((long) iArr2[4]) & j2;
                long j15 = j11 + (j12 * j3);
                int i8 = (int) j15;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long j16 = j13 + (j15 >>> 32) + (j12 * j8);
                long j17 = j14 + (j16 >>> 32);
                long j18 = ((long) iArr[3]) & 4294967295L;
                long j19 = (((long) iArr2[5]) & 4294967295L) + (j17 >>> 32);
                long j20 = j17 & 4294967295L;
                long j21 = (((long) iArr2[6]) & 4294967295L) + (j19 >>> 32);
                long j22 = (j16 & 4294967295L) + (j3 * j18);
                int i9 = (int) j22;
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
                long j23 = j20 + (j22 >>> 32) + (j8 * j18);
                long j24 = (j19 & 4294967295L) + (j23 >>> 32) + (j18 * j12);
                long j25 = j21 + (j24 >>> 32);
                int i10 = (int) j23;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                int i11 = (int) (4294967295L & j24);
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                int i13 = (int) j25;
                iArr2[6] = i12 | (i13 << 1);
                iArr2[7] = (i13 >>> 31) | ((iArr2[7] + ((int) (j25 >>> 32))) << 1);
                return;
            }
            i3 = i4;
            i2 = i6;
            c2 = c2;
            j2 = j2;
        }
    }

    public static int t(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static int u(int[] iArr, int[] iArr2) {
        long j2 = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (4294967295L & ((long) iArr[3])));
        iArr2[3] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static BigInteger v(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h2e.c(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger w(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j2 = jArr[i];
            if (j2 != 0) {
                h2e.h(j2, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void x(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }
}
