package com.coloros.sceneservice.i;

import android.os.Bundle;
import com.coloros.sceneservice.aidl.IInvokeMethodCallBack;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.listener.IMethodCallBack;

/* JADX INFO: loaded from: classes13.dex */
public class a implements IMethodCallBack {
    public final /* synthetic */ IInvokeMethodCallBack Zb;
    public final /* synthetic */ String _b;
    public final /* synthetic */ b this$1;

    public a(b bVar, IInvokeMethodCallBack iInvokeMethodCallBack, String str) {
        this.this$1 = bVar;
        this.Zb = iInvokeMethodCallBack;
        this._b = str;
    }

    @Override // com.coloros.sceneservice.sceneprovider.listener.IMethodCallBack
    public void callBack(Bundle bundle) {
        try {
            IInvokeMethodCallBack iInvokeMethodCallBack = this.Zb;
            if (iInvokeMethodCallBack != null) {
                iInvokeMethodCallBack.callBack(bundle);
            }
        } catch (Exception e2) {
            f.e(e.TAG, "invokeClientMethod error:" + this._b, e2);
        }
    }
}
