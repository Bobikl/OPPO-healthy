package com.coloros.sceneservice.i;

import android.os.Bundle;
import com.coloros.sceneservice.sceneprovider.listener.IMethodCallBack;

/* JADX INFO: loaded from: classes13.dex */
public class d extends e.a {
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, IMethodCallBack iMethodCallBack) {
        super(iMethodCallBack);
        this.this$0 = eVar;
    }

    @Override // com.coloros.sceneservice.aidl.IInvokeMethodCallBack
    public void callBack(Bundle bundle) {
        IMethodCallBack iMethodCallBackA = a();
        if (iMethodCallBackA != null) {
            iMethodCallBackA.callBack(bundle);
            this.G.clear();
            this.G = null;
        }
    }
}
