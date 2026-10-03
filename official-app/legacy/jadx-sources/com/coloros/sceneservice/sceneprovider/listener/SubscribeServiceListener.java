package com.coloros.sceneservice.sceneprovider.listener;

import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public interface SubscribeServiceListener {
    void executeMethodByService(int i, String str, String str2, Bundle bundle, IMethodCallBack iMethodCallBack);

    void finishSceneService(int i, String str);

    void subscribeFailure();

    void subscribeSuccess();
}
