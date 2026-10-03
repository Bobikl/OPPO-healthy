package com.coloros.sceneservice.k;

import android.os.Bundle;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.listener.IMethodCallBack;
import com.coloros.sceneservice.sceneprovider.listener.SubscribeServiceListener;
import com.coloros.sceneservice.sceneprovider.service.BaseSceneService;

/* JADX INFO: loaded from: classes13.dex */
public class a implements SubscribeServiceListener {
    public final /* synthetic */ BaseSceneService this$0;
    public final /* synthetic */ int xc;

    public a(BaseSceneService baseSceneService, int i) {
        this.this$0 = baseSceneService;
        this.xc = i;
    }

    @Override // com.coloros.sceneservice.sceneprovider.listener.SubscribeServiceListener
    public void executeMethodByService(int i, String str, String str2, Bundle bundle, IMethodCallBack iMethodCallBack) {
        f.d(BaseSceneService.TAG, "executeMethodByService sceneId:" + i + ",serviceId:" + str + ",method:" + str2);
        this.this$0.executeMethodByService(i, str, str2, bundle, iMethodCallBack);
    }

    @Override // com.coloros.sceneservice.sceneprovider.listener.SubscribeServiceListener
    public void finishSceneService(int i, String str) {
        f.d(BaseSceneService.TAG, "finishSceneService, sceneId=" + i + ",mServiceId= " + str);
        this.this$0.finishByService();
    }

    @Override // com.coloros.sceneservice.sceneprovider.listener.SubscribeServiceListener
    public void subscribeFailure() {
        f.d(BaseSceneService.TAG, "subscribeFailure:" + this.this$0.mServiceId);
        this.this$0.mSceneIds.remove(this.xc);
    }

    @Override // com.coloros.sceneservice.sceneprovider.listener.SubscribeServiceListener
    public void subscribeSuccess() {
        f.d(BaseSceneService.TAG, "subscribeSuccess:" + this.this$0.mServiceId);
        this.this$0.mSceneIds.add(Integer.valueOf(this.xc));
    }
}
