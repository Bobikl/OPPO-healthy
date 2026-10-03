package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class PreDeleteCheckReqVO {

    @Tag(1)
    private String appCode;

    @Tag(4)
    private String balance;

    @Tag(3)
    private String cardNo;

    @Tag(2)
    private String cplc;

    public PreDeleteCheckReqVO() {
    }

    public String getAppCode() {
        return this.appCode;
    }

    public String getBalance() {
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

    public void setBalance(String str) {
        this.balance = str;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }

    public String toString() {
        return "PreDeleteCheckReqVO{appCode='" + this.appCode + "', cplc='" + this.cplc + "', cardNo='" + this.cardNo + "', balance='" + this.balance + "'}";
    }

    public PreDeleteCheckReqVO(String str, String str2, String str3, String str4) {
        this.appCode = str;
        this.cplc = str2;
        this.cardNo = str3;
        this.balance = str4;
    }
}
