package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class aog extends h86 {
    public long[] a;

    public aog(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.a = zng.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        long[] jArrG = afc.g();
        zng.a(this.a, ((aog) h86Var).a, jArrG);
        return new aog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        long[] jArrG = afc.g();
        zng.c(this.a, jArrG);
        return new aog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        return j(h86Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aog) {
            return afc.l(this.a, ((aog) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return 233;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        long[] jArrG = afc.g();
        zng.j(this.a, jArrG);
        return new aog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return afc.s(this.a);
    }

    public int hashCode() {
        return eh0.t(this.a, 0, 4) ^ 2330074;
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return afc.u(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        long[] jArrG = afc.g();
        zng.k(this.a, ((aog) h86Var).a, jArrG);
        return new aog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return l(h86Var, h86Var2, h86Var3);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        long[] jArr = this.a;
        long[] jArr2 = ((aog) h86Var).a;
        long[] jArr3 = ((aog) h86Var2).a;
        long[] jArr4 = ((aog) h86Var3).a;
        long[] jArrI = afc.i();
        zng.l(jArr, jArr2, jArrI);
        zng.l(jArr3, jArr4, jArrI);
        long[] jArrG = afc.g();
        zng.m(jArrI, jArrG);
        return new aog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        long[] jArrG = afc.g();
        zng.o(this.a, jArrG);
        return new aog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        long[] jArrG = afc.g();
        zng.p(this.a, jArrG);
        return new aog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 p(h86 h86Var, h86 h86Var2) {
        long[] jArr = this.a;
        long[] jArr2 = ((aog) h86Var).a;
        long[] jArr3 = ((aog) h86Var2).a;
        long[] jArrI = afc.i();
        zng.q(jArr, jArrI);
        zng.l(jArr2, jArr3, jArrI);
        long[] jArrG = afc.g();
        zng.m(jArrI, jArrG);
        return new aog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrG = afc.g();
        zng.r(this.a, i, jArrG);
        return new aog(jArrG);
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
        return afc.I(this.a);
    }

    public aog() {
        this.a = afc.g();
    }

    public aog(long[] jArr) {
        this.a = jArr;
    }
}
