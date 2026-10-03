package com.heytap.msp.okipc.exception;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class IPCServerRejectedException extends IPCServerException {
    private String message;

    public IPCServerRejectedException() {
        this("IPC dispatch blocked, please retry later");
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public IPCServerExceptionType getExceptionType() {
        return IPCServerExceptionType.REJECTED;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void readFrom(JSONObject jSONObject) {
        this.message = jSONObject.optString("message", "IPC dispatch blocked, please retry later");
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void writeTo(JSONObject jSONObject) {
        try {
            jSONObject.put("message", this.message);
        } catch (Exception unused) {
        }
    }

    public IPCServerRejectedException(String str) {
        this.message = str;
    }
}
