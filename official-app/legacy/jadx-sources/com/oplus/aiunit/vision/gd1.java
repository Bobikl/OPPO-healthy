package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class gd1 implements nt3 {
    public String a = "00A4040010A0000006320101050101100020080201";

    @Override // com.oplus.aiunit.vision.nt3
    public w92 create(String str) {
        t63 t63Var = new t63();
        t63Var.i(str);
        t63Var.j(z60.APPLET_VENDER_SNB);
        r63 r63VarC = r63.c(this.a, 1300, ".*(9000|61..)$");
        r63VarC.h(true);
        r63VarC.a(z60.CMD_APDU_CARD_INFO_00B095001E, 1301, ".*(9000)$");
        ed1 ed1Var = new ed1(1301, 21, 40);
        t63Var.r(2, r63VarC);
        t63Var.q(2, ed1Var);
        q92 q92Var = new q92(str, 1300, ed1Var);
        t63Var.r(4, r63VarC);
        t63Var.q(4, q92Var);
        q92Var.e(new na2(1301, 48, 56));
        t63Var.q(4, q92Var);
        r63 r63VarC2 = r63.c(this.a, 1200, ".*(9000|61..)$");
        r63VarC2.h(true);
        r63VarC2.a("805C050210", 1201, ".*(9000)$");
        t63Var.r(1, r63VarC2);
        t63Var.q(1, new dd1(1201));
        r63 r63VarC3 = r63.c(this.a, 1400, ".*(9000|61..)$");
        r63VarC3.b(z60.TRANS_RECORD_CODES_C400_17, 1451, ".*(9000)$");
        t63Var.r(8, r63VarC3);
        t63Var.q(8, new ja2(1451, 10));
        t63Var.p(ud8.a());
        return t63Var;
    }
}
