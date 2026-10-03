package io.netty.util.internal.shaded.org.jctools.util;

/* JADX INFO: loaded from: classes10.dex */
public final class RangeUtil {
    public static int checkGreaterThanOrEqual(int i, int i2, String str) {
        if (i >= i2) {
            return i;
        }
        throw new IllegalArgumentException(str + ": " + i + " (expected: >= " + i2 + ')');
    }

    public static int checkLessThan(int i, int i2, String str) {
        if (i < i2) {
            return i;
        }
        throw new IllegalArgumentException(str + ": " + i + " (expected: < " + i2 + ')');
    }

    public static int checkLessThanOrEqual(int i, long j2, String str) {
        if (i <= j2) {
            return i;
        }
        throw new IllegalArgumentException(str + ": " + i + " (expected: <= " + j2 + ')');
    }

    public static long checkPositive(long j2, String str) {
        if (j2 > 0) {
            return j2;
        }
        throw new IllegalArgumentException(str + ": " + j2 + " (expected: > 0)");
    }

    public static int checkPositiveOrZero(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + ": " + i + " (expected: >= 0)");
    }
}
