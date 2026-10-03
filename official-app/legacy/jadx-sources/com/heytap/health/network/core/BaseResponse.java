package com.heytap.health.network.core;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class BaseResponse<T> {
    private T body;
    private int errorCode;
    private String message;

    public T getBody() {
        return this.body;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isSuccess() {
        return this.errorCode == 0;
    }

    public void setBody(T t) {
        this.body = t;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    @NonNull
    public String toString() {
        return "BaseResponse{errorCode=" + this.errorCode + ", message='" + this.message + "', body=" + this.body + '}';
    }
}
