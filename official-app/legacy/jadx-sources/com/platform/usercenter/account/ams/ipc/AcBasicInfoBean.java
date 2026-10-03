package com.platform.usercenter.account.ams.ipc;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcBasicInfoBean {

    @Nullable
    public String bizAppId;

    @Nullable
    public String bizAppKey;

    @NonNull
    public String pkgName;

    @NonNull
    public String pkgVersion;
    public int pkgVersionCode;

    @NonNull
    public String sdkVersion;

    public AcBasicInfoBean(@NonNull String str, @NonNull String str2, int i, @NonNull String str3) {
        this.pkgName = str;
        this.pkgVersion = str2;
        this.pkgVersionCode = i;
        this.sdkVersion = str3;
    }

    @Nullable
    public String getBizAppI() {
        return this.bizAppId;
    }

    @Nullable
    public String getBizAppK() {
        return this.bizAppKey;
    }

    @NonNull
    public String getPkgName() {
        return this.pkgName;
    }

    @NonNull
    public String getPkgVersion() {
        return this.pkgVersion;
    }

    public int getPkgVersionCode() {
        return this.pkgVersionCode;
    }

    @NonNull
    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public void setBizAppI(@Nullable String str) {
        this.bizAppId = str;
    }

    public void setBizAppK(@Nullable String str) {
        this.bizAppKey = str;
    }

    public void setPkgName(@NonNull String str) {
        this.pkgName = str;
    }

    public void setPkgVersion(@NonNull String str) {
        this.pkgVersion = str;
    }

    public void setPkgVersionCode(int i) {
        this.pkgVersionCode = i;
    }

    public void setSdkVersion(@NonNull String str) {
        this.sdkVersion = str;
    }
}
