package com.heytap.theme.watch.domain.dto.response.common;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class ResponsesBody<T> implements Serializable {
    private static final long serialVersionUID = 1481203207927840409L;

    @Tag(3)
    private T body;

    @Tag(1)
    private int errorCode;

    @Tag(2)
    private String message;

    public ResponsesBody() {
    }

    public T getBody() {
        return this.body;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setBody(T t) {
        this.body = t;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public ResponsesBody(int i, T t, String str) {
        this.errorCode = i;
        this.body = t;
        this.message = str;
    }
}
