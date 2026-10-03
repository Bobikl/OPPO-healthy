package com.heytap.msp.sdk.base.common.executor;

/* JADX INFO: loaded from: classes19.dex */
public interface IMainThread {
    void post(Runnable runnable);

    void postDelay(Runnable runnable, long j2);
}
