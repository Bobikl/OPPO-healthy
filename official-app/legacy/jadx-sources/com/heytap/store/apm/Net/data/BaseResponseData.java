package com.heytap.store.apm.Net.data;

import com.heytap.store.base.core.data.IBean;

/* JADX INFO: loaded from: classes19.dex */
public class BaseResponseData implements IBean {
    public int code;
    public String errorMessage;
    public String message;
    public String msg;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
