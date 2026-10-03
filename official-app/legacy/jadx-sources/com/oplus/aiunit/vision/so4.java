package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class so4 extends m1 {
    public k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f16668j;
    public k1 k;

    public so4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.i = new k1(bigInteger);
        this.f16668j = new k1(bigInteger2);
        this.k = new k1(bigInteger3);
    }

    public static so4 g(Object obj) {
        if (obj instanceof so4) {
            return (so4) obj;
        }
        if (obj != null) {
            return new so4(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f16668j);
        g1Var.a(this.k);
        return new xj4(g1Var);
    }

    public BigInteger f() {
        return this.k.n();
    }

    public BigInteger h() {
        return this.i.n();
    }

    public BigInteger i() {
        return this.f16668j.n();
    }

    public so4(s1 s1Var) {
        if (s1Var.size() == 3) {
            Enumeration enumerationQ = s1Var.q();
            this.i = k1.m(enumerationQ.nextElement());
            this.f16668j = k1.m(enumerationQ.nextElement());
            this.k = k1.m(enumerationQ.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + s1Var.size());
    }
}
