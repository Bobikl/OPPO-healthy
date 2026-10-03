package com.oplus.accountsdk.open.core.beans;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcRefreshTokenRequest {
    private String envInfo;
    private String[] packages;
    private String ssoid;

    public AcRefreshTokenRequest(String str, String[] strArr, String str2) {
        this.envInfo = str2;
        this.ssoid = str;
        this.packages = strArr;
    }

    public String getEnvInfo() {
        return this.envInfo;
    }

    public void setEnvInfo(String str) {
        this.envInfo = str;
    }
}
