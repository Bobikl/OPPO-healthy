package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class LocalDownloadParam {

    @Tag(2)
    private String pkgName;

    @Tag(3)
    private String pkgNameMd5;

    @Tag(5)
    private String token;

    @Tag(1)
    private int type;

    @Tag(4)
    private int versionCode;

    public String getPkgName() {
        return this.pkgName;
    }

    public String getPkgNameMd5() {
        return this.pkgNameMd5;
    }

    public String getToken() {
        return this.token;
    }

    public int getType() {
        return this.type;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setPkgNameMd5(String str) {
        this.pkgNameMd5 = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public String toString() {
        return "LocalDownloadParam{type=" + this.type + ", pkgName='" + this.pkgName + "', pkgNameMd5='" + this.pkgNameMd5 + "', versionCode=" + this.versionCode + ", token='" + this.token + "'}";
    }
}
