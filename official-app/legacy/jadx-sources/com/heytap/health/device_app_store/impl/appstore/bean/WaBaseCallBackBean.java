package com.heytap.health.device_app_store.impl.appstore.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class WaBaseCallBackBean<T> {
    private int code;
    private T data;
    private String msg;

    public int getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public String toString() {
        return "WfCallBackBean{code=" + this.code + ", msg='" + this.msg + "', data=" + this.data + '}';
    }
}
