package com.coloros.sceneservice.k;

import android.os.Bundle;
import com.coloros.sceneservice.sceneprovider.listener.IMethodCallBack;
import com.coloros.sceneservice.sceneprovider.service.BaseSceneService;

/* JADX INFO: loaded from: classes13.dex */
public class d implements Runnable {
    public final /* synthetic */ IMethodCallBack Zb;
    public final /* synthetic */ String _b;
    public final /* synthetic */ BaseSceneService this$0;
    public final /* synthetic */ Bundle val$request;
    public final /* synthetic */ int xc;

    public d(BaseSceneService baseSceneService, int i, String str, Bundle bundle, IMethodCallBack iMethodCallBack) {
        this.this$0 = baseSceneService;
        this.xc = i;
        this._b = str;
        this.val$request = bundle;
        this.Zb = iMethodCallBack;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.coloros.sceneservice.i.e.getInstance().a(this.xc, this.this$0.mServiceId, this._b, this.val$request, this.Zb);
    }
}
