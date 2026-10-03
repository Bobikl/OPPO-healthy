package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class t8g extends h86 {
    public static final BigInteger Q = r8g.q;
    public int[] a;

    public t8g(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.a = s8g.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrF = afc.f();
        s8g.a(this.a, ((t8g) h86Var).a, iArrF);
        return new t8g(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrF = afc.f();
        s8g.b(this.a, iArrF);
        return new t8g(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrF = afc.f();
        c2c.d(s8g.a, ((t8g) h86Var).a, iArrF);
        s8g.e(iArrF, this.a, iArrF);
        return new t8g(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t8g) {
            return afc.k(this.a, ((t8g) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return Q.bitLength();
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        int[] iArrF = afc.f();
        c2c.d(s8g.a, this.a, iArrF);
        return new t8g(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return afc.r(this.a);
    }

    public int hashCode() {
        return eh0.s(this.a, 0, 8) ^ Q.hashCode();
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return afc.t(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        int[] iArrF = afc.f();
        s8g.e(this.a, ((t8g) h86Var).a, iArrF);
        return new t8g(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrF = afc.f();
        s8g.g(this.a, iArrF);
        return new t8g(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (afc.t(iArr) || afc.r(iArr)) {
            return this;
        }
        int[] iArrF = afc.f();
        s8g.j(iArr, iArrF);
        s8g.e(iArrF, iArr, iArrF);
        int[] iArrF2 = afc.f();
        s8g.k(iArrF, 2, iArrF2);
        s8g.e(iArrF2, iArrF, iArrF2);
        int[] iArrF3 = afc.f();
        s8g.k(iArrF2, 2, iArrF3);
        s8g.e(iArrF3, iArrF, iArrF3);
        s8g.k(iArrF3, 6, iArrF);
        s8g.e(iArrF, iArrF3, iArrF);
        int[] iArrF4 = afc.f();
        s8g.k(iArrF, 12, iArrF4);
        s8g.e(iArrF4, iArrF, iArrF4);
        s8g.k(iArrF4, 6, iArrF);
        s8g.e(iArrF, iArrF3, iArrF);
        s8g.j(iArrF, iArrF3);
        s8g.e(iArrF3, iArr, iArrF3);
        s8g.k(iArrF3, 31, iArrF4);
        s8g.e(iArrF4, iArrF3, iArrF);
        s8g.k(iArrF4, 32, iArrF4);
        s8g.e(iArrF4, iArrF, iArrF4);
        s8g.k(iArrF4, 62, iArrF4);
        s8g.e(iArrF4, iArrF, iArrF4);
        s8g.k(iArrF4, 4, iArrF4);
        s8g.e(iArrF4, iArrF2, iArrF4);
        s8g.k(iArrF4, 32, iArrF4);
        s8g.e(iArrF4, iArr, iArrF4);
        s8g.k(iArrF4, 62, iArrF4);
        s8g.j(iArrF4, iArrF2);
        if (afc.k(iArr, iArrF2)) {
            return new t8g(iArrF4);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrF = afc.f();
        s8g.j(this.a, iArrF);
        return new t8g(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrF = afc.f();
        s8g.m(this.a, ((t8g) h86Var).a, iArrF);
        return new t8g(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return afc.o(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return afc.H(this.a);
    }

    public t8g() {
        this.a = afc.f();
    }

    public t8g(int[] iArr) {
        this.a = iArr;
    }
}
