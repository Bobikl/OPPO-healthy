package com.platform.usercenter.account.ams.ipc;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcAuthRequestBean {

    @NonNull
    private String appId;

    @NonNull
    private String appKey;
    private boolean isForeground;

    @NonNull
    private boolean isShowPage;

    @Nullable
    private String scope;

    @Nullable
    private String state;

    public AcAuthRequestBean(@NonNull String str, @NonNull String str2, boolean z, boolean z2, @Nullable String str3, @Nullable String str4) {
        this.appId = str;
        this.appKey = str2;
        this.isForeground = z;
        this.isShowPage = z2;
        this.state = str3;
        this.scope = str4;
    }

    @NonNull
    public String getAppId() {
        return this.appId;
    }

    @NonNull
    public String getAppKey() {
        return this.appKey;
    }

    @Nullable
    public String getScope() {
        return this.scope;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    public boolean isForeground() {
        return this.isForeground;
    }

    public boolean isShowPage() {
        return this.isShowPage;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppKey(@NonNull String str) {
        this.appKey = str;
    }

    public void setForeground(boolean z) {
        this.isForeground = z;
    }

    public void setScope(@Nullable String str) {
        this.scope = str;
    }

    public void setShowPage(boolean z) {
        this.isShowPage = z;
    }

    public void setState(@Nullable String str) {
        this.state = str;
    }
}
