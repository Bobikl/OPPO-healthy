package com.coloros.sceneservice.k;

import android.os.Bundle;
import com.coloros.sceneservice.sceneprovider.listener.IMethodCallBack;
import com.coloros.sceneservice.sceneprovider.service.BaseSceneService;

/* JADX INFO: loaded from: classes13.dex */
public class c implements Runnable {
    public final /* synthetic */ IMethodCallBack Zb;
    public final /* synthetic */ String _b;
    public final /* synthetic */ BaseSceneService this$0;
    public final /* synthetic */ Bundle val$request;

    public c(BaseSceneService baseSceneService, String str, Bundle bundle, IMethodCallBack iMethodCallBack) {
        this.this$0 = baseSceneService;
        this._b = str;
        this.val$request = bundle;
        this.Zb = iMethodCallBack;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.coloros.sceneservice.i.e eVar = com.coloros.sceneservice.i.e.getInstance();
        BaseSceneService baseSceneService = this.this$0;
        eVar.a(baseSceneService.mSceneId, baseSceneService.mServiceId, this._b, this.val$request, this.Zb);
    }
}
