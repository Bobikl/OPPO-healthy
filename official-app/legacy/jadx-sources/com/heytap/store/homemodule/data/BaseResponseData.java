package com.heytap.store.homemodule.data;

import com.heytap.store.base.core.data.IBean;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseResponseData<T> implements IBean {
    static final int SUCCEED_CODE = 200;
    public int code;
    public T data;
    public String errorMessage;
    public String errorType;
    public String msg;

    public T getData() {
        return this.data;
    }

    public void setData(T t) {
        this.data = t;
    }
}
