package com.heytap.msp.okipc.exception;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class IPCServerBundleException extends IPCServerException {
    private String msg;

    public IPCServerBundleException() {
        this(null);
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public IPCServerExceptionType getExceptionType() {
        return IPCServerExceptionType.BUNDLE_ERROR;
    }

    public String getMsg() {
        return this.msg;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void readFrom(JSONObject jSONObject) {
        this.msg = jSONObject.optString("msg");
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    @Override // com.heytap.msp.okipc.exception.IPCServerException
    public void writeTo(JSONObject jSONObject) {
        try {
            jSONObject.put("msg", this.msg);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public IPCServerBundleException(String str) {
        this.msg = str;
    }
}
