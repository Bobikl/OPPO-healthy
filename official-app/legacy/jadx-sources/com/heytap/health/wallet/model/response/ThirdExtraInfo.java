package com.heytap.health.wallet.model.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class ThirdExtraInfo {
    private String appName;
    private String deleteProcessUrl;
    private String linkUrl;
    private String logoUrl;
    private String pkgName;

    public String getAppName() {
        return this.appName;
    }

    public String getDeleteProcessUrl() {
        return this.deleteProcessUrl;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setDeleteProcessUrl(String str) {
        this.deleteProcessUrl = str;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setLogoUrl(String str) {
        this.logoUrl = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }
}
