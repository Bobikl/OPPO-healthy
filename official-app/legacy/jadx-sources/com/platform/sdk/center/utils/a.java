package com.platform.sdk.center.utils;

import android.content.Context;
import com.heytap.usercenter.accountsdk.AccountAgent;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements AcKeyguardUtils.KeyguardDismissCallback {
    public final /* synthetic */ Context a;
    public final /* synthetic */ AcNameTask.onReqAccountCallback b;

    public a(Context context, AcNameTask.onReqAccountCallback onreqaccountcallback) {
        this.a = context;
        this.b = onreqaccountcallback;
    }

    @Override // com.platform.sdk.center.utils.AcKeyguardUtils.KeyguardDismissCallback
    public final void onDismissFailed() {
        UCLogUtil.d("AcJumpHelper", "onDismissFailed");
    }

    @Override // com.platform.sdk.center.utils.AcKeyguardUtils.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        Context context = this.a;
        AccountAgent.reqSignInAccount(context, context.getPackageName(), new b(this.b));
    }
}
