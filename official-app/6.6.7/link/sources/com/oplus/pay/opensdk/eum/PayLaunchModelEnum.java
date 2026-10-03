package com.oplus.pay.opensdk.eum;

import androidx.annotation.Keep;
import com.oplus.pay.opensdk.msp.pay.PayConstant;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public enum PayLaunchModelEnum {
    PAY(PayConstant.MethodName.PAY),
    MSP("msppay");

    public String model;

    PayLaunchModelEnum(String str) {
        this.model = str;
    }
}
