package com.oplus.aiunit.vision;

import java.math.BigDecimal;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class rd1 {
    public final char[] a;

    public rd1(char[] cArr) {
        this.a = cArr;
    }

    public static BigDecimal b(String str) {
        return c(str.toCharArray());
    }

    public static BigDecimal c(char[] cArr) {
        int length = cArr.length;
        try {
            return length < 500 ? new BigDecimal(cArr) : new rd1(cArr).e(length / 10);
        } catch (NumberFormatException e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            throw new NumberFormatException("Value \"" + new String(cArr) + "\" can not be represented as `java.math.BigDecimal`, reason: " + message);
        }
    }

    public static BigDecimal d(char[] cArr, int i, int i2) {
        if (i > 0 || i2 != cArr.length) {
            cArr = Arrays.copyOfRange(cArr, i, i2 + i);
        }
        return c(cArr);
    }

    public final int a(int i, long j2) {
        long j3 = ((long) i) - j2;
        if (j3 <= 2147483647L && j3 >= -2147483648L) {
            return (int) j3;
        }
        throw new NumberFormatException("Scale out of range: " + j3 + " while adjusting scale " + i + " to exponent " + j2);
    }

    public final BigDecimal e(int i) {
        int i2;
        int i3;
        BigDecimal bigDecimalF;
        int length = this.a.length;
        int i4 = -1;
        int i5 = -1;
        int iA = 0;
        boolean z = false;
        boolean z2 = false;
        int i6 = 0;
        boolean z3 = false;
        for (int i7 = 0; i7 < length; i7++) {
            char c2 = this.a[i7];
            if (c2 != '+') {
                if (c2 == 'E' || c2 == 'e') {
                    if (i4 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i4 = i7;
                } else if (c2 != '-') {
                    if (c2 == '.') {
                        if (i5 >= 0) {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                        i5 = i7;
                    } else if (i5 >= 0 && i4 == -1) {
                        iA++;
                    }
                } else if (i4 >= 0) {
                    if (z2) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z2 = true;
                } else {
                    if (z) {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                    i6 = i7 + 1;
                    z = true;
                    z3 = true;
                }
            } else if (i4 >= 0) {
                if (z2) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z2 = true;
            } else {
                if (z) {
                    throw new NumberFormatException("Multiple signs in number");
                }
                i6 = i7 + 1;
                z = true;
            }
        }
        if (i4 >= 0) {
            i2 = 1;
            i3 = Integer.parseInt(new String(this.a, i4 + 1, (length - i4) - 1));
            iA = a(iA, i3);
            length = i4;
        } else {
            i2 = 1;
            i3 = 0;
        }
        if (i5 >= 0) {
            int i8 = (length - i5) - i2;
            bigDecimalF = f(i6, i5 - i6, i3, i).add(f(i5 + i2, i8, i3 - i8, i));
        } else {
            bigDecimalF = f(i6, length - i6, i3, i);
        }
        if (iA != 0) {
            bigDecimalF = bigDecimalF.setScale(iA);
        }
        return z3 ? bigDecimalF.negate() : bigDecimalF;
    }

    public final BigDecimal f(int i, int i2, int i3, int i4) {
        if (i2 <= i4) {
            return i2 == 0 ? BigDecimal.ZERO : new BigDecimal(this.a, i, i2).movePointRight(i3);
        }
        int i5 = i2 / 2;
        return f(i, i5, (i3 + i2) - i5, i4).add(f(i + i5, i2 - i5, i3, i4));
    }
}
