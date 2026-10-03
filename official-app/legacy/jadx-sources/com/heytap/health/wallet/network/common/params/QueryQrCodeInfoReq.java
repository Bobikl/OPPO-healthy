package com.heytap.health.wallet.network.common.params;

import androidx.annotation.Keep;
import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class QueryQrCodeInfoReq implements Serializable {
    private static final long serialVersionUID = 1276479034193111143L;

    @Tag(3)
    private Byte cardType;

    @Tag(2)
    private String cplc;

    @Tag(1)
    private String voucher;

    public QueryQrCodeInfoReq(String str, String str2) {
        this.voucher = str;
        this.cplc = str2;
    }

    public Byte getCardType() {
        return this.cardType;
    }

    public String getVoucher() {
        return this.voucher;
    }

    public void setCardType(Byte b) {
        this.cardType = b;
    }

    public void setVoucher(String str) {
        this.voucher = str;
    }

    public QueryQrCodeInfoReq() {
    }
}
