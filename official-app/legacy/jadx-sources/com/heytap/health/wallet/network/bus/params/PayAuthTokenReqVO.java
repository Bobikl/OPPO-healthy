package com.heytap.health.wallet.network.bus.params;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class PayAuthTokenReqVO implements Serializable {
    private static final long serialVersionUID = -3519942360772342186L;

    @Tag(1)
    private String appCode;

    @Tag(3)
    private String channelType;

    @Tag(2)
    private String cplc;

    public PayAuthTokenReqVO(String str, String str2, String str3) {
        this.appCode = str2;
        this.cplc = str;
        this.channelType = str3;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public String getCplc() {
        return this.cplc;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }
}
