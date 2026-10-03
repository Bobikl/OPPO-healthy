package com.platform.usercenter.account.ams.ipc.support;

/* JADX INFO: loaded from: classes9.dex */
public class AcInnerCallbackWrapper {
    private IAcIpcRequestCallback<Object> callback;
    private String traceId;

    public AcInnerCallbackWrapper(String str, IAcIpcRequestCallback<Object> iAcIpcRequestCallback) {
        this.traceId = str;
        this.callback = iAcIpcRequestCallback;
    }

    public IAcIpcRequestCallback<Object> getCallback() {
        return this.callback;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String toString() {
        return "AcInnerCallbackWrapper{traceId='" + this.traceId + "', callback=" + this.callback + '}';
    }
}
