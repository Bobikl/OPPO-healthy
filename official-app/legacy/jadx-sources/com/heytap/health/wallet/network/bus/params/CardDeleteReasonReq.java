package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class CardDeleteReasonReq {

    @Tag(3)
    private String appCode;

    @Tag(9)
    private String authCode;

    @Tag(2)
    private String cardNo;

    @Tag(1)
    private String cplc;

    @Tag(4)
    private String mobile;

    @Tag(6)
    private String reason;

    @Tag(5)
    private String reasonIds;

    @Tag(8)
    private String refundAccount;

    @Tag(7)
    private String refundChannel;

    public CardDeleteReasonReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.cplc = str;
        this.cardNo = str2;
        this.appCode = str3;
        this.mobile = str4;
        this.reasonIds = str5;
        this.reason = str6;
        this.refundChannel = str7;
        this.refundAccount = str8;
        this.authCode = str9;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public String getCplc() {
        return this.cplc;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getReason() {
        return this.reason;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setCardNo(String str) {
        this.cardNo = str;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public String toString() {
        return "CardDeleteReasonReq{cplc='" + this.cplc + "', cardNo='" + this.cardNo + "', appCode='" + this.appCode + "', mobile='" + this.mobile + "', reasonIds='" + this.reasonIds + "', reason='" + this.reason + "', refundChannel='" + this.refundChannel + "', refundAccount='" + this.refundAccount + "', authCode='" + this.authCode + "'}";
    }
}
