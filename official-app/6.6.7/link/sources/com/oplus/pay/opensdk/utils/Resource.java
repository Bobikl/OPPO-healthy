package com.oplus.pay.opensdk.utils;

import androidx.annotation.Keep;
import com.oplus.pay.opensdk.eum.PaySdkEnum;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public final class Resource<T> {
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

    public void updateStatus(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public void updateStatus(PaySdkEnum paySdkEnum) {
        this.code = paySdkEnum.getCode();
        this.msg = paySdkEnum.getMsg();
    }
}
