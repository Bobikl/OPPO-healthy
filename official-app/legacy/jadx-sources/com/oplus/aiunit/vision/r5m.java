package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class r5m {
    public static final gj0 a = t6j.q("minus");
    public static final gj0 b = t6j.q("leftarrow");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gj0 f16080c = t6j.q("rightarrow");

    public static t22 a(rpj rpjVar, float f) {
        t22 t22VarC = b.c(rpjVar);
        t22 t22VarC2 = f16080c.c(rpjVar);
        float fK = t22VarC.k() + t22VarC2.k();
        float f2 = 0.0f;
        if (f < fK) {
            af9 af9Var = new af9(t22VarC);
            af9Var.b(new s1j(-Math.min(fK - f, t22VarC.k()), 0.0f, 0.0f, 0.0f));
            af9Var.b(t22VarC2);
            return af9Var;
        }
        t22 t22VarC3 = new ssh(a, "").c(rpjVar);
        t22 t22VarC4 = new d4i(5, -3.4f, 0.0f, 0.0f).c(rpjVar);
        float fK2 = t22VarC3.k() + t22VarC4.k();
        float fK3 = fK + (t22VarC4.k() * 2.0f);
        af9 af9Var2 = new af9();
        while (true) {
            float f3 = f - fK3;
            if (f2 >= f3 - fK2) {
                af9Var2.b(new qdg(t22VarC3, (f3 - f2) / t22VarC3.k(), 1.0d));
                af9Var2.a(0, t22VarC4);
                af9Var2.a(0, t22VarC);
                af9Var2.b(t22VarC4);
                af9Var2.b(t22VarC2);
                return af9Var2;
            }
            af9Var2.b(t22VarC3);
            af9Var2.b(t22VarC4);
            f2 += fK2;
        }
    }

    public static t22 b(boolean z, rpj rpjVar, float f) {
        float f2;
        t22 t22VarC = (z ? b : f16080c).c(rpjVar);
        float fH = t22VarC.h();
        float fG = t22VarC.g();
        float fK = t22VarC.k();
        if (f <= fK) {
            t22VarC.m(fG / 2.0f);
            return t22VarC;
        }
        t22 t22VarC2 = new ssh(a, "").c(rpjVar);
        t22 t22VarC3 = new d4i(5, -4.0f, 0.0f, 0.0f).c(rpjVar);
        float fK2 = t22VarC2.k() + t22VarC3.k();
        float fK3 = fK + t22VarC3.k();
        af9 af9Var = new af9();
        float f3 = 0.0f;
        while (true) {
            f2 = f - fK3;
            if (f3 >= f2 - fK2) {
                break;
            }
            af9Var.b(t22VarC2);
            af9Var.b(t22VarC3);
            f3 += fK2;
        }
        float fK4 = (f2 - f3) / t22VarC2.k();
        float f4 = (-2.0f) * fK4;
        af9Var.b(new d4i(5, f4, 0.0f, 0.0f).c(rpjVar));
        af9Var.b(new pdg(a, fK4, 1.0d).c(rpjVar));
        if (z) {
            af9Var.a(0, new d4i(5, -3.5f, 0.0f, 0.0f).c(rpjVar));
            af9Var.a(0, t22VarC);
        } else {
            af9Var.b(new d4i(5, f4 - 2.0f, 0.0f, 0.0f).c(rpjVar));
            af9Var.b(t22VarC);
        }
        af9Var.m(fG / 2.0f);
        af9Var.n(fH);
        return af9Var;
    }
}
