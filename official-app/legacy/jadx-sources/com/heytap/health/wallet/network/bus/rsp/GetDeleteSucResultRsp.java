package com.heytap.health.wallet.network.bus.rsp;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class GetDeleteSucResultRsp implements Serializable {
    private static final long serialVersionUID = 8867422039946891320L;

    @Tag(1)
    private String delSucDescText;

    @Tag(2)
    private String refundImageUrl;

    @Tag(3)
    private String refundRecordUrl;

    public String getDelSucDescText() {
        return this.delSucDescText;
    }

    public String getRefundImageUrl() {
        return this.refundImageUrl;
    }

    public String getRefundRecordUrl() {
        return this.refundRecordUrl;
    }

    public void setDelSucDescText(String str) {
        this.delSucDescText = str;
    }

    public void setRefundImageUrl(String str) {
        this.refundImageUrl = str;
    }
}
