package com.oplus.accountsdk.base.account.refresh.api.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcRefreshTokenRequest {
    private String envInfo;

    public AcRefreshTokenRequest(String str) {
        this.envInfo = str;
    }

    public String getEnvInfo() {
        return this.envInfo;
    }

    public void setEnvInfo(String str) {
        this.envInfo = str;
    }
}
