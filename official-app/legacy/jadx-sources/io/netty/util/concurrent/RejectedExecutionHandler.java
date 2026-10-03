package io.netty.util.concurrent;

/* JADX INFO: loaded from: classes10.dex */
public interface RejectedExecutionHandler {
    void rejected(Runnable runnable, SingleThreadEventExecutor singleThreadEventExecutor);
}
