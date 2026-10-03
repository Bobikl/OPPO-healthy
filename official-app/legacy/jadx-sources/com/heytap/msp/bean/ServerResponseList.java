package com.heytap.msp.bean;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ServerResponseList<T> extends ServerResponse {
    private transient List<T> data;

    public ServerResponseList() {
    }

    public List<T> getData() {
        return this.data;
    }

    @Override // com.heytap.msp.bean.ServerResponse
    public boolean isSuccess() {
        List<T> list;
        return super.isSuccess() && (list = this.data) != null && list.size() > 0;
    }

    public void setData(List<T> list) {
        this.data = list;
    }

    public String toString() {
        return "ServerResponseList{code=" + this.code + ", message='" + this.message + "', data=" + this.data + '}';
    }

    public ServerResponseList(int i, String str) {
        super(i, str);
    }

    public ServerResponseList(int i, String str, List<T> list) {
        super(i, str);
        this.data = list;
    }
}
