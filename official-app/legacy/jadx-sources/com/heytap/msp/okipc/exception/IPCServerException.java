package com.heytap.msp.okipc.exception;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public abstract class IPCServerException extends IPCException {
    public abstract IPCServerExceptionType getExceptionType();

    public abstract void readFrom(JSONObject jSONObject);

    public abstract void writeTo(JSONObject jSONObject);
}
