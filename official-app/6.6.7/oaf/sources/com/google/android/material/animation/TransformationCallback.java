package com.google.android.material.animation;

import android.view.View;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface TransformationCallback<T extends View> {
    void onScaleChanged(T t);

    void onTranslationChanged(T t);
}
