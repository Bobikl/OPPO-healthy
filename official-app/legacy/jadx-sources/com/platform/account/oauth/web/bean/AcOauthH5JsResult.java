package com.platform.account.oauth.web.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.platform.usercenter.oauth.util.AcOauthJsonUtils;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthH5JsResult<T> {
    public int code;
    public T data;
    public String msg;

    public AcOauthH5JsResult(int i, String str, T t) {
        this.code = i;
        this.msg = str;
        this.data = t;
    }

    @NonNull
    public String toString() {
        return AcOauthJsonUtils.toJson(this);
    }
}
