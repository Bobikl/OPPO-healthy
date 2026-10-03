package com.heytap.usercenter.accountsdk.http;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes19.dex */
public interface IAsyncTaskExecutor {
    Executor asyncExecutor();

    Executor diskExecutor();

    boolean isMainThread();

    Executor mainThread();

    void runOnAsyncExecutor(Runnable runnable);

    void runOnDiskExecutor(Runnable runnable);

    void runOnMainThread(Runnable runnable);

    void shutDown();
}
