package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public final class na0 {
    public Executor a;
    public Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f14414c;

    public static class b implements Executor {
        public Handler i = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.i.post(runnable);
        }
    }

    public static class c {
        public static na0 instance = new na0();
    }

    public static na0 a() {
        return c.instance;
    }

    public Executor b() {
        return this.b;
    }

    public na0() {
        this.a = Executors.newSingleThreadExecutor();
        this.b = Executors.newFixedThreadPool(3);
        this.f14414c = new b();
    }
}
