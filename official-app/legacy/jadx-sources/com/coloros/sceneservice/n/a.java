package com.coloros.sceneservice.n;

import com.coloros.sceneservice.m.f;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes13.dex */
public class a implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        f.e(b.TAG, "Task rejected, too many task!");
    }
}
