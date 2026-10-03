package com.heytap.theme.watch.domain.dto.response.user;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class AppPayInfoDto implements Serializable {
    private static final long serialVersionUID = -1478423427071770649L;

    @Tag(4)
    private String pay;

    @Tag(1)
    private String pkgName;

    @Tag(2)
    private String pkgNameMd5;

    @Tag(3)
    private Integer versionCode;

    public String getPay() {
        return this.pay;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getPkgNameMd5() {
        return this.pkgNameMd5;
    }

    public Integer getVersionCode() {
        return this.versionCode;
    }

    public void setPay(String str) {
        this.pay = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setPkgNameMd5(String str) {
        this.pkgNameMd5 = str;
    }

    public void setVersionCode(Integer num) {
        this.versionCode = num;
    }

    public String toString() {
        return "AppPayInfoDto{pkgName='" + this.pkgName + "', pkgNameMd5='" + this.pkgNameMd5 + "', versionCode=" + this.versionCode + ", pay='" + this.pay + "'}";
    }
}
