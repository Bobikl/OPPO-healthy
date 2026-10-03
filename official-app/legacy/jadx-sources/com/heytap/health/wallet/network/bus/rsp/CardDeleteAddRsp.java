package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class CardDeleteAddRsp {

    @Tag(1)
    private boolean addDeleteCardResult;

    public boolean isSuccess() {
        return this.addDeleteCardResult;
    }

    public void setSuccess(boolean z) {
        this.addDeleteCardResult = z;
    }
}
