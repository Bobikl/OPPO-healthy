package com.heytap.msp.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class ServerResponse implements Serializable {
    private static final int ERROR_SUCCESS = 0;
    private static final long serialVersionUID = 4015909983561786857L;
    int code;
    String message;

    public ServerResponse() {
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isSuccess() {
        return this.code == 0;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public ServerResponse(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
