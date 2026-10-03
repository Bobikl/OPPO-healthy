package com.oplus.aiunit.vision;

import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d01 {
    public static final int BEHAVIOR_TYPE_ATTACHMENT = 3;
    public static final int BEHAVIOR_TYPE_CONSTRAINT = 1;
    public static final int BEHAVIOR_TYPE_DRAG = 0;
    public static final int BEHAVIOR_TYPE_FLING = 2;
    public static final int BEHAVIOR_TYPE_PRESS = 5;
    public static final int BEHAVIOR_TYPE_SNAP = 4;
    public HashMap<String, ot7> f;
    public Runnable h;
    public Runnable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cfk f10313j;
    public bv1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public oki f10314l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f10315n;
    public float a = 1.0f;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10311c = false;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ot7 f10312e = null;
    public vie g = null;
    public lki m = null;

    public d01() {
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends d01> T A(float f, float f2) {
        oki okiVar = this.f10314l;
        if (okiVar != null) {
            okiVar.f14974e = f;
            okiVar.f = f2;
            lki lkiVar = this.m;
            if (lkiVar != null) {
                lkiVar.g(f);
                this.m.f(f2);
            }
        }
        return this;
    }

    public void B() {
        if (this.f10311c) {
            return;
        }
        H();
        G();
        w();
        m();
        this.g.B(this);
        this.g.x(this);
        this.f10311c = true;
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean C() {
        if (!this.f10311c) {
            return false;
        }
        if (r() != 0) {
            this.f10313j.g.f();
        }
        this.g.z(this);
        this.f10311c = false;
        Runnable runnable = this.i;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void D(bv1 bv1Var, nuk nukVar) {
        bv1Var.r(nukVar);
    }

    public void E() {
        HashMap<String, ot7> map = this.f;
        if (map == null) {
            return;
        }
        for (ot7 ot7Var : map.values()) {
            if (ot7Var != null) {
                F(this.f10313j, ot7Var);
            }
        }
    }

    public final void F(cfk cfkVar, ot7 ot7Var) {
        ot7Var.e(cfkVar);
    }

    public void G() {
        HashMap<String, ot7> map = this.f;
        if (map == null) {
            cfk cfkVar = this.f10313j;
            cfkVar.c(cfkVar.a().a, this.f10313j.a().b);
            return;
        }
        for (ot7 ot7Var : map.values()) {
            if (ot7Var != null) {
                ot7Var.f(this.f10313j);
            }
        }
    }

    public void H() {
        if (this.d) {
            this.d = false;
            this.k.d().d(hr3.d(this.f10313j.g.a), hr3.d(this.f10313j.g.b));
        }
    }

    public final void I() {
        vie vieVar = this.g;
        if (vieVar != null && this.k == null) {
            cfk cfkVarN = vieVar.n(this.f10315n);
            this.f10313j = cfkVarN;
            vie vieVar2 = this.g;
            ot7 ot7Var = this.f10312e;
            this.k = vieVar2.m(cfkVarN, ot7Var != null ? ot7Var.a : 1);
            y();
            if (g25.b()) {
                g25.c("verifyBodyProperty : mActiveUIItem =:" + this.f10313j + ",mPropertyBody =:" + this.k + ",this =:" + this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends d01> T J(ot7... ot7VarArr) {
        for (ot7 ot7Var : ot7VarArr) {
            a(ot7Var);
        }
        return this;
    }

    public final void a(ot7 ot7Var) {
        if (this.f == null) {
            this.f = new HashMap<>(1);
        }
        if (this.f10312e == null) {
            this.f10312e = ot7Var;
            I();
        }
        this.f.put(ot7Var.b, ot7Var);
        this.a = qnb.b(this.a, ot7Var.f15044c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends d01> T b(Object obj) {
        this.f10315n = obj;
        I();
        return this;
    }

    public d01 c(vie vieVar) {
        this.g = vieVar;
        I();
        v(this.g.l());
        return this;
    }

    public bv1 d(String str, bv1 bv1Var) {
        if (bv1Var == null) {
            bv1 bv1Var2 = this.k;
            nuk nukVar = bv1Var2.a;
            int iH = bv1Var2.h();
            int iG = this.k.g();
            bv1 bv1Var3 = this.k;
            bv1Var = i(nukVar, iH, iG, bv1Var3.o, bv1Var3.p, str);
        } else {
            bv1 bv1Var4 = this.k;
            bv1Var.t(bv1Var4.o, bv1Var4.p);
        }
        bv1Var.o(this.k.d());
        bv1Var.l(false);
        return bv1Var;
    }

    public boolean e(oki okiVar) {
        if (this.b) {
            return false;
        }
        lki lkiVarF = f(okiVar, this.k);
        this.m = lkiVarF;
        if (lkiVarF == null) {
            return false;
        }
        this.b = true;
        return true;
    }

    public lki f(oki okiVar, bv1 bv1Var) {
        if (okiVar == null || bv1Var == null) {
            return null;
        }
        okiVar.f14973c.e(bv1Var.i());
        return this.g.g(okiVar);
    }

    public void g() {
        h(4.0f, 0.2f);
    }

    public void h(float f, float f2) {
        oki okiVar = new oki();
        this.f10314l = okiVar;
        okiVar.f14974e = 4.0f;
        okiVar.f = 0.2f;
    }

    public final bv1 i(nuk nukVar, int i, int i2, float f, float f2, String str) {
        return this.g.f(nukVar, i, i2, f, f2, str);
    }

    public boolean j(bv1 bv1Var) {
        return this.g.j(bv1Var);
    }

    public boolean k() {
        if (!this.b) {
            return false;
        }
        l(this.m);
        this.m = null;
        this.b = false;
        return true;
    }

    public void l(lki lkiVar) {
        this.g.k(lkiVar);
    }

    public void m() {
        this.f10313j.f(hr3.c(this.k.f().a - this.k.c().a), hr3.c(this.k.f().b - this.k.c().b));
    }

    public Object n() {
        ot7 ot7Var = this.f10312e;
        if (ot7Var != null) {
            return Float.valueOf(p(this.f10313j, ot7Var));
        }
        if (q() != null) {
            return Float.valueOf(q().a);
        }
        return null;
    }

    public nuk o() {
        bv1 bv1Var = this.k;
        return bv1Var != null ? bv1Var.d() : new nuk();
    }

    public float p(Object obj, ot7 ot7Var) {
        return ot7Var.a(obj);
    }

    public s9k q() {
        cfk cfkVar = this.f10313j;
        if (cfkVar != null) {
            return cfkVar.a();
        }
        return null;
    }

    public abstract int r();

    public boolean s(nuk nukVar) {
        lki lkiVar = this.m;
        if (lkiVar != null) {
            return hr3.b(qnb.a(lkiVar.d().a - nukVar.a) + qnb.a(this.m.d().b - nukVar.b));
        }
        return true;
    }

    public boolean t() {
        return u(this.k.f9865e) && s(this.k.f());
    }

    public String toString() {
        return "BaseBehavior{type=" + r() + ", mFirstProperty=" + this.f10312e + ", mValueThreshold=" + this.a + ", mTarget=" + this.f10315n + ", mPropertyBody=" + this.k + ", mActiveUIItem=" + this.f10313j + ", mSpring=" + this.m + ", mSpringDef=" + this.f10314l + ", mIsSpringApplied=" + this.b + ", mIsStarted=" + this.f10311c + ", mHasCustomStartVelocity=" + this.d + "}@" + hashCode();
    }

    public boolean u(nuk nukVar) {
        return hr3.b(qnb.a(nukVar.a)) && hr3.b(qnb.a(nukVar.b));
    }

    public void v(bv1 bv1Var) {
        oki okiVar = this.f10314l;
        if (okiVar != null) {
            okiVar.a = bv1Var;
            bv1Var.l(true);
        }
    }

    public void w() {
        cfk cfkVar = this.f10313j;
        cfkVar.d.d((hr3.d(cfkVar.f10068e.a) + this.k.c().a) / this.a, (hr3.d(this.f10313j.f10068e.b) + this.k.c().b) / this.a);
        D(this.k, this.f10313j.d);
    }

    public void x() {
    }

    public void y() {
        oki okiVar = this.f10314l;
        if (okiVar != null) {
            okiVar.b = this.k;
        }
    }

    public void z() {
        if (g25.b()) {
            g25.c("onRemove mIsStarted =:" + this.f10311c + ",this =:" + this);
        }
        this.i = null;
        C();
    }
}
