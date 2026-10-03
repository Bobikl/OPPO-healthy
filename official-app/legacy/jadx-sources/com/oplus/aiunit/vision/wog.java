package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class wog extends h86 {
    public long[] a;

    public wog(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.a = vog.g(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        long[] jArrA = ffc.a();
        vog.b(this.a, ((wog) h86Var).a, jArrA);
        return new wog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        long[] jArrA = ffc.a();
        vog.f(this.a, jArrA);
        return new wog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        return j(h86Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wog) {
            return ffc.c(this.a, ((wog) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return 571;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        long[] jArrA = ffc.a();
        vog.k(this.a, jArrA);
        return new wog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return ffc.e(this.a);
    }

    public int hashCode() {
        return eh0.t(this.a, 0, 9) ^ 5711052;
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return ffc.f(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        long[] jArrA = ffc.a();
        vog.l(this.a, ((wog) h86Var).a, jArrA);
        return new wog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return l(h86Var, h86Var2, h86Var3);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        long[] jArr = this.a;
        long[] jArr2 = ((wog) h86Var).a;
        long[] jArr3 = ((wog) h86Var2).a;
        long[] jArr4 = ((wog) h86Var3).a;
        long[] jArrB = ffc.b();
        vog.m(jArr, jArr2, jArrB);
        vog.m(jArr3, jArr4, jArrB);
        long[] jArrA = ffc.a();
        vog.q(jArrB, jArrA);
        return new wog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        long[] jArrA = ffc.a();
        vog.s(this.a, jArrA);
        return new wog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        long[] jArrA = ffc.a();
        vog.t(this.a, jArrA);
        return new wog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 p(h86 h86Var, h86 h86Var2) {
        long[] jArr = this.a;
        long[] jArr2 = ((wog) h86Var).a;
        long[] jArr3 = ((wog) h86Var2).a;
        long[] jArrB = ffc.b();
        vog.u(jArr, jArrB);
        vog.m(jArr2, jArr3, jArrB);
        long[] jArrA = ffc.a();
        vog.q(jArrB, jArrA);
        return new wog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrA = ffc.a();
        vog.v(this.a, i, jArrA);
        return new wog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 r(h86 h86Var) {
        return a(h86Var);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean s() {
        return (this.a[0] & 1) != 0;
    }

    @Override // com.oplus.aiunit.vision.h86
    public BigInteger t() {
        return ffc.g(this.a);
    }

    public wog() {
        this.a = ffc.a();
    }

    public wog(long[] jArr) {
        this.a = jArr;
    }
}
