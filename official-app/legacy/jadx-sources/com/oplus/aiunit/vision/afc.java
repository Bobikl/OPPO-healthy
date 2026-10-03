package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class afc {
    public static int A(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[0]) & 4294967295L;
        long j4 = ((long) iArr2[1]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[3]) & 4294967295L;
        long j7 = ((long) iArr2[4]) & 4294967295L;
        long j8 = ((long) iArr2[5]) & 4294967295L;
        long j9 = ((long) iArr2[6]) & 4294967295L;
        long j10 = ((long) iArr2[7]) & 4294967295L;
        long j11 = 0;
        int i = 0;
        while (i < 8) {
            long j12 = j10;
            long j13 = ((long) iArr[i]) & j2;
            int i2 = i + 0;
            long j14 = j8;
            long j15 = (j13 * j3) + (((long) iArr3[i2]) & j2) + 0;
            iArr3[i2] = (int) j15;
            int i3 = i + 1;
            long j16 = j4;
            long j17 = (j15 >>> 32) + (j13 * j4) + (((long) iArr3[i3]) & j2);
            iArr3[i3] = (int) j17;
            int i4 = i + 2;
            long j18 = (j17 >>> 32) + (j13 * j5) + (((long) iArr3[i4]) & j2);
            iArr3[i4] = (int) j18;
            int i5 = i + 3;
            long j19 = (j18 >>> 32) + (j13 * j6) + (((long) iArr3[i5]) & j2);
            iArr3[i5] = (int) j19;
            int i6 = i + 4;
            long j20 = (j19 >>> 32) + (j13 * j7) + (((long) iArr3[i6]) & j2);
            iArr3[i6] = (int) j20;
            int i7 = i + 5;
            long j21 = (j20 >>> 32) + (j13 * j14) + (((long) iArr3[i7]) & j2);
            iArr3[i7] = (int) j21;
            int i8 = i + 6;
            long j22 = (j21 >>> 32) + (j13 * j9) + (((long) iArr3[i8]) & j2);
            iArr3[i8] = (int) j22;
            int i9 = i + 7;
            long j23 = (j22 >>> 32) + (j13 * j12) + (((long) iArr3[i9]) & j2);
            iArr3[i9] = (int) j23;
            int i10 = i + 8;
            long j24 = (j23 >>> 32) + j11 + (((long) iArr3[i10]) & j2);
            iArr3[i10] = (int) j24;
            j11 = j24 >>> 32;
            i = i3;
            j10 = j12;
            j8 = j14;
            j4 = j16;
            j2 = 4294967295L;
        }
        return (int) j11;
    }

    public static int B(int i, int[] iArr, int[] iArr2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = ((((long) iArr2[0]) & 4294967295L) * j2) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr2[1]) & 4294967295L) * j2) + (((long) iArr[1]) & 4294967295L);
        iArr2[1] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr2[2]) & 4294967295L) * j2) + (((long) iArr[2]) & 4294967295L);
        iArr2[2] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[3]) & 4294967295L) * j2) + (((long) iArr[3]) & 4294967295L);
        iArr2[3] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr2[4]) & 4294967295L) * j2) + (((long) iArr[4]) & 4294967295L);
        iArr2[4] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr2[5]) & 4294967295L) * j2) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j8;
        long j9 = (j8 >>> 32) + ((((long) iArr2[6]) & 4294967295L) * j2) + (((long) iArr[6]) & 4294967295L);
        iArr2[6] = (int) j9;
        long j10 = (j9 >>> 32) + (j2 * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7]));
        iArr2[7] = (int) j10;
        return (int) (j10 >>> 32);
    }

    public static void C(int[] iArr, int i, int[] iArr2, int i2) {
        long j2 = ((long) iArr[i + 0]) & 4294967295L;
        int i3 = 0;
        int i4 = 16;
        int i5 = 7;
        while (true) {
            int i6 = i5 - 1;
            long j3 = ((long) iArr[i + i5]) & 4294967295L;
            long j4 = j3 * j3;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i3 << 31) | ((int) (j4 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i6 <= 0) {
                long j5 = j2 * j2;
                long j6 = (j5 >>> 33) | (((long) (i3 << 31)) & 4294967295L);
                iArr2[i2 + 0] = (int) j5;
                int i8 = ((int) (j5 >>> 32)) & 1;
                long j7 = ((long) iArr[i + 1]) & 4294967295L;
                int i9 = i2 + 2;
                long j8 = ((long) iArr2[i9]) & 4294967295L;
                long j9 = j6 + (j7 * j2);
                int i10 = (int) j9;
                iArr2[i2 + 1] = (i10 << 1) | i8;
                int i11 = i10 >>> 31;
                long j10 = j8 + (j9 >>> 32);
                long j11 = ((long) iArr[i + 2]) & 4294967295L;
                int i12 = i2 + 3;
                long j12 = ((long) iArr2[i12]) & 4294967295L;
                int i13 = i2 + 4;
                long j13 = ((long) iArr2[i13]) & 4294967295L;
                long j14 = j10 + (j11 * j2);
                int i14 = (int) j14;
                iArr2[i9] = (i14 << 1) | i11;
                long j15 = j12 + (j14 >>> 32) + (j11 * j7);
                long j16 = j13 + (j15 >>> 32);
                long j17 = ((long) iArr[i + 3]) & 4294967295L;
                int i15 = i2 + 5;
                long j18 = (((long) iArr2[i15]) & 4294967295L) + (j16 >>> 32);
                long j19 = j16 & 4294967295L;
                int i16 = i2 + 6;
                long j20 = (((long) iArr2[i16]) & 4294967295L) + (j18 >>> 32);
                long j21 = (j15 & 4294967295L) + (j17 * j2);
                int i17 = (int) j21;
                iArr2[i12] = (i17 << 1) | (i14 >>> 31);
                long j22 = j19 + (j21 >>> 32) + (j17 * j7);
                long j23 = (j18 & 4294967295L) + (j22 >>> 32) + (j17 * j11);
                long j24 = j20 + (j23 >>> 32);
                long j25 = j23 & 4294967295L;
                long j26 = ((long) iArr[i + 4]) & 4294967295L;
                int i18 = i2 + 7;
                long j27 = (((long) iArr2[i18]) & 4294967295L) + (j24 >>> 32);
                int i19 = i2 + 8;
                long j28 = (((long) iArr2[i19]) & 4294967295L) + (j27 >>> 32);
                long j29 = (j22 & 4294967295L) + (j26 * j2);
                int i20 = (int) j29;
                iArr2[i13] = (i20 << 1) | (i17 >>> 31);
                int i21 = i20 >>> 31;
                long j30 = j25 + (j29 >>> 32) + (j26 * j7);
                long j31 = (j24 & 4294967295L) + (j30 >>> 32) + (j26 * j11);
                long j32 = (j27 & 4294967295L) + (j31 >>> 32) + (j26 * j17);
                long j33 = j28 + (j32 >>> 32);
                long j34 = j32 & 4294967295L;
                long j35 = ((long) iArr[i + 5]) & 4294967295L;
                int i22 = i2 + 9;
                long j36 = (((long) iArr2[i22]) & 4294967295L) + (j33 >>> 32);
                long j37 = j33 & 4294967295L;
                int i23 = i2 + 10;
                long j38 = (((long) iArr2[i23]) & 4294967295L) + (j36 >>> 32);
                long j39 = (j30 & 4294967295L) + (j35 * j2);
                int i24 = (int) j39;
                iArr2[i15] = (i24 << 1) | i21;
                int i25 = i24 >>> 31;
                long j40 = (j31 & 4294967295L) + (j39 >>> 32) + (j35 * j7);
                long j41 = j34 + (j40 >>> 32) + (j35 * j11);
                long j42 = j37 + (j41 >>> 32) + (j35 * j17);
                long j43 = (j36 & 4294967295L) + (j42 >>> 32) + (j35 * j26);
                long j44 = j38 + (j43 >>> 32);
                long j45 = j43 & 4294967295L;
                long j46 = ((long) iArr[i + 6]) & 4294967295L;
                int i26 = i2 + 11;
                long j47 = (((long) iArr2[i26]) & 4294967295L) + (j44 >>> 32);
                long j48 = j44 & 4294967295L;
                int i27 = i2 + 12;
                long j49 = (((long) iArr2[i27]) & 4294967295L) + (j47 >>> 32);
                long j50 = (j40 & 4294967295L) + (j46 * j2);
                int i28 = (int) j50;
                iArr2[i16] = (i28 << 1) | i25;
                int i29 = i28 >>> 31;
                long j51 = (j41 & 4294967295L) + (j50 >>> 32) + (j46 * j7);
                long j52 = (j42 & 4294967295L) + (j51 >>> 32) + (j46 * j11);
                long j53 = j45 + (j52 >>> 32) + (j46 * j17);
                long j54 = j52 & 4294967295L;
                long j55 = j48 + (j53 >>> 32) + (j46 * j26);
                long j56 = (j47 & 4294967295L) + (j55 >>> 32) + (j46 * j35);
                long j57 = j49 + (j56 >>> 32);
                long j58 = j56 & 4294967295L;
                long j59 = ((long) iArr[i + 7]) & 4294967295L;
                int i30 = i2 + 13;
                long j60 = (((long) iArr2[i30]) & 4294967295L) + (j57 >>> 32);
                long j61 = j57 & 4294967295L;
                int i31 = i2 + 14;
                long j62 = (((long) iArr2[i31]) & 4294967295L) + (j60 >>> 32);
                long j63 = 4294967295L & j60;
                long j64 = (j51 & 4294967295L) + (j2 * j59);
                int i32 = (int) j64;
                iArr2[i18] = (i32 << 1) | i29;
                long j65 = j54 + (j64 >>> 32) + (j7 * j59);
                long j66 = (j53 & 4294967295L) + (j65 >>> 32) + (j59 * j11);
                long j67 = (j55 & 4294967295L) + (j66 >>> 32) + (j59 * j17);
                long j68 = j58 + (j67 >>> 32) + (j59 * j26);
                long j69 = j61 + (j68 >>> 32) + (j59 * j35);
                long j70 = j63 + (j69 >>> 32) + (j59 * j46);
                long j71 = j62 + (j70 >>> 32);
                int i33 = (int) j65;
                iArr2[i19] = (i32 >>> 31) | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j66;
                iArr2[i22] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j67;
                iArr2[i23] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) j68;
                iArr2[i26] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = (int) j69;
                iArr2[i27] = i40 | (i41 << 1);
                int i42 = i41 >>> 31;
                int i43 = (int) j70;
                iArr2[i30] = i42 | (i43 << 1);
                int i44 = i43 >>> 31;
                int i45 = (int) j71;
                iArr2[i31] = i44 | (i45 << 1);
                int i46 = i45 >>> 31;
                int i47 = i2 + 15;
                iArr2[i47] = i46 | ((iArr2[i47] + ((int) (j71 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void D(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 0;
        int i3 = 7;
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
                int i11 = i10 >>> 31;
                long j31 = j25 + (j30 >>> 32) + (j26 * j7);
                long j32 = j28 + (j31 >>> 32) + (j26 * j11);
                long j33 = (j27 & 4294967295L) + (j32 >>> 32) + (j26 * j17);
                long j34 = j29 + (j33 >>> 32);
                long j35 = j33 & 4294967295L;
                long j36 = ((long) iArr[5]) & 4294967295L;
                long j37 = (((long) iArr2[9]) & 4294967295L) + (j34 >>> 32);
                long j38 = j34 & 4294967295L;
                long j39 = (((long) iArr2[10]) & 4294967295L) + (j37 >>> 32);
                long j40 = (j31 & 4294967295L) + (j36 * j2);
                int i12 = (int) j40;
                iArr2[5] = (i12 << 1) | i11;
                long j41 = (j32 & 4294967295L) + (j40 >>> 32) + (j36 * j7);
                long j42 = j35 + (j41 >>> 32) + (j36 * j11);
                long j43 = j38 + (j42 >>> 32) + (j36 * j17);
                long j44 = (j37 & 4294967295L) + (j43 >>> 32) + (j36 * j26);
                long j45 = j39 + (j44 >>> 32);
                long j46 = ((long) iArr[6]) & 4294967295L;
                long j47 = (((long) iArr2[11]) & 4294967295L) + (j45 >>> 32);
                long j48 = j45 & 4294967295L;
                long j49 = (((long) iArr2[12]) & 4294967295L) + (j47 >>> 32);
                long j50 = (j41 & 4294967295L) + (j46 * j2);
                int i13 = (int) j50;
                iArr2[6] = (i13 << 1) | (i12 >>> 31);
                long j51 = (j42 & 4294967295L) + (j50 >>> 32) + (j46 * j7);
                long j52 = (j43 & 4294967295L) + (j51 >>> 32) + (j46 * j11);
                long j53 = (j44 & 4294967295L) + (j52 >>> 32) + (j46 * j17);
                long j54 = j48 + (j53 >>> 32) + (j46 * j26);
                long j55 = (j47 & 4294967295L) + (j54 >>> 32) + (j46 * j36);
                long j56 = j49 + (j55 >>> 32);
                long j57 = j55 & 4294967295L;
                long j58 = ((long) iArr[7]) & 4294967295L;
                long j59 = (((long) iArr2[13]) & 4294967295L) + (j56 >>> 32);
                long j60 = j56 & 4294967295L;
                long j61 = (((long) iArr2[14]) & 4294967295L) + (j59 >>> 32);
                long j62 = (j51 & 4294967295L) + (j2 * j58);
                int i14 = (int) j62;
                iArr2[7] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                long j63 = (j52 & 4294967295L) + (j62 >>> 32) + (j7 * j58);
                long j64 = (j53 & 4294967295L) + (j63 >>> 32) + (j58 * j11);
                long j65 = (j54 & 4294967295L) + (j64 >>> 32) + (j58 * j17);
                long j66 = j57 + (j65 >>> 32) + (j58 * j26);
                long j67 = j60 + (j66 >>> 32) + (j58 * j36);
                long j68 = (j59 & 4294967295L) + (j67 >>> 32) + (j58 * j46);
                long j69 = j61 + (j68 >>> 32);
                int i16 = (int) j63;
                iArr2[8] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j64;
                iArr2[9] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j65;
                iArr2[10] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j66;
                iArr2[11] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j67;
                iArr2[12] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j68;
                iArr2[13] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j69;
                iArr2[14] = i27 | (i28 << 1);
                iArr2[15] = (i28 >>> 31) | ((iArr2[15] + ((int) (j69 >>> 32))) << 1);
                return;
            }
            i3 = i4;
            i2 = i6;
        }
    }

    public static int E(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j2 = ((((long) iArr[i + 0]) & 4294967295L) - (((long) iArr2[i2 + 0]) & 4294967295L)) + 0;
        iArr3[i3 + 0] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L));
        iArr3[i3 + 1] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L));
        iArr3[i3 + 2] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L));
        iArr3[i3 + 3] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L));
        iArr3[i3 + 4] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L));
        iArr3[i3 + 5] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L));
        iArr3[i3 + 6] = (int) j8;
        long j9 = (j8 >> 32) + ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L));
        iArr3[i3 + 7] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static int F(int[] iArr, int[] iArr2, int[] iArr3) {
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
        long j9 = (j8 >> 32) + ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static int G(int[] iArr, int[] iArr2) {
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
        long j8 = (j7 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L));
        iArr2[6] = (int) j8;
        long j9 = (j8 >> 32) + ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7])));
        iArr2[7] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static BigInteger H(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                h2e.c(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger I(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j2 = jArr[i];
            if (j2 != 0) {
                h2e.h(j2, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void J(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

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
        long j9 = (j8 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr3[7] = (int) j9;
        return (int) (j9 >>> 32);
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
        long j9 = (j8 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L);
        iArr3[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int c(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = i2 + 0;
        long j2 = (((long) i3) & 4294967295L) + (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 1;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 2;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 3;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 4;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 5;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 6;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L);
        iArr2[i10] = (int) j8;
        int i11 = i2 + 7;
        long j9 = (j8 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i11]));
        iArr2[i11] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int d(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr2[2] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr2[3] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr2[4] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr2[5] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr2[6] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7]));
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int e(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = i + 0;
        int i4 = i2 + 0;
        long j2 = (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L) + 0;
        int i5 = (int) j2;
        iArr[i3] = i5;
        iArr2[i4] = i5;
        int i6 = i + 1;
        int i7 = i2 + 1;
        long j3 = (j2 >>> 32) + (((long) iArr[i6]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        int i8 = (int) j3;
        iArr[i6] = i8;
        iArr2[i7] = i8;
        int i9 = i + 2;
        int i10 = i2 + 2;
        long j4 = (j3 >>> 32) + (((long) iArr[i9]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L);
        int i11 = (int) j4;
        iArr[i9] = i11;
        iArr2[i10] = i11;
        int i12 = i + 3;
        int i13 = i2 + 3;
        long j5 = (j4 >>> 32) + (((long) iArr[i12]) & 4294967295L) + (((long) iArr2[i13]) & 4294967295L);
        int i14 = (int) j5;
        iArr[i12] = i14;
        iArr2[i13] = i14;
        int i15 = i + 4;
        int i16 = i2 + 4;
        long j6 = (j5 >>> 32) + (((long) iArr[i15]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L);
        int i17 = (int) j6;
        iArr[i15] = i17;
        iArr2[i16] = i17;
        int i18 = i + 5;
        int i19 = i2 + 5;
        long j7 = (j6 >>> 32) + (((long) iArr[i18]) & 4294967295L) + (((long) iArr2[i19]) & 4294967295L);
        int i20 = (int) j7;
        iArr[i18] = i20;
        iArr2[i19] = i20;
        int i21 = i + 6;
        int i22 = i2 + 6;
        long j8 = (j7 >>> 32) + (((long) iArr[i21]) & 4294967295L) + (((long) iArr2[i22]) & 4294967295L);
        int i23 = (int) j8;
        iArr[i21] = i23;
        iArr2[i22] = i23;
        int i24 = i + 7;
        int i25 = i2 + 7;
        long j9 = (j8 >>> 32) + (((long) iArr[i24]) & 4294967295L) + (4294967295L & ((long) iArr2[i25]));
        int i26 = (int) j9;
        iArr[i24] = i26;
        iArr2[i25] = i26;
        return (int) (j9 >>> 32);
    }

    public static int[] f() {
        return new int[8];
    }

    public static long[] g() {
        return new long[4];
    }

    public static int[] h() {
        return new int[16];
    }

    public static long[] i() {
        return new long[8];
    }

    public static boolean j(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean zP = p(iArr, i, iArr2, i2);
        if (zP) {
            E(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            E(iArr2, i2, iArr, i, iArr3, i3);
        }
        return zP;
    }

    public static boolean k(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] m(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArrF = f();
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArrF[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArrF;
    }

    public static long[] n(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArrG = g();
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArrG[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArrG;
    }

    public static int o(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            if ((i & 255) != i) {
                return 0;
            }
            i2 = iArr[i >>> 5] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean p(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean q(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
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

    public static boolean r(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void v(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j2 = ((long) iArr2[i2 + 0]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j8 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j9 = ((long) iArr2[i2 + 7]) & 4294967295L;
        long j10 = ((long) iArr[i + 0]) & 4294967295L;
        long j11 = (j10 * j2) + 0;
        iArr3[i3 + 0] = (int) j11;
        long j12 = (j11 >>> 32) + (j10 * j3);
        iArr3[i3 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + (j10 * j4);
        iArr3[i3 + 2] = (int) j13;
        long j14 = (j13 >>> 32) + (j10 * j5);
        iArr3[i3 + 3] = (int) j14;
        long j15 = (j14 >>> 32) + (j10 * j6);
        iArr3[i3 + 4] = (int) j15;
        long j16 = (j15 >>> 32) + (j10 * j7);
        iArr3[i3 + 5] = (int) j16;
        long j17 = (j16 >>> 32) + (j10 * j8);
        iArr3[i3 + 6] = (int) j17;
        long j18 = j9;
        long j19 = (j17 >>> 32) + (j10 * j18);
        iArr3[i3 + 7] = (int) j19;
        iArr3[i3 + 8] = (int) (j19 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 8) {
            i5 += i4;
            long j20 = ((long) iArr[i + i6]) & 4294967295L;
            int i7 = i5 + 0;
            long j21 = (j20 * j2) + (((long) iArr3[i7]) & 4294967295L) + 0;
            iArr3[i7] = (int) j21;
            int i8 = i5 + 1;
            long j22 = j18;
            long j23 = (j21 >>> 32) + (j20 * j3) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j23;
            int i9 = i5 + 2;
            long j24 = j4;
            long j25 = (j23 >>> 32) + (j20 * j4) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j25;
            int i10 = i5 + 3;
            long j26 = (j25 >>> 32) + (j20 * j5) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j26;
            int i11 = i5 + 4;
            long j27 = (j26 >>> 32) + (j20 * j6) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j27;
            int i12 = i5 + 5;
            long j28 = (j27 >>> 32) + (j20 * j7) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j28;
            int i13 = i5 + 6;
            long j29 = (j28 >>> 32) + (j20 * j8) + (((long) iArr3[i13]) & 4294967295L);
            iArr3[i13] = (int) j29;
            int i14 = i5 + 7;
            long j30 = (j29 >>> 32) + (j20 * j22) + (((long) iArr3[i14]) & 4294967295L);
            iArr3[i14] = (int) j30;
            iArr3[i5 + 8] = (int) (j30 >>> 32);
            i6++;
            j4 = j24;
            j18 = j22;
            j5 = j5;
            i4 = 1;
        }
    }

    public static void w(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = ((long) iArr2[7]) & 4294967295L;
        long j10 = ((long) iArr[0]) & 4294967295L;
        long j11 = (j10 * j2) + 0;
        iArr3[0] = (int) j11;
        long j12 = (j11 >>> 32) + (j10 * j3);
        iArr3[1] = (int) j12;
        long j13 = (j12 >>> 32) + (j10 * j4);
        iArr3[2] = (int) j13;
        long j14 = (j13 >>> 32) + (j10 * j5);
        iArr3[3] = (int) j14;
        long j15 = (j14 >>> 32) + (j10 * j6);
        iArr3[4] = (int) j15;
        long j16 = (j15 >>> 32) + (j10 * j7);
        iArr3[5] = (int) j16;
        long j17 = (j16 >>> 32) + (j10 * j8);
        iArr3[6] = (int) j17;
        long j18 = (j17 >>> 32) + (j10 * j9);
        iArr3[7] = (int) j18;
        iArr3[8] = (int) (j18 >>> 32);
        int i = 1;
        for (int i2 = 8; i < i2; i2 = 8) {
            long j19 = ((long) iArr[i]) & 4294967295L;
            int i3 = i + 0;
            long j20 = (j19 * j2) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j20;
            int i4 = i + 1;
            long j21 = j3;
            long j22 = (j20 >>> 32) + (j19 * j3) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j22;
            int i5 = i + 2;
            long j23 = j7;
            long j24 = (j22 >>> 32) + (j19 * j4) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j24;
            int i6 = i + 3;
            long j25 = (j24 >>> 32) + (j19 * j5) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j25;
            int i7 = i + 4;
            long j26 = (j25 >>> 32) + (j19 * j6) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j26;
            int i8 = i + 5;
            long j27 = (j26 >>> 32) + (j19 * j23) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j27;
            int i9 = i + 6;
            long j28 = (j27 >>> 32) + (j19 * j8) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j28;
            int i10 = i + 7;
            long j29 = (j28 >>> 32) + (j19 * j9) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j29;
            iArr3[i + 8] = (int) (j29 >>> 32);
            i = i4;
            j2 = j2;
            j3 = j21;
            j7 = j23;
        }
    }

    public static long x(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
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
        long j17 = (j15 >>> 32) + (j2 * j16) + j14 + (((long) iArr2[i3 + 6]) & 4294967295L);
        iArr3[i4 + 6] = (int) j17;
        long j18 = ((long) iArr[i2 + 7]) & 4294967295L;
        long j19 = (j17 >>> 32) + (j2 * j18) + j16 + (4294967295L & ((long) iArr2[i3 + 7]));
        iArr3[i4 + 7] = (int) j19;
        return (j19 >>> 32) + j18;
    }

    public static int y(int i, long j2, int[] iArr, int i2) {
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
        return gfc.t(8, iArr, i2, 4);
    }

    public static int z(int i, int i2, int[] iArr, int i3) {
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
        return gfc.t(8, iArr, i3, 3);
    }
}
