package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class stk extends m1 {
    public kj4 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f16750j;

    public stk(s1 s1Var) {
        if (s1Var.size() == 2) {
            this.i = kj4.r(s1Var.p(0));
            this.f16750j = k1.m(s1Var.p(1));
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + s1Var.size());
        }
    }

    public static stk f(Object obj) {
        if (obj instanceof stk) {
            return (stk) obj;
        }
        if (obj != null) {
            return new stk(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f16750j);
        return new xj4(g1Var);
    }

    public BigInteger g() {
        return this.f16750j.n();
    }

    public byte[] h() {
        return this.i.o();
    }
}
