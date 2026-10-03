package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public abstract class v4n {
    public ThreadPoolExecutor a;
    public ConcurrentHashMap<u4n, Future<?>> b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u4n.a f17708c = new a();

    public class a implements u4n.a {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.u4n.a
        public final void a(u4n u4nVar) {
            v4n.this.d(u4nVar, false);
        }

        @Override // com.oplus.aiunit.vision.u4n.a
        public final void b(u4n u4nVar) {
            v4n.this.d(u4nVar, true);
        }
    }

    public final void a(long j2, TimeUnit timeUnit) {
        try {
            ThreadPoolExecutor threadPoolExecutor = this.a;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.awaitTermination(j2, timeUnit);
            }
        } catch (InterruptedException unused) {
        }
    }

    public final void b(u4n u4nVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (e(u4nVar) || (threadPoolExecutor = this.a) == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        u4nVar.f = this.f17708c;
        try {
            Future<?> futureSubmit = this.a.submit(u4nVar);
            if (futureSubmit == null) {
                return;
            }
            c(u4nVar, futureSubmit);
        } catch (RejectedExecutionException e2) {
            c2n.r(e2, "TPool", "addTask");
        }
    }

    public final synchronized void c(u4n u4nVar, Future<?> future) {
        try {
            this.b.put(u4nVar, future);
        } catch (Throwable th) {
            c2n.r(th, "TPool", "addQueue");
            th.printStackTrace();
        }
    }

    public final synchronized void d(u4n u4nVar, boolean z) {
        try {
            Future<?> futureRemove = this.b.remove(u4nVar);
            if (z && futureRemove != null) {
                futureRemove.cancel(true);
            }
        } catch (Throwable th) {
            c2n.r(th, "TPool", "removeQueue");
            th.printStackTrace();
        }
    }

    public final synchronized boolean e(u4n u4nVar) {
        boolean zContainsKey;
        try {
            zContainsKey = this.b.containsKey(u4nVar);
        } catch (Throwable th) {
            c2n.r(th, "TPool", "contain");
            th.printStackTrace();
            zContainsKey = false;
        }
        return zContainsKey;
    }

    public final Executor f() {
        return this.a;
    }

    public final void g() {
        try {
            Iterator<Map.Entry<u4n, Future<?>>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                Future<?> future = this.b.get(it.next().getKey());
                if (future != null) {
                    try {
                        future.cancel(true);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            this.b.clear();
        } catch (Throwable th) {
            c2n.r(th, "TPool", "destroy");
            th.printStackTrace();
        }
        ThreadPoolExecutor threadPoolExecutor = this.a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }
}
