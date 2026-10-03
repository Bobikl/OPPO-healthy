package com.oplus.accountsdk.base.sdk.verifysystembasic.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcVerifyResultData {
    private String businessId;
    private int code;
    private String msg;
    private String requestCode;
    private String ticket;

    public AcVerifyResultData() {
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getRequestCode() {
        return this.requestCode;
    }

    public String getTicket() {
        return this.ticket;
    }

    public void setBusinessId(String str) {
        this.businessId = str;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setRequestCode(String str) {
        this.requestCode = str;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public String toString() {
        return "AcVerifyResultData{code=" + this.code + ", msg='" + this.msg + "', ticket='" + this.ticket + "', businessId='" + this.businessId + "', requestCode='" + this.requestCode + "'}";
    }

    public AcVerifyResultData(int i, String str, String str2, String str3, String str4) {
        this.code = i;
        this.msg = str;
        this.ticket = str2;
        this.businessId = str3;
        this.requestCode = str4;
    }
}
