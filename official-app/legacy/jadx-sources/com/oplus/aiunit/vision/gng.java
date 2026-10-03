package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class gng extends h86 {
    public long[] a;

    public gng(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.a = fng.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        long[] jArrF = yec.f();
        fng.a(this.a, ((gng) h86Var).a, jArrF);
        return new gng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        long[] jArrF = yec.f();
        fng.c(this.a, jArrF);
        return new gng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        return j(h86Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gng) {
            return yec.k(this.a, ((gng) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return 131;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        long[] jArrF = yec.f();
        fng.i(this.a, jArrF);
        return new gng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return yec.r(this.a);
    }

    public int hashCode() {
        return eh0.t(this.a, 0, 3) ^ 131832;
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return yec.t(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        long[] jArrF = yec.f();
        fng.j(this.a, ((gng) h86Var).a, jArrF);
        return new gng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return l(h86Var, h86Var2, h86Var3);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        long[] jArr = this.a;
        long[] jArr2 = ((gng) h86Var).a;
        long[] jArr3 = ((gng) h86Var2).a;
        long[] jArr4 = ((gng) h86Var3).a;
        long[] jArrJ = gfc.j(5);
        fng.k(jArr, jArr2, jArrJ);
        fng.k(jArr3, jArr4, jArrJ);
        long[] jArrF = yec.f();
        fng.l(jArrJ, jArrF);
        return new gng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        long[] jArrF = yec.f();
        fng.n(this.a, jArrF);
        return new gng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        long[] jArrF = yec.f();
        fng.o(this.a, jArrF);
        return new gng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 p(h86 h86Var, h86 h86Var2) {
        long[] jArr = this.a;
        long[] jArr2 = ((gng) h86Var).a;
        long[] jArr3 = ((gng) h86Var2).a;
        long[] jArrJ = gfc.j(5);
        fng.p(jArr, jArrJ);
        fng.k(jArr2, jArr3, jArrJ);
        long[] jArrF = yec.f();
        fng.l(jArrJ, jArrF);
        return new gng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrF = yec.f();
        fng.q(this.a, i, jArrF);
        return new gng(jArrF);
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
        return yec.G(this.a);
    }

    public gng() {
        this.a = yec.f();
    }

    public gng(long[] jArr) {
        this.a = jArr;
    }
}
