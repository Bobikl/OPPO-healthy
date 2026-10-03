package com.platform.usercenter.account.ams.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcEncryptSsoidResponse {
    public String encryptSsoid;

    public AcEncryptSsoidResponse(String str) {
        this.encryptSsoid = str;
    }

    public String getEncryptGuid() {
        return this.encryptSsoid;
    }
}
