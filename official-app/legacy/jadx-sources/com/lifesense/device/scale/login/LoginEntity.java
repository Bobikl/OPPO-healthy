package com.lifesense.device.scale.login;

/* JADX INFO: loaded from: classes4.dex */
public class LoginEntity {
    public String accessToken;
    public boolean needInfo;
    public String userId;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isNeedInfo() {
        return this.needInfo;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setNeedInfo(boolean z) {
        this.needInfo = z;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "LoginEntity{userId='" + this.userId + "', accessToken='" + this.accessToken + "', needInfo=" + this.needInfo + '}';
    }
}
