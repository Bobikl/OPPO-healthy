package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class ang extends h86 {
    public long[] a;

    public ang(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.a = zmg.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        long[] jArrD = wec.d();
        zmg.a(this.a, ((ang) h86Var).a, jArrD);
        return new ang(jArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        long[] jArrD = wec.d();
        zmg.c(this.a, jArrD);
        return new ang(jArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        return j(h86Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ang) {
            return wec.h(this.a, ((ang) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return 113;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        long[] jArrD = wec.d();
        zmg.h(this.a, jArrD);
        return new ang(jArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return wec.n(this.a);
    }

    public int hashCode() {
        return eh0.t(this.a, 0, 2) ^ 113009;
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return wec.p(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        long[] jArrD = wec.d();
        zmg.i(this.a, ((ang) h86Var).a, jArrD);
        return new ang(jArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return l(h86Var, h86Var2, h86Var3);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        long[] jArr = this.a;
        long[] jArr2 = ((ang) h86Var).a;
        long[] jArr3 = ((ang) h86Var2).a;
        long[] jArr4 = ((ang) h86Var3).a;
        long[] jArrF = wec.f();
        zmg.j(jArr, jArr2, jArrF);
        zmg.j(jArr3, jArr4, jArrF);
        long[] jArrD = wec.d();
        zmg.k(jArrF, jArrD);
        return new ang(jArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        long[] jArrD = wec.d();
        zmg.m(this.a, jArrD);
        return new ang(jArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        long[] jArrD = wec.d();
        zmg.n(this.a, jArrD);
        return new ang(jArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 p(h86 h86Var, h86 h86Var2) {
        long[] jArr = this.a;
        long[] jArr2 = ((ang) h86Var).a;
        long[] jArr3 = ((ang) h86Var2).a;
        long[] jArrF = wec.f();
        zmg.o(jArr, jArrF);
        zmg.j(jArr2, jArr3, jArrF);
        long[] jArrD = wec.d();
        zmg.k(jArrF, jArrD);
        return new ang(jArrD);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrD = wec.d();
        zmg.p(this.a, i, jArrD);
        return new ang(jArrD);
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
        return wec.w(this.a);
    }

    public ang() {
        this.a = wec.d();
    }

    public ang(long[] jArr) {
        this.a = jArr;
    }
}
