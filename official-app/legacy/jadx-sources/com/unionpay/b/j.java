package com.unionpay.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.oplus.aiunit.vision.f1n;
import com.unionpay.tsmservice.mi.mini.ITsmCallback;
import com.unionpay.tsmservice.mi.mini.result.QueryVendorPayStatusResult;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends ITsmCallback.Stub {
    private int a = 4000;
    private Handler b;

    public j(Handler handler) {
        this.b = handler;
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onError(String str, String str2) {
        f1n.d("uppay", "errorCode:" + str + ", errorDesc:" + str2);
        Handler handler = this.b;
        handler.sendMessage(Message.obtain(handler, 1, this.a, 0, str + str2));
    }

    @Override // com.unionpay.tsmservice.mi.mini.ITsmCallback
    public final void onResult(Bundle bundle) {
        if (this.a != 4000) {
            return;
        }
        f1n.d("uppay-spay", "query vendor pay status callback");
        bundle.setClassLoader(QueryVendorPayStatusResult.class.getClassLoader());
        Bundle queryVendorPayStatusResult = ((QueryVendorPayStatusResult) bundle.get("result")).getQueryVendorPayStatusResult();
        Handler handler = this.b;
        handler.sendMessage(Message.obtain(handler, 4000, queryVendorPayStatusResult));
    }
}
