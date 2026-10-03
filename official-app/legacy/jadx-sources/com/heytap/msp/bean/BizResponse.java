package com.heytap.msp.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class BizResponse<T> implements Serializable {
    private static final long serialVersionUID = -2881606998535114733L;
    private int code;
    private String message;
    private transient T response;
    private String traceId;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getResponse() {
        return this.response;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setResponse(T t) {
        this.response = t;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public String toString() {
        return "BizResponse{code=" + this.code + "，trace=" + this.traceId + ", message='" + this.message + "', response=" + this.response + "}";
    }
}
