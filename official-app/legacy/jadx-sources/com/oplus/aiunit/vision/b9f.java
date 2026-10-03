package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class b9f extends m1 {
    public BigInteger i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BigInteger f9649j;

    public b9f(BigInteger bigInteger, BigInteger bigInteger2) {
        this.i = bigInteger;
        this.f9649j = bigInteger2;
    }

    public static b9f f(Object obj) {
        if (obj instanceof b9f) {
            return (b9f) obj;
        }
        if (obj != null) {
            return new b9f(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(g()));
        g1Var.a(new k1(h()));
        return new xj4(g1Var);
    }

    public BigInteger g() {
        return this.i;
    }

    public BigInteger h() {
        return this.f9649j;
    }

    public b9f(s1 s1Var) {
        if (s1Var.size() == 2) {
            Enumeration enumerationQ = s1Var.q();
            this.i = k1.m(enumerationQ.nextElement()).n();
            this.f9649j = k1.m(enumerationQ.nextElement()).n();
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + s1Var.size());
        }
    }
}
