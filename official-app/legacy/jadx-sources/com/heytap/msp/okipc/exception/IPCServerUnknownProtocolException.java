package com.heytap.msp.okipc.exception;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class IPCServerUnknownProtocolException extends IPCServerException {
    private int version;

    public IPCServerUnknownProtocolException() {
        this(0);
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public IPCServerExceptionType getExceptionType() {
        return IPCServerExceptionType.UNKNOWN_PROTOCOL;
    }

    public int getVersion() {
        return this.version;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void readFrom(JSONObject jSONObject) {
        this.version = jSONObject.optInt("version", 0);
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void writeTo(JSONObject jSONObject) {
        try {
            jSONObject.put("version", this.version);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public IPCServerUnknownProtocolException(int i) {
        this.version = i;
    }
}
