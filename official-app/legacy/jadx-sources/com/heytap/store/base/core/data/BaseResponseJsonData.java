package com.heytap.store.base.core.data;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseResponseJsonData<T> implements IBean {
    public int code;
    public List<T> data;

    public int getCode() {
        return this.code;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(List<T> list) {
        this.data = list;
    }
}
