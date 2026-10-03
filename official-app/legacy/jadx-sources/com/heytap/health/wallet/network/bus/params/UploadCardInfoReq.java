package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class UploadCardInfoReq {

    @Tag(4)
    private String appCode;

    @Tag(2)
    private Integer balance;

    @Tag(1)
    private String cardNo;

    @Tag(3)
    private String cplc;

    public String getAppCode() {
        return this.appCode;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public String getCplc() {
        return this.cplc;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setBalance(Integer num) {
        this.balance = num;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }

    public String toString() {
        return "UploadCardInfoReq{cardNo='" + this.cardNo + "', balance=" + this.balance + ", cplc='" + this.cplc + "', appCode='" + this.appCode + "'}";
    }
}
