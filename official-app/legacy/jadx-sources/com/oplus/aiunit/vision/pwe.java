package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class pwe extends m1 {
    public o1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public tz f15532j;
    public u1 k;

    public pwe(tz tzVar, f1 f1Var) throws IOException {
        this(tzVar, f1Var, null);
    }

    public static pwe g(Object obj) {
        if (obj instanceof pwe) {
            return (pwe) obj;
        }
        if (obj != null) {
            return new pwe(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(0L));
        g1Var.a(this.f15532j);
        g1Var.a(this.i);
        if (this.k != null) {
            g1Var.a(new ck4(false, 0, this.k));
        }
        return new xj4(g1Var);
    }

    public tz f() {
        return this.f15532j;
    }

    public tz h() {
        return this.f15532j;
    }

    public f1 i() throws IOException {
        return r1.i(this.i.o());
    }

    public pwe(tz tzVar, f1 f1Var, u1 u1Var) throws IOException {
        this.i = new tj4(f1Var.c().e("DER"));
        this.f15532j = tzVar;
        this.k = u1Var;
    }

    public pwe(s1 s1Var) {
        Enumeration enumerationQ = s1Var.q();
        if (((k1) enumerationQ.nextElement()).o().intValue() == 0) {
            this.f15532j = tz.g(enumerationQ.nextElement());
            this.i = o1.n(enumerationQ.nextElement());
            if (enumerationQ.hasMoreElements()) {
                this.k = u1.n((y1) enumerationQ.nextElement(), false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for private key info");
    }
}
