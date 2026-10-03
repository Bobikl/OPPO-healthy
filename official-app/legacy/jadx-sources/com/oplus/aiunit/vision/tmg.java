package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class tmg extends h86 {
    public static final BigInteger Q = rmg.q;
    public int[] a;

    public tmg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.a = smg.e(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrI = gfc.i(12);
        smg.a(this.a, ((tmg) h86Var).a, iArrI);
        return new tmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrI = gfc.i(12);
        smg.c(this.a, iArrI);
        return new tmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrI = gfc.i(12);
        c2c.d(smg.a, ((tmg) h86Var).a, iArrI);
        smg.f(iArrI, this.a, iArrI);
        return new tmg(iArrI);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tmg) {
            return gfc.m(12, this.a, ((tmg) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return Q.bitLength();
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        int[] iArrI = gfc.i(12);
        c2c.d(smg.a, this.a, iArrI);
        return new tmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return gfc.u(12, this.a);
    }

    public int hashCode() {
        return eh0.s(this.a, 0, 12) ^ Q.hashCode();
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return gfc.v(12, this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        int[] iArrI = gfc.i(12);
        smg.f(this.a, ((tmg) h86Var).a, iArrI);
        return new tmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrI = gfc.i(12);
        smg.g(this.a, iArrI);
        return new tmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (gfc.v(12, iArr) || gfc.u(12, iArr)) {
            return this;
        }
        int[] iArrI = gfc.i(12);
        int[] iArrI2 = gfc.i(12);
        int[] iArrI3 = gfc.i(12);
        int[] iArrI4 = gfc.i(12);
        smg.j(iArr, iArrI);
        smg.f(iArrI, iArr, iArrI);
        smg.k(iArrI, 2, iArrI2);
        smg.f(iArrI2, iArrI, iArrI2);
        smg.j(iArrI2, iArrI2);
        smg.f(iArrI2, iArr, iArrI2);
        smg.k(iArrI2, 5, iArrI3);
        smg.f(iArrI3, iArrI2, iArrI3);
        smg.k(iArrI3, 5, iArrI4);
        smg.f(iArrI4, iArrI2, iArrI4);
        smg.k(iArrI4, 15, iArrI2);
        smg.f(iArrI2, iArrI4, iArrI2);
        smg.k(iArrI2, 2, iArrI3);
        smg.f(iArrI, iArrI3, iArrI);
        smg.k(iArrI3, 28, iArrI3);
        smg.f(iArrI2, iArrI3, iArrI2);
        smg.k(iArrI2, 60, iArrI3);
        smg.f(iArrI3, iArrI2, iArrI3);
        smg.k(iArrI3, 120, iArrI2);
        smg.f(iArrI2, iArrI3, iArrI2);
        smg.k(iArrI2, 15, iArrI2);
        smg.f(iArrI2, iArrI4, iArrI2);
        smg.k(iArrI2, 33, iArrI2);
        smg.f(iArrI2, iArrI, iArrI2);
        smg.k(iArrI2, 64, iArrI2);
        smg.f(iArrI2, iArr, iArrI2);
        smg.k(iArrI2, 30, iArrI);
        smg.j(iArrI, iArrI2);
        if (gfc.m(12, iArr, iArrI2)) {
            return new tmg(iArrI);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrI = gfc.i(12);
        smg.j(this.a, iArrI);
        return new tmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrI = gfc.i(12);
        smg.m(this.a, ((tmg) h86Var).a, iArrI);
        return new tmg(iArrI);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return gfc.o(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return gfc.O(12, this.a);
    }

    public tmg() {
        this.a = gfc.i(12);
    }

    public tmg(int[] iArr) {
        this.a = iArr;
    }
}
