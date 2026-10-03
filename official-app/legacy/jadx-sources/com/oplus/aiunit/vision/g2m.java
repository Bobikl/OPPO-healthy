package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class g2m {
    public bv1 a;
    public lki b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11604c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nuk f11605e;

    public g2m() {
        this(new nuk());
    }

    public bv1 a(nuk nukVar, int i, int i2, float f, float f2, String str) {
        bv1 bv1Var = new bv1(nukVar, i, i2, f, f2);
        bv1Var.u(str);
        bv1Var.f9866j = null;
        bv1 bv1Var2 = this.a;
        bv1Var.k = bv1Var2;
        if (bv1Var2 != null) {
            bv1Var2.f9866j = bv1Var;
        }
        this.a = bv1Var;
        this.f11604c++;
        if (g25.b()) {
            e();
        }
        return bv1Var;
    }

    public lki b(oki okiVar) {
        lki lkiVarA = lki.a(this, okiVar);
        if (lkiVarA == null) {
            return null;
        }
        lkiVarA.a = null;
        lki lkiVar = this.b;
        lkiVarA.b = lkiVar;
        if (lkiVar != null) {
            lkiVar.a = lkiVarA;
        }
        this.b = lkiVarA;
        this.d++;
        ve6 ve6Var = lkiVarA.f13747c;
        ve6Var.b = lkiVarA;
        ve6Var.a = lkiVarA.c();
        ve6 ve6Var2 = lkiVarA.f13747c;
        ve6Var2.f17828c = null;
        ve6Var2.d = lkiVarA.b().f9867l;
        if (lkiVarA.b().f9867l != null) {
            lkiVarA.b().f9867l.f17828c = lkiVarA.f13747c;
        }
        lkiVarA.b().f9867l = lkiVarA.f13747c;
        ve6 ve6Var3 = lkiVarA.d;
        ve6Var3.b = lkiVarA;
        ve6Var3.a = lkiVarA.b();
        ve6 ve6Var4 = lkiVarA.d;
        ve6Var4.f17828c = null;
        ve6Var4.d = lkiVarA.c().f9867l;
        if (lkiVarA.c().f9867l != null) {
            lkiVarA.c().f9867l.f17828c = lkiVarA.d;
        }
        lkiVarA.c().f9867l = lkiVarA.d;
        return lkiVarA;
    }

    public void c(bv1 bv1Var) {
        if (this.f11604c <= 0) {
            return;
        }
        ve6 ve6Var = bv1Var.f9867l;
        while (ve6Var != null) {
            ve6 ve6Var2 = ve6Var.d;
            lki lkiVar = ve6Var.b;
            if (lkiVar != null) {
                d(lkiVar);
            }
            bv1Var.f9867l = ve6Var2;
            ve6Var = ve6Var2;
        }
        bv1Var.f9867l = null;
        bv1 bv1Var2 = bv1Var.f9866j;
        if (bv1Var2 != null) {
            bv1Var2.k = bv1Var.k;
        }
        bv1 bv1Var3 = bv1Var.k;
        if (bv1Var3 != null) {
            bv1Var3.f9866j = bv1Var2;
        }
        if (bv1Var == this.a) {
            this.a = bv1Var3;
        }
        this.f11604c--;
    }

    public void d(lki lkiVar) {
        if (this.d <= 0) {
            return;
        }
        lki lkiVar2 = lkiVar.a;
        if (lkiVar2 != null) {
            lkiVar2.b = lkiVar.b;
        }
        lki lkiVar3 = lkiVar.b;
        if (lkiVar3 != null) {
            lkiVar3.a = lkiVar2;
        }
        if (lkiVar == this.b) {
            this.b = lkiVar3;
        }
        bv1 bv1VarB = lkiVar.b();
        bv1 bv1VarC = lkiVar.c();
        ve6 ve6Var = lkiVar.f13747c;
        ve6 ve6Var2 = ve6Var.f17828c;
        if (ve6Var2 != null) {
            ve6Var2.d = ve6Var.d;
        }
        ve6 ve6Var3 = ve6Var.d;
        if (ve6Var3 != null) {
            ve6Var3.f17828c = ve6Var2;
        }
        if (ve6Var == bv1VarB.f9867l) {
            bv1VarB.f9867l = ve6Var3;
        }
        ve6Var.f17828c = null;
        ve6Var.d = null;
        ve6 ve6Var4 = lkiVar.d;
        ve6 ve6Var5 = ve6Var4.f17828c;
        if (ve6Var5 != null) {
            ve6Var5.d = ve6Var4.d;
        }
        ve6 ve6Var6 = ve6Var4.d;
        if (ve6Var6 != null) {
            ve6Var6.f17828c = ve6Var5;
        }
        if (ve6Var4 == bv1VarC.f9867l) {
            bv1VarC.f9867l = ve6Var6;
        }
        ve6Var4.f17828c = null;
        ve6Var4.d = null;
        this.d--;
    }

    public final void e() {
        for (bv1 bv1Var = this.a; bv1Var != null; bv1Var = bv1Var.k) {
            g25.c("world has body ====>>> " + bv1Var);
        }
    }

    public nuk f() {
        return this.f11605e;
    }

    public final void g(float f) {
        for (bv1 bv1Var = this.a; bv1Var != null; bv1Var = bv1Var.k) {
            bv1Var.x = false;
        }
        for (lki lkiVar = this.b; lkiVar != null; lkiVar = lkiVar.b) {
            lkiVar.f13748e = false;
        }
        for (bv1 bv1Var2 = this.a; bv1Var2 != null; bv1Var2 = bv1Var2.k) {
            if (!bv1Var2.x && bv1Var2.m && bv1Var2.h() != 0) {
                h(bv1Var2, f);
                bv1Var2.x = true;
                bv1Var2.f.f();
            }
        }
    }

    public final void h(bv1 bv1Var, float f) {
        bv1Var.x();
        bv1Var.f9865e.a(bv1Var.f.b(bv1Var.s).b(f));
        bv1Var.f9865e.b(1.0f / ((bv1Var.t * f) + 1.0f));
        for (ve6 ve6Var = bv1Var.f9867l; ve6Var != null; ve6Var = ve6Var.d) {
            lki lkiVar = ve6Var.b;
            if (!lkiVar.f13748e) {
                lkiVar.f13748e = true;
                bv1 bv1Var2 = ve6Var.a;
                if (!bv1Var2.x && bv1Var2.m) {
                    lkiVar.e(bv1Var, f);
                    for (int i = 0; i < 4; i++) {
                        ve6Var.b.j(bv1Var);
                    }
                }
            }
        }
        nuk nukVar = bv1Var.f9864c;
        float f2 = nukVar.a;
        nuk nukVar2 = bv1Var.f9865e;
        nukVar.a = f2 + (nukVar2.a * f);
        nukVar.b += f * nukVar2.b;
        bv1Var.w();
    }

    public void i(float f) {
        g(f);
    }

    public g2m(nuk nukVar) {
        this.f11605e = nukVar;
        this.a = null;
        this.b = null;
        this.f11604c = 0;
        this.d = 0;
    }
}
