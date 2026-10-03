package com.coloros.sceneservice.i;

import android.os.Bundle;
import com.coloros.sceneservice.aidl.IInvokeMethodCallBack;
import com.coloros.sceneservice.aidl.ISceneClientCallBack;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.listener.SubscribeServiceListener;

/* JADX INFO: loaded from: classes13.dex */
public class b extends ISceneClientCallBack.Stub {
    public final /* synthetic */ e this$0;

    public b(e eVar) {
        this.this$0 = eVar;
    }

    @Override // com.coloros.sceneservice.aidl.ISceneClientCallBack
    public void finishSceneService(int i, String str) {
        f.i(e.TAG, "finishSceneService sceneId=" + i + ",serviceId=" + str);
        SubscribeServiceListener subscribeServiceListener = (SubscribeServiceListener) this.this$0.tc.remove(i + ":" + str);
        if (subscribeServiceListener != null) {
            subscribeServiceListener.finishSceneService(i, str);
        }
    }

    @Override // com.coloros.sceneservice.aidl.ISceneClientCallBack
    public void invokeClientMethod(int i, String str, String str2, Bundle bundle, IInvokeMethodCallBack iInvokeMethodCallBack) {
        f.i(e.TAG, "executeMethodByService sceneId=" + i + ",serviceId=" + str);
        SubscribeServiceListener subscribeServiceListener = (SubscribeServiceListener) this.this$0.tc.get(i + ":" + str);
        if (subscribeServiceListener != null) {
            subscribeServiceListener.executeMethodByService(i, str, str2, bundle, new a(this, iInvokeMethodCallBack, str2));
        }
    }
}
