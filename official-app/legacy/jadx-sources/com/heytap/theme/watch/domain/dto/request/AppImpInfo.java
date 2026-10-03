package com.heytap.theme.watch.domain.dto.request;

import io.protostuff.Tag;

/* JADX INFO: loaded from: classes17.dex */
public class AppImpInfo {

    @Tag(1)
    private String pkgName;

    @Tag(2)
    private String pkgNameMd5;

    @Tag(3)
    private int versionCode;

    public String getPkgName() {
        return this.pkgName;
    }

    public String getPkgNameMd5() {
        return this.pkgNameMd5;
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

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public String toString() {
        return "AppImpInfo{pkgName='" + this.pkgName + "', pkgNameMd5='" + this.pkgNameMd5 + "', versionCode=" + this.versionCode + '}';
    }
}
