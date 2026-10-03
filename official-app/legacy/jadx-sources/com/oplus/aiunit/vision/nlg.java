package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class nlg extends h86 {
    public static final BigInteger Q = llg.q;
    public int[] a;

    public nlg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.a = mlg.c(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrC = xec.c();
        mlg.a(this.a, ((nlg) h86Var).a, iArrC);
        return new nlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrC = xec.c();
        mlg.b(this.a, iArrC);
        return new nlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrC = xec.c();
        c2c.d(mlg.a, ((nlg) h86Var).a, iArrC);
        mlg.d(iArrC, this.a, iArrC);
        return new nlg(iArrC);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nlg) {
            return xec.e(this.a, ((nlg) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return Q.bitLength();
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        int[] iArrC = xec.c();
        c2c.d(mlg.a, this.a, iArrC);
        return new nlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return xec.i(this.a);
    }

    public int hashCode() {
        return eh0.s(this.a, 0, 5) ^ Q.hashCode();
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return xec.j(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        int[] iArrC = xec.c();
        mlg.d(this.a, ((nlg) h86Var).a, iArrC);
        return new nlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrC = xec.c();
        mlg.f(this.a, iArrC);
        return new nlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (xec.j(iArr) || xec.i(iArr)) {
            return this;
        }
        int[] iArrC = xec.c();
        mlg.i(iArr, iArrC);
        mlg.d(iArrC, iArr, iArrC);
        int[] iArrC2 = xec.c();
        mlg.j(iArrC, 2, iArrC2);
        mlg.d(iArrC2, iArrC, iArrC2);
        mlg.j(iArrC2, 4, iArrC);
        mlg.d(iArrC, iArrC2, iArrC);
        mlg.j(iArrC, 8, iArrC2);
        mlg.d(iArrC2, iArrC, iArrC2);
        mlg.j(iArrC2, 16, iArrC);
        mlg.d(iArrC, iArrC2, iArrC);
        mlg.j(iArrC, 32, iArrC2);
        mlg.d(iArrC2, iArrC, iArrC2);
        mlg.j(iArrC2, 64, iArrC);
        mlg.d(iArrC, iArrC2, iArrC);
        mlg.i(iArrC, iArrC2);
        mlg.d(iArrC2, iArr, iArrC2);
        mlg.j(iArrC2, 29, iArrC2);
        mlg.i(iArrC2, iArrC);
        if (xec.e(iArr, iArrC)) {
            return new nlg(iArrC2);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrC = xec.c();
        mlg.i(this.a, iArrC);
        return new nlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrC = xec.c();
        mlg.k(this.a, ((nlg) h86Var).a, iArrC);
        return new nlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return xec.g(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return xec.t(this.a);
    }

    public nlg() {
        this.a = xec.c();
    }

    public nlg(int[] iArr) {
        this.a = iArr;
    }
}
