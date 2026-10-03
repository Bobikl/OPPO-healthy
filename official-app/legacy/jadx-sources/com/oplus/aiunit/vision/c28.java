package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class c28 extends m1 {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f9921j;
    public k1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k1 f9922l;

    public c28(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.i = i;
        this.f9921j = new k1(bigInteger);
        this.k = new k1(bigInteger2);
        this.f9922l = new k1(bigInteger3);
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(this.i));
        g1Var.a(this.f9921j);
        g1Var.a(this.k);
        g1Var.a(this.f9922l);
        return new xj4(g1Var);
    }

    public BigInteger f() {
        return this.f9922l.n();
    }

    public BigInteger g() {
        return this.f9921j.n();
    }

    public BigInteger h() {
        return this.k.n();
    }
}
