package com.oplus.aiunit.vision;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class vba implements Callable<Void>, cv5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FutureTask<Void> f17786n = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);
    public final Runnable i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f17788l;
    public Thread m;
    public final AtomicReference<Future<?>> k = new AtomicReference<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<Future<?>> f17787j = new AtomicReference<>();

    public vba(Runnable runnable, ExecutorService executorService) {
        this.i = runnable;
        this.f17788l = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.m = Thread.currentThread();
        try {
            this.i.run();
            c(this.f17788l.submit(this));
            this.m = null;
        } catch (Throwable th) {
            this.m = null;
            h4g.r(th);
        }
        return null;
    }

    public void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.k.get();
            if (future2 == f17786n) {
                future.cancel(this.m != Thread.currentThread());
                return;
            }
        } while (!fue.a(this.k, future2, future));
    }

    public void c(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f17787j.get();
            if (future2 == f17786n) {
                future.cancel(this.m != Thread.currentThread());
                return;
            }
        } while (!fue.a(this.f17787j, future2, future));
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.k;
        FutureTask<Void> futureTask = f17786n;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.m != Thread.currentThread());
        }
        Future<?> andSet2 = this.f17787j.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.m != Thread.currentThread());
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.k.get() == f17786n;
    }
}
