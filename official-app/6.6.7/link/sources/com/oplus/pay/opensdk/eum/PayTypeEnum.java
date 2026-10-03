package com.oplus.pay.opensdk.eum;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public enum PayTypeEnum {
    RECHARGE(0, "RECHARGE"),
    SIGNANDPAY(1, "SIGNANDPAY"),
    SIGN(2, "SIGN"),
    PAYMENT(0, "PAYMENT");

    public int mAutoRenew;
    public String tradeType;

    PayTypeEnum(int i, String str) {
        this.mAutoRenew = i;
        this.tradeType = str;
    }
}
