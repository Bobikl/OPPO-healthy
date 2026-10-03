package com.heytap.msp.sdk.base.common.executor.impl;

import android.os.Handler;
import android.os.Looper;
import com.heytap.msp.sdk.base.common.executor.IMainThread;

/* JADX INFO: loaded from: classes19.dex */
public class MainThreadImpl implements IMainThread {
    private static IMainThread sMainThread;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    private MainThreadImpl() {
    }

    public static IMainThread getInstance() {
        if (sMainThread == null) {
            sMainThread = new MainThreadImpl();
        }
        return sMainThread;
    }

    @Override // com.heytap.msp.sdk.base.common.executor.IMainThread
    public void post(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    @Override // com.heytap.msp.sdk.base.common.executor.IMainThread
    public void postDelay(Runnable runnable, long j2) {
        this.mHandler.postDelayed(runnable, j2);
    }
}
