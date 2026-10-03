package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class pmg extends h86 {
    public static final BigInteger Q = nmg.q;
    public int[] a;

    public pmg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.a = omg.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrF = afc.f();
        omg.a(this.a, ((pmg) h86Var).a, iArrF);
        return new pmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrF = afc.f();
        omg.b(this.a, iArrF);
        return new pmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrF = afc.f();
        c2c.d(omg.a, ((pmg) h86Var).a, iArrF);
        omg.e(iArrF, this.a, iArrF);
        return new pmg(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pmg) {
            return afc.k(this.a, ((pmg) obj).a);
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
        c2c.d(omg.a, this.a, iArrF);
        return new pmg(iArrF);
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
        omg.e(this.a, ((pmg) h86Var).a, iArrF);
        return new pmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrF = afc.f();
        omg.g(this.a, iArrF);
        return new pmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (afc.t(iArr) || afc.r(iArr)) {
            return this;
        }
        int[] iArrF = afc.f();
        int[] iArrF2 = afc.f();
        omg.j(iArr, iArrF);
        omg.e(iArrF, iArr, iArrF);
        omg.k(iArrF, 2, iArrF2);
        omg.e(iArrF2, iArrF, iArrF2);
        omg.k(iArrF2, 4, iArrF);
        omg.e(iArrF, iArrF2, iArrF);
        omg.k(iArrF, 8, iArrF2);
        omg.e(iArrF2, iArrF, iArrF2);
        omg.k(iArrF2, 16, iArrF);
        omg.e(iArrF, iArrF2, iArrF);
        omg.k(iArrF, 32, iArrF);
        omg.e(iArrF, iArr, iArrF);
        omg.k(iArrF, 96, iArrF);
        omg.e(iArrF, iArr, iArrF);
        omg.k(iArrF, 94, iArrF);
        omg.j(iArrF, iArrF2);
        if (afc.k(iArr, iArrF2)) {
            return new pmg(iArrF);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrF = afc.f();
        omg.j(this.a, iArrF);
        return new pmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrF = afc.f();
        omg.m(this.a, ((pmg) h86Var).a, iArrF);
        return new pmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return afc.o(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return afc.H(this.a);
    }

    public pmg() {
        this.a = afc.f();
    }

    public pmg(int[] iArr) {
        this.a = iArr;
    }
}
