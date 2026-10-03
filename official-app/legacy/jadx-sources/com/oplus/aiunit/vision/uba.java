package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class uba implements Callable<Void>, io.reactivex.rxjava3.disposables.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FutureTask<Void> f17402n = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);
    public final Runnable i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f17404l;
    public Thread m;
    public final AtomicReference<Future<?>> k = new AtomicReference<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<Future<?>> f17403j = new AtomicReference<>();

    public uba(Runnable runnable, ExecutorService executorService) {
        this.i = runnable;
        this.f17404l = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.m = Thread.currentThread();
        try {
            this.i.run();
            this.m = null;
            c(this.f17404l.submit(this));
            return null;
        } catch (Throwable th) {
            this.m = null;
            g4g.u(th);
            throw th;
        }
    }

    public void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.k.get();
            if (future2 == f17402n) {
                future.cancel(this.m != Thread.currentThread());
                return;
            }
        } while (!fue.a(this.k, future2, future));
    }

    public void c(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f17403j.get();
            if (future2 == f17402n) {
                future.cancel(this.m != Thread.currentThread());
                return;
            }
        } while (!fue.a(this.f17403j, future2, future));
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.k;
        FutureTask<Void> futureTask = f17402n;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.m != Thread.currentThread());
        }
        Future<?> andSet2 = this.f17403j.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.m != Thread.currentThread());
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.k.get() == f17402n;
    }
}
