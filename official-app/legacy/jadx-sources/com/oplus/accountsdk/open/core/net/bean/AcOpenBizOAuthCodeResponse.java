package com.oplus.accountsdk.open.core.net.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenBizOAuthCodeResponse {
    private String code;
    private String state;

    public AcOpenBizOAuthCodeResponse() {
    }

    public String getCode() {
        return this.code;
    }

    public String getState() {
        return this.state;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public AcOpenBizOAuthCodeResponse(String str, String str2) {
        this.code = str;
        this.state = str2;
    }
}
