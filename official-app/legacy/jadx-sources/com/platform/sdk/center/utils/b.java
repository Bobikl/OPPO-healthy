package com.platform.sdk.center.utils;

import com.heytap.usercenter.accountsdk.http.AccountNameTask;
import com.heytap.usercenter.accountsdk.model.SignInAccount;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements AccountNameTask.onReqAccountCallback<SignInAccount> {
    public final /* synthetic */ AcNameTask.onReqAccountCallback a;

    public b(AcNameTask.onReqAccountCallback onreqaccountcallback) {
        this.a = onreqaccountcallback;
    }

    @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
    public final void onReqFinish(SignInAccount signInAccount) {
        SignInAccount signInAccount2 = signInAccount;
        AcNameTask.onReqAccountCallback onreqaccountcallback = this.a;
        if (onreqaccountcallback != null) {
            onreqaccountcallback.onReqFinish(signInAccount2);
        }
    }

    @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
    public final void onReqLoading() {
        AcNameTask.onReqAccountCallback onreqaccountcallback = this.a;
        if (onreqaccountcallback != null) {
            onreqaccountcallback.onReqLoading();
        }
    }

    @Override // com.heytap.usercenter.accountsdk.http.AccountNameTask.onReqAccountCallback
    public final void onReqStart() {
        AcNameTask.onReqAccountCallback onreqaccountcallback = this.a;
        if (onreqaccountcallback != null) {
            onreqaccountcallback.onReqStart();
        }
    }
}
