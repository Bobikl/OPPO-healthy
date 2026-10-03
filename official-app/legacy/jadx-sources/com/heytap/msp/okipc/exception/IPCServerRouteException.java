package com.heytap.msp.okipc.exception;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class IPCServerRouteException extends IPCServerException {
    private String path;

    public IPCServerRouteException() {
        this("");
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public IPCServerExceptionType getExceptionType() {
        return IPCServerExceptionType.ROUTE_ERROR;
    }

    public String getPath() {
        return this.path;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void readFrom(JSONObject jSONObject) {
        this.path = jSONObject.optString("path");
    }

    public void setPath(String str) {
        this.path = str;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void writeTo(JSONObject jSONObject) {
        try {
            jSONObject.put("path", this.path);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public IPCServerRouteException(String str) {
        this.path = str;
    }
}
