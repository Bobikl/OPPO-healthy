package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h86 implements z76 {

    public static class b extends h86 {
        public BigInteger a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public BigInteger f12051c;

        public b(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, u(bigInteger), bigInteger2);
        }

        public static BigInteger u(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return z76.ONE.shiftLeft(iBitLength).subtract(bigInteger);
        }

        public BigInteger A(BigInteger bigInteger) {
            int iF = f();
            int i = (iF + 31) >> 5;
            int[] iArrN = gfc.n(iF, this.a);
            int[] iArrN2 = gfc.n(iF, bigInteger);
            int[] iArrI = gfc.i(i);
            c2c.d(iArrN, iArrN2, iArrI);
            return gfc.O(i, iArrI);
        }

        public BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
            return C(bigInteger.multiply(bigInteger2));
        }

        public BigInteger C(BigInteger bigInteger) {
            if (this.b == null) {
                return bigInteger.mod(this.a);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.a.bitLength();
            boolean zEquals = this.b.equals(z76.ONE);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.b);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.a) >= 0) {
                bigInteger = bigInteger.subtract(this.a);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.a.subtract(bigInteger);
        }

        public BigInteger D(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.a) : bigIntegerSubtract;
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 a(h86 h86Var) {
            return new b(this.a, this.b, x(this.f12051c, h86Var.t()));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 b() {
            BigInteger bigIntegerAdd = this.f12051c.add(z76.ONE);
            if (bigIntegerAdd.compareTo(this.a) == 0) {
                bigIntegerAdd = z76.ZERO;
            }
            return new b(this.a, this.b, bigIntegerAdd);
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 d(h86 h86Var) {
            return new b(this.a, this.b, B(this.f12051c, A(h86Var.t())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.f12051c.equals(bVar.f12051c);
        }

        @Override // com.oplus.aiunit.vision.h86
        public int f() {
            return this.a.bitLength();
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 g() {
            return new b(this.a, this.b, A(this.f12051c));
        }

        public int hashCode() {
            return this.f12051c.hashCode() ^ this.a.hashCode();
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 j(h86 h86Var) {
            return new b(this.a, this.b, B(this.f12051c, h86Var.t()));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
            BigInteger bigInteger = this.f12051c;
            BigInteger bigIntegerT = h86Var.t();
            BigInteger bigIntegerT2 = h86Var2.t();
            BigInteger bigIntegerT3 = h86Var3.t();
            return new b(this.a, this.b, C(bigInteger.multiply(bigIntegerT).subtract(bigIntegerT2.multiply(bigIntegerT3))));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
            BigInteger bigInteger = this.f12051c;
            BigInteger bigIntegerT = h86Var.t();
            BigInteger bigIntegerT2 = h86Var2.t();
            BigInteger bigIntegerT3 = h86Var3.t();
            return new b(this.a, this.b, C(bigInteger.multiply(bigIntegerT).add(bigIntegerT2.multiply(bigIntegerT3))));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 m() {
            if (this.f12051c.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.a;
            return new b(bigInteger, this.b, bigInteger.subtract(this.f12051c));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 n() {
            if (i() || h()) {
                return this;
            }
            if (!this.a.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.a.testBit(1)) {
                BigInteger bigIntegerAdd = this.a.shiftRight(2).add(z76.ONE);
                BigInteger bigInteger = this.a;
                return v(new b(bigInteger, this.b, this.f12051c.modPow(bigIntegerAdd, bigInteger)));
            }
            if (this.a.testBit(2)) {
                BigInteger bigIntegerModPow = this.f12051c.modPow(this.a.shiftRight(3), this.a);
                BigInteger bigIntegerB = B(bigIntegerModPow, this.f12051c);
                if (B(bigIntegerB, bigIntegerModPow).equals(z76.ONE)) {
                    return v(new b(this.a, this.b, bigIntegerB));
                }
                return v(new b(this.a, this.b, B(bigIntegerB, z76.TWO.modPow(this.a.shiftRight(2), this.a))));
            }
            BigInteger bigIntegerShiftRight = this.a.shiftRight(1);
            BigInteger bigIntegerModPow2 = this.f12051c.modPow(bigIntegerShiftRight, this.a);
            BigInteger bigInteger2 = z76.ONE;
            if (!bigIntegerModPow2.equals(bigInteger2)) {
                return null;
            }
            BigInteger bigInteger3 = this.f12051c;
            BigInteger bigIntegerY = y(y(bigInteger3));
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(bigInteger2);
            BigInteger bigIntegerSubtract = this.a.subtract(bigInteger2);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger4 = new BigInteger(this.a.bitLength(), random);
                if (bigInteger4.compareTo(this.a) < 0 && C(bigInteger4.multiply(bigInteger4).subtract(bigIntegerY)).modPow(bigIntegerShiftRight, this.a).equals(bigIntegerSubtract)) {
                    BigInteger[] bigIntegerArrW = w(bigInteger4, bigInteger3, bigIntegerAdd2);
                    BigInteger bigInteger5 = bigIntegerArrW[0];
                    BigInteger bigInteger6 = bigIntegerArrW[1];
                    if (B(bigInteger6, bigInteger6).equals(bigIntegerY)) {
                        return new b(this.a, this.b, z(bigInteger6));
                    }
                    if (!bigInteger5.equals(z76.ONE) && !bigInteger5.equals(bigIntegerSubtract)) {
                        return null;
                    }
                }
            }
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 o() {
            BigInteger bigInteger = this.a;
            BigInteger bigInteger2 = this.b;
            BigInteger bigInteger3 = this.f12051c;
            return new b(bigInteger, bigInteger2, B(bigInteger3, bigInteger3));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 p(h86 h86Var, h86 h86Var2) {
            BigInteger bigInteger = this.f12051c;
            BigInteger bigIntegerT = h86Var.t();
            BigInteger bigIntegerT2 = h86Var2.t();
            return new b(this.a, this.b, C(bigInteger.multiply(bigInteger).add(bigIntegerT.multiply(bigIntegerT2))));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 r(h86 h86Var) {
            return new b(this.a, this.b, D(this.f12051c, h86Var.t()));
        }

        @Override // com.oplus.aiunit.vision.h86
        public BigInteger t() {
            return this.f12051c;
        }

        public final h86 v(h86 h86Var) {
            if (h86Var.o().equals(this)) {
                return h86Var;
            }
            return null;
        }

        public final BigInteger[] w(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int iBitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigIntegerB = z76.ONE;
            BigInteger bigIntegerC = bigInteger;
            BigInteger bigIntegerB2 = bigIntegerB;
            BigInteger bigIntegerC2 = z76.TWO;
            BigInteger bigIntegerB3 = bigIntegerB2;
            for (int i = iBitLength - 1; i >= lowestSetBit + 1; i--) {
                bigIntegerB = B(bigIntegerB, bigIntegerB3);
                if (bigInteger3.testBit(i)) {
                    bigIntegerB3 = B(bigIntegerB, bigInteger2);
                    bigIntegerB2 = B(bigIntegerB2, bigIntegerC);
                    bigIntegerC2 = C(bigIntegerC.multiply(bigIntegerC2).subtract(bigInteger.multiply(bigIntegerB)));
                    bigIntegerC = C(bigIntegerC.multiply(bigIntegerC).subtract(bigIntegerB3.shiftLeft(1)));
                } else {
                    BigInteger bigIntegerC3 = C(bigIntegerB2.multiply(bigIntegerC2).subtract(bigIntegerB));
                    BigInteger bigIntegerC4 = C(bigIntegerC.multiply(bigIntegerC2).subtract(bigInteger.multiply(bigIntegerB)));
                    bigIntegerC2 = C(bigIntegerC2.multiply(bigIntegerC2).subtract(bigIntegerB.shiftLeft(1)));
                    bigIntegerC = bigIntegerC4;
                    bigIntegerB2 = bigIntegerC3;
                    bigIntegerB3 = bigIntegerB;
                }
            }
            BigInteger bigIntegerB4 = B(bigIntegerB, bigIntegerB3);
            BigInteger bigIntegerB5 = B(bigIntegerB4, bigInteger2);
            BigInteger bigIntegerC5 = C(bigIntegerB2.multiply(bigIntegerC2).subtract(bigIntegerB4));
            BigInteger bigIntegerC6 = C(bigIntegerC.multiply(bigIntegerC2).subtract(bigInteger.multiply(bigIntegerB4)));
            BigInteger bigIntegerB6 = B(bigIntegerB4, bigIntegerB5);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                bigIntegerC5 = B(bigIntegerC5, bigIntegerC6);
                bigIntegerC6 = C(bigIntegerC6.multiply(bigIntegerC6).subtract(bigIntegerB6.shiftLeft(1)));
                bigIntegerB6 = B(bigIntegerB6, bigIntegerB6);
            }
            return new BigInteger[]{bigIntegerC5, bigIntegerC6};
        }

        public BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            return bigIntegerAdd.compareTo(this.a) >= 0 ? bigIntegerAdd.subtract(this.a) : bigIntegerAdd;
        }

        public BigInteger y(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            return bigIntegerShiftLeft.compareTo(this.a) >= 0 ? bigIntegerShiftLeft.subtract(this.a) : bigIntegerShiftLeft;
        }

        public BigInteger z(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.a.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.a = bigInteger;
            this.b = bigInteger2;
            this.f12051c = bigInteger3;
        }
    }

    public abstract h86 a(h86 h86Var);

    public abstract h86 b();

    public int c() {
        return t().bitLength();
    }

    public abstract h86 d(h86 h86Var);

    public byte[] e() {
        return td1.a((f() + 7) / 8, t());
    }

    public abstract int f();

    public abstract h86 g();

    public boolean h() {
        return c() == 1;
    }

    public boolean i() {
        return t().signum() == 0;
    }

    public abstract h86 j(h86 h86Var);

    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return j(h86Var).r(h86Var2.j(h86Var3));
    }

    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return j(h86Var).a(h86Var2.j(h86Var3));
    }

    public abstract h86 m();

    public abstract h86 n();

    public abstract h86 o();

    public h86 p(h86 h86Var, h86 h86Var2) {
        return o().a(h86Var.j(h86Var2));
    }

    public h86 q(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this = this.o();
        }
        return this;
    }

    public abstract h86 r(h86 h86Var);

    public boolean s() {
        return t().testBit(0);
    }

    public abstract BigInteger t();

    public String toString() {
        return t().toString(16);
    }

    public static class a extends h86 {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f12050c;
        public u8b d;

        public a(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.a = 2;
                this.f12050c = new int[]{i2};
            } else {
                if (i3 >= i4) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i3 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.a = 3;
                this.f12050c = new int[]{i2, i3, i4};
            }
            this.b = i;
            this.d = new u8b(bigInteger);
        }

        public static void u(h86 h86Var, h86 h86Var2) {
            if (!(h86Var instanceof a) || !(h86Var2 instanceof a)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            a aVar = (a) h86Var;
            a aVar2 = (a) h86Var2;
            if (aVar.a != aVar2.a) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (aVar.b != aVar2.b || !eh0.c(aVar.f12050c, aVar2.f12050c)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 a(h86 h86Var) {
            u8b u8bVar = (u8b) this.d.clone();
            u8bVar.f(((a) h86Var).d, 0);
            return new a(this.b, this.f12050c, u8bVar);
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 b() {
            return new a(this.b, this.f12050c, this.d.d());
        }

        @Override // com.oplus.aiunit.vision.h86
        public int c() {
            return this.d.m();
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 d(h86 h86Var) {
            return j(h86Var.g());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.a == aVar.a && eh0.c(this.f12050c, aVar.f12050c) && this.d.equals(aVar.d);
        }

        @Override // com.oplus.aiunit.vision.h86
        public int f() {
            return this.b;
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 g() {
            int i = this.b;
            int[] iArr = this.f12050c;
            return new a(i, iArr, this.d.z(i, iArr));
        }

        @Override // com.oplus.aiunit.vision.h86
        public boolean h() {
            return this.d.x();
        }

        public int hashCode() {
            return eh0.r(this.f12050c) ^ (this.d.hashCode() ^ this.b);
        }

        @Override // com.oplus.aiunit.vision.h86
        public boolean i() {
            return this.d.y();
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 j(h86 h86Var) {
            int i = this.b;
            int[] iArr = this.f12050c;
            return new a(i, iArr, this.d.A(((a) h86Var).d, i, iArr));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
            return l(h86Var, h86Var2, h86Var3);
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
            u8b u8bVar = this.d;
            u8b u8bVar2 = ((a) h86Var).d;
            u8b u8bVar3 = ((a) h86Var2).d;
            u8b u8bVar4 = ((a) h86Var3).d;
            u8b u8bVarD = u8bVar.D(u8bVar2, this.b, this.f12050c);
            u8b u8bVarD2 = u8bVar3.D(u8bVar4, this.b, this.f12050c);
            if (u8bVarD == u8bVar || u8bVarD == u8bVar2) {
                u8bVarD = (u8b) u8bVarD.clone();
            }
            u8bVarD.f(u8bVarD2, 0);
            u8bVarD.F(this.b, this.f12050c);
            return new a(this.b, this.f12050c, u8bVarD);
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 m() {
            return this;
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 n() {
            return (this.d.y() || this.d.x()) ? this : q(this.b - 1);
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 o() {
            int i = this.b;
            int[] iArr = this.f12050c;
            return new a(i, iArr, this.d.B(i, iArr));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 p(h86 h86Var, h86 h86Var2) {
            u8b u8bVar = this.d;
            u8b u8bVar2 = ((a) h86Var).d;
            u8b u8bVar3 = ((a) h86Var2).d;
            u8b u8bVarP = u8bVar.P(this.b, this.f12050c);
            u8b u8bVarD = u8bVar2.D(u8bVar3, this.b, this.f12050c);
            if (u8bVarP == u8bVar) {
                u8bVarP = (u8b) u8bVarP.clone();
            }
            u8bVarP.f(u8bVarD, 0);
            u8bVarP.F(this.b, this.f12050c);
            return new a(this.b, this.f12050c, u8bVarP);
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 q(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.b;
            int[] iArr = this.f12050c;
            return new a(i2, iArr, this.d.C(i, i2, iArr));
        }

        @Override // com.oplus.aiunit.vision.h86
        public h86 r(h86 h86Var) {
            return a(h86Var);
        }

        @Override // com.oplus.aiunit.vision.h86
        public boolean s() {
            return this.d.S();
        }

        @Override // com.oplus.aiunit.vision.h86
        public BigInteger t() {
            return this.d.T();
        }

        public a(int i, int[] iArr, u8b u8bVar) {
            this.b = i;
            this.a = iArr.length == 1 ? 2 : 3;
            this.f12050c = iArr;
            this.d = u8bVar;
        }
    }
}
