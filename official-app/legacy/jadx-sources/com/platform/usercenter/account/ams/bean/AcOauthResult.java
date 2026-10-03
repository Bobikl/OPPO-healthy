package com.platform.usercenter.account.ams.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthResult {
    private String authCode;

    public AcOauthResult(String str) {
        this.authCode = str;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
