package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class kog extends h86 {
    public long[] a;

    public kog(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.a = jog.d(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 a(h86 h86Var) {
        long[] jArrA = bfc.a();
        jog.a(this.a, ((kog) h86Var).a, jArrA);
        return new kog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 b() {
        long[] jArrA = bfc.a();
        jog.c(this.a, jArrA);
        return new kog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 d(h86 h86Var) {
        return j(h86Var.g());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kog) {
            return bfc.c(this.a, ((kog) obj).a);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.h86
    public int f() {
        return 283;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 g() {
        long[] jArrA = bfc.a();
        jog.j(this.a, jArrA);
        return new kog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean h() {
        return bfc.e(this.a);
    }

    public int hashCode() {
        return eh0.t(this.a, 0, 5) ^ 2831275;
    }

    @Override // com.oplus.aiunit.vision.h86
    public boolean i() {
        return bfc.f(this.a);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 j(h86 h86Var) {
        long[] jArrA = bfc.a();
        jog.k(this.a, ((kog) h86Var).a, jArrA);
        return new kog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 k(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        return l(h86Var, h86Var2, h86Var3);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 l(h86 h86Var, h86 h86Var2, h86 h86Var3) {
        long[] jArr = this.a;
        long[] jArr2 = ((kog) h86Var).a;
        long[] jArr3 = ((kog) h86Var2).a;
        long[] jArr4 = ((kog) h86Var3).a;
        long[] jArrJ = gfc.j(9);
        jog.l(jArr, jArr2, jArrJ);
        jog.l(jArr3, jArr4, jArrJ);
        long[] jArrA = bfc.a();
        jog.m(jArrJ, jArrA);
        return new kog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 m() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 n() {
        long[] jArrA = bfc.a();
        jog.o(this.a, jArrA);
        return new kog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 o() {
        long[] jArrA = bfc.a();
        jog.p(this.a, jArrA);
        return new kog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 p(h86 h86Var, h86 h86Var2) {
        long[] jArr = this.a;
        long[] jArr2 = ((kog) h86Var).a;
        long[] jArr3 = ((kog) h86Var2).a;
        long[] jArrJ = gfc.j(9);
        jog.q(jArr, jArrJ);
        jog.l(jArr2, jArr3, jArrJ);
        long[] jArrA = bfc.a();
        jog.m(jArrJ, jArrA);
        return new kog(jArrA);
    }

    @Override // com.oplus.aiunit.vision.h86
    public h86 q(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArrA = bfc.a();
        jog.r(this.a, i, jArrA);
        return new kog(jArrA);
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
        return bfc.g(this.a);
    }

    public kog() {
        this.a = bfc.a();
    }

    public kog(long[] jArr) {
        this.a = jArr;
    }
}
