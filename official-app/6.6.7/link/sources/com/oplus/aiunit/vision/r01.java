package com.oplus.aiunit.vision;

import java.util.HashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class r01 {
    public static final int BEHAVIOR_TYPE_ATTACHMENT = 3;
    public static final int BEHAVIOR_TYPE_CONSTRAINT = 1;
    public static final int BEHAVIOR_TYPE_DRAG = 0;
    public static final int BEHAVIOR_TYPE_FLING = 2;
    public static final int BEHAVIOR_TYPE_PRESS = 5;
    public static final int BEHAVIOR_TYPE_SNAP = 4;
    public HashMap<String, qu7> f;
    public Runnable h;
    public Runnable i;
    public ejk j;
    public pv1 k;
    public hoi l;
    public Object n;
    public float a = 1.0f;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public qu7 e = null;
    public dle g = null;
    public eoi m = null;

    public r01() {
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends r01> T A(float f, float f2) {
        hoi hoiVar = this.l;
        if (hoiVar != null) {
            hoiVar.e = f;
            hoiVar.f = f2;
            eoi eoiVar = this.m;
            if (eoiVar != null) {
                eoiVar.g(f);
                this.m.f(f2);
            }
        }
        return this;
    }

    public void B() {
        if (this.c) {
            return;
        }
        H();
        G();
        w();
        m();
        this.g.B(this);
        this.g.x(this);
        this.c = true;
        Runnable runnable = this.h;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean C() {
        if (!this.c) {
            return false;
        }
        if (r() != 0) {
            this.j.g.f();
        }
        this.g.z(this);
        this.c = false;
        Runnable runnable = this.i;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void D(pv1 pv1Var, lyk lykVar) {
        pv1Var.r(lykVar);
    }

    public void E() {
        HashMap<String, qu7> map = this.f;
        if (map == null) {
            return;
        }
        for (qu7 qu7Var : map.values()) {
            if (qu7Var != null) {
                F(this.j, qu7Var);
            }
        }
    }

    public final void F(ejk ejkVar, qu7 qu7Var) {
        qu7Var.e(ejkVar);
    }

    public void G() {
        HashMap<String, qu7> map = this.f;
        if (map == null) {
            ejk ejkVar = this.j;
            ejkVar.c(ejkVar.a().a, this.j.a().b);
            return;
        }
        for (qu7 qu7Var : map.values()) {
            if (qu7Var != null) {
                qu7Var.f(this.j);
            }
        }
    }

    public void H() {
        if (this.d) {
            this.d = false;
            this.k.d().d(vr3.d(this.j.g.a), vr3.d(this.j.g.b));
        }
    }

    public final void I() {
        dle dleVar = this.g;
        if (dleVar != null && this.k == null) {
            ejk ejkVarN = dleVar.n(this.n);
            this.j = ejkVarN;
            dle dleVar2 = this.g;
            qu7 qu7Var = this.e;
            this.k = dleVar2.m(ejkVarN, qu7Var != null ? qu7Var.a : 1);
            y();
            if (z25.b()) {
                z25.c("verifyBodyProperty : mActiveUIItem =:" + this.j + ",mPropertyBody =:" + this.k + ",this =:" + this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends r01> T J(qu7... qu7VarArr) {
        for (qu7 qu7Var : qu7VarArr) {
            a(qu7Var);
        }
        return this;
    }

    public final void a(qu7 qu7Var) {
        if (this.f == null) {
            this.f = new HashMap<>(1);
        }
        if (this.e == null) {
            this.e = qu7Var;
            I();
        }
        this.f.put(qu7Var.b, qu7Var);
        this.a = fpb.b(this.a, qu7Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends r01> T b(Object obj) {
        this.n = obj;
        I();
        return this;
    }

    public r01 c(dle dleVar) {
        this.g = dleVar;
        I();
        v(this.g.l());
        return this;
    }

    public pv1 d(String str, pv1 pv1Var) {
        if (pv1Var == null) {
            pv1 pv1Var2 = this.k;
            lyk lykVar = pv1Var2.a;
            int iH = pv1Var2.h();
            int iG = this.k.g();
            pv1 pv1Var3 = this.k;
            pv1Var = i(lykVar, iH, iG, pv1Var3.o, pv1Var3.p, str);
        } else {
            pv1 pv1Var4 = this.k;
            pv1Var.t(pv1Var4.o, pv1Var4.p);
        }
        pv1Var.o(this.k.d());
        pv1Var.l(false);
        return pv1Var;
    }

    public boolean e(hoi hoiVar) {
        if (this.b) {
            return false;
        }
        eoi eoiVarF = f(hoiVar, this.k);
        this.m = eoiVarF;
        if (eoiVarF == null) {
            return false;
        }
        this.b = true;
        return true;
    }

    public eoi f(hoi hoiVar, pv1 pv1Var) {
        if (hoiVar == null || pv1Var == null) {
            return null;
        }
        hoiVar.c.e(pv1Var.i());
        return this.g.g(hoiVar);
    }

    public void g() {
        h(4.0f, 0.2f);
    }

    public void h(float f, float f2) {
        hoi hoiVar = new hoi();
        this.l = hoiVar;
        hoiVar.e = 4.0f;
        hoiVar.f = 0.2f;
    }

    public final pv1 i(lyk lykVar, int i, int i2, float f, float f2, String str) {
        return this.g.f(lykVar, i, i2, f, f2, str);
    }

    public boolean j(pv1 pv1Var) {
        return this.g.j(pv1Var);
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

    public void l(eoi eoiVar) {
        this.g.k(eoiVar);
    }

    public void m() {
        this.j.f(vr3.c(this.k.f().a - this.k.c().a), vr3.c(this.k.f().b - this.k.c().b));
    }

    public Object n() {
        qu7 qu7Var = this.e;
        if (qu7Var != null) {
            return Float.valueOf(p(this.j, qu7Var));
        }
        if (q() != null) {
            return Float.valueOf(q().a);
        }
        return null;
    }

    public lyk o() {
        pv1 pv1Var = this.k;
        return pv1Var != null ? pv1Var.d() : new lyk();
    }

    public float p(Object obj, qu7 qu7Var) {
        return qu7Var.a(obj);
    }

    public udk q() {
        ejk ejkVar = this.j;
        if (ejkVar != null) {
            return ejkVar.a();
        }
        return null;
    }

    public abstract int r();

    public boolean s(lyk lykVar) {
        eoi eoiVar = this.m;
        if (eoiVar != null) {
            return vr3.b(fpb.a(eoiVar.d().a - lykVar.a) + fpb.a(this.m.d().b - lykVar.b));
        }
        return true;
    }

    public boolean t() {
        return u(this.k.e) && s(this.k.f());
    }

    public String toString() {
        return "BaseBehavior{type=" + r() + ", mFirstProperty=" + this.e + ", mValueThreshold=" + this.a + ", mTarget=" + this.n + ", mPropertyBody=" + this.k + ", mActiveUIItem=" + this.j + ", mSpring=" + this.m + ", mSpringDef=" + this.l + ", mIsSpringApplied=" + this.b + ", mIsStarted=" + this.c + ", mHasCustomStartVelocity=" + this.d + "}@" + hashCode();
    }

    public boolean u(lyk lykVar) {
        return vr3.b(fpb.a(lykVar.a)) && vr3.b(fpb.a(lykVar.b));
    }

    public void v(pv1 pv1Var) {
        hoi hoiVar = this.l;
        if (hoiVar != null) {
            hoiVar.a = pv1Var;
            pv1Var.l(true);
        }
    }

    public void w() {
        ejk ejkVar = this.j;
        ejkVar.d.d((vr3.d(ejkVar.e.a) + this.k.c().a) / this.a, (vr3.d(this.j.e.b) + this.k.c().b) / this.a);
        D(this.k, this.j.d);
    }

    public void x() {
    }

    public void y() {
        hoi hoiVar = this.l;
        if (hoiVar != null) {
            hoiVar.b = this.k;
        }
    }

    public void z() {
        if (z25.b()) {
            z25.c("onRemove mIsStarted =:" + this.c + ",this =:" + this);
        }
        this.i = null;
        C();
    }
}
