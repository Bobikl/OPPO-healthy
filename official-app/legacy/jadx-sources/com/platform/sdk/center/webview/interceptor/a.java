package com.platform.sdk.center.webview.interceptor;

import com.heytap.usercenter.accountsdk.http.AccountNameTask;
import com.heytap.usercenter.accountsdk.model.SignInAccount;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements AccountNameTask.onReqAccountCallback<SignInAccount> {
    public final /* synthetic */ UwsGetTokenInterceptorImpl.SignInAccountCallback a;

    public a(UwsGetTokenInterceptorImpl.SignInAccountCallback signInAccountCallback) {
        this.a = signInAccountCallback;
    }

    @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
    public final void onReqFinish(SignInAccount signInAccount) {
        SignInAccount signInAccount2 = signInAccount;
        if (signInAccount2.isLogin) {
            this.a.onReqInfo(signInAccount2);
        } else {
            this.a.onReqInfo(null);
        }
    }

    @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
    public final void onReqLoading() {
    }

    @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
    public final void onReqStart() {
    }
}
