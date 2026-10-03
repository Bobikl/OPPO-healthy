package com.oplus.pay.opensdk.eum;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public enum PayLaunchModelEnum {
    PAY("pay"),
    MSP("msppay");

    public String model;

    PayLaunchModelEnum(String str) {
        this.model = str;
    }
}
