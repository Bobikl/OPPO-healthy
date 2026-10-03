package com.oplus.aiunit.vision;

import com.heytap.health.wallet.bean.Command;

/* JADX INFO: loaded from: classes19.dex */
public class v92 extends Command {
    public static final int DEFAULT_ID_BALANCE = 1200;
    public static final int DEFAULT_ID_CARD_INFO = 1300;
    public static final int DEFAULT_ID_SEL_APP = 1100;
    public static final int DEFAULT_ID_SITE_STATE = 1500;
    public static final int DEFAULT_ID_TRANS_INDEX_BEGIN = 1400;
    public static final int DEFAULT_ID_TRANS_INDEX_SECOND_BEGIN = 1450;
    public static final int ID_CARD_INFO_DATE = 3100;
    public static final int ID_NORMAL = 0;
    public static final int ID_TRANS_SECONDS_INDEX_BEGIN = 4100;
    public int a;

    public static v92 a(v92 v92Var) {
        if (v92Var == null) {
            return null;
        }
        v92 v92Var2 = new v92();
        v92Var2.a = v92Var.a;
        v92Var2.setChecker(v92Var.getChecker());
        v92Var2.setCommand(v92Var.getCommand());
        v92Var2.setIndex(v92Var.getIndex());
        v92Var2.setResult(v92Var.getResult());
        return v92Var2;
    }
}
