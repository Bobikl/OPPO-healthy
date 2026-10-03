package com.coloros.sceneservice.h;

import com.coloros.sceneservice.i.e;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.api.CallResult;
import com.coloros.sceneservice.sceneprovider.api.SceneAbilityApi;
import com.coloros.sceneservice.sceneprovider.listener.SceneSubscribeListener;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Runnable {
    public final /* synthetic */ String Xb;
    public final /* synthetic */ SceneSubscribeListener Yb;

    public b(String str, SceneSubscribeListener sceneSubscribeListener) {
        this.Xb = str;
        this.Yb = sceneSubscribeListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CallResult callResultG = e.getInstance().g(this.Xb);
        f.i(SceneAbilityApi.TAG, "unSubscribeScene result:" + callResultG);
        SceneSubscribeListener sceneSubscribeListener = this.Yb;
        if (sceneSubscribeListener != null) {
            sceneSubscribeListener.onUnSubscribeSceneEnd(callResultG);
        }
    }
}
