package com.heytap.databaseengine.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class CommonBackBean {
    private int anchor;
    private int errorCode;
    private Object obj;

    public CommonBackBean() {
    }

    public int getAnchor() {
        return this.anchor;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public Object getObj() {
        return this.obj;
    }

    public void setAnchor(int i) {
        this.anchor = i;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String toString() {
        return "CommonBackBean{errorCode=" + this.errorCode + ", obj=" + this.obj + ", anchor=" + this.anchor + '}';
    }

    public CommonBackBean(int i, Object obj) {
        this.errorCode = i;
        this.obj = obj;
    }

    public CommonBackBean(int i, Object obj, int i2) {
        this.errorCode = i;
        this.obj = obj;
        this.anchor = i2;
    }
}
