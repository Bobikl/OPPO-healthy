package com.alibaba.fastjson.util;

import com.heytap.log.consts.UploadCode;
import com.oplus.aiunit.vision.p6i;
import java.lang.reflect.Array;
import java.math.BigInteger;
import okhttp3.internal.connection.RealConnection;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes12.dex */
public final class RyuDouble {
    private static final int[][] POW5_INV_SPLIT;
    private static final int[][] POW5_SPLIT;

    static {
        Class cls = Integer.TYPE;
        POW5_SPLIT = (int[][]) Array.newInstance((Class<?>) cls, 326, 4);
        POW5_INV_SPLIT = (int[][]) Array.newInstance((Class<?>) cls, 291, 4);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger.shiftLeft(31).subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigInteger.shiftLeft(31).subtract(bigInteger);
        int i = 0;
        while (i < 326) {
            BigInteger bigIntegerPow = BigInteger.valueOf(5L).pow(i);
            int iBitLength = bigIntegerPow.bitLength();
            int i2 = i == 0 ? 1 : (int) ((((((long) i) * 23219280) + 10000000) - 1) / 10000000);
            if (i2 != iBitLength) {
                throw new IllegalStateException(iBitLength + " != " + i2);
            }
            if (i < POW5_SPLIT.length) {
                for (int i3 = 0; i3 < 4; i3++) {
                    POW5_SPLIT[i][i3] = bigIntegerPow.shiftRight(iBitLength + UploadCode.NEED_WIFI + ((3 - i3) * 31)).and(bigIntegerSubtract).intValue();
                }
            }
            if (i < POW5_INV_SPLIT.length) {
                BigInteger bigInteger2 = BigInteger.ONE;
                BigInteger bigIntegerAdd = bigInteger2.shiftLeft(iBitLength + 121).divide(bigIntegerPow).add(bigInteger2);
                for (int i4 = 0; i4 < 4; i4++) {
                    if (i4 == 0) {
                        POW5_INV_SPLIT[i][i4] = bigIntegerAdd.shiftRight((3 - i4) * 31).intValue();
                    } else {
                        POW5_INV_SPLIT[i][i4] = bigIntegerAdd.shiftRight((3 - i4) * 31).and(bigIntegerSubtract2).intValue();
                    }
                }
            }
            i++;
        }
    }

    public static String toString(double d) {
        char[] cArr = new char[24];
        return new String(cArr, 0, toString(d, cArr, 0));
    }

