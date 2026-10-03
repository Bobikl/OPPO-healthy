package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class u0k {
    public static final byte POW_2_WIDTH = 16;
    public static final byte WIDTH = 4;
    public static final BigInteger a;
    public static final q7m[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final q7m[] alpha1;
    public static final byte[][] alpha1Tnaf;
    public static final BigInteger b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f17240c;

    static {
        BigInteger bigInteger = z76.ONE;
        BigInteger bigIntegerNegate = bigInteger.negate();
        a = bigIntegerNegate;
        b = z76.TWO.negate();
        BigInteger bigIntegerNegate2 = z76.THREE.negate();
        f17240c = bigIntegerNegate2;
        BigInteger bigInteger2 = z76.ZERO;
        alpha0 = new q7m[]{null, new q7m(bigInteger, bigInteger2), null, new q7m(bigIntegerNegate2, bigIntegerNegate), null, new q7m(bigIntegerNegate, bigIntegerNegate), null, new q7m(bigInteger, bigIntegerNegate), null};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new q7m[]{null, new q7m(bigInteger, bigInteger2), null, new q7m(bigIntegerNegate2, bigInteger), null, new q7m(bigIntegerNegate, bigInteger), null, new q7m(bigInteger, bigInteger), null};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static n3h a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b2, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b2));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i4);
        if (bigIntegerAdd.testBit(i4 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(z76.ONE);
        }
        return new n3h(bigIntegerShiftRight, i2);
    }

    public static BigInteger[] b(byte b2, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigIntegerSubtract;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z) {
            bigInteger = z76.TWO;
            bigIntegerSubtract = BigInteger.valueOf(b2);
        } else {
            bigInteger = z76.ZERO;
            bigIntegerSubtract = z76.ONE;
        }
        int i2 = 1;
        while (i2 < i) {
            i2++;
            BigInteger bigInteger2 = bigIntegerSubtract;
            bigIntegerSubtract = (b2 == 1 ? bigIntegerSubtract : bigIntegerSubtract.negate()).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger2;
        }
        return new BigInteger[]{bigInteger, bigIntegerSubtract};
    }

    public static byte c(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    public static rb6.a[] d(rb6.a aVar, byte b2) {
        byte[][] bArr = b2 == 0 ? alpha0Tnaf : alpha1Tnaf;
        rb6.a[] aVarArr = new rb6.a[(bArr.length + 1) >>> 1];
        aVarArr[0] = aVar;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            aVarArr[i >>> 1] = h(aVar, bArr[i]);
        }
        aVar.i().y(aVarArr);
        return aVarArr;
    }

    public static int e(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(z76.TWO)) {
                return 1;
            }
            if (bigInteger.equals(z76.FOUR)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] f(a86.a aVar) {
        if (!aVar.G()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int iS = aVar.s();
        int iIntValue = aVar.n().t().intValue();
        byte bC = c(iIntValue);
        int iE = e(aVar.p());
        BigInteger[] bigIntegerArrB = b(bC, (iS + 3) - iIntValue, false);
        if (bC == 1) {
            bigIntegerArrB[0] = bigIntegerArrB[0].negate();
            bigIntegerArrB[1] = bigIntegerArrB[1].negate();
        }
        BigInteger bigInteger = z76.ONE;
        return new BigInteger[]{bigInteger.add(bigIntegerArrB[1]).shiftRight(iE), bigInteger.add(bigIntegerArrB[0]).shiftRight(iE).negate()};
    }

    public static BigInteger g(byte b2, int i) {
        if (i == 4) {
            return b2 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] bigIntegerArrB = b(b2, i, false);
        BigInteger bit = z76.ZERO.setBit(i);
        return z76.TWO.multiply(bigIntegerArrB[0]).multiply(bigIntegerArrB[1].modInverse(bit)).mod(bit);
    }

    public static rb6.a h(rb6.a aVar, byte[] bArr) {
        rb6.a aVar2 = (rb6.a) aVar.i().t();
        rb6.a aVar3 = (rb6.a) aVar.x();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b2 = bArr[length];
            if (b2 != 0) {
                aVar2 = (rb6.a) aVar2.I(i).a(b2 > 0 ? aVar : aVar3);
                i = 0;
            }
        }
        return i > 0 ? aVar2.I(i) : aVar2;
    }

    public static BigInteger i(byte b2, q7m q7mVar) {
        BigInteger bigInteger = q7mVar.a;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger);
        BigInteger bigIntegerMultiply2 = q7mVar.a.multiply(q7mVar.b);
        BigInteger bigInteger2 = q7mVar.b;
        BigInteger bigIntegerShiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b2 == 1) {
            return bigIntegerMultiply.add(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        if (b2 == -1) {
            return bigIntegerMultiply.subtract(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static q7m j(BigInteger bigInteger, int i, byte b2, BigInteger[] bigIntegerArr, byte b3, byte b4) {
        BigInteger bigIntegerAdd = b3 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = b(b3, i, true)[1];
        q7m q7mVarK = k(a(bigInteger, bigIntegerArr[0], bigInteger2, b2, i, b4), a(bigInteger, bigIntegerArr[1], bigInteger2, b2, i, b4), b3);
        return new q7m(bigInteger.subtract(bigIntegerAdd.multiply(q7mVarK.a)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(q7mVarK.b)), bigIntegerArr[1].multiply(q7mVarK.a).subtract(bigIntegerArr[0].multiply(q7mVarK.b)));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r5.d(r9) >= 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q7m k(n3h n3hVar, n3h n3hVar2, byte b2) {
        n3h n3hVarA;
        n3h n3hVarI;
        if (n3hVar2.f() != n3hVar.f()) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        int i = -1;
        int i2 = 1;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerH = n3hVar.h();
        BigInteger bigIntegerH2 = n3hVar2.h();
        n3h n3hVarJ = n3hVar.j(bigIntegerH);
        n3h n3hVarJ2 = n3hVar2.j(bigIntegerH2);
        n3h n3hVarA2 = n3hVarJ.a(n3hVarJ);
        n3h n3hVarA3 = b2 == 1 ? n3hVarA2.a(n3hVarJ2) : n3hVarA2.i(n3hVarJ2);
        n3h n3hVarA4 = n3hVarJ2.a(n3hVarJ2).a(n3hVarJ2);
        n3h n3hVarA5 = n3hVarA4.a(n3hVarJ2);
        if (b2 == 1) {
            n3hVarA = n3hVarJ.i(n3hVarA4);
            n3hVarI = n3hVarJ.a(n3hVarA5);
        } else {
            n3hVarA = n3hVarJ.a(n3hVarA4);
            n3hVarI = n3hVarJ.i(n3hVarA5);
        }
        BigInteger bigInteger = z76.ONE;
        byte b3 = 0;
        if (n3hVarA3.d(bigInteger) >= 0) {
            if (n3hVarA.d(a) < 0) {
                i2 = 0;
                b3 = b2;
            }
        } else if (n3hVarI.d(z76.TWO) >= 0) {
            i2 = 0;
            b3 = b2;
        } else {
            i2 = 0;
        }
        if (n3hVarA3.d(a) >= 0) {
            if (n3hVarI.d(b) < 0) {
            }
            i = i2;
            return new q7m(bigIntegerH.add(BigInteger.valueOf(i)), bigIntegerH2.add(BigInteger.valueOf(b3)));
        }
        b3 = (byte) (-b2);
        i = i2;
        return new q7m(bigIntegerH.add(BigInteger.valueOf(i)), bigIntegerH2.add(BigInteger.valueOf(b3)));
    }

    public static byte[] l(byte b2, q7m q7mVar, byte b3, BigInteger bigInteger, BigInteger bigInteger2, q7m[] q7mVarArr) {
        boolean z;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = i(b2, q7mVar).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 + b3 : b3 + 34];
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(1);
        BigInteger bigIntegerAdd = q7mVar.a;
        BigInteger bigIntegerAdd2 = q7mVar.b;
        int i = 0;
        while (true) {
            BigInteger bigInteger3 = z76.ZERO;
            if (bigIntegerAdd.equals(bigInteger3) && bigIntegerAdd2.equals(bigInteger3)) {
                return bArr;
            }
            if (bigIntegerAdd.testBit(0)) {
                BigInteger bigIntegerMod = bigIntegerAdd.add(bigIntegerAdd2.multiply(bigInteger2)).mod(bigInteger);
                byte bIntValue = (byte) (bigIntegerMod.compareTo(bigIntegerShiftRight) >= 0 ? bigIntegerMod.subtract(bigInteger).intValue() : bigIntegerMod.intValue());
                bArr[i] = bIntValue;
                if (bIntValue < 0) {
                    bIntValue = (byte) (-bIntValue);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bigIntegerAdd = bigIntegerAdd.subtract(q7mVarArr[bIntValue].a);
                    bigIntegerAdd2 = bigIntegerAdd2.subtract(q7mVarArr[bIntValue].b);
                } else {
                    bigIntegerAdd = bigIntegerAdd.add(q7mVarArr[bIntValue].a);
                    bigIntegerAdd2 = bigIntegerAdd2.add(q7mVarArr[bIntValue].b);
                }
            } else {
                bArr[i] = 0;
            }
            BigInteger bigIntegerAdd3 = b2 == 1 ? bigIntegerAdd2.add(bigIntegerAdd.shiftRight(1)) : bigIntegerAdd2.subtract(bigIntegerAdd.shiftRight(1));
            BigInteger bigIntegerNegate = bigIntegerAdd.shiftRight(1).negate();
            i++;
            bigIntegerAdd = bigIntegerAdd3;
            bigIntegerAdd2 = bigIntegerNegate;
        }
    }
}
