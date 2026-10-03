package com.oplus.aiunit.vision;

import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes13.dex */
public final class nzc {
    public static int a = 1000000;
    public static int b = 1000000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f14703c = 1000000000;
    public static long d = -2147483648L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f14704e = 2147483647L;
    public static final String f = String.valueOf(Integer.MIN_VALUE);
    public static final String g = String.valueOf(Long.MIN_VALUE);
    public static final int[] h = new int[1000];
    public static final String[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f14705j;

    static {
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = 0;
                while (i5 < 10) {
                    h[i2] = ((i3 + 48) << 16) | ((i4 + 48) << 8) | (i5 + 48);
                    i5++;
                    i2++;
                }
            }
        }
        i = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", s04.VIA_SHARE_TYPE_PUBLISHVIDEO, "9", "10"};
        f14705j = new String[]{"-1", eq.NET_ERROR, "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    public static int a(int i2, byte[] bArr, int i3) {
        int i4 = h[i2];
        int i5 = i3 + 1;
        bArr[i3] = (byte) (i4 >> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i4 >> 8);
        int i7 = i6 + 1;
        bArr[i6] = (byte) i4;
        return i7;
    }

    public static int b(int i2, char[] cArr, int i3) {
        int i4 = h[i2];
        int i5 = i3 + 1;
        cArr[i3] = (char) (i4 >> 16);
        int i6 = i5 + 1;
        cArr[i5] = (char) ((i4 >> 8) & 127);
        int i7 = i6 + 1;
        cArr[i6] = (char) (i4 & 127);
        return i7;
    }

