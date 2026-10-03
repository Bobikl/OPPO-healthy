package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class dkk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static dkk f10607c;
    public static final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f10608e;
    public static final int f;
    public final ExecutorService b = c();
    public final Executor a = new b();

    public static class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        d = iAvailableProcessors;
        f10608e = iAvailableProcessors + 1;
        f = (iAvailableProcessors * 2) + 1;
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        threadPoolExecutor.allowCoreThreadTimeOut(z);
    }

    public static ExecutorService b() {
        if (f10607c == null) {
            f10607c = new dkk();
        }
        return f10607c.b;
    }

    public static ExecutorService c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f10608e, f, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor d() {
        if (f10607c == null) {
            f10607c = new dkk();
        }
        return f10607c.a;
    }
}
