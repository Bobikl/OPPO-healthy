package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class xa0 {
    public Executor a;
    public Executor b;
    public Executor c;

    public static class b implements Executor {
        public Handler i = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.i.post(runnable);
        }
    }

    public static class c {
        public static xa0 instance = new xa0();
    }

    public static xa0 a() {
        return c.instance;
    }

    public Executor b() {
        return this.b;
    }

    public xa0() {
        this.a = Executors.newSingleThreadExecutor();
        this.b = Executors.newFixedThreadPool(3);
        this.c = new b();
    }
}
