package com.coloros.sceneservice.n;

import com.coloros.sceneservice.m.f;

/* JADX INFO: loaded from: classes13.dex */
public class c implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ d this$0;

    public c(d dVar) {
        this.this$0 = dVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        f.e(d.TAG, "Running task appeared exception! Thread [" + thread.getName() + "], because [" + th.getMessage() + "]");
    }
}
