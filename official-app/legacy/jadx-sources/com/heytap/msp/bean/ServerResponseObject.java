package com.heytap.msp.bean;

/* JADX INFO: loaded from: classes19.dex */
public class ServerResponseObject<T> extends ServerResponse {
    private transient T data;

    public ServerResponseObject() {
    }

    public T getData() {
        return this.data;
    }

    @Override // com.heytap.msp.bean.ServerResponse
    public boolean isSuccess() {
        return super.isSuccess() && this.data != null;
    }

    public void setData(T t) {
        this.data = t;
    }

    public String toString() {
        return "ServerResponseObject{code=" + this.code + ", message='" + this.message + "', data=" + this.data + '}';
    }

    public ServerResponseObject(int i, String str) {
        super(i, str);
    }

    public ServerResponseObject(int i, String str, T t) {
        super(i, str);
        this.data = t;
    }
}
