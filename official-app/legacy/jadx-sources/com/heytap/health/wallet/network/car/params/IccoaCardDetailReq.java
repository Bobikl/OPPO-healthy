package com.heytap.health.wallet.network.car.params;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class IccoaCardDetailReq {

    @Tag(3)
    private String cardId;

    @Tag(1)
    private String cplc;

    @Tag(2)
    private String keyId;

    public String getCardId() {
        return this.cardId;
    }

    public String getCplc() {
        return this.cplc;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public void setCardId(String str) {
        this.cardId = str;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }
}
