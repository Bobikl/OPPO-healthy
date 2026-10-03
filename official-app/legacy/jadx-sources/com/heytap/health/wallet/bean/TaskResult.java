package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class TaskResult {
    private Content content;
    private int resultCode;
    private String resultMsg;

    public Content getContent() {
        return this.content;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setResultMsg(String str) {
        this.resultMsg = str;
    }

    public String toString() {
        return "TaskResult{resultCode=" + this.resultCode + ", resultMsg='" + this.resultMsg + "', content=" + this.content + '}';
    }
}
