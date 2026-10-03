package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class t63 extends s63 {
    public t63() {
        s();
    }

    public void s() {
        r63 r63VarC = r63.c(z60.CMD_APDU_CARD_INFO_00B0950000, 1300, ".*(9000)$");
        r(2, r63VarC);
        r(4, r63VarC);
        q(2, na2.c());
        q(4, new q92(this.a, 1300, na2.c()));
        r(1, r63.c(z60.CMD_APDU_BALANCE_805C000204, 1200, ".*(9000)$"));
        q(1, n92.c());
        r(8, r63.d(z60.TRANS_RECORD_CODES_C400_18, 1400, ".*(9000|6A83)$"));
        q(8, new ja2(1400, 10));
        wd8 wd8Var = new wd8();
        wd8Var.a("03,");
        wd8Var.b(wd8.TAG_VALUE_EP_BALANCE, wd8.TAG_VALUE_EP_AMOUNT, wd8.TAG_VALUE_EP_DATE_DAY, wd8.TAG_VALUE_EP_DATE_TIME, wd8.TAG_VALUE_EP_TRANS_TYPE, wd8.TAG_VALUE_EP_TERMINAL_CODE);
        p(wd8Var);
    }
}
