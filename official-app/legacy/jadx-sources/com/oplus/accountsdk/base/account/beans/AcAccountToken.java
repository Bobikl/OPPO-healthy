package com.oplus.accountsdk.base.account.beans;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcAccountToken {
    private final String accountType;
    private final String deviceId;
    private String extraDataJson;
    private final String token;

    public AcAccountToken(String str, String str2, String str3) {
        this.token = str;
        this.deviceId = str2;
        this.accountType = str3;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getExtraDataJson() {
        return this.extraDataJson;
    }

    public String getToken() {
        return this.token;
    }

    public AcAccountToken(String str, String str2, String str3, String str4) {
        this.token = str;
        this.deviceId = str2;
        this.accountType = str3;
        this.extraDataJson = str4;
    }
}
