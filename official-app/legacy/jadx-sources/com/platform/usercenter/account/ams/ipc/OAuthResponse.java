package com.platform.usercenter.account.ams.ipc;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class OAuthResponse {

    @NonNull
    private final String authCode;

    @NonNull
    private final String state;

    public OAuthResponse(@NonNull String str, @NonNull String str2) {
        this.authCode = str;
        this.state = str2;
    }

    @NonNull
    public String getAuthCode() {
        return this.authCode;
    }

    @NonNull
    public String getState() {
        return this.state;
    }
}
