package com.heytap.store.sdk.service;

/* JADX INFO: loaded from: classes7.dex */
public interface IStoreDataCallBack<T> {
    void onFailure(Throwable th);

    void onResponse(T t);
}
