package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class ma3 implements nt3 {
    public static w92 a(String str) {
        t63 t63Var = new t63();
        t63Var.i(str);
        t63Var.j(z60.APPLET_VENDER_KE_WEI);
        r63 r63VarC = r63.c(z60.CMD_APDU_CARD_INFO_00B095001E, 1300, ".*(9000)$");
        t63Var.r(2, r63VarC);
        t63Var.r(4, r63VarC);
        na2 na2Var = new na2(1300, 21, 40);
        t63Var.q(2, na2Var);
        q92 q92Var = new q92(str, 1300, na2Var);
        q92Var.e(new na2(1300, 40, 56));
        t63Var.q(4, q92Var);
        r63 r63VarC2 = r63.c(z60.CMD_APDU_BALANCE_805C000204, 1200, ".*(9000)$");
        o92 o92Var = new o92(1200);
        t63Var.r(1, r63VarC2);
        t63Var.q(1, o92Var);
        r63 r63VarD = r63.d(z60.TRANS_RECORD_CODES_C400_17, 1400, ".*(9000)$");
        ja2 ja2Var = new ja2(1400, 10);
        t63Var.r(8, r63VarD);
        t63Var.q(8, ja2Var);
        vd8 vd8Var = new vd8(false);
        vd8Var.b(-1, -1, 6, 6, 12, 2, 14, 12, 26, 8, 34, 6, 42, 6);
        vd8Var.d("02,");
        vd8Var.e(null);
        t63Var.p(vd8Var);
        return t63Var;
    }

    @Override // com.oplus.aiunit.vision.nt3
    public w92 create(String str) {
        return a(str);
    }
}
