package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class qog extends h86 {
    public long[] a;

    public qog(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.a = pog.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        long[] jArrA = dfc.a();
        pog.a(this.a, ((qog) h86Var).a, jArrA);
        return new qog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        long[] jArrA = dfc.a();
        pog.c(this.a, jArrA);
        return new qog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        return j(h86Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qog) {
            return dfc.c(this.a, ((qog) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return 409;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        long[] jArrA = dfc.a();
        pog.j(this.a, jArrA);
        return new qog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return dfc.e(this.a);
    }

    public int hashCode() {
        return eh0.t(this.a, 0, 7) ^ 4090087;
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return dfc.f(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        long[] jArrA = dfc.a();
        pog.k(this.a, ((qog) h86Var).a, jArrA);
        return new qog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return l(h86Var, h86Var2, h86Var3);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        long[] jArr = this.a;
        long[] jArr2 = ((qog) h86Var).a;
        long[] jArr3 = ((qog) h86Var2).a;
        long[] jArr4 = ((qog) h86Var3).a;
        long[] jArrJ = gfc.j(13);
        pog.l(jArr, jArr2, jArrJ);
        pog.l(jArr3, jArr4, jArrJ);
        long[] jArrA = dfc.a();
        pog.m(jArrJ, jArrA);
        return new qog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        long[] jArrA = dfc.a();
        pog.o(this.a, jArrA);
        return new qog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        long[] jArrA = dfc.a();
        pog.p(this.a, jArrA);
        return new qog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 p(h86 h86Var, h86 h86Var2) {
        long[] jArr = this.a;
        long[] jArr2 = ((qog) h86Var).a;
        long[] jArr3 = ((qog) h86Var2).a;
        long[] jArrJ = gfc.j(13);
        pog.q(jArr, jArrJ);
        pog.l(jArr2, jArr3, jArrJ);
        long[] jArrA = dfc.a();
        pog.m(jArrJ, jArrA);
        return new qog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrA = dfc.a();
        pog.r(this.a, i, jArrA);
        return new qog(jArrA);
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
        return dfc.g(this.a);
    }

    public qog() {
        this.a = dfc.a();
    }

    public qog(long[] jArr) {
        this.a = jArr;
    }
}
