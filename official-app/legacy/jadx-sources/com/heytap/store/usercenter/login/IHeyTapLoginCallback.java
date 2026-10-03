package com.heytap.store.usercenter.login;

/* JADX INFO: loaded from: classes14.dex */
public interface IHeyTapLoginCallback {
    String getSsoid();

    String getToken();

    void goToLogin(ILoginCallback iLoginCallback);

    void loginInValid(ILoginCallback iLoginCallback);
}
