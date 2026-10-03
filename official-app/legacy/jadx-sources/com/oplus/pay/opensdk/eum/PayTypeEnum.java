package com.oplus.pay.opensdk.eum;

import androidx.annotation.Keep;
import com.heytap.wallet.business.bus.bean.BusConsume;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public enum PayTypeEnum {
    RECHARGE(0, BusConsume.KEY_TRANSTYPE_RECHARGE),
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
