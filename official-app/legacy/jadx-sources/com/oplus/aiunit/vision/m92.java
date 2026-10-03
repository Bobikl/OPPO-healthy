package com.oplus.aiunit.vision;

import com.heytap.wallet.business.bus.bean.NfcConsumeRecord;

/* JADX INFO: loaded from: classes19.dex */
public class m92 {
    public static final String DEFAULT_NO_ACTIVITE_AID = "no_activite_aid";

    public static String a(int i) {
        if (i == 1) {
            return "issuecard";
        }
        if (i == 3) {
            return "issueTopup";
        }
        if (i != 4) {
            return i != 5 ? "topup" : "shiftin";
        }
        return "shiftout";
    }

    @Deprecated
    public static int b(String str, String str2) {
        return tqc.g().i(str, str2);
    }

    @Deprecated
    public static int c(String str, String str2) {
        return tqc.g().h(str, str2);
    }

    @Deprecated
    public static String d(String str, String str2) {
        return tqc.g().a(str, str2);
    }

    @Deprecated
    public static NfcConsumeRecord e(String str, String str2) {
        return tqc.g().j(str2, str);
    }
}
