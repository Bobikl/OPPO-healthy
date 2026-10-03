package com.platform.account.webview.api;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public enum WebViewError {
    CANCELED(1, "canceled"),
    BUNDLE_IS_NULL(2, "bundle is null"),
    RESULT_IS_NULL(3, "result is null");

    private int errorCode;
    private String message;

    WebViewError(int i, String str) {
        this.errorCode = i;
        this.message = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.message;
    }
}
