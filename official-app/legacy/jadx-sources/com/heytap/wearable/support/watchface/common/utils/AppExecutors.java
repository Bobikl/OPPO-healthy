package com.heytap.wearable.support.watchface.common.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class AppExecutors {
    private static final int THREAD_COUNT = 3;
    private static volatile AppExecutors sInstance;
    private final Executor mDiskIO;
    private final Executor mMainThread;
    private final Executor mNetworkIO;

    public static class DiskIOThreadExecutor implements Executor {
        private final Executor mDiskIO = Executors.newSingleThreadExecutor();

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.mDiskIO.execute(runnable);
        }
    }

    public static class MainThreadExecutor implements Executor {
        private Handler mainThreadHandler;

        private MainThreadExecutor() {
            this.mainThreadHandler = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.mainThreadHandler.post(runnable);
        }
    }

    private AppExecutors(Executor executor, Executor executor2, Executor executor3) {
        this.mDiskIO = executor;
        this.mNetworkIO = executor2;
        this.mMainThread = executor3;
    }

    public static AppExecutors getInstance() {
        if (sInstance == null) {
            synchronized (AppExecutors.class) {
                if (sInstance == null) {
                    sInstance = new AppExecutors();
                }
            }
        }
        return sInstance;
    }

    public Executor diskIO() {
        return this.mDiskIO;
    }

    public Executor mainThread() {
        return this.mMainThread;
    }

    public Executor networkIO() {
        return this.mNetworkIO;
    }

    private AppExecutors() {
        this(new DiskIOThreadExecutor(), Executors.newFixedThreadPool(3), new MainThreadExecutor());
    }
}
