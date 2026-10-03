package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class gog extends h86 {
    public long[] a;

    public gog(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.a = fog.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        long[] jArrG = afc.g();
        fog.a(this.a, ((gog) h86Var).a, jArrG);
        return new gog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        long[] jArrG = afc.g();
        fog.c(this.a, jArrG);
        return new gog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        return j(h86Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gog) {
            return afc.l(this.a, ((gog) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return 239;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        long[] jArrG = afc.g();
        fog.j(this.a, jArrG);
        return new gog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return afc.s(this.a);
    }

    public int hashCode() {
        return eh0.t(this.a, 0, 4) ^ 23900158;
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return afc.u(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        long[] jArrG = afc.g();
        fog.k(this.a, ((gog) h86Var).a, jArrG);
        return new gog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return l(h86Var, h86Var2, h86Var3);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        long[] jArr = this.a;
        long[] jArr2 = ((gog) h86Var).a;
        long[] jArr3 = ((gog) h86Var2).a;
        long[] jArr4 = ((gog) h86Var3).a;
        long[] jArrI = afc.i();
        fog.l(jArr, jArr2, jArrI);
        fog.l(jArr3, jArr4, jArrI);
        long[] jArrG = afc.g();
        fog.m(jArrI, jArrG);
        return new gog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        long[] jArrG = afc.g();
        fog.o(this.a, jArrG);
        return new gog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        long[] jArrG = afc.g();
        fog.p(this.a, jArrG);
        return new gog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 p(h86 h86Var, h86 h86Var2) {
        long[] jArr = this.a;
        long[] jArr2 = ((gog) h86Var).a;
        long[] jArr3 = ((gog) h86Var2).a;
        long[] jArrI = afc.i();
        fog.q(jArr, jArrI);
        fog.l(jArr2, jArr3, jArrI);
        long[] jArrG = afc.g();
        fog.m(jArrI, jArrG);
        return new gog(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrG = afc.g();
        fog.r(this.a, i, jArrG);
        return new gog(jArrG);
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

    public gog() {
        this.a = afc.g();
    }

    public gog(long[] jArr) {
        this.a = jArr;
    }
}
