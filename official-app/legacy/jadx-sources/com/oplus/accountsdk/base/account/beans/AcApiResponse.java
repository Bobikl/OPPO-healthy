package com.oplus.accountsdk.base.account.beans;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.xa;
import com.platform.usercenter.account.ams.ipc.ResponseEnum;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcApiResponse<T> {
    private int code;
    private T data;
    private String msg;

    public AcApiResponse(int i, String str, T t) {
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
        return xa.d(this);
    }

    public AcApiResponse(ResponseEnum responseEnum, T t) {
        this.code = responseEnum.getCode();
        this.msg = responseEnum.getRemark();
        this.data = t;
    }
}
