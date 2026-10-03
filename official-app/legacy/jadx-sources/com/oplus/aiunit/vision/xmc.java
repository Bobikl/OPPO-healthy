package com.oplus.aiunit.vision;

import java.net.HttpURLConnection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class xmc {
    public final ThreadPoolExecutor a;
    public final com.badlogic.gdx.utils.i<Object, HttpURLConnection> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.i<Object, Object> f18678c;
    public final com.badlogic.gdx.utils.i<Object, Future<?>> d;

    public class a implements ThreadFactory {
        public AtomicInteger i = new AtomicInteger();

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "NetThread" + this.i.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    public xmc(int i) {
        boolean z = i == Integer.MAX_VALUE;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(z ? 0 : i, i, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) (z ? new SynchronousQueue() : new LinkedBlockingQueue()), new a());
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(!z);
        this.b = new com.badlogic.gdx.utils.i<>();
        this.f18678c = new com.badlogic.gdx.utils.i<>();
        this.d = new com.badlogic.gdx.utils.i<>();
    }
}
