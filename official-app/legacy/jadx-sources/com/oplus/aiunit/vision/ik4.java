package com.oplus.aiunit.vision;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class ik4 extends m1 {
    public k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k1 f12566j;
    public k1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k1 f12567l;
    public pk4 m;

    public ik4(s1 s1Var) {
        if (s1Var.size() < 3 || s1Var.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + s1Var.size());
        }
        Enumeration enumerationQ = s1Var.q();
        this.i = k1.m(enumerationQ.nextElement());
        this.f12566j = k1.m(enumerationQ.nextElement());
        this.k = k1.m(enumerationQ.nextElement());
        f1 f1VarH = h(enumerationQ);
        if (f1VarH != null && (f1VarH instanceof k1)) {
            this.f12567l = k1.m(f1VarH);
            f1VarH = h(enumerationQ);
        }
        if (f1VarH != null) {
            this.m = pk4.f(f1VarH.c());
        }
    }

    public static ik4 g(Object obj) {
        if (obj == null || (obj instanceof ik4)) {
            return (ik4) obj;
        }
        if (obj instanceof s1) {
            return new ik4((s1) obj);
        }
        throw new IllegalArgumentException("Invalid DHDomainParameters: " + obj.getClass().getName());
    }

    public static f1 h(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (f1) enumeration.nextElement();
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f12566j);
        g1Var.a(this.k);
        k1 k1Var = this.f12567l;
        if (k1Var != null) {
            g1Var.a(k1Var);
        }
        pk4 pk4Var = this.m;
        if (pk4Var != null) {
            g1Var.a(pk4Var);
        }
        return new xj4(g1Var);
    }

    public k1 f() {
        return this.f12566j;
    }

    public k1 i() {
        return this.i;
    }
}
