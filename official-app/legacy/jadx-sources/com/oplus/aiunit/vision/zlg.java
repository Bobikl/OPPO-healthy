package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class zlg extends h86 {
    public static final BigInteger Q = xlg.q;
    public int[] a;

    public zlg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.a = ylg.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrE = yec.e();
        ylg.a(this.a, ((zlg) h86Var).a, iArrE);
        return new zlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrE = yec.e();
        ylg.b(this.a, iArrE);
        return new zlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrE = yec.e();
        c2c.d(ylg.a, ((zlg) h86Var).a, iArrE);
        ylg.e(iArrE, this.a, iArrE);
        return new zlg(iArrE);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zlg) {
            return yec.j(this.a, ((zlg) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return Q.bitLength();
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        int[] iArrE = yec.e();
        c2c.d(ylg.a, this.a, iArrE);
        return new zlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return yec.q(this.a);
    }

    public int hashCode() {
        return eh0.s(this.a, 0, 6) ^ Q.hashCode();
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return yec.s(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        int[] iArrE = yec.e();
        ylg.e(this.a, ((zlg) h86Var).a, iArrE);
        return new zlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrE = yec.e();
        ylg.g(this.a, iArrE);
        return new zlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (yec.s(iArr) || yec.q(iArr)) {
            return this;
        }
        int[] iArrE = yec.e();
        int[] iArrE2 = yec.e();
        ylg.j(iArr, iArrE);
        ylg.e(iArrE, iArr, iArrE);
        ylg.k(iArrE, 2, iArrE2);
        ylg.e(iArrE2, iArrE, iArrE2);
        ylg.k(iArrE2, 4, iArrE);
        ylg.e(iArrE, iArrE2, iArrE);
        ylg.k(iArrE, 8, iArrE2);
        ylg.e(iArrE2, iArrE, iArrE2);
        ylg.k(iArrE2, 16, iArrE);
        ylg.e(iArrE, iArrE2, iArrE);
        ylg.k(iArrE, 32, iArrE2);
        ylg.e(iArrE2, iArrE, iArrE2);
        ylg.k(iArrE2, 64, iArrE);
        ylg.e(iArrE, iArrE2, iArrE);
        ylg.k(iArrE, 62, iArrE);
        ylg.j(iArrE, iArrE2);
        if (yec.j(iArr, iArrE2)) {
            return new zlg(iArrE);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrE = yec.e();
        ylg.j(this.a, iArrE);
        return new zlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrE = yec.e();
        ylg.m(this.a, ((zlg) h86Var).a, iArrE);
        return new zlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return yec.n(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return yec.F(this.a);
    }

    public zlg() {
        this.a = yec.e();
    }

    public zlg(int[] iArr) {
        this.a = iArr;
    }
}
