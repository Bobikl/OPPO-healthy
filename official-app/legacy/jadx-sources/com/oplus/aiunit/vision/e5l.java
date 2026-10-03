package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e5l {
    public static final String PRECOMP_NAME = "bc_wnaf";
    public static final int[] a = {13, 41, 121, 337, 897, k18.GL_CCW};
    public static final byte[] b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10792c = new int[0];
    public static final rb6[] d = new rb6[0];

    public static int[] a(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return f10792c;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i = iBitLength >> 1;
        int[] iArr = new int[i];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i2 = iBitLength - 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < i2) {
            if (bigIntegerXor.testBit(i4)) {
                iArr[i3] = i5 | ((bigInteger.testBit(i4) ? -1 : 1) << 16);
                i4++;
                i5 = 1;
                i3++;
            } else {
                i5++;
            }
            i4++;
        }
        int i6 = i3 + 1;
        iArr[i3] = 65536 | i5;
        return i > i6 ? m(iArr, i6) : iArr;
    }

    public static int[] b(int i, BigInteger bigInteger) {
        if (i == 2) {
            return a(bigInteger);
        }
        if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return f10792c;
        }
        int iBitLength = (bigInteger.bitLength() / i) + 1;
        int[] iArr = new int[iBitLength];
        int i2 = 1 << i;
        int i3 = i2 - 1;
        int i4 = i2 >>> 1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i5) == z) {
                i5++;
            } else {
                bigInteger = bigInteger.shiftRight(i5);
                int iIntValue = bigInteger.intValue() & i3;
                if (z) {
                    iIntValue++;
                }
                z = (iIntValue & i4) != 0;
                if (z) {
                    iIntValue -= i2;
                }
                if (i6 > 0) {
                    i5--;
                }
                iArr[i6] = i5 | (iIntValue << 16);
                i5 = i;
                i6++;
            }
        }
        return iBitLength > i6 ? m(iArr, i6) : iArr;
    }

    public static byte[] c(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return b;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength() - 1;
        byte[] bArr = new byte[iBitLength];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i = 1;
        while (i < iBitLength) {
            if (bigIntegerXor.testBit(i)) {
                bArr[i - 1] = (byte) (bigInteger.testBit(i) ? -1 : 1);
                i++;
            }
            i++;
        }
        bArr[iBitLength - 1] = 1;
        return bArr;
    }

    public static byte[] d(int i, BigInteger bigInteger) {
        if (i == 2) {
            return c(bigInteger);
        }
        if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return b;
        }
        int iBitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[iBitLength];
        int i2 = 1 << i;
        int i3 = i2 - 1;
        int i4 = i2 >>> 1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i5) == z) {
                i5++;
            } else {
                bigInteger = bigInteger.shiftRight(i5);
                int iIntValue = bigInteger.intValue() & i3;
                if (z) {
                    iIntValue++;
                }
                z = (iIntValue & i4) != 0;
                if (z) {
                    iIntValue -= i2;
                }
                if (i6 > 0) {
                    i5--;
                }
                int i7 = i6 + i5;
                bArr[i7] = (byte) iIntValue;
                i6 = i7 + 1;
                i5 = i;
            }
        }
        return iBitLength > i6 ? l(bArr, i6) : bArr;
    }

    public static d5l e(rb6 rb6Var) {
        return f(rb6Var.i().w(rb6Var, PRECOMP_NAME));
    }

    public static d5l f(qoe qoeVar) {
        return (qoeVar == null || !(qoeVar instanceof d5l)) ? new d5l() : (d5l) qoeVar;
    }

    public static int g(int i) {
        return h(i, a);
    }

    public static int h(int i, int[] iArr) {
        int i2 = 0;
        while (i2 < iArr.length && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    public static rb6 i(rb6 rb6Var, int i, boolean z, sb6 sb6Var) {
        a86 a86VarI = rb6Var.i();
        d5l d5lVarJ = j(rb6Var, i, z);
        rb6 rb6VarA = sb6Var.a(rb6Var);
        d5l d5lVarF = f(a86VarI.w(rb6VarA, PRECOMP_NAME));
        rb6 rb6VarC = d5lVarJ.c();
        if (rb6VarC != null) {
            d5lVarF.f(sb6Var.a(rb6VarC));
        }
        rb6[] rb6VarArrA = d5lVarJ.a();
        int length = rb6VarArrA.length;
        rb6[] rb6VarArr = new rb6[length];
        for (int i2 = 0; i2 < rb6VarArrA.length; i2++) {
            rb6VarArr[i2] = sb6Var.a(rb6VarArrA[i2]);
        }
        d5lVarF.d(rb6VarArr);
        if (z) {
            rb6[] rb6VarArr2 = new rb6[length];
            for (int i3 = 0; i3 < length; i3++) {
                rb6VarArr2[i3] = rb6VarArr[i3].x();
            }
            d5lVarF.e(rb6VarArr2);
        }
        a86VarI.A(rb6VarA, PRECOMP_NAME, d5lVarF);
        return rb6VarA;
    }

    public static d5l j(rb6 rb6Var, int i, boolean z) {
        int length;
        int i2;
        int iQ;
        a86 a86VarI = rb6Var.i();
        d5l d5lVarF = f(a86VarI.w(rb6Var, PRECOMP_NAME));
        int length2 = 0;
        int iMax = 1 << Math.max(0, i - 2);
        rb6[] rb6VarArrA = d5lVarF.a();
        if (rb6VarArrA == null) {
            rb6VarArrA = d;
            length = 0;
        } else {
            length = rb6VarArrA.length;
        }
        if (length < iMax) {
            rb6VarArrA = k(rb6VarArrA, iMax);
            if (iMax == 1) {
                rb6VarArrA[0] = rb6Var.y();
            } else {
                if (length == 0) {
                    rb6VarArrA[0] = rb6Var;
                    i2 = 1;
                } else {
                    i2 = length;
                }
                h86 h86Var = null;
                if (iMax == 2) {
                    rb6VarArrA[1] = rb6Var.E();
                } else {
                    rb6 rb6VarC = d5lVarF.c();
                    rb6 rb6VarA = rb6VarArrA[i2 - 1];
                    if (rb6VarC == null) {
                        rb6VarC = rb6VarArrA[0].G();
                        d5lVarF.f(rb6VarC);
                        if (!rb6VarC.t() && y76.f(a86VarI) && a86VarI.s() >= 64 && ((iQ = a86VarI.q()) == 2 || iQ == 3 || iQ == 4)) {
                            h86 h86VarS = rb6VarC.s(0);
                            rb6VarC = a86VarI.f(rb6VarC.q().t(), rb6VarC.r().t());
                            h86 h86VarO = h86VarS.o();
                            rb6VarA = rb6VarA.C(h86VarO).D(h86VarO.j(h86VarS));
                            if (length == 0) {
                                rb6VarArrA[0] = rb6VarA;
                            }
                            h86Var = h86VarS;
                        }
                    }
                    while (i2 < iMax) {
                        rb6VarA = rb6VarA.a(rb6VarC);
                        rb6VarArrA[i2] = rb6VarA;
                        i2++;
                    }
                }
                a86VarI.z(rb6VarArrA, length, iMax - length, h86Var);
            }
        }
        d5lVarF.d(rb6VarArrA);
        if (z) {
            rb6[] rb6VarArrB = d5lVarF.b();
            if (rb6VarArrB == null) {
                rb6VarArrB = new rb6[iMax];
            } else {
                length2 = rb6VarArrB.length;
                if (length2 < iMax) {
                    rb6VarArrB = k(rb6VarArrB, iMax);
                }
            }
            while (length2 < iMax) {
                rb6VarArrB[length2] = rb6VarArrA[length2].x();
                length2++;
            }
            d5lVarF.e(rb6VarArrB);
        }
        a86VarI.A(rb6Var, PRECOMP_NAME, d5lVarF);
        return d5lVarF;
    }

    public static rb6[] k(rb6[] rb6VarArr, int i) {
        rb6[] rb6VarArr2 = new rb6[i];
        System.arraycopy(rb6VarArr, 0, rb6VarArr2, 0, rb6VarArr.length);
        return rb6VarArr2;
    }

    public static byte[] l(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public static int[] m(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }
}
