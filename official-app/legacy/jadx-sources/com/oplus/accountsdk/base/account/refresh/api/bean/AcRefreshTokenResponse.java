package com.oplus.accountsdk.base.account.refresh.api.bean;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.oplus.accountsdk.base.account.beans.AcTokenBean;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcRefreshTokenResponse {

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
