package com.platform.sdk.center.sdk.mvvm.model.data;

import com.google.gson.Gson;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcAccount {
    public String deviceId;
    public boolean isLogin;
    public String resultCode;
    public String resultMsg;
    public String token;
    public AcInfo vipInfo;

    public String toString() {
        return "VIPAccount{isLogin=" + this.isLogin + ", deviceId='" + this.deviceId + "', token='" + this.token + "', vipInfo='" + new Gson().toJson(this.vipInfo) + "', resultCode=" + this.resultCode + "', resultMsg='" + this.resultMsg + '}';
    }
}
