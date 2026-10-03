package com.heytap.store.business.component.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class BaseResponseData<T> {
    static final int SUCCEED_CODE = 200;
    public int code;
    public T data;
    public String errorMessage;
    public String errorType;
    public String message;
    public String msg;

    public T getData() {
        return this.data;
    }

    public void setData(T t) {
        this.data = t;
    }
}
