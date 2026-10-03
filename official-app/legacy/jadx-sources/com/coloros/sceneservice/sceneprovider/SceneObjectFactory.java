package com.coloros.sceneservice.sceneprovider;

import androidx.annotation.Keep;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.sceneprocessor.AbsSceneProcessor;
import com.coloros.sceneservice.sceneprovider.service.BaseSceneService;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public abstract class SceneObjectFactory {
    public static final String TAG = "SceneObjectFactory";
    public static SceneObjectFactory mSceneObjectFactory;

    public static SceneObjectFactory getObjectFactory() {
        return mSceneObjectFactory;
    }

    public static void setObjectFactory(SceneObjectFactory sceneObjectFactory) {
        mSceneObjectFactory = sceneObjectFactory;
    }

    @Keep
    public AbsSceneProcessor createSceneProcessor(int i) {
        f.d(TAG, "createSceneProcessor sceneId:" + i);
        return null;
    }

    @Keep
    public BaseSceneService createService(int i, String str) {
        return null;
    }
}
