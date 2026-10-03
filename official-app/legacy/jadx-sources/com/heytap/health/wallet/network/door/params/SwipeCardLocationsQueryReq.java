package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SwipeCardLocationsQueryReq {

    @Tag(2)
    private String appCode;

    @Tag(1)
    private String cplc;

    public SwipeCardLocationsQueryReq() {
    }

    public String getAppCode() {
        return this.appCode;
    }

    public String getCplc() {
        return this.cplc;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }

    public SwipeCardLocationsQueryReq(String str, String str2) {
        this.cplc = str;
        this.appCode = str2;
    }
}
