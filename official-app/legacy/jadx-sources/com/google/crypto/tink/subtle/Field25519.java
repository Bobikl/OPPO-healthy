package com.google.crypto.tink.subtle;

import com.google.crypto.tink.annotations.Alpha;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
@Alpha
final class Field25519 {
    static final int FIELD_LEN = 32;
    static final int LIMB_CNT = 10;
    private static final long TWO_TO_25 = 33554432;
    private static final long TWO_TO_26 = 67108864;
    private static final int[] EXPAND_START = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] EXPAND_SHIFT = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] MASK = {67108863, 33554431};
    private static final int[] SHIFT = {26, 25};

    public static byte[] contract(long[] jArr) {
        int i;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            int i3 = 0;
            while (i3 < 9) {
                long j2 = jArrCopyOf[i3];
                int i4 = SHIFT[i3 & 1];
                int i5 = -((int) (((j2 >> 31) & j2) >> i4));
                jArrCopyOf[i3] = j2 + ((long) (i5 << i4));
                i3++;
                jArrCopyOf[i3] = jArrCopyOf[i3] - ((long) i5);
            }
            long j3 = jArrCopyOf[9];
            int i6 = -((int) (((j3 >> 31) & j3) >> 25));
            jArrCopyOf[9] = j3 + ((long) (i6 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i6 * 19));
            i2++;
        }
        long j4 = jArrCopyOf[0];
        int i7 = -((int) (((j4 >> 31) & j4) >> 26));
        jArrCopyOf[0] = j4 + ((long) (i7 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i7);
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 9) {
                long j5 = jArrCopyOf[i9];
                int i10 = i9 & 1;
                int i11 = (int) (j5 >> SHIFT[i10]);
                jArrCopyOf[i9] = j5 & ((long) MASK[i10]);
                i9++;
                jArrCopyOf[i9] = jArrCopyOf[i9] + ((long) i11);
            }
        }
        long j6 = jArrCopyOf[9];
        jArrCopyOf[9] = j6 & 33554431;
        long j7 = jArrCopyOf[0] + ((long) (((int) (j6 >> 25)) * 19));
        jArrCopyOf[0] = j7;
        int iGte = gte((int) j7, 67108845);
        for (int i12 = 1; i12 < 10; i12++) {
            iGte &= eq((int) jArrCopyOf[i12], MASK[i12 & 1]);
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & iGte));
        long j8 = 33554431 & iGte;
        jArrCopyOf[1] = jArrCopyOf[1] - j8;
        for (i = 2; i < 10; i += 2) {
            jArrCopyOf[i] = jArrCopyOf[i] - ((long) (67108863 & iGte));
            int i13 = i + 1;
            jArrCopyOf[i13] = jArrCopyOf[i13] - j8;
        }
        for (int i14 = 0; i14 < 10; i14++) {
            jArrCopyOf[i14] = jArrCopyOf[i14] << EXPAND_SHIFT[i14];
        }
        byte[] bArr = new byte[32];
        for (int i15 = 0; i15 < 10; i15++) {
            int i16 = EXPAND_START[i15];
            long j9 = bArr[i16];
            long j10 = jArrCopyOf[i15];
            bArr[i16] = (byte) (j9 | (j10 & 255));
            int i17 = i16 + 1;
            bArr[i17] = (byte) (((long) bArr[i17]) | ((j10 >> 8) & 255));
            int i18 = i16 + 2;
            bArr[i18] = (byte) (((long) bArr[i18]) | ((j10 >> 16) & 255));
            int i19 = i16 + 3;
            bArr[i19] = (byte) (((long) bArr[i19]) | ((j10 >> 24) & 255));
        }
        return bArr;
    }

    private static int eq(int i, int i2) {
        int i3 = ~(i ^ i2);
        int i4 = i3 & (i3 << 16);
        int i5 = i4 & (i4 << 8);
        int i6 = i5 & (i5 << 4);
        int i7 = i6 & (i6 << 2);
        return (i7 & (i7 << 1)) >> 31;
    }

    public static long[] expand(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = EXPAND_START[i];
            jArr[i] = ((((((long) (bArr[i2] & 255)) | (((long) (bArr[i2 + 1] & 255)) << 8)) | (((long) (bArr[i2 + 2] & 255)) << 16)) | (((long) (bArr[i2 + 3] & 255)) << 24)) >> EXPAND_SHIFT[i]) & ((long) MASK[i & 1]);
        }
        return jArr;
    }

    private static int gte(int i, int i2) {
        return ~((i - i2) >> 31);
    }

    public static void inverse(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        square(jArr3, jArr2);
        square(jArr12, jArr3);
        square(jArr11, jArr12);
        mult(jArr4, jArr11, jArr2);
        mult(jArr5, jArr4, jArr3);
        square(jArr11, jArr5);
        mult(jArr6, jArr11, jArr4);
        square(jArr11, jArr6);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        mult(jArr7, jArr11, jArr6);
        square(jArr11, jArr7);
        square(jArr12, jArr11);
        for (int i = 2; i < 10; i += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr8, jArr12, jArr7);
        square(jArr11, jArr8);
        square(jArr12, jArr11);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr11, jArr12, jArr8);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            square(jArr12, jArr11);
            square(jArr11, jArr12);
        }
        mult(jArr9, jArr11, jArr7);
        square(jArr11, jArr9);
        square(jArr12, jArr11);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr10, jArr12, jArr9);
        square(jArr12, jArr10);
        square(jArr11, jArr12);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            square(jArr12, jArr11);
            square(jArr11, jArr12);
        }
        mult(jArr12, jArr11, jArr10);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            square(jArr11, jArr12);
            square(jArr12, jArr11);
        }
        mult(jArr11, jArr12, jArr9);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        square(jArr11, jArr12);
        square(jArr12, jArr11);
        mult(jArr, jArr12, jArr5);
    }

    public static void mult(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        product(jArr4, jArr2, jArr3);
        reduce(jArr4, jArr);
    }

    public static void product(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j2 = jArr2[0];
        long j3 = jArr3[1] * j2;
        long j4 = jArr2[1];
        long j5 = jArr3[0];
        jArr[1] = j3 + (j4 * j5);
        long j6 = jArr2[1];
        long j7 = jArr3[1];
        jArr[2] = (j6 * 2 * j7) + (jArr3[2] * j2) + (jArr2[2] * j5);
        long j8 = jArr3[2];
        long j9 = jArr2[2];
        jArr[3] = (j6 * j8) + (j9 * j7) + (jArr3[3] * j2) + (jArr2[3] * j5);
        long j10 = jArr3[3];
        long j11 = jArr2[3];
        jArr[4] = (j9 * j8) + (((j6 * j10) + (j11 * j7)) * 2) + (jArr3[4] * j2) + (jArr2[4] * j5);
        long j12 = jArr3[4];
        long j13 = jArr2[4];
        jArr[5] = (j9 * j10) + (j11 * j8) + (j6 * j12) + (j13 * j7) + (jArr3[5] * j2) + (jArr2[5] * j5);
        long j14 = jArr3[5];
        long j15 = jArr2[5];
        jArr[6] = (((j11 * j10) + (j6 * j14) + (j15 * j7)) * 2) + (j9 * j12) + (j13 * j8) + (jArr3[6] * j2) + (jArr2[6] * j5);
        long j16 = jArr3[6];
        long j17 = jArr2[6];
        jArr[7] = (j11 * j12) + (j13 * j10) + (j9 * j14) + (j15 * j8) + (j6 * j16) + (j17 * j7) + (jArr3[7] * j2) + (jArr2[7] * j5);
        long j18 = jArr3[7];
        long j19 = jArr2[7];
        jArr[8] = (j13 * j12) + (((j11 * j14) + (j15 * j10) + (j6 * j18) + (j19 * j7)) * 2) + (j9 * j16) + (j17 * j8) + (jArr3[8] * j2) + (jArr2[8] * j5);
        long j20 = jArr3[8];
        long j21 = jArr2[8];
        jArr[9] = (j13 * j14) + (j15 * j12) + (j11 * j16) + (j17 * j10) + (j9 * j18) + (j19 * j8) + (j6 * j20) + (j21 * j7) + (j2 * jArr3[9]) + (jArr2[9] * j5);
        long j22 = jArr3[9];
        long j23 = jArr2[9];
        jArr[10] = (((j15 * j14) + (j11 * j18) + (j19 * j10) + (j6 * j22) + (j7 * j23)) * 2) + (j13 * j16) + (j17 * j12) + (j9 * j20) + (j21 * j8);
        jArr[11] = (j15 * j16) + (j17 * j14) + (j13 * j18) + (j19 * j12) + (j11 * j20) + (j21 * j10) + (j9 * j22) + (j8 * j23);
        jArr[12] = (j17 * j16) + (((j15 * j18) + (j19 * j14) + (j11 * j22) + (j10 * j23)) * 2) + (j13 * j20) + (j21 * j12);
        jArr[13] = (j17 * j18) + (j19 * j16) + (j15 * j20) + (j21 * j14) + (j13 * j22) + (j12 * j23);
        jArr[14] = (((j19 * j18) + (j15 * j22) + (j14 * j23)) * 2) + (j17 * j20) + (j21 * j16);
        jArr[15] = (j19 * j20) + (j21 * j18) + (j17 * j22) + (j16 * j23);
        jArr[16] = (j21 * j20) + (((j19 * j22) + (j18 * j23)) * 2);
        jArr[17] = (j21 * j22) + (j20 * j23);
        jArr[18] = j23 * 2 * j22;
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        reduceSizeByModularReduction(jArr);
        reduceCoefficients(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void reduceCoefficients(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j2 = jArr[i];
            long j3 = j2 / 67108864;
            jArr[i] = j2 - (j3 << 26);
            int i2 = i + 1;
            long j4 = jArr[i2] + j3;
            jArr[i2] = j4;
            long j5 = j4 / 33554432;
            jArr[i2] = j4 - (j5 << 25);
            i += 2;
            jArr[i] = jArr[i] + j5;
        }
        long j6 = jArr[0];
        long j7 = jArr[10];
        long j8 = j6 + (j7 << 4);
        jArr[0] = j8;
        long j9 = j8 + (j7 << 1);
        jArr[0] = j9;
        long j10 = j9 + j7;
        jArr[0] = j10;
        jArr[10] = 0;
        long j11 = j10 / 67108864;
        jArr[0] = j10 - (j11 << 26);
        jArr[1] = jArr[1] + j11;
    }

    public static void reduceSizeByModularReduction(long[] jArr) {
        long j2 = jArr[8];
        long j3 = jArr[18];
        long j4 = j2 + (j3 << 4);
        jArr[8] = j4;
        long j5 = j4 + (j3 << 1);
        jArr[8] = j5;
        jArr[8] = j5 + j3;
        long j6 = jArr[7];
        long j7 = jArr[17];
        long j8 = j6 + (j7 << 4);
        jArr[7] = j8;
        long j9 = j8 + (j7 << 1);
        jArr[7] = j9;
        jArr[7] = j9 + j7;
        long j10 = jArr[6];
        long j11 = jArr[16];
        long j12 = j10 + (j11 << 4);
        jArr[6] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[6] = j13;
        jArr[6] = j13 + j11;
        long j14 = jArr[5];
        long j15 = jArr[15];
        long j16 = j14 + (j15 << 4);
        jArr[5] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[5] = j17;
        jArr[5] = j17 + j15;
        long j18 = jArr[4];
        long j19 = jArr[14];
        long j20 = j18 + (j19 << 4);
        jArr[4] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[4] = j21;
        jArr[4] = j21 + j19;
        long j22 = jArr[3];
        long j23 = jArr[13];
        long j24 = j22 + (j23 << 4);
        jArr[3] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[3] = j25;
        jArr[3] = j25 + j23;
        long j26 = jArr[2];
        long j27 = jArr[12];
        long j28 = j26 + (j27 << 4);
        jArr[2] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[2] = j29;
        jArr[2] = j29 + j27;
        long j30 = jArr[1];
        long j31 = jArr[11];
        long j32 = j30 + (j31 << 4);
        jArr[1] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[1] = j33;
        jArr[1] = j33 + j31;
        long j34 = jArr[0];
        long j35 = jArr[10];
        long j36 = j34 + (j35 << 4);
        jArr[0] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[0] = j37;
        jArr[0] = j37 + j35;
    }

    public static void scalarProduct(long[] jArr, long[] jArr2, long j2) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] * j2;
        }
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[19];
        squareInner(jArr3, jArr2);
        reduce(jArr3, jArr);
    }

    private static void squareInner(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        jArr[0] = j2 * j2;
        long j3 = jArr2[0];
        jArr[1] = j3 * 2 * jArr2[1];
        long j4 = jArr2[1];
        jArr[2] = ((j4 * j4) + (jArr2[2] * j3)) * 2;
        long j5 = jArr2[2];
        jArr[3] = ((j4 * j5) + (jArr2[3] * j3)) * 2;
        long j6 = jArr2[3];
        jArr[4] = (j5 * j5) + (j4 * 4 * j6) + (j3 * 2 * jArr2[4]);
        long j7 = jArr2[4];
        jArr[5] = ((j5 * j6) + (j4 * j7) + (jArr2[5] * j3)) * 2;
        long j8 = (j6 * j6) + (j5 * j7) + (jArr2[6] * j3);
        long j9 = jArr2[5];
        jArr[6] = (j8 + (j4 * 2 * j9)) * 2;
        long j10 = jArr2[6];
        jArr[7] = ((j6 * j7) + (j5 * j9) + (j4 * j10) + (jArr2[7] * j3)) * 2;
        long j11 = (j5 * j10) + (jArr2[8] * j3);
        long j12 = jArr2[7];
        jArr[8] = (j7 * j7) + ((j11 + (((j4 * j12) + (j6 * j9)) * 2)) * 2);
        long j13 = jArr2[8];
        jArr[9] = ((j7 * j9) + (j6 * j10) + (j5 * j12) + (j4 * j13) + (j3 * jArr2[9])) * 2;
        long j14 = jArr2[9];
        jArr[10] = ((j9 * j9) + (j7 * j10) + (j5 * j13) + (((j6 * j12) + (j4 * j14)) * 2)) * 2;
        jArr[11] = ((j9 * j10) + (j7 * j12) + (j6 * j13) + (j5 * j14)) * 2;
        jArr[12] = (j10 * j10) + (((j7 * j13) + (((j9 * j12) + (j6 * j14)) * 2)) * 2);
        jArr[13] = ((j10 * j12) + (j9 * j13) + (j7 * j14)) * 2;
        jArr[14] = ((j12 * j12) + (j10 * j13) + (j9 * 2 * j14)) * 2;
        jArr[15] = ((j12 * j13) + (j10 * j14)) * 2;
        jArr[16] = (j13 * j13) + (j12 * 4 * j14);
        jArr[17] = j13 * 2 * j14;
        jArr[18] = 2 * j14 * j14;
    }

    public static void sub(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void sum(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static void sub(long[] jArr, long[] jArr2) {
        sub(jArr, jArr2, jArr);
    }

    public static void sum(long[] jArr, long[] jArr2) {
        sum(jArr, jArr, jArr2);
    }
}
