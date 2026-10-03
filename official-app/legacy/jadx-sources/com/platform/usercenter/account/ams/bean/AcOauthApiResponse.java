package com.platform.usercenter.account.ams.bean;

import androidx.annotation.Keep;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthApiResponse<T> {
    private int code;
    private T data;
    private String msg;

    public AcOauthApiResponse(int i, String str, T t) {
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
        return this.code == ResponseEnum.SUCCESS.getCode();
    }

    public String toString() {
        return "{code=" + this.code + ", msg='" + this.msg + "', data=" + this.data + '}';
    }
}
