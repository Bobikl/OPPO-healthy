package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class a9f extends m1 {
    public BigInteger i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BigInteger f9261j;
    public BigInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BigInteger f9262l;
    public BigInteger m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BigInteger f9263n;
    public BigInteger o;
    public BigInteger p;
    public BigInteger q;
    public s1 r;

    public a9f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.r = null;
        this.i = BigInteger.valueOf(0L);
        this.f9261j = bigInteger;
        this.k = bigInteger2;
        this.f9262l = bigInteger3;
        this.m = bigInteger4;
        this.f9263n = bigInteger5;
        this.o = bigInteger6;
        this.p = bigInteger7;
        this.q = bigInteger8;
    }

    public static a9f i(Object obj) {
        if (obj instanceof a9f) {
            return (a9f) obj;
        }
        if (obj != null) {
            return new a9f(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(this.i));
        g1Var.a(new k1(j()));
        g1Var.a(new k1(n()));
        g1Var.a(new k1(m()));
        g1Var.a(new k1(k()));
        g1Var.a(new k1(l()));
        g1Var.a(new k1(g()));
        g1Var.a(new k1(h()));
        g1Var.a(new k1(f()));
        s1 s1Var = this.r;
        if (s1Var != null) {
            g1Var.a(s1Var);
        }
        return new xj4(g1Var);
    }

    public BigInteger f() {
        return this.q;
    }

    public BigInteger g() {
        return this.o;
    }

    public BigInteger h() {
        return this.p;
    }

    public BigInteger j() {
        return this.f9261j;
    }

    public BigInteger k() {
        return this.m;
    }

    public BigInteger l() {
        return this.f9263n;
    }

    public BigInteger m() {
        return this.f9262l;
    }

    public BigInteger n() {
        return this.k;
    }

    public a9f(s1 s1Var) {
        this.r = null;
        Enumeration enumerationQ = s1Var.q();
        BigInteger bigIntegerO = ((k1) enumerationQ.nextElement()).o();
        if (bigIntegerO.intValue() != 0 && bigIntegerO.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.i = bigIntegerO;
        this.f9261j = ((k1) enumerationQ.nextElement()).o();
        this.k = ((k1) enumerationQ.nextElement()).o();
        this.f9262l = ((k1) enumerationQ.nextElement()).o();
        this.m = ((k1) enumerationQ.nextElement()).o();
        this.f9263n = ((k1) enumerationQ.nextElement()).o();
        this.o = ((k1) enumerationQ.nextElement()).o();
        this.p = ((k1) enumerationQ.nextElement()).o();
        this.q = ((k1) enumerationQ.nextElement()).o();
        if (enumerationQ.hasMoreElements()) {
            this.r = (s1) enumerationQ.nextElement();
        }
    }
}
