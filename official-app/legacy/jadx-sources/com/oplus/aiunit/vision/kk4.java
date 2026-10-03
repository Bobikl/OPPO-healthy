package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class kk4 extends m1 {
    public k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f13317j;
    public k1 k;

    public kk4(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.i = new k1(bigInteger);
        this.f13317j = new k1(bigInteger2);
        if (i != 0) {
            this.k = new k1(i);
        } else {
            this.k = null;
        }
    }

    public static kk4 g(Object obj) {
        if (obj instanceof kk4) {
            return (kk4) obj;
        }
        if (obj != null) {
            return new kk4(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f13317j);
        if (h() != null) {
            g1Var.a(this.k);
        }
        return new xj4(g1Var);
    }

    public BigInteger f() {
        return this.f13317j.n();
    }

    public BigInteger h() {
        k1 k1Var = this.k;
        if (k1Var == null) {
            return null;
        }
        return k1Var.n();
    }

    public BigInteger i() {
        return this.i.n();
    }

    public kk4(s1 s1Var) {
        Enumeration enumerationQ = s1Var.q();
        this.i = k1.m(enumerationQ.nextElement());
        this.f13317j = k1.m(enumerationQ.nextElement());
        if (enumerationQ.hasMoreElements()) {
            this.k = (k1) enumerationQ.nextElement();
        } else {
            this.k = null;
        }
    }
}
