package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
public final class b8i implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    @SuppressLint({"NewThreadDirectly"})
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "split_query_thread");
    }
}
