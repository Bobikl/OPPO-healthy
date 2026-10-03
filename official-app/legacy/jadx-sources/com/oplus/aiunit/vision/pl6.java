package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pl6 implements b95 {
    public final char a;

    public pl6(char c2) {
        this.a = c2;
    }

    @Override // com.oplus.aiunit.vision.b95
    public char a() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.b95
    public int b() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.b95
    public char c() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.b95
    public void d(zrj zrjVar, zrj zrjVar2, int i) {
        ltc p1jVar;
        String strValueOf = String.valueOf(c());
        if (i == 1) {
            p1jVar = new ol6(strValueOf);
        } else {
            p1jVar = new p1j(strValueOf + strValueOf);
        }
        ltc ltcVarE = zrjVar.e();
        while (ltcVarE != null && ltcVarE != zrjVar2) {
            ltc ltcVarE2 = ltcVarE.e();
            p1jVar.b(ltcVarE);
            ltcVarE = ltcVarE2;
        }
        zrjVar.h(p1jVar);
    }

    @Override // com.oplus.aiunit.vision.b95
    public int e(c95 c95Var, c95 c95Var2) {
        if ((c95Var.a() || c95Var2.c()) && c95Var2.b() % 3 != 0 && (c95Var.b() + c95Var2.b()) % 3 == 0) {
            return 0;
        }
        return (c95Var.length() < 2 || c95Var2.length() < 2) ? 1 : 2;
    }
}
