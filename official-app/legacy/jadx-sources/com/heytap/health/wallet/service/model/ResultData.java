package com.heytap.health.wallet.service.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class ResultData {
    private String data;
    private int resultCode;
    private String resultMsg;

    public String getData() {
        return this.data;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setResultMsg(String str) {
        this.resultMsg = str;
    }
}
