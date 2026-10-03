package com.heytap.health.wallet.network.bus.params;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class GetDeletSucResultReq implements Serializable {
    private static final long serialVersionUID = 334850408660739873L;

    @Tag(2)
    private String appCode;

    @Tag(1)
    private String cplc;

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
