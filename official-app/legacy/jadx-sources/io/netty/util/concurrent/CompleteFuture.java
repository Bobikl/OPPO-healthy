package io.netty.util.concurrent;

import io.netty.util.internal.ObjectUtil;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CompleteFuture<V> extends AbstractFuture<V> {
    private final EventExecutor executor;

    public CompleteFuture(EventExecutor eventExecutor) {
        this.executor = eventExecutor;
    }

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener */
    public Future<V> addListener2(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        DefaultPromise.notifyListener(executor(), this, (GenericFutureListener) ObjectUtil.checkNotNull(genericFutureListener, "listener"));
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners */
    public Future<V> addListeners2(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr) {
        for (GenericFutureListener genericFutureListener : (GenericFutureListener[]) ObjectUtil.checkNotNull(genericFutureListenerArr, "listeners")) {
            if (genericFutureListener == null) {
                break;
            }
            DefaultPromise.notifyListener(executor(), this, genericFutureListener);
        }
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: await */
    public Future<V> await2() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: awaitUninterruptibly */
    public Future<V> awaitUninterruptibly2() {
        return this;
    }

    @Override // io.netty.util.concurrent.Future, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    public EventExecutor executor() {
        return this.executor;
    }

    @Override // io.netty.util.concurrent.Future
    public boolean isCancellable() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener */
    public Future<V> removeListener2(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners */
    public Future<V> removeListeners2(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr) {
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: sync */
    public Future<V> sync2() throws InterruptedException {
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: syncUninterruptibly */
    public Future<V> syncUninterruptibly2() {
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long j2) {
        return true;
    }

    @Override // io.netty.util.concurrent.Future
    public boolean await(long j2, TimeUnit timeUnit) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return true;
    }

    @Override // io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long j2, TimeUnit timeUnit) {
        return true;
    }

    @Override // io.netty.util.concurrent.Future
    public boolean await(long j2) throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return true;
    }
}
