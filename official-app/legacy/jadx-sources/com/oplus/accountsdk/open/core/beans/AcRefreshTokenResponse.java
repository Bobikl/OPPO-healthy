package com.oplus.accountsdk.open.core.beans;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcRefreshTokenResponse {
    public String deviceId;
    public Map<String, String> secondaryTokenMap;

    @Nullable
    public AcTokenBean v3TokenResp;

    public AcRefreshTokenResponse(@Nullable AcTokenBean acTokenBean) {
        this.v3TokenResp = acTokenBean;
    }

    @Nullable
    public AcTokenBean getV3TokenResp() {
        return this.v3TokenResp;
    }

    public void setV3TokenResp(@Nullable AcTokenBean acTokenBean) {
        this.v3TokenResp = acTokenBean;
    }
}
