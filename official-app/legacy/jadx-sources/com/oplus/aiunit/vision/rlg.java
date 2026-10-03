package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class rlg extends h86 {
    public static final BigInteger Q = plg.q;
    public int[] a;

    public rlg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.a = qlg.c(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrC = xec.c();
        qlg.a(this.a, ((rlg) h86Var).a, iArrC);
        return new rlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrC = xec.c();
        qlg.b(this.a, iArrC);
        return new rlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrC = xec.c();
        c2c.d(qlg.a, ((rlg) h86Var).a, iArrC);
        qlg.d(iArrC, this.a, iArrC);
        return new rlg(iArrC);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rlg) {
            return xec.e(this.a, ((rlg) obj).a);
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
        c2c.d(qlg.a, this.a, iArrC);
        return new rlg(iArrC);
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
        qlg.d(this.a, ((rlg) h86Var).a, iArrC);
        return new rlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrC = xec.c();
        qlg.f(this.a, iArrC);
        return new rlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (xec.j(iArr) || xec.i(iArr)) {
            return this;
        }
        int[] iArrC = xec.c();
        qlg.i(iArr, iArrC);
        qlg.d(iArrC, iArr, iArrC);
        int[] iArrC2 = xec.c();
        qlg.i(iArrC, iArrC2);
        qlg.d(iArrC2, iArr, iArrC2);
        int[] iArrC3 = xec.c();
        qlg.i(iArrC2, iArrC3);
        qlg.d(iArrC3, iArr, iArrC3);
        int[] iArrC4 = xec.c();
        qlg.j(iArrC3, 3, iArrC4);
        qlg.d(iArrC4, iArrC2, iArrC4);
        qlg.j(iArrC4, 7, iArrC3);
        qlg.d(iArrC3, iArrC4, iArrC3);
        qlg.j(iArrC3, 3, iArrC4);
        qlg.d(iArrC4, iArrC2, iArrC4);
        int[] iArrC5 = xec.c();
        qlg.j(iArrC4, 14, iArrC5);
        qlg.d(iArrC5, iArrC3, iArrC5);
        qlg.j(iArrC5, 31, iArrC3);
        qlg.d(iArrC3, iArrC5, iArrC3);
        qlg.j(iArrC3, 62, iArrC5);
        qlg.d(iArrC5, iArrC3, iArrC5);
        qlg.j(iArrC5, 3, iArrC3);
        qlg.d(iArrC3, iArrC2, iArrC3);
        qlg.j(iArrC3, 18, iArrC3);
        qlg.d(iArrC3, iArrC4, iArrC3);
        qlg.j(iArrC3, 2, iArrC3);
        qlg.d(iArrC3, iArr, iArrC3);
        qlg.j(iArrC3, 3, iArrC3);
        qlg.d(iArrC3, iArrC, iArrC3);
        qlg.j(iArrC3, 6, iArrC3);
        qlg.d(iArrC3, iArrC2, iArrC3);
        qlg.j(iArrC3, 2, iArrC3);
        qlg.d(iArrC3, iArr, iArrC3);
        qlg.i(iArrC3, iArrC);
        if (xec.e(iArr, iArrC)) {
            return new rlg(iArrC3);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrC = xec.c();
        qlg.i(this.a, iArrC);
        return new rlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrC = xec.c();
        qlg.k(this.a, ((rlg) h86Var).a, iArrC);
        return new rlg(iArrC);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return xec.g(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return xec.t(this.a);
    }

    public rlg() {
        this.a = xec.c();
    }

    public rlg(int[] iArr) {
        this.a = iArr;
    }
}
