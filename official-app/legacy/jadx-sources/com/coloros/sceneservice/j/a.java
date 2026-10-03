package com.coloros.sceneservice.j;

import android.os.Bundle;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.sceneprocessor.AbsSceneProcessor;

/* JADX INFO: loaded from: classes13.dex */
public class a extends AbsSceneProcessor {
    public static final String TAG = "BaseSceneProcessor";

    public a(int i) {
        super(i);
    }

    @Override // com.coloros.sceneservice.sceneprovider.sceneprocessor.AbsSceneProcessor
    public void handleBySelfInWorkThread(Bundle bundle) {
        f.d(TAG, "handleBySelfInWorkThread sceneId:" + this.mSceneId);
        finish();
    }

    @Override // com.coloros.sceneservice.sceneprovider.sceneprocessor.AbsSceneProcessor
    public String toString() {
        return "AbsSceneClientProcessor{mSceneId=" + this.mSceneId + ", mServiceList=" + this.mServiceList + '}';
    }
}
