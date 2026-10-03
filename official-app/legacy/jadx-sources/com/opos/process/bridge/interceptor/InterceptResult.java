package com.opos.process.bridge.interceptor;

/* JADX INFO: loaded from: classes9.dex */
public class InterceptResult {
    public static final InterceptResult SUCCESS = new InterceptResult();
    final int code;
    final String message;

    public InterceptResult() {
        this.code = 0;
        this.message = "";
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isIntercepted() {
        return this.code != 0;
    }

    public String toString() {
        return "InterceptResult{code=" + this.code + ", message='" + this.message + "'}";
    }

    public InterceptResult(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
