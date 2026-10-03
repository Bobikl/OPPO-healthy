package com.oplus.accountsdk.open.core.net.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenBizOAuthCodeRequest {
    private String envInfo;
    private String scope;
    private String state;

    public AcOpenBizOAuthCodeRequest(String str, String str2, String str3) {
        this.envInfo = str;
        this.scope = str2;
        this.state = str3;
    }

    public String getEnvInfo() {
        return this.envInfo;
    }

    public String getScope() {
        return this.scope;
    }

    public String getState() {
        return this.state;
    }
}
