package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class lxj implements nt3 {
    @Override // com.oplus.aiunit.vision.nt3
    public w92 create(String str) {
        t63 t63Var = new t63();
        t63Var.i(str);
        t63Var.j(z60.APPLET_VENDER_SNB);
        r63 r63VarC = r63.c(z60.CMD_APDU_CARD_INFO_00B0950000, 1300, ".*(9000)$");
        q92 q92Var = new q92(str, 1300, na2.c());
        t63Var.r(2, r63VarC);
        t63Var.r(4, r63VarC);
        t63Var.q(2, na2.c());
        t63Var.q(4, q92Var);
        q92Var.e(new na2(1300, 48, 56));
        t63Var.q(4, q92Var);
        t63Var.r(1, r63.c(z60.CMD_APDU_BALANCE_805C000204, 1200, ".*(9000)$"));
        t63Var.q(1, new n92(1200));
        t63Var.r(8, r63.d(z60.TRANS_RECORD_CODES_C400_18, 1400, ".*(9000)$"));
        t63Var.q(8, new ja2(1400, 10));
        t63Var.p(new vd8());
        return t63Var;
    }
}
