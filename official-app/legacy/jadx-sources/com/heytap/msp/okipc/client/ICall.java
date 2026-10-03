package com.heytap.msp.okipc.client;

/* JADX INFO: loaded from: classes19.dex */
public interface ICall<T> {
    void enqueue(Callback<T> callback);

    e<T> execute() throws Exception;

    com.heytap.msp.okipc.d request();
}
