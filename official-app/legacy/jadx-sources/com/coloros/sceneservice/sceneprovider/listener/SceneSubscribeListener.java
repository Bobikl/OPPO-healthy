package com.coloros.sceneservice.sceneprovider.listener;

import com.coloros.sceneservice.sceneprovider.api.CallResult;

/* JADX INFO: loaded from: classes13.dex */
public interface SceneSubscribeListener {
    void onSubscribeSceneEnd(CallResult callResult);

    void onUnSubscribeSceneEnd(CallResult callResult);
}
