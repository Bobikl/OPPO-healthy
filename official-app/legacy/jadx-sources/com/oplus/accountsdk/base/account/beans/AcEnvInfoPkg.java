package com.oplus.accountsdk.base.account.beans;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcEnvInfoPkg {
    private String appId;
    private String deviceId;
    private String envParam;
    private String pkgName;
    private String pkgNameSign;

    public AcEnvInfoPkg(String str, String str2, String str3, String str4, String str5) {
        this.appId = str;
        this.pkgName = str3;
        this.pkgNameSign = str4;
        this.deviceId = str2;
        this.envParam = str5;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getEnvParam() {
        return this.envParam;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getPkgNameSign() {
        return this.pkgNameSign;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setEnvParam(String str) {
        this.envParam = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setPkgNameSign(String str) {
        this.pkgNameSign = str;
    }
}
