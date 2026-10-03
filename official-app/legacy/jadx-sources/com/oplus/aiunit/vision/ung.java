package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class ung extends h86 {
    public long[] a;

    public ung(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.a = tng.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        long[] jArrG = afc.g();
        tng.a(this.a, ((ung) h86Var).a, jArrG);
        return new ung(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        long[] jArrG = afc.g();
        tng.c(this.a, jArrG);
        return new ung(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        return j(h86Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ung) {
            return afc.l(this.a, ((ung) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return 193;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        long[] jArrG = afc.g();
        tng.j(this.a, jArrG);
        return new ung(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return afc.s(this.a);
    }

    public int hashCode() {
        return eh0.t(this.a, 0, 4) ^ 1930015;
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return afc.u(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        long[] jArrG = afc.g();
        tng.k(this.a, ((ung) h86Var).a, jArrG);
        return new ung(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return l(h86Var, h86Var2, h86Var3);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        long[] jArr = this.a;
        long[] jArr2 = ((ung) h86Var).a;
        long[] jArr3 = ((ung) h86Var2).a;
        long[] jArr4 = ((ung) h86Var3).a;
        long[] jArrI = afc.i();
        tng.l(jArr, jArr2, jArrI);
        tng.l(jArr3, jArr4, jArrI);
        long[] jArrG = afc.g();
        tng.m(jArrI, jArrG);
        return new ung(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        long[] jArrG = afc.g();
        tng.o(this.a, jArrG);
        return new ung(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        long[] jArrG = afc.g();
        tng.p(this.a, jArrG);
        return new ung(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 p(h86 h86Var, h86 h86Var2) {
        long[] jArr = this.a;
        long[] jArr2 = ((ung) h86Var).a;
        long[] jArr3 = ((ung) h86Var2).a;
        long[] jArrI = afc.i();
        tng.q(jArr, jArrI);
        tng.l(jArr2, jArr3, jArrI);
        long[] jArrG = afc.g();
        tng.m(jArrI, jArrG);
        return new ung(jArrG);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrG = afc.g();
        tng.r(this.a, i, jArrG);
        return new ung(jArrG);
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

    public ung() {
        this.a = afc.g();
    }

    public ung(long[] jArr) {
        this.a = jArr;
    }
}
