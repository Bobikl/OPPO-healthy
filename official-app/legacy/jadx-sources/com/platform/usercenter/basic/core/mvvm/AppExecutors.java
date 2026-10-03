package com.platform.usercenter.basic.core.mvvm;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes9.dex */
public class AppExecutors {
    private static volatile AppExecutors INSTANCE;
    private final Executor diskIO;
    private final Executor mainThread;
    private final Executor networkIO;

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

    public AppExecutors(Executor executor, Executor executor2, Executor executor3) {
        this.diskIO = executor;
        this.networkIO = executor2;
        this.mainThread = executor3;
    }

    public static AppExecutors getInstance() {
        if (INSTANCE == null) {
            synchronized (AppExecutors.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppExecutors();
                }
            }
        }
        return INSTANCE;
    }

    public Executor diskIO() {
        return this.diskIO;
    }

    public Executor mainThread() {
        return this.mainThread;
    }

    public Executor networkIO() {
        return this.networkIO;
    }

    public AppExecutors() {
        this(Executors.newSingleThreadExecutor(), Executors.newFixedThreadPool(3), new MainThreadExecutor());
    }
}
