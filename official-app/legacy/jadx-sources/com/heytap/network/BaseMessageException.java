package com.heytap.network;

import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public class BaseMessageException extends IOException {
    public int code;

    public BaseMessageException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "BaseMessageException{code=" + this.code + ", detailMessage='" + getMessage() + "'}";
    }

    public BaseMessageException(String str, int i) {
        super(str);
        this.code = i;
    }
}
