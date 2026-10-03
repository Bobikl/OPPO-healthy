package com.oplus.accountsdk.base.account.beans;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcEnvInfo {
    private String bizAppId;
    private String bizAppKey;
    private String bizPkgName;
    private String bizPkgNameSign;
    private String deviceId;
    private String envParam;

    public AcEnvInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.bizAppId = str;
        this.bizAppKey = str2;
        this.bizPkgName = str3;
        this.bizPkgNameSign = str4;
        this.deviceId = str5;
        this.envParam = str6;
    }

    public String getBizAppId() {
        return this.bizAppId;
    }

    public String getBizAppKey() {
        return this.bizAppKey;
    }

    public String getBizPkgName() {
        return this.bizPkgName;
    }

    public String getBizPkgNameSign() {
        return this.bizPkgNameSign;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getEnvParam() {
        return this.envParam;
    }

    public void setBizAppId(String str) {
        this.bizAppId = str;
    }

    public void setBizAppKey(String str) {
        this.bizAppKey = str;
    }

    public void setBizPkgName(String str) {
        this.bizPkgName = str;
    }

    public void setBizPkgNameSign(String str) {
        this.bizPkgNameSign = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setEnvParam(String str) {
        this.envParam = str;
    }
}
