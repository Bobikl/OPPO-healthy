package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class f6m {
    public pv1 a;
    public eoi b;
    public int c;
    public int d;
    public final lyk e;

    public f6m() {
        this(new lyk());
    }

    public pv1 a(lyk lykVar, int i, int i2, float f, float f2, String str) {
        pv1 pv1Var = new pv1(lykVar, i, i2, f, f2);
        pv1Var.u(str);
        pv1Var.j = null;
        pv1 pv1Var2 = this.a;
        pv1Var.k = pv1Var2;
        if (pv1Var2 != null) {
            pv1Var2.j = pv1Var;
        }
        this.a = pv1Var;
        this.c++;
        if (z25.b()) {
            e();
        }
        return pv1Var;
    }

    public eoi b(hoi hoiVar) {
        eoi eoiVarA = eoi.a(this, hoiVar);
        if (eoiVarA == null) {
            return null;
        }
        eoiVarA.a = null;
        eoi eoiVar = this.b;
        eoiVarA.b = eoiVar;
        if (eoiVar != null) {
            eoiVar.a = eoiVarA;
        }
        this.b = eoiVarA;
        this.d++;
        tf6 tf6Var = eoiVarA.c;
        tf6Var.b = eoiVarA;
        tf6Var.a = eoiVarA.c();
        tf6 tf6Var2 = eoiVarA.c;
        tf6Var2.c = null;
        tf6Var2.d = eoiVarA.b().l;
        if (eoiVarA.b().l != null) {
            eoiVarA.b().l.c = eoiVarA.c;
        }
        eoiVarA.b().l = eoiVarA.c;
        tf6 tf6Var3 = eoiVarA.d;
        tf6Var3.b = eoiVarA;
        tf6Var3.a = eoiVarA.b();
        tf6 tf6Var4 = eoiVarA.d;
        tf6Var4.c = null;
        tf6Var4.d = eoiVarA.c().l;
        if (eoiVarA.c().l != null) {
            eoiVarA.c().l.c = eoiVarA.d;
        }
        eoiVarA.c().l = eoiVarA.d;
        return eoiVarA;
    }

    public void c(pv1 pv1Var) {
        if (this.c <= 0) {
            return;
        }
        tf6 tf6Var = pv1Var.l;
        while (tf6Var != null) {
            tf6 tf6Var2 = tf6Var.d;
            eoi eoiVar = tf6Var.b;
            if (eoiVar != null) {
                d(eoiVar);
            }
            pv1Var.l = tf6Var2;
            tf6Var = tf6Var2;
        }
        pv1Var.l = null;
        pv1 pv1Var2 = pv1Var.j;
        if (pv1Var2 != null) {
            pv1Var2.k = pv1Var.k;
        }
        pv1 pv1Var3 = pv1Var.k;
        if (pv1Var3 != null) {
            pv1Var3.j = pv1Var2;
        }
        if (pv1Var == this.a) {
            this.a = pv1Var3;
        }
        this.c--;
    }

    public void d(eoi eoiVar) {
        if (this.d <= 0) {
            return;
        }
        eoi eoiVar2 = eoiVar.a;
        if (eoiVar2 != null) {
            eoiVar2.b = eoiVar.b;
        }
        eoi eoiVar3 = eoiVar.b;
        if (eoiVar3 != null) {
            eoiVar3.a = eoiVar2;
        }
        if (eoiVar == this.b) {
            this.b = eoiVar3;
        }
        pv1 pv1VarB = eoiVar.b();
        pv1 pv1VarC = eoiVar.c();
        tf6 tf6Var = eoiVar.c;
        tf6 tf6Var2 = tf6Var.c;
        if (tf6Var2 != null) {
            tf6Var2.d = tf6Var.d;
        }
        tf6 tf6Var3 = tf6Var.d;
        if (tf6Var3 != null) {
            tf6Var3.c = tf6Var2;
        }
        if (tf6Var == pv1VarB.l) {
            pv1VarB.l = tf6Var3;
        }
        tf6Var.c = null;
        tf6Var.d = null;
        tf6 tf6Var4 = eoiVar.d;
        tf6 tf6Var5 = tf6Var4.c;
        if (tf6Var5 != null) {
            tf6Var5.d = tf6Var4.d;
        }
        tf6 tf6Var6 = tf6Var4.d;
        if (tf6Var6 != null) {
            tf6Var6.c = tf6Var5;
        }
        if (tf6Var4 == pv1VarC.l) {
            pv1VarC.l = tf6Var6;
        }
        tf6Var4.c = null;
        tf6Var4.d = null;
        this.d--;
    }

    public final void e() {
        for (pv1 pv1Var = this.a; pv1Var != null; pv1Var = pv1Var.k) {
            z25.c("world has body ====>>> " + pv1Var);
        }
    }

    public lyk f() {
        return this.e;
    }

    public final void g(float f) {
        for (pv1 pv1Var = this.a; pv1Var != null; pv1Var = pv1Var.k) {
            pv1Var.x = false;
        }
        for (eoi eoiVar = this.b; eoiVar != null; eoiVar = eoiVar.b) {
            eoiVar.e = false;
        }
        for (pv1 pv1Var2 = this.a; pv1Var2 != null; pv1Var2 = pv1Var2.k) {
            if (!pv1Var2.x && pv1Var2.m && pv1Var2.h() != 0) {
                h(pv1Var2, f);
                pv1Var2.x = true;
                pv1Var2.f.f();
            }
        }
    }

    public final void h(pv1 pv1Var, float f) {
        pv1Var.x();
        pv1Var.e.a(pv1Var.f.b(pv1Var.s).b(f));
        pv1Var.e.b(1.0f / ((pv1Var.t * f) + 1.0f));
        for (tf6 tf6Var = pv1Var.l; tf6Var != null; tf6Var = tf6Var.d) {
            eoi eoiVar = tf6Var.b;
            if (!eoiVar.e) {
                eoiVar.e = true;
                pv1 pv1Var2 = tf6Var.a;
                if (!pv1Var2.x && pv1Var2.m) {
                    eoiVar.e(pv1Var, f);
                    for (int i = 0; i < 4; i++) {
                        tf6Var.b.j(pv1Var);
                    }
                }
            }
        }
        lyk lykVar = pv1Var.c;
        float f2 = lykVar.a;
        lyk lykVar2 = pv1Var.e;
        lykVar.a = f2 + (lykVar2.a * f);
        lykVar.b += f * lykVar2.b;
        pv1Var.w();
    }

    public void i(float f) {
        g(f);
    }

    public f6m(lyk lykVar) {
        this.e = lykVar;
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = 0;
    }
}
