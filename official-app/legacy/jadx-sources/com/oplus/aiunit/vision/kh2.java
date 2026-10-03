package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class kh2 {
    public static volatile kh2 a;
    public static final char[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', rnb.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', rnb.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', rnb.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', rnb.MATRIX_TYPE_ZERO, '.'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f13283c = {2, 14, 12, 52, 2, 14, 11, 14, 17, 52, 8, 13, 13, 4, 17, 52, 21, 8, 4, 22, 52, 47, 8, 4, 22, 48, 17, 0, 15, 15, 4, 17};
    public static final int[] d = {2, 14, 12, 52, 2, 14, 11, 14, 17, 52, 14, 18, 52, 28, 14, 11, 14, 17, 27, 20, 8, 11, 3};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f13284e = {6, 4, 19, 28, 14, 11, 14, 17, 40, 44, 47, 30, 43, 44, 34, 40, 39};
    public static final int[] f = {2, 14, 12, 52, 2, 14, 11, 14, 17, 52, 8, 13, 13, 4, 17, 52, 2, 14, 13, 19, 4, 13, 19, 52, 17, 4, 18, 52, 28, 14, 13, 5, 8, 6, 20, 17, 0, 19, 8, 14, 13, 48, 17, 0, 15, 15, 4, 17};
    public static final int[] g = {0, 13, 3, 17, 14, 8, 3, 52, 21, 8, 4, 22, 52, 40, 15, 15, 14, 27, 0, 18, 4, 47, 8, 4, 22};
    public static final int[] h = {2, 14, 12, 52, 2, 14, 11, 14, 17, 52, 2, 11, 8, 2, 10, 19, 14, 15};
    public static final int[] i = {2, 14, 12, 52, 2, 14, 11, 14, 17, 52, 8, 13, 13, 4, 17, 52, 22, 8, 3, 6, 4, 19, 52, 26, 1, 18, 37, 8, 18, 19, 47, 8, 4, 22, 48, 17, 0, 15, 15, 4, 17};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f13285j = {17, 14, 52, 14, 15, 15, 14, 52, 19, 7, 4, 12, 4, 52, 21, 4, 17, 18, 8, 14, 13};

    public static kh2 c() {
        if (a == null) {
            synchronized (kh2.class) {
                if (a == null) {
                    a = new kh2();
                }
            }
        }
        return a;
    }

    public String a() {
        int length = i.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = b[i[i2]];
        }
        return String.valueOf(cArr);
    }

    public String b() {
        int length = f.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = b[f[i2]];
        }
        return String.valueOf(cArr);
    }

    public String d() {
        int length = d.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = b[d[i2]];
        }
        return String.valueOf(cArr);
    }

    public String e() {
        int length = f13284e.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = b[f13284e[i2]];
        }
        return String.valueOf(cArr);
    }

    public String f() {
        int length = f13285j.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = b[f13285j[i2]];
        }
        return String.valueOf(cArr);
    }

    public String g() {
        int length = f13283c.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = b[f13283c[i2]];
        }
        return String.valueOf(cArr);
    }
}
