package com.platform.usercenter.account.ams.ipc.support;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcIpcResponse {
    private int code;
    private AcIpcResult data;
    private String msg;

    public AcIpcResponse(int i, String str, AcIpcResult acIpcResult) {
        this.code = i;
        this.msg = str;
        this.data = acIpcResult;
    }

    public int getCode() {
        return this.code;
    }

    public AcIpcResult getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }
}
