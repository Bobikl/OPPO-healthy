package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class y76 {
    public static rb6 a(rb6 rb6Var, BigInteger bigInteger, rb6 rb6Var2, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, e5l.g(bigIntegerAbs.bitLength())));
        int iMax2 = Math.max(2, Math.min(16, e5l.g(bigIntegerAbs2.bitLength())));
        d5l d5lVarJ = e5l.j(rb6Var, iMax, true);
        d5l d5lVarJ2 = e5l.j(rb6Var2, iMax2, true);
        return c(z ? d5lVarJ.b() : d5lVarJ.a(), z ? d5lVarJ.a() : d5lVarJ.b(), e5l.d(iMax, bigIntegerAbs), z2 ? d5lVarJ2.b() : d5lVarJ2.a(), z2 ? d5lVarJ2.a() : d5lVarJ2.b(), e5l.d(iMax2, bigIntegerAbs2));
    }

    public static rb6 b(rb6 rb6Var, BigInteger bigInteger, sb6 sb6Var, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, e5l.g(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
        rb6 rb6VarI = e5l.i(rb6Var, iMax, true, sb6Var);
        d5l d5lVarE = e5l.e(rb6Var);
        d5l d5lVarE2 = e5l.e(rb6VarI);
        return c(z ? d5lVarE.b() : d5lVarE.a(), z ? d5lVarE.a() : d5lVarE.b(), e5l.d(iMax, bigIntegerAbs), z2 ? d5lVarE2.b() : d5lVarE2.a(), z2 ? d5lVarE2.a() : d5lVarE2.b(), e5l.d(iMax, bigIntegerAbs2));
    }

    public static rb6 c(rb6[] rb6VarArr, rb6[] rb6VarArr2, byte[] bArr, rb6[] rb6VarArr3, rb6[] rb6VarArr4, byte[] bArr2) {
        rb6 rb6VarA;
        int iMax = Math.max(bArr.length, bArr2.length);
        rb6 rb6VarT = rb6VarArr[0].i().t();
        int i = iMax - 1;
        int i2 = 0;
        rb6 rb6VarH = rb6VarT;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : (byte) 0;
            byte b2 = i < bArr2.length ? bArr2[i] : (byte) 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    rb6VarA = rb6VarT.a((b < 0 ? rb6VarArr2 : rb6VarArr)[Math.abs((int) b) >>> 1]);
                } else {
                    rb6VarA = rb6VarT;
                }
                if (b2 != 0) {
                    rb6VarA = rb6VarA.a((b2 < 0 ? rb6VarArr4 : rb6VarArr3)[Math.abs((int) b2) >>> 1]);
                }
                if (i2 > 0) {
                    rb6VarH = rb6VarH.F(i2);
                    i2 = 0;
                }
                rb6VarH = rb6VarH.H(rb6VarA);
            }
            i--;
        }
        return i2 > 0 ? rb6VarH.F(i2) : rb6VarH;
    }

    public static boolean d(a86 a86Var) {
        return e(a86Var.r());
    }

    public static boolean e(ig7 ig7Var) {
        return ig7Var.a() > 1 && ig7Var.b().equals(z76.TWO) && (ig7Var instanceof ene);
    }

    public static boolean f(a86 a86Var) {
        return g(a86Var.r());
    }

    public static boolean g(ig7 ig7Var) {
        return ig7Var.a() == 1;
    }

    public static void h(h86[] h86VarArr, int i, int i2, h86 h86Var) {
        h86[] h86VarArr2 = new h86[i2];
        int i3 = 0;
        h86VarArr2[0] = h86VarArr[i];
        while (true) {
            i3++;
            if (i3 >= i2) {
                break;
            } else {
                h86VarArr2[i3] = h86VarArr2[i3 - 1].j(h86VarArr[i + i3]);
            }
        }
        int i4 = i3 - 1;
        if (h86Var != null) {
            h86VarArr2[i4] = h86VarArr2[i4].j(h86Var);
        }
        h86 h86VarG = h86VarArr2[i4].g();
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = i4 + i;
            h86 h86Var2 = h86VarArr[i6];
            h86VarArr[i6] = h86VarArr2[i5].j(h86VarG);
            h86VarG = h86VarG.j(h86Var2);
            i4 = i5;
        }
        h86VarArr[i] = h86VarG;
    }

    public static rb6 i(rb6 rb6Var, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        rb6 rb6VarT = rb6Var.i().t();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                rb6VarT = rb6Var;
            }
            for (int i = 1; i < iBitLength; i++) {
                rb6Var = rb6Var.G();
                if (bigIntegerAbs.testBit(i)) {
                    rb6VarT = rb6VarT.a(rb6Var);
                }
            }
        }
        return bigInteger.signum() < 0 ? rb6VarT.x() : rb6VarT;
    }

    public static rb6 j(rb6 rb6Var) {
        if (rb6Var.v()) {
            return rb6Var;
        }
        throw new IllegalArgumentException("Invalid point");
    }
}
