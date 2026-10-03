package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class pi6 extends m1 {
    public k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f15377j;

    public pi6(BigInteger bigInteger, BigInteger bigInteger2) {
        this.i = new k1(bigInteger);
        this.f15377j = new k1(bigInteger2);
    }

    public static pi6 g(Object obj) {
        if (obj instanceof pi6) {
            return (pi6) obj;
        }
        if (obj != null) {
            return new pi6(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f15377j);
        return new xj4(g1Var);
    }

    public BigInteger f() {
        return this.f15377j.n();
    }

    public BigInteger h() {
        return this.i.n();
    }

    public pi6(s1 s1Var) {
        Enumeration enumerationQ = s1Var.q();
        this.i = (k1) enumerationQ.nextElement();
        this.f15377j = (k1) enumerationQ.nextElement();
    }
}
