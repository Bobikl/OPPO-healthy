package androidx.core.math;

/* JADX INFO: loaded from: classes12.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static int addExact(int i, int i2) {
        int i3 = i + i2;
        if ((i >= 0) == (i2 >= 0)) {
            if ((i >= 0) != (i3 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i3;
    }

    public static double clamp(double d, double d2, double d3) {
        if (d < d2) {
            return d2;
        }
        return d > d3 ? d3 : d;
    }

    public static int decrementExact(int i) {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i, int i2) {
        int i3 = i * i2;
        if (i == 0 || i2 == 0 || (i3 / i == i2 && i3 / i2 == i)) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int subtractExact(int i, int i2) {
        int i3 = i - i2;
        if ((i < 0) != (i2 < 0)) {
            if ((i < 0) != (i3 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i3;
    }

    public static int toIntExact(long j2) {
        if (j2 > 2147483647L || j2 < -2147483648L) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) j2;
    }

    public static long addExact(long j2, long j3) {
        long j4 = j2 + j3;
        if ((j2 >= 0) == (j3 >= 0)) {
            if ((j2 >= 0) != (j4 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j4;
    }

    public static float clamp(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static long decrementExact(long j2) {
        if (j2 != Long.MIN_VALUE) {
            return j2 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j2) {
        if (j2 != Long.MAX_VALUE) {
            return j2 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long j2) {
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long subtractExact(long j2, long j3) {
        long j4 = j2 - j3;
        if ((j2 < 0) != (j3 < 0)) {
            if ((j2 < 0) != (j4 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j4;
    }

    public static int clamp(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static long multiplyExact(long j2, long j3) {
        long j4 = j2 * j3;
        if (j2 == 0 || j3 == 0 || (j4 / j2 == j3 && j4 / j3 == j2)) {
            return j4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long clamp(long j2, long j3, long j4) {
        if (j2 < j3) {
            return j3;
        }
        return j2 > j4 ? j4 : j2;
    }
}
