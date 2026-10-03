package com.oplus.accountsdk.open.core.net.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.accountsdk.open.core.beans.AcTokenBean;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenBizAuthResponse {

    @SerializedName("v3BizTokenResp")
    private AcTokenBean bizToken;
    private String deviceId;
    private String extraDataJson;

    public AcTokenBean getBizToken() {
        return this.bizToken;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getExtraDataJson() {
        return this.extraDataJson;
    }

    public void setBizToken(AcTokenBean acTokenBean) {
        this.bizToken = acTokenBean;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setExtraDataJson(String str) {
        this.extraDataJson = str;
    }
}
