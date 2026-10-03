package com.heytap.usercenter.accountsdk.model;

import com.google.gson.Gson;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class SignInAccount {
    public String deviceId;
    public boolean isLogin;
    public String resultCode;
    public String resultMsg;
    public String token;
    public BasicUserInfo userInfo;

    public String toString() {
        return new Gson().toJson(this);
    }
}
