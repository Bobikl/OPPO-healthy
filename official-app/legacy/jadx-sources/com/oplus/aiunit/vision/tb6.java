package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class tb6 extends m1 {
    public s1 i;

    public tb6(s1 s1Var) {
        this.i = s1Var;
    }

    public static tb6 f(Object obj) {
        if (obj instanceof tb6) {
            return (tb6) obj;
        }
        if (obj != null) {
            return new tb6(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        return this.i;
    }

    public BigInteger g() {
        return new BigInteger(1, ((o1) this.i.p(1)).o());
    }

    public final r1 h(int i) {
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

    public kj4 i() {
        return (kj4) h(1);
    }

    public tb6(int i, BigInteger bigInteger, f1 f1Var) {
        this(i, bigInteger, null, f1Var);
    }

    public tb6(int i, BigInteger bigInteger, kj4 kj4Var, f1 f1Var) {
        byte[] bArrA = td1.a((i + 7) / 8, bigInteger);
        g1 g1Var = new g1();
        g1Var.a(new k1(1L));
        g1Var.a(new tj4(bArrA));
        if (f1Var != null) {
            g1Var.a(new ck4(true, 0, f1Var));
        }
        if (kj4Var != null) {
            g1Var.a(new ck4(true, 1, kj4Var));
        }
        this.i = new xj4(g1Var);
    }
}
