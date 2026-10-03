package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class s66 {
    public gj0 a;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16484c = -1;

    public s66(gj0 gj0Var) {
        this.a = gj0Var;
    }

    public void a(uq7 uq7Var) {
        this.b = false;
        this.f16484c = -1;
        this.a = uq7Var;
    }

    public t22 b(rpj rpjVar) {
        if (this.b) {
            ((y73) this.a).j();
        }
        t22 t22VarC = this.a.c(rpjVar);
        if (this.b) {
            ((y73) this.a).k();
        }
        return t22VarC;
    }

    public x73 c(spj spjVar) {
        return ((y73) this.a).f(spjVar);
    }

    public int d() {
        int i = this.f16484c;
        return i >= 0 ? i : this.a.d();
    }

    public int e() {
        int i = this.f16484c;
        return i >= 0 ? i : this.a.e();
    }

    public boolean f() {
        gj0 gj0Var = this.a;
        return (gj0Var instanceof v73) && ((v73) gj0Var).r();
    }

    public boolean g() {
        return this.a instanceof y73;
    }

    public boolean h() {
        return this.a instanceof d4i;
    }

    public void i() {
        this.b = true;
    }

    public void j(s66 s66Var) {
        Cloneable cloneable = this.a;
        if (cloneable instanceof nzf) {
            ((nzf) cloneable).a(s66Var);
        }
    }

    public void k(int i) {
        this.f16484c = i;
    }
}
