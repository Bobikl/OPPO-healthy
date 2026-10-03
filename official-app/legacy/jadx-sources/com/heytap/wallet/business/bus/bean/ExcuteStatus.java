package com.heytap.wallet.business.bus.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ExcuteStatus {
    private String errorCode;
    private boolean isSuccess;
    private String resultMsg;

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setResultMsg(String str) {
        this.resultMsg = str;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }
}
