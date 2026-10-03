package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class wb6 extends m1 {
    public s1 i;

    public wb6(s1 s1Var) {
        this.i = s1Var;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        return this.i;
    }

    public BigInteger f() {
        return new BigInteger(1, ((o1) this.i.p(1)).o());
    }

    public final r1 g(int i) {
        Enumeration enumerationQ = this.i.q();
        while (enumerationQ.hasMoreElements()) {
            f1 f1Var = (f1) enumerationQ.nextElement();
            if (f1Var instanceof y1) {
                y1 y1Var = (y1) f1Var;
                if (y1Var.o() == i) {
                    return y1Var.n().c();
                }
            }
        }
        return null;
    }

    public kj4 h() {
        return (kj4) g(1);
    }

    public wb6(BigInteger bigInteger, f1 f1Var) {
        this(bigInteger, null, f1Var);
    }

    public wb6(BigInteger bigInteger, kj4 kj4Var, f1 f1Var) {
        byte[] bArrB = td1.b(bigInteger);
        g1 g1Var = new g1();
        g1Var.a(new k1(1L));
        g1Var.a(new tj4(bArrB));
        if (f1Var != null) {
            g1Var.a(new ck4(true, 0, f1Var));
        }
        if (kj4Var != null) {
            g1Var.a(new ck4(true, 1, kj4Var));
        }
        this.i = new xj4(g1Var);
    }
}