    public static int toString(double d, char[] cArr, int i) {
        int i2;
        boolean z;
        int i3;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        int i4;
        long j4;
        int i5;
        long j5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!Double.isNaN(d)) {
            if (d == Double.POSITIVE_INFINITY) {
                int i15 = i + 1;
                cArr[i] = 'I';
                int i16 = i15 + 1;
                cArr[i15] = 'n';
                int i17 = i16 + 1;
                cArr[i16] = 'f';
                int i18 = i17 + 1;
                cArr[i17] = 'i';
                int i19 = i18 + 1;
                cArr[i18] = 'n';
                int i20 = i19 + 1;
                cArr[i19] = 'i';
                int i21 = i20 + 1;
                cArr[i20] = 't';
                i13 = i21 + 1;
                cArr[i21] = 'y';
            } else if (d == Double.NEGATIVE_INFINITY) {
                int i22 = i + 1;
                cArr[i] = Soundex.SILENT_MARKER;
                int i23 = i22 + 1;
                cArr[i22] = 'I';
                int i24 = i23 + 1;
                cArr[i23] = 'n';
                int i25 = i24 + 1;
                cArr[i24] = 'f';
                int i26 = i25 + 1;
                cArr[i25] = 'i';
                int i27 = i26 + 1;
                cArr[i26] = 'n';
                int i28 = i27 + 1;
                cArr[i27] = 'i';
                int i29 = i28 + 1;
                cArr[i28] = 't';
                i14 = i29 + 1;
                cArr[i29] = 'y';
            } else {
                long jDoubleToLongBits = Double.doubleToLongBits(d);
                if (jDoubleToLongBits == 0) {
                    int i30 = i + 1;
                    cArr[i] = '0';
                    int i31 = i30 + 1;
                    cArr[i30] = '.';
                    i14 = i31 + 1;
                    cArr[i31] = '0';
                } else {
                    if (jDoubleToLongBits != Long.MIN_VALUE) {
                        int i32 = (int) ((jDoubleToLongBits >>> 52) & 2047);
                        long j6 = jDoubleToLongBits & 4503599627370495L;
                        if (i32 == 0) {
                            i2 = -1074;
                        } else {
                            i2 = (i32 - 1023) - 52;
                            j6 |= 4503599627370496L;
                        }
                        boolean z5 = jDoubleToLongBits < 0;
                        boolean z6 = (j6 & 1) == 0;
                        long j7 = 4 * j6;
                        long j8 = j7 + 2;
                        int i33 = (j6 != 4503599627370496L || i32 <= 1) ? 1 : 0;
                        long j9 = (j7 - 1) - ((long) i33);
                        int i34 = i2 - 2;
                        if (i34 >= 0) {
                            int iMax = Math.max(0, ((int) ((((long) i34) * 3010299) / 10000000)) - 1);
                            int i35 = ((((-i34) + iMax) + (((iMax == 0 ? 1 : (int) ((((((long) iMax) * 23219280) + 10000000) - 1) / 10000000)) + 122) - 1)) - 93) - 21;
                            if (i35 >= 0) {
                                int[] iArr = POW5_INV_SPLIT[iMax];
                                long j10 = j7 >>> 31;
                                long j11 = j7 & 2147483647L;
                                int i36 = iArr[0];
                                int i37 = iArr[1];
                                int i38 = iArr[2];
                                z = z6;
                                int i39 = iArr[3];
                                long j12 = ((((((((((((j11 * ((long) i39)) >>> 31) + (((long) i38) * j11)) + (j10 * ((long) i39))) >>> 31) + (((long) i37) * j11)) + (((long) i38) * j10)) >>> 31) + (((long) i36) * j11)) + (((long) i37) * j10)) >>> 21) + ((((long) i36) * j10) << 10)) >>> i35;
                                long j13 = j8 >>> 31;
                                long j14 = j8 & 2147483647L;
                                long j15 = ((((((((((((j14 * ((long) i39)) >>> 31) + (((long) i38) * j14)) + (j13 * ((long) i39))) >>> 31) + (((long) i37) * j14)) + (((long) i38) * j13)) >>> 31) + (((long) i36) * j14)) + (((long) i37) * j13)) >>> 21) + ((((long) i36) * j13) << 10)) >>> i35;
                                long j16 = j9 >>> 31;
                                long j17 = j9 & 2147483647L;
                                long j18 = j15;
                                long j19 = ((((((((((((j17 * ((long) i39)) >>> 31) + (((long) i38) * j17)) + (j16 * ((long) i39))) >>> 31) + (((long) i37) * j17)) + (((long) i38) * j16)) >>> 31) + (((long) i36) * j17)) + (((long) i37) * j16)) >>> 21) + ((((long) i36) * j16) << 10)) >>> i35;
                                if (iMax <= 21) {
                                    long j20 = j7 % 5;
                                    if (j20 == 0) {
                                        if (j20 != 0) {
                                            i12 = 0;
                                        } else if (j7 % 25 != 0) {
                                            i12 = 1;
                                        } else if (j7 % 125 != 0) {
                                            i12 = 2;
                                        } else if (j7 % 625 != 0) {
                                            i12 = 3;
                                        } else {
                                            long j21 = j7 / 625;
                                            i12 = 4;
                                            for (long j22 = 0; j21 > j22 && j21 % 5 == j22; j22 = 0) {
                                                j21 /= 5;
                                                i12++;
                                            }
                                        }
                                        z4 = i12 >= iMax;
                                        z3 = false;
                                    } else if (z) {
                                        if (j9 % 5 != 0) {
                                            i11 = 0;
                                        } else if (j9 % 25 != 0) {
                                            i11 = 1;
                                        } else if (j9 % 125 != 0) {
                                            i11 = 2;
                                        } else if (j9 % 625 != 0) {
                                            i11 = 3;
                                        } else {
                                            long j23 = j9 / 625;
                                            i11 = 4;
                                            for (long j24 = 0; j23 > j24 && j23 % 5 == j24; j24 = 0) {
                                                j23 /= 5;
                                                i11++;
                                            }
                                        }
                                        z3 = i11 >= iMax;
                                        z4 = false;
                                    } else {
                                        if (j8 % 5 != 0) {
                                            i10 = 0;
                                        } else if (j8 % 25 != 0) {
                                            i10 = 1;
                                        } else if (j8 % 125 != 0) {
                                            i10 = 2;
                                        } else if (j8 % 625 != 0) {
                                            i10 = 3;
                                        } else {
                                            long j25 = j8 / 625;
                                            i10 = 4;
                                            for (long j26 = 0; j25 > j26 && j25 % 5 == j26; j26 = 0) {
                                                j25 /= 5;
                                                i10++;
                                            }
                                        }
                                        if (i10 >= iMax) {
                                            j18--;
                                        }
                                    }
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                j2 = j12;
                                j3 = j18;
                                i3 = 2;
                                z2 = z4;
                                j4 = j19;
                                i4 = iMax;
                            } else {
                                throw new IllegalArgumentException("" + i35);
                            }
                        } else {
                            z = z6;
                            int i40 = -i34;
                            int iMax2 = Math.max(0, ((int) ((((long) i40) * 6989700) / 10000000)) - 1);
                            int i41 = i40 - iMax2;
                            int i42 = ((iMax2 - ((i41 == 0 ? 1 : (int) ((((((long) i41) * 23219280) + 10000000) - 1) / 10000000)) + UploadCode.NEED_WIFI)) - 93) - 21;
                            if (i42 >= 0) {
                                int[] iArr2 = POW5_SPLIT[i41];
                                long j27 = j7 >>> 31;
                                long j28 = j7 & 2147483647L;
                                int i43 = iArr2[0];
                                int i44 = iArr2[1];
                                int i45 = i33;
                                i3 = 2;
                                int i46 = iArr2[2];
                                int i47 = iArr2[3];
                                long j29 = ((((((((((((j28 * ((long) i47)) >>> 31) + (((long) i46) * j28)) + (j27 * ((long) i47))) >>> 31) + (((long) i44) * j28)) + (((long) i46) * j27)) >>> 31) + (((long) i43) * j28)) + (((long) i44) * j27)) >>> 21) + ((((long) i43) * j27) << 10)) >>> i42;
                                long j30 = j8 >>> 31;
                                long j31 = j8 & 2147483647L;
                                j2 = j29;
                                long j32 = ((((((((((((j31 * ((long) i47)) >>> 31) + (((long) i46) * j31)) + (j30 * ((long) i47))) >>> 31) + (((long) i44) * j31)) + (((long) i46) * j30)) >>> 31) + (((long) i43) * j31)) + (((long) i44) * j30)) >>> 21) + ((((long) i43) * j30) << 10)) >>> i42;
                                long j33 = j9 >>> 31;
                                long j34 = j9 & 2147483647L;
                                j3 = j32;
                                long j35 = ((((((((((((j34 * ((long) i47)) >>> 31) + (((long) i46) * j34)) + (j33 * ((long) i47))) >>> 31) + (((long) i44) * j34)) + (((long) i46) * j33)) >>> 31) + (((long) i43) * j34)) + (((long) i44) * j33)) >>> 21) + ((((long) i43) * j33) << 10)) >>> i42;
                                int i48 = iMax2 + i34;
                                z2 = true;
                                if (iMax2 <= 1) {
                                    if (z) {
                                        z3 = i45 == 1;
                                    } else {
                                        j3--;
                                    }
                                    i4 = i48;
                                    j4 = j35;
                                } else {
                                    z2 = iMax2 < 63 && (j7 & ((1 << (iMax2 - 1)) - 1)) == 0;
                                }
                                z3 = false;
                                i4 = i48;
                                j4 = j35;
                            } else {
                                throw new IllegalArgumentException("" + i42);
                            }
                        }
                        if (j3 >= 1000000000000000000L) {
                            i5 = 19;
                        } else if (j3 >= 100000000000000000L) {
                            i5 = 18;
                        } else if (j3 >= 10000000000000000L) {
                            i5 = 17;
                        } else if (j3 >= 1000000000000000L) {
                            i5 = 16;
                        } else if (j3 >= 100000000000000L) {
                            i5 = 15;
                        } else if (j3 >= 10000000000000L) {
                            i5 = 14;
                        } else if (j3 >= 1000000000000L) {
                            i5 = 13;
                        } else if (j3 >= 100000000000L) {
                            i5 = 12;
                        } else if (j3 >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                            i5 = 11;
                        } else if (j3 >= p6i.MILLI) {
                            i5 = 10;
                        } else if (j3 >= 100000000) {
                            i5 = 9;
                        } else if (j3 >= 10000000) {
                            i5 = 8;
                        } else if (j3 >= 1000000) {
                            i5 = 7;
                        } else if (j3 >= 100000) {
                            i5 = 6;
                        } else if (j3 >= 10000) {
                            i5 = 5;
                        } else if (j3 >= 1000) {
                            i5 = 4;
                        } else if (j3 >= 100) {
                            i5 = 3;
                        } else {
                            i5 = j3 >= 10 ? i3 : 1;
                        }
                        int i49 = (i4 + i5) - 1;
                        boolean z7 = i49 < -3 || i49 >= 7;
                        if (z3 || z2) {
                            boolean z8 = z3;
                            int i50 = 0;
                            int i51 = 0;
                            while (true) {
                                long j36 = j3 / 10;
                                long j37 = j4 / 10;
                                if (j36 <= j37 || (j3 < 100 && z7)) {
                                    break;
                                }
                                z8 &= j4 % 10 == 0;
                                z2 &= i50 == 0;
                                i50 = (int) (j2 % 10);
                                j2 /= 10;
                                i51++;
                                j3 = j36;
                                j4 = j37;
                            }
                            if (z8 && z) {
                                while (j4 % 10 == 0 && (j3 >= 100 || !z7)) {
                                    z2 &= i50 == 0;
                                    i50 = (int) (j2 % 10);
                                    j3 /= 10;
                                    j2 /= 10;
                                    j4 /= 10;
                                    i51++;
                                }
                            }
                            if (z2 && i50 == 5 && j2 % 2 == 0) {
                                i50 = 4;
                            }
                            j5 = j2 + ((long) (((j2 != j4 || (z8 && z)) && i50 < 5) ? 0 : 1));
                            i6 = i51;
                        } else {
                            i6 = 0;
                            int i52 = 0;
                            while (true) {
                                long j38 = j3 / 10;
                                long j39 = j4 / 10;
                                if (j38 <= j39 || (j3 < 100 && z7)) {
                                    break;
                                }
                                i52 = (int) (j2 % 10);
                                j2 /= 10;
                                i6++;
                                j3 = j38;
                                j4 = j39;
                            }
                            j5 = j2 + ((long) ((j2 == j4 || i52 >= 5) ? 1 : 0));
                        }
                        int i53 = i5 - i6;
                        if (z5) {
                            i7 = i + 1;
                            cArr[i] = Soundex.SILENT_MARKER;
                        } else {
                            i7 = i;
                        }
                        if (z7) {
                            for (int i54 = 0; i54 < i53 - 1; i54++) {
                                int i55 = (int) (j5 % 10);
                                j5 /= 10;
                                cArr[(i7 + i53) - i54] = (char) (i55 + 48);
                            }
                            cArr[i7] = (char) ((j5 % 10) + 48);
                            cArr[i7 + 1] = '.';
                            int i56 = i7 + i53 + 1;
                            if (i53 == 1) {
                                cArr[i56] = '0';
                                i56++;
                            }
                            int i57 = i56 + 1;
                            cArr[i56] = 'E';
                            if (i49 < 0) {
                                cArr[i57] = Soundex.SILENT_MARKER;
                                i49 = -i49;
                                i57++;
                            }
                            if (i49 >= 100) {
                                int i58 = i57 + 1;
                                i9 = 48;
                                cArr[i57] = (char) ((i49 / 100) + 48);
                                i49 %= 100;
                                i57 = i58 + 1;
                                cArr[i58] = (char) ((i49 / 10) + 48);
                            } else {
                                i9 = 48;
                                if (i49 >= 10) {
                                    cArr[i57] = (char) ((i49 / 10) + 48);
                                    i57++;
                                }
                            }
                            cArr[i57] = (char) ((i49 % 10) + i9);
                            return (i57 + 1) - i;
                        }
                        char c2 = '0';
                        if (i49 < 0) {
                            int i59 = i7 + 1;
                            cArr[i7] = '0';
                            int i60 = i59 + 1;
                            cArr[i59] = '.';
                            int i61 = -1;
                            while (i61 > i49) {
                                cArr[i60] = c2;
                                i61--;
                                i60++;
                                c2 = '0';
                            }
                            i8 = i60;
                            for (int i62 = 0; i62 < i53; i62++) {
                                cArr[((i60 + i53) - i62) - 1] = (char) ((j5 % 10) + 48);
                                j5 /= 10;
                                i8++;
                            }
                        } else {
                            int i63 = i49 + 1;
                            if (i63 >= i53) {
                                for (int i64 = 0; i64 < i53; i64++) {
                                    cArr[((i7 + i53) - i64) - 1] = (char) ((j5 % 10) + 48);
                                    j5 /= 10;
                                }
                                int i65 = i7 + i53;
                                while (i53 < i63) {
                                    cArr[i65] = '0';
                                    i53++;
                                    i65++;
                                }
                                int i66 = i65 + 1;
                                cArr[i65] = '.';
                                i8 = i66 + 1;
                                cArr[i66] = '0';
                            } else {
                                int i67 = i7 + 1;
                                for (int i68 = 0; i68 < i53; i68++) {
                                    if ((i53 - i68) - 1 == i49) {
                                        cArr[((i67 + i53) - i68) - 1] = '.';
                                        i67--;
                                    }
                                    cArr[((i67 + i53) - i68) - 1] = (char) ((j5 % 10) + 48);
                                    j5 /= 10;
                                }
                                i8 = i7 + i53 + 1;
                            }
                        }
                        return i8 - i;
                    }
                    int i69 = i + 1;
                    cArr[i] = Soundex.SILENT_MARKER;
                    int i70 = i69 + 1;
                    cArr[i69] = '0';
                    int i71 = i70 + 1;
                    cArr[i70] = '.';
                    i13 = i71 + 1;
                    cArr[i71] = '0';
                }
            }
            return i13 - i;
        }
        int i72 = i + 1;
        cArr[i] = 'N';
        int i73 = i72 + 1;
        cArr[i72] = 'a';
        i14 = i73 + 1;
        cArr[i73] = 'N';
        return i14 - i;
    }
}
