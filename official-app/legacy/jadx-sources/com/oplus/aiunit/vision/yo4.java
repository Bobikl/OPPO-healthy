package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class yo4 extends m1 {
    public BigInteger i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xo4 f19081j;
    public k1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o1 f19082l;
    public k1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o1 f19083n;

    public yo4(s1 s1Var) {
        this.i = BigInteger.valueOf(0L);
        int i = 0;
        if (s1Var.p(0) instanceof y1) {
            y1 y1Var = (y1) s1Var.p(0);
            if (!y1Var.p() || y1Var.o() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.i = k1.m(y1Var.a()).o();
            i = 1;
        }
        this.f19081j = xo4.f(s1Var.p(i));
        int i2 = i + 1;
        this.k = k1.m(s1Var.p(i2));
        int i3 = i2 + 1;
        this.f19082l = o1.n(s1Var.p(i3));
        int i4 = i3 + 1;
        this.m = k1.m(s1Var.p(i4));
        this.f19083n = o1.n(s1Var.p(i4 + 1));
    }

    public static yo4 j(Object obj) {
        if (obj instanceof yo4) {
            return (yo4) obj;
        }
        if (obj != null) {
            return new yo4(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        if (this.i.compareTo(BigInteger.valueOf(0L)) != 0) {
            g1Var.a(new ck4(true, 0, new k1(this.i)));
        }
        g1Var.a(this.f19081j);
        g1Var.a(this.k);
        g1Var.a(this.f19082l);
        g1Var.a(this.m);
        g1Var.a(this.f19083n);
        return new xj4(g1Var);
    }

    public BigInteger f() {
        return this.k.o();
    }

    public byte[] g() {
        return eh0.e(this.f19082l.o());
    }

    public xo4 h() {
        return this.f19081j;
    }

    public byte[] i() {
        return eh0.e(this.f19083n.o());
    }

    public BigInteger k() {
        return this.m.o();
    }
}
