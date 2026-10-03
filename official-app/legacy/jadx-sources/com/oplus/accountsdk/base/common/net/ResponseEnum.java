package com.oplus.accountsdk.base.common.net;

/* JADX INFO: loaded from: classes6.dex */
public enum ResponseEnum {
    ERROR_NETWORK_NOT_AVAILABLE(-218, "Network is not available");

    public int code;
    public String remark;

    ResponseEnum(int i, String str) {
        this.code = i;
        this.remark = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getRemark() {
        return this.remark;
    }
}
