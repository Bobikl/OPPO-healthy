package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class hz5 extends m1 {
    public final k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f12318j;
    public final k1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k1 f12319l;
    public final stk m;

    public hz5(s1 s1Var) {
        if (s1Var.size() < 3 || s1Var.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + s1Var.size());
        }
        Enumeration enumerationQ = s1Var.q();
        this.i = k1.m(enumerationQ.nextElement());
        this.f12318j = k1.m(enumerationQ.nextElement());
        this.k = k1.m(enumerationQ.nextElement());
        f1 f1VarI = i(enumerationQ);
        if (f1VarI == null || !(f1VarI instanceof k1)) {
            this.f12319l = null;
        } else {
            this.f12319l = k1.m(f1VarI);
            f1VarI = i(enumerationQ);
        }
        if (f1VarI != null) {
            this.m = stk.f(f1VarI.c());
        } else {
            this.m = null;
        }
    }

    public static hz5 g(Object obj) {
        if (obj instanceof hz5) {
            return (hz5) obj;
        }
        if (obj != null) {
            return new hz5(s1.n(obj));
        }
        return null;
    }

    public static f1 i(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (f1) enumeration.nextElement();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f12318j);
        g1Var.a(this.k);
        k1 k1Var = this.f12319l;
        if (k1Var != null) {
            g1Var.a(k1Var);
        }
        stk stkVar = this.m;
        if (stkVar != null) {
            g1Var.a(stkVar);
        }
        return new xj4(g1Var);
    }

    public BigInteger f() {
        return this.f12318j.n();
    }

    public BigInteger h() {
        k1 k1Var = this.f12319l;
        if (k1Var == null) {
            return null;
        }
        return k1Var.n();
    }

    public BigInteger j() {
        return this.i.n();
    }

    public BigInteger k() {
        return this.k.n();
    }

    public stk l() {
        return this.m;
    }
}
