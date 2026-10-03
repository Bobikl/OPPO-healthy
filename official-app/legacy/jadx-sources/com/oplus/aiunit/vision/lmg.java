package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class lmg extends h86 {
    public static final BigInteger Q = jmg.q;
    public int[] a;

    public lmg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.a = kmg.c(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrF = afc.f();
        kmg.a(this.a, ((lmg) h86Var).a, iArrF);
        return new lmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrF = afc.f();
        kmg.b(this.a, iArrF);
        return new lmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrF = afc.f();
        c2c.d(kmg.a, ((lmg) h86Var).a, iArrF);
        kmg.d(iArrF, this.a, iArrF);
        return new lmg(iArrF);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lmg) {
            return afc.k(this.a, ((lmg) obj).a);
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
        c2c.d(kmg.a, this.a, iArrF);
        return new lmg(iArrF);
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
        kmg.d(this.a, ((lmg) h86Var).a, iArrF);
        return new lmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrF = afc.f();
        kmg.f(this.a, iArrF);
        return new lmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (afc.t(iArr) || afc.r(iArr)) {
            return this;
        }
        int[] iArrF = afc.f();
        kmg.i(iArr, iArrF);
        kmg.d(iArrF, iArr, iArrF);
        int[] iArrF2 = afc.f();
        kmg.i(iArrF, iArrF2);
        kmg.d(iArrF2, iArr, iArrF2);
        int[] iArrF3 = afc.f();
        kmg.j(iArrF2, 3, iArrF3);
        kmg.d(iArrF3, iArrF2, iArrF3);
        kmg.j(iArrF3, 3, iArrF3);
        kmg.d(iArrF3, iArrF2, iArrF3);
        kmg.j(iArrF3, 2, iArrF3);
        kmg.d(iArrF3, iArrF, iArrF3);
        int[] iArrF4 = afc.f();
        kmg.j(iArrF3, 11, iArrF4);
        kmg.d(iArrF4, iArrF3, iArrF4);
        kmg.j(iArrF4, 22, iArrF3);
        kmg.d(iArrF3, iArrF4, iArrF3);
        int[] iArrF5 = afc.f();
        kmg.j(iArrF3, 44, iArrF5);
        kmg.d(iArrF5, iArrF3, iArrF5);
        int[] iArrF6 = afc.f();
        kmg.j(iArrF5, 88, iArrF6);
        kmg.d(iArrF6, iArrF5, iArrF6);
        kmg.j(iArrF6, 44, iArrF5);
        kmg.d(iArrF5, iArrF3, iArrF5);
        kmg.j(iArrF5, 3, iArrF3);
        kmg.d(iArrF3, iArrF2, iArrF3);
        kmg.j(iArrF3, 23, iArrF3);
        kmg.d(iArrF3, iArrF4, iArrF3);
        kmg.j(iArrF3, 6, iArrF3);
        kmg.d(iArrF3, iArrF, iArrF3);
        kmg.j(iArrF3, 2, iArrF3);
        kmg.i(iArrF3, iArrF);
        if (afc.k(iArr, iArrF)) {
            return new lmg(iArrF3);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrF = afc.f();
        kmg.i(this.a, iArrF);
        return new lmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrF = afc.f();
        kmg.k(this.a, ((lmg) h86Var).a, iArrF);
        return new lmg(iArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return afc.o(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return afc.H(this.a);
    }

    public lmg() {
        this.a = afc.f();
    }

    public lmg(int[] iArr) {
        this.a = iArr;
    }
}
