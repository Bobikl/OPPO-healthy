package com.accountbase;

import android.os.Looper;
import com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor;
import com.platform.usercenter.basic.core.mvvm.AppExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes12.dex */
public class d implements IAsyncTaskExecutor {
    private final Executor a;
    private final Executor b;

    public static class b {
        private static final d a = new d();
    }

    public static d a() {
        return b.a;
    }

    @Override // com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor
    public Executor asyncExecutor() {
        return this.a;
    }

    @Override // com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor
    public Executor diskExecutor() {
        return this.a;
    }

    @Override // com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor
    public boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor
    public Executor mainThread() {
        return this.b;
    }

    @Override // com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor
    public void runOnAsyncExecutor(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.a.execute(runnable);
    }

    @Override // com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor
    public void runOnDiskExecutor(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.a.execute(runnable);
    }

    @Override // com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor
    public void runOnMainThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.b.execute(runnable);
    }

    @Override // com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor
    public void shutDown() {
    }

    private d() {
        this.b = AppExecutors.getInstance().mainThread();
        this.a = AppExecutors.getInstance().networkIO();
    }
}
