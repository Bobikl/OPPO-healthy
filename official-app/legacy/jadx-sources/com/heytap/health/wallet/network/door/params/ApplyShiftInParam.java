package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class ApplyShiftInParam {

    @Tag(2)
    private String cplc;

    @Tag(1)
    private String orderNo;

    public ApplyShiftInParam(String str, String str2) {
        this.orderNo = str;
        this.cplc = str2;
    }

    public String getCplc() {
        return this.cplc;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public ApplyShiftInParam() {
    }
}
