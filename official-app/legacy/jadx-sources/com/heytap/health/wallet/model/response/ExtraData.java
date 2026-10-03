package com.heytap.health.wallet.model.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class ExtraData {
    private String appName;
    private String linkUrl;
    private String pkgName;

    public String getAppName() {
        return this.appName;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }
}
