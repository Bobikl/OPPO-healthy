package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class ApplyShiftInRspVo {

    @Tag(2)
    private String appCode;

    @Tag(1)
    private String orderNo;

    public String getAppCode() {
        return this.appCode;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }
}
