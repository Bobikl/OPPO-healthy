package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class mng extends h86 {
    public long[] a;

    public mng(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.a = lng.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        long[] jArrF = yec.f();
        lng.a(this.a, ((mng) h86Var).a, jArrF);
        return new mng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        long[] jArrF = yec.f();
        lng.c(this.a, jArrF);
        return new mng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        return j(h86Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mng) {
            return yec.k(this.a, ((mng) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return 163;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        long[] jArrF = yec.f();
        lng.i(this.a, jArrF);
        return new mng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return yec.r(this.a);
    }

    public int hashCode() {
        return eh0.t(this.a, 0, 3) ^ 163763;
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return yec.t(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        long[] jArrF = yec.f();
        lng.j(this.a, ((mng) h86Var).a, jArrF);
        return new mng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return l(h86Var, h86Var2, h86Var3);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        long[] jArr = this.a;
        long[] jArr2 = ((mng) h86Var).a;
        long[] jArr3 = ((mng) h86Var2).a;
        long[] jArr4 = ((mng) h86Var3).a;
        long[] jArrH = yec.h();
        lng.k(jArr, jArr2, jArrH);
        lng.k(jArr3, jArr4, jArrH);
        long[] jArrF = yec.f();
        lng.l(jArrH, jArrF);
        return new mng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        long[] jArrF = yec.f();
        lng.n(this.a, jArrF);
        return new mng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        long[] jArrF = yec.f();
        lng.o(this.a, jArrF);
        return new mng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 p(h86 h86Var, h86 h86Var2) {
        long[] jArr = this.a;
        long[] jArr2 = ((mng) h86Var).a;
        long[] jArr3 = ((mng) h86Var2).a;
        long[] jArrH = yec.h();
        lng.p(jArr, jArrH);
        lng.k(jArr2, jArr3, jArrH);
        long[] jArrF = yec.f();
        lng.l(jArrH, jArrF);
        return new mng(jArrF);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrF = yec.f();
        lng.q(this.a, i, jArrF);
        return new mng(jArrF);
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

    public mng() {
        this.a = yec.f();
    }

    public mng(long[] jArr) {
        this.a = jArr;
    }
}
