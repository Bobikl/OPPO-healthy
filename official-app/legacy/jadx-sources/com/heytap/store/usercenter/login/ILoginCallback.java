package com.heytap.store.usercenter.login;

/* JADX INFO: loaded from: classes14.dex */
public interface ILoginCallback<T> {
    void onLoginFailed();

    void onLoginSuccessed(T t);
}
