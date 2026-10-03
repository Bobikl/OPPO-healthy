package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class l5m extends m1 implements n5m {
    public n1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r1 f13537j;

    public l5m(BigInteger bigInteger) {
        this.i = n5m.prime_field;
        this.f13537j = new k1(bigInteger);
    }

    public static l5m g(Object obj) {
        if (obj instanceof l5m) {
            return (l5m) obj;
        }
        if (obj != null) {
            return new l5m(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f13537j);
        return new xj4(g1Var);
    }

    public n1 f() {
        return this.i;
    }

    public r1 h() {
        return this.f13537j;
    }

    public l5m(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public l5m(int i, int i2, int i3, int i4) {
        this.i = n5m.characteristic_two_field;
        g1 g1Var = new g1();
        g1Var.a(new k1(i));
        if (i3 == 0) {
            if (i4 == 0) {
                g1Var.a(n5m.tpBasis);
                g1Var.a(new k1(i2));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i3 > i2 && i4 > i3) {
            g1Var.a(n5m.ppBasis);
            g1 g1Var2 = new g1();
            g1Var2.a(new k1(i2));
            g1Var2.a(new k1(i3));
            g1Var2.a(new k1(i4));
            g1Var.a(new xj4(g1Var2));
        } else {
            throw new IllegalArgumentException("inconsistent k values");
        }
        this.f13537j = new xj4(g1Var);
    }

    public l5m(s1 s1Var) {
        this.i = n1.s(s1Var.p(0));
        this.f13537j = s1Var.p(1).c();
    }
}
