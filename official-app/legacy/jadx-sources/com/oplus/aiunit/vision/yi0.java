package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class yi0 implements bv5 {
    public final ExecutorService i;

    public class a implements ThreadFactory {
        public final /* synthetic */ String i;

        public a(String str) {
            this.i = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.i);
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements Callable<T> {
        public final /* synthetic */ ej0 i;

        public b(ej0 ej0Var) {
            this.i = ej0Var;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            return (T) this.i.call();
        }
    }

    public yi0(int i, String str) {
        this.i = Executors.newFixedThreadPool(i, new a(str));
    }

    public <T> dj0<T> b(ej0<T> ej0Var) {
        if (this.i.isShutdown()) {
            throw new GdxRuntimeException("Cannot run tasks on an executor that has been shutdown (disposed)");
        }
        return new dj0<>(this.i.submit(new b(ej0Var)));
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        this.i.shutdown();
        try {
            this.i.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            throw new GdxRuntimeException("Couldn't shutdown loading thread", e2);
        }
    }
}
