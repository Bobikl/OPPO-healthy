package com.heytap.store.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class BaseResponseData<T> implements IBean, Serializable {
    static final int SUCCEED_CODE = 200;
    public int code;
    public T data;

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(T t) {
        this.data = t;
    }
}
