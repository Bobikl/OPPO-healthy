package com.oplus.drs.core.net.response;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class ApiResponse<T> {
    private final int code;
    private final T data;
    private final String msg;

    public ApiResponse(int i, String str, T t) {
        this.code = i;
        this.msg = str;
        this.data = t;
    }

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public boolean isSuccess() {
        return this.code == 200;
    }

    @NonNull
    public String toString() {
        return "ApiResponse{code=" + this.code + ", msg='" + this.msg + "', data=" + this.data + '}';
    }
}