    public static int c(int i2, byte[] bArr, int i3) {
        int i4 = h[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                bArr[i3] = (byte) (i4 >> 16);
                i3++;
            }
            bArr[i3] = (byte) (i4 >> 8);
            i3++;
        }
        int i5 = i3 + 1;
        bArr[i3] = (byte) i4;
        return i5;
    }

    public static int d(int i2, char[] cArr, int i3) {
        int i4 = h[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                cArr[i3] = (char) (i4 >> 16);
                i3++;
            }
            cArr[i3] = (char) ((i4 >> 8) & 127);
            i3++;
        }
        int i5 = i3 + 1;
        cArr[i3] = (char) (i4 & 127);
        return i5;
    }

    public static int e(int i2, byte[] bArr, int i3) {
        int i4 = i2 / 1000;
        int i5 = i2 - (i4 * 1000);
        int i6 = i4 / 1000;
        int i7 = i4 - (i6 * 1000);
        int[] iArr = h;
        int i8 = iArr[i6];
        int i9 = i3 + 1;
        bArr[i3] = (byte) (i8 >> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 8);
        int i11 = i10 + 1;
        bArr[i10] = (byte) i8;
        int i12 = iArr[i7];
        int i13 = i11 + 1;
        bArr[i11] = (byte) (i12 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i12 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) i12;
        int i16 = iArr[i5];
        int i17 = i15 + 1;
        bArr[i15] = (byte) (i16 >> 16);
        int i18 = i17 + 1;
        bArr[i17] = (byte) (i16 >> 8);
        int i19 = i18 + 1;
        bArr[i18] = (byte) i16;
        return i19;
    }

    public static int f(int i2, char[] cArr, int i3) {
        int i4 = i2 / 1000;
        int i5 = i2 - (i4 * 1000);
        int i6 = i4 / 1000;
        int[] iArr = h;
        int i7 = iArr[i6];
        int i8 = i3 + 1;
        cArr[i3] = (char) (i7 >> 16);
        int i9 = i8 + 1;
        cArr[i8] = (char) ((i7 >> 8) & 127);
        int i10 = i9 + 1;
        cArr[i9] = (char) (i7 & 127);
        int i11 = iArr[i4 - (i6 * 1000)];
        int i12 = i10 + 1;
        cArr[i10] = (char) (i11 >> 16);
        int i13 = i12 + 1;
        cArr[i12] = (char) ((i11 >> 8) & 127);
        int i14 = i13 + 1;
        cArr[i13] = (char) (i11 & 127);
        int i15 = iArr[i5];
        int i16 = i14 + 1;
        cArr[i14] = (char) (i15 >> 16);
        int i17 = i16 + 1;
        cArr[i16] = (char) ((i15 >> 8) & 127);
        int i18 = i17 + 1;
        cArr[i17] = (char) (i15 & 127);
        return i18;
    }

    public static int g(byte[] bArr, int i2) {
        int length = f.length();
        int i3 = 0;
        while (i3 < length) {
            bArr[i2] = (byte) f.charAt(i3);
            i3++;
            i2++;
        }
        return i2;
    }

    public static int h(char[] cArr, int i2) {
        String str = f;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        return i2 + length;
    }

    public static int i(byte[] bArr, int i2) {
        int length = g.length();
        int i3 = 0;
        while (i3 < length) {
            bArr[i2] = (byte) g.charAt(i3);
            i3++;
            i2++;
        }
        return i2;
    }

    public static int j(char[] cArr, int i2) {
        String str = g;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        return i2 + length;
    }

    public static int k(int i2, byte[] bArr, int i3) {
        if (i2 < a) {
            if (i2 < 1000) {
                return c(i2, bArr, i3);
            }
            int i4 = i2 / 1000;
            return m(bArr, i3, i4, i2 - (i4 * 1000));
        }
        int i5 = i2 / 1000;
        int i6 = i2 - (i5 * 1000);
        int i7 = i5 / 1000;
        int i8 = i5 - (i7 * 1000);
        int iC = c(i7, bArr, i3);
        int[] iArr = h;
        int i9 = iArr[i8];
        int i10 = iC + 1;
        bArr[iC] = (byte) (i9 >> 16);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (i9 >> 8);
        int i12 = i11 + 1;
        bArr[i11] = (byte) i9;
        int i13 = iArr[i6];
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 >> 16);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i13 >> 8);
        int i16 = i15 + 1;
        bArr[i15] = (byte) i13;
        return i16;
    }

    public static int l(int i2, char[] cArr, int i3) {
        if (i2 < a) {
            if (i2 < 1000) {
                return d(i2, cArr, i3);
            }
            int i4 = i2 / 1000;
            return n(cArr, i3, i4, i2 - (i4 * 1000));
        }
        int i5 = i2 / 1000;
        int i6 = i2 - (i5 * 1000);
        int i7 = i5 / 1000;
        int i8 = i5 - (i7 * 1000);
        int iD = d(i7, cArr, i3);
        int[] iArr = h;
        int i9 = iArr[i8];
        int i10 = iD + 1;
        cArr[iD] = (char) (i9 >> 16);
        int i11 = i10 + 1;
        cArr[i10] = (char) ((i9 >> 8) & 127);
        int i12 = i11 + 1;
        cArr[i11] = (char) (i9 & 127);
        int i13 = iArr[i6];
        int i14 = i12 + 1;
        cArr[i12] = (char) (i13 >> 16);
        int i15 = i14 + 1;
        cArr[i14] = (char) ((i13 >> 8) & 127);
        int i16 = i15 + 1;
        cArr[i15] = (char) (i13 & 127);
        return i16;
    }

    public static int m(byte[] bArr, int i2, int i3, int i4) {
        int[] iArr = h;
        int i5 = iArr[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                bArr[i2] = (byte) (i5 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i5 >> 8);
            i2++;
        }
        int i6 = i2 + 1;
        bArr[i2] = (byte) i5;
        int i7 = iArr[i4];
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 >> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) i7;
        return i10;
    }

    public static int n(char[] cArr, int i2, int i3, int i4) {
        int[] iArr = h;
        int i5 = iArr[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                cArr[i2] = (char) (i5 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i5 >> 8) & 127);
            i2++;
        }
        int i6 = i2 + 1;
        cArr[i2] = (char) (i5 & 127);
        int i7 = iArr[i4];
        int i8 = i6 + 1;
        cArr[i6] = (char) (i7 >> 16);
        int i9 = i8 + 1;
        cArr[i8] = (char) ((i7 >> 8) & 127);
        int i10 = i9 + 1;
        cArr[i9] = (char) (i7 & 127);
        return i10;
    }

    public static boolean o(double d2) {
        return Double.isNaN(d2) || Double.isInfinite(d2);
    }

    public static boolean p(float f2) {
        return Float.isNaN(f2) || Float.isInfinite(f2);
    }

    public static int q(int i2, byte[] bArr, int i3) {
        int i4;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return g(bArr, i3);
            }
            bArr[i3] = 45;
            i2 = -i2;
            i3++;
        }
        if (i2 < a) {
            if (i2 >= 1000) {
                int i5 = i2 / 1000;
                return a(i2 - (i5 * 1000), bArr, c(i5, bArr, i3));
            }
            if (i2 >= 10) {
                return c(i2, bArr, i3);
            }
            int i6 = i3 + 1;
            bArr[i3] = (byte) (i2 + 48);
            return i6;
        }
        int i7 = b;
        if (i2 < i7) {
            int i8 = i2 / 1000;
            int i9 = i8 / 1000;
            return a(i2 - (i8 * 1000), bArr, a(i8 - (i9 * 1000), bArr, c(i9, bArr, i3)));
        }
        int i10 = i2 - i7;
        if (i10 >= i7) {
            i10 -= i7;
            i4 = i3 + 1;
            bArr[i3] = 50;
        } else {
            i4 = i3 + 1;
            bArr[i3] = 49;
        }
        return e(i10, bArr, i4);
    }

    public static int r(int i2, char[] cArr, int i3) {
        int i4;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return h(cArr, i3);
            }
            cArr[i3] = Soundex.SILENT_MARKER;
            i2 = -i2;
            i3++;
        }
        if (i2 < a) {
            if (i2 >= 1000) {
                int i5 = i2 / 1000;
                return b(i2 - (i5 * 1000), cArr, d(i5, cArr, i3));
            }
            if (i2 >= 10) {
                return d(i2, cArr, i3);
            }
            cArr[i3] = (char) (i2 + 48);
            return i3 + 1;
        }
        int i6 = b;
        if (i2 < i6) {
            int i7 = i2 / 1000;
            int i8 = i7 / 1000;
            return b(i2 - (i7 * 1000), cArr, b(i7 - (i8 * 1000), cArr, d(i8, cArr, i3)));
        }
        int i9 = i2 - i6;
        if (i9 >= i6) {
            i9 -= i6;
            i4 = i3 + 1;
            cArr[i3] = '2';
        } else {
            i4 = i3 + 1;
            cArr[i3] = '1';
        }
        return f(i9, cArr, i4);
    }

    public static int s(long j2, byte[] bArr, int i2) {
        int iE;
        if (j2 < 0) {
            if (j2 > d) {
                return q((int) j2, bArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                return i(bArr, i2);
            }
            bArr[i2] = 45;
            j2 = -j2;
            i2++;
        } else if (j2 <= f14704e) {
            return q((int) j2, bArr, i2);
        }
        long j3 = f14703c;
        long j4 = j2 / j3;
        long j5 = j2 - (j4 * j3);
        if (j4 < j3) {
            iE = k((int) j4, bArr, i2);
        } else {
            long j6 = j4 / j3;
            int iC = c((int) j6, bArr, i2);
            iE = e((int) (j4 - (j3 * j6)), bArr, iC);
        }
        return e((int) j5, bArr, iE);
    }

    public static int t(long j2, char[] cArr, int i2) {
        int iF;
        if (j2 < 0) {
            if (j2 > d) {
                return r((int) j2, cArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                return j(cArr, i2);
            }
            cArr[i2] = Soundex.SILENT_MARKER;
            j2 = -j2;
            i2++;
        } else if (j2 <= f14704e) {
            return r((int) j2, cArr, i2);
        }
        long j3 = f14703c;
        long j4 = j2 / j3;
        long j5 = j2 - (j4 * j3);
        if (j4 < j3) {
            iF = l((int) j4, cArr, i2);
        } else {
            long j6 = j4 / j3;
            int iD = d((int) j6, cArr, i2);
            iF = f((int) (j4 - (j3 * j6)), cArr, iD);
        }
        return f((int) j5, cArr, iF);
    }

    public static String u(double d2) {
        return Double.toString(d2);
    }

    public static String v(float f2) {
        return Float.toString(f2);
    }

    public static String w(int i2) {
        String[] strArr = i;
        if (i2 < strArr.length) {
            if (i2 >= 0) {
                return strArr[i2];
            }
            int i3 = (-i2) - 1;
            String[] strArr2 = f14705j;
            if (i3 < strArr2.length) {
                return strArr2[i3];
            }
        }
        return Integer.toString(i2);
    }

    public static String x(long j2) {
        return (j2 > 2147483647L || j2 < -2147483648L) ? Long.toString(j2) : w((int) j2);
    }
}
