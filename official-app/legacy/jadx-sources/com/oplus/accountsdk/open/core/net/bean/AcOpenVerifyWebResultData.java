package com.oplus.accountsdk.open.core.net.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenVerifyWebResultData {
    private int code = 200;
    private String id;
    private String msg;
    private int passedRound;
    private String processToken;
    private String ticket;

    public int getCode() {
        return this.code;
    }

    public String getId() {
        return this.id;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getPassedRound() {
        return this.passedRound;
    }

    public String getProcessToken() {
        return this.processToken;
    }

    public String getTicket() {
        return this.ticket;
    }

    public boolean isSuccess() {
        return this.code == 200;
    }
}
