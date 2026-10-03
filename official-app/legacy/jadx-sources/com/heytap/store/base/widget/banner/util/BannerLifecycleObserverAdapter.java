package com.heytap.store.base.widget.banner.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.heytap.store.platform.tools.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class BannerLifecycleObserverAdapter implements LifecycleObserver {
    private final LifecycleOwner mLifecycleOwner;
    private final BannerLifecycleObserver mObserver;

    public BannerLifecycleObserverAdapter(LifecycleOwner lifecycleOwner, BannerLifecycleObserver bannerLifecycleObserver) {
        this.mLifecycleOwner = lifecycleOwner;
        this.mObserver = bannerLifecycleObserver;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LogUtils.INSTANCE.d("onDestroy");
        this.mObserver.onDestroy(this.mLifecycleOwner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        LogUtils.INSTANCE.d("onStart");
        this.mObserver.onStart(this.mLifecycleOwner);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        LogUtils.INSTANCE.d("onStop");
        this.mObserver.onStop(this.mLifecycleOwner);
    }
}
