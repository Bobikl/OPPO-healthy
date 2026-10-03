package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class a95 {
    public static t22 a(t6j t6jVar, rpj rpjVar, int i) {
        if (i > 4) {
            return t6jVar.c(rpjVar);
        }
        spj spjVarN = rpjVar.n();
        int iM = rpjVar.m();
        u73 u73VarS = spjVarN.s(t6jVar.r(), iM);
        int i2 = 1;
        while (i2 <= i && spjVarN.K(u73VarS)) {
            u73VarS = spjVarN.f(u73VarS, iM);
            i2++;
        }
        if (i2 > i || spjVarN.K(u73VarS)) {
            return new w73(u73VarS);
        }
        w73 w73Var = new w73(spjVarN.G('A', "mathnormal", iM));
        return b(t6jVar.r(), rpjVar, i * (w73Var.h() + w73Var.g()));
    }

    public static t22 b(String str, rpj rpjVar, float f) {
        float f2;
        spj spjVarN = rpjVar.n();
        int iM = rpjVar.m();
        u73 u73VarS = spjVarN.s(str, iM);
        pzb pzbVarH = u73VarS.h();
        float fB = pzbVarH.b();
        float fA = pzbVarH.a();
        while (true) {
            f2 = fB + fA;
            if (f2 >= f || !spjVarN.K(u73VarS)) {
                break;
            }
            u73VarS = spjVarN.f(u73VarS, iM);
            pzb pzbVarH2 = u73VarS.h();
            fB = pzbVarH2.b();
            fA = pzbVarH2.a();
        }
        if (f2 < f && spjVarN.g(u73VarS)) {
            tvk tvkVar = new tvk();
            oz6 oz6VarJ = spjVarN.J(u73VarS, iM);
            if (oz6VarJ.g()) {
                tvkVar.b(new w73(oz6VarJ.d()));
            }
            boolean zF = oz6VarJ.f();
            if (zF) {
                tvkVar.b(new w73(oz6VarJ.b()));
            }
            if (oz6VarJ.e()) {
                tvkVar.b(new w73(oz6VarJ.a()));
            }
            w73 w73Var = new w73(oz6VarJ.c());
            while (tvkVar.h() + tvkVar.g() <= f) {
                if (oz6VarJ.g() && oz6VarJ.e()) {
                    tvkVar.a(1, w73Var);
                    if (zF) {
                        tvkVar.a(tvkVar.s() - 1, w73Var);
                    }
                } else if (oz6VarJ.e()) {
                    tvkVar.a(0, w73Var);
                } else {
                    tvkVar.b(w73Var);
                }
            }
            return tvkVar;
        }
        return new w73(u73VarS);
    }
}
