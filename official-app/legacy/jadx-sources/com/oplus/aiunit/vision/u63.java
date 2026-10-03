package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class u63 extends s63 {
    public u63(String str) {
        s(str);
    }

    public void s(String str) {
        i(str);
        j(z60.APPLET_VENDER_SNB);
        r(1, r63.c(z60.CMD_APDU_BALANCE_805C000204, 1200, ".*(9000)$"));
        q(1, n92.c());
        r(8, r63.d(z60.TRANS_RECORD_CODES_C400_18, 1400, ".*(9000|6A83)$"));
        q(8, new ja2(1400, 10));
        r63 r63VarC = r63.c(z60.CMD_APDU_CARD_INFO_00B0950000, 1300, ".*(9000)$");
        r(2, r63VarC);
        r(4, r63VarC);
        q(2, na2.c());
        q(4, new q92(str, 1300, na2.c()));
        vd8 vd8Var = new vd8();
        vd8Var.d("02,");
        p(vd8Var);
    }
}
