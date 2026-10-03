package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class vlg extends h86 {
    public static final BigInteger Q = tlg.q;
    public int[] a;

    public vlg(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.a = ulg.c(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        int[] iArrE = yec.e();
        ulg.a(this.a, ((vlg) h86Var).a, iArrE);
        return new vlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        int[] iArrE = yec.e();
        ulg.b(this.a, iArrE);
        return new vlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        int[] iArrE = yec.e();
        c2c.d(ulg.a, ((vlg) h86Var).a, iArrE);
        ulg.d(iArrE, this.a, iArrE);
        return new vlg(iArrE);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlg) {
            return yec.j(this.a, ((vlg) obj).a);
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
        c2c.d(ulg.a, this.a, iArrE);
        return new vlg(iArrE);
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
        ulg.d(this.a, ((vlg) h86Var).a, iArrE);
        return new vlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        int[] iArrE = yec.e();
        ulg.f(this.a, iArrE);
        return new vlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        int[] iArr = this.a;
        if (yec.s(iArr) || yec.q(iArr)) {
            return this;
        }
        int[] iArrE = yec.e();
        ulg.i(iArr, iArrE);
        ulg.d(iArrE, iArr, iArrE);
        int[] iArrE2 = yec.e();
        ulg.i(iArrE, iArrE2);
        ulg.d(iArrE2, iArr, iArrE2);
        int[] iArrE3 = yec.e();
        ulg.j(iArrE2, 3, iArrE3);
        ulg.d(iArrE3, iArrE2, iArrE3);
        ulg.j(iArrE3, 2, iArrE3);
        ulg.d(iArrE3, iArrE, iArrE3);
        ulg.j(iArrE3, 8, iArrE);
        ulg.d(iArrE, iArrE3, iArrE);
        ulg.j(iArrE, 3, iArrE3);
        ulg.d(iArrE3, iArrE2, iArrE3);
        int[] iArrE4 = yec.e();
        ulg.j(iArrE3, 16, iArrE4);
        ulg.d(iArrE4, iArrE, iArrE4);
        ulg.j(iArrE4, 35, iArrE);
        ulg.d(iArrE, iArrE4, iArrE);
        ulg.j(iArrE, 70, iArrE4);
        ulg.d(iArrE4, iArrE, iArrE4);
        ulg.j(iArrE4, 19, iArrE);
        ulg.d(iArrE, iArrE3, iArrE);
        ulg.j(iArrE, 20, iArrE);
        ulg.d(iArrE, iArrE3, iArrE);
        ulg.j(iArrE, 4, iArrE);
        ulg.d(iArrE, iArrE2, iArrE);
        ulg.j(iArrE, 6, iArrE);
        ulg.d(iArrE, iArrE2, iArrE);
        ulg.i(iArrE, iArrE);
        ulg.i(iArrE, iArrE2);
        if (yec.j(iArr, iArrE2)) {
            return new vlg(iArrE);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        int[] iArrE = yec.e();
        ulg.i(this.a, iArrE);
        return new vlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        int[] iArrE = yec.e();
        ulg.k(this.a, ((vlg) h86Var).a, iArrE);
        return new vlg(iArrE);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return yec.n(this.a, 0) == 1;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return yec.F(this.a);
    }

    public vlg() {
        this.a = yec.e();
    }

    public vlg(int[] iArr) {
        this.a = iArr;
    }
}
