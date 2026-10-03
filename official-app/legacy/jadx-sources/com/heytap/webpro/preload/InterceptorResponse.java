package com.heytap.webpro.preload;

import com.client.platform.opensdk.pay.PayResponse;

/* JADX INFO: loaded from: classes3.dex */
public enum InterceptorResponse {
    FAIL_5000(5000, "url is null"),
    FAIL_5001(5001, "not set IPreloadResManager"),
    FAIL_5002(5002, "interceptor fail"),
    FAIL_5003(PayResponse.ERROR_PARAM_INVALID, "file is not found");

    private final int code;
    private final String msg;

    InterceptorResponse(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
