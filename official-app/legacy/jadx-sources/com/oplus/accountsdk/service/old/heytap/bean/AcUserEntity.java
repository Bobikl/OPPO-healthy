package com.oplus.accountsdk.service.old.heytap.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.xa;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AcUserEntity {
    private String authToken;
    private int result;
    private String resultMsg;
    private String username;

    public AcUserEntity(int i, String str, String str2, String str3) {
        this.result = i;
        this.resultMsg = str;
        this.username = str2;
        this.authToken = str3;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public int getResult() {
        return this.result;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public String getUsername() {
        return this.username;
    }

    public void setAuthToken(String str) {
        this.authToken = str;
    }

    public void setResult(int i) {
        this.result = i;
    }

    public void setResultMsg(String str) {
        this.resultMsg = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        return xa.d(this);
    }
}
