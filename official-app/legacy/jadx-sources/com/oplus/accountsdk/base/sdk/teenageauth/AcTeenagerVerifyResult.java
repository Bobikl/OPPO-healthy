package com.oplus.accountsdk.base.sdk.teenageauth;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcTeenagerVerifyResult {
    private String ticket;

    public AcTeenagerVerifyResult() {
    }

    public AcTeenagerVerifyResult(String str) {
        this.ticket = str;
    }

    public String getTicket() {
        return this.ticket;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public String toString() {
        return "AcVerifyResultData{ticket='" + this.ticket + "'}";
    }
}
