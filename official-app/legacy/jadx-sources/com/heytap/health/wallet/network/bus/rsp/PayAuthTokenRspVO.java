package com.heytap.health.wallet.network.bus.rsp;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class PayAuthTokenRspVO implements Serializable {
    private static final long serialVersionUID = 5442800573716490901L;

    @Tag(1)
    private String signData;

    public String getSignData() {
        return this.signData;
    }

    public void setSignData(String str) {
        this.signData = str;
    }
}
