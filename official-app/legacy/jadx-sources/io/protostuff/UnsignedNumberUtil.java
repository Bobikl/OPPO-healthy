package io.protostuff;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class UnsignedNumberUtil {
    static final long INT_MASK = 4294967295L;
    public static final long MAX_VALUE = -1;
    private static final long[] maxValueDivs = new long[37];
    private static final int[] maxValueMods = new int[37];
    private static final int[] maxSafeDigits = new int[37];

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++) {
            long j2 = i;
            maxValueDivs[i] = divide(-1L, j2);
            maxValueMods[i] = (int) remainder(-1L, j2);
            maxSafeDigits[i] = bigInteger.toString(i).length() - 1;
        }
    }

    private UnsignedNumberUtil() {
    }

    private static int compareSigned(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 > j3 ? 1 : 0;
    }

    private static int compareUnsigned(long j2, long j3) {
        return compareSigned(flip(j2), flip(j3));
    }

    private static long divide(long j2, long j3) {
        if (j3 < 0) {
            return compareUnsigned(j2, j3) < 0 ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / j3;
        }
        long j4 = ((j2 >>> 1) / j3) << 1;
        return j4 + ((long) (compareUnsigned(j2 - (j4 * j3), j3) < 0 ? 0 : 1));
    }

    private static int flip(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    private static boolean overflowInParse(long j2, int i, int i2) {
        if (j2 < 0) {
            return true;
        }
        long j3 = maxValueDivs[i2];
        if (j2 < j3) {
            return false;
        }
        return j2 > j3 || i > maxValueMods[i2];
    }

    public static int parseUnsignedInt(String str) {
        return parseUnsignedInt(str, 10);
    }

    public static long parseUnsignedLong(String str) {
        return parseUnsignedLong(str, 10);
    }

    private static long remainder(long j2, long j3) {
        if (j3 < 0) {
            return compareUnsigned(j2, j3) < 0 ? j2 : j2 - j3;
        }
        if (j2 >= 0) {
            return j2 % j3;
        }
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if (compareUnsigned(j4, j3) < 0) {
            j3 = 0;
        }
        return j4 - j3;
    }

    private static long toLong(int i) {
        return ((long) i) & INT_MASK;
    }

    public static String unsignedIntToString(int i) {
        return unsignedIntToString(i, 10);
    }

    public static String unsignedLongToString(long j2) {
        return unsignedLongToString(j2, 10);
    }

    private static long flip(long j2) {
        return j2 ^ Long.MIN_VALUE;
    }

    private static int parseUnsignedInt(String str, int i) {
        long j2 = Long.parseLong(str, i);
        if ((INT_MASK & j2) == j2) {
            return (int) j2;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }

    private static long parseUnsignedLong(String str, int i) {
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i < 2 || i > 36) {
            throw new NumberFormatException("illegal radix: " + i);
        }
        int i2 = maxSafeDigits[i] - 1;
        long j2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iDigit = Character.digit(str.charAt(i3), i);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i3 > i2 && overflowInParse(j2, iDigit, i)) {
                throw new NumberFormatException("Too large for unsigned long: " + str);
            }
            j2 = (j2 * ((long) i)) + ((long) iDigit);
        }
        return j2;
    }

    private static String unsignedIntToString(int i, int i2) {
        return Long.toString(((long) i) & INT_MASK, i2);
    }

    private static String unsignedLongToString(long j2, int i) {
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("Invalid radix: " + i);
        }
        if (j2 == 0) {
            return "0";
        }
        int i2 = 64;
        char[] cArr = new char[64];
        if (j2 < 0) {
            long j3 = i;
            long jDivide = divide(j2, j3);
            i2 = 63;
            cArr[63] = Character.forDigit((int) (j2 - (j3 * jDivide)), i);
            j2 = jDivide;
        }
        while (j2 > 0) {
            i2--;
            long j4 = i;
            cArr[i2] = Character.forDigit((int) (j2 % j4), i);
            j2 /= j4;
        }
        return new String(cArr, i2, 64 - i2);
    }
}
