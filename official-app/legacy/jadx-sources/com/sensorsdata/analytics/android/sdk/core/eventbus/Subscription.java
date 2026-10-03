package com.sensorsdata.analytics.android.sdk.core.eventbus;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Subscription<T> {
    String eventTag;

    public abstract void notify(T t);
}
