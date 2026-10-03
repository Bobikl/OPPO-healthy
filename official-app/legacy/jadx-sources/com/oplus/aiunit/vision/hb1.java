package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class hb1 extends m1 {
    public d1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f12089j;

    public hb1(s1 s1Var) {
        this.i = d1.o(false);
        this.f12089j = null;
        if (s1Var.size() == 0) {
            this.i = null;
            this.f12089j = null;
            return;
        }
        if (s1Var.p(0) instanceof d1) {
            this.i = d1.n(s1Var.p(0));
        } else {
            this.i = null;
            this.f12089j = k1.m(s1Var.p(0));
        }
        if (s1Var.size() > 1) {
            if (this.i == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.f12089j = k1.m(s1Var.p(1));
        }
    }

    public static hb1 f(Object obj) {
        if (obj instanceof hb1) {
            return (hb1) obj;
        }
        if (obj instanceof z4m) {
            return f(z4m.a((z4m) obj));
        }
        if (obj != null) {
            return new hb1(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        d1 d1Var = this.i;
        if (d1Var != null) {
            g1Var.a(d1Var);
        }
        k1 k1Var = this.f12089j;
        if (k1Var != null) {
            g1Var.a(k1Var);
        }
        return new xj4(g1Var);
    }

    public BigInteger g() {
        k1 k1Var = this.f12089j;
        if (k1Var != null) {
            return k1Var.o();
        }
        return null;
    }

    public boolean h() {
        d1 d1Var = this.i;
        return d1Var != null && d1Var.p();
    }

    public String toString() {
        if (this.f12089j != null) {
            return "BasicConstraints: isCa(" + h() + "), pathLenConstraint = " + this.f12089j.o();
        }
        if (this.i == null) {
            return "BasicConstraints: isCa(false)";
        }
        return "BasicConstraints: isCa(" + h() + ")";
    }
}
