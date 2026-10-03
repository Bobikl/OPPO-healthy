package io.netty.util.concurrent;

import io.netty.util.internal.ObjectUtil;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultProgressivePromise<V> extends DefaultPromise<V> implements ProgressivePromise<V> {
    public DefaultProgressivePromise(EventExecutor eventExecutor) {
        super(eventExecutor);
    }

    /* JADX INFO: renamed from: setProgress */
    public ProgressivePromise<V> setProgress2(long j2, long j3) {
        if (j3 < 0) {
            ObjectUtil.checkPositiveOrZero(j2, "progress");
            j3 = -1;
        } else if (j2 < 0 || j2 > j3) {
            throw new IllegalArgumentException("progress: " + j2 + " (expected: 0 <= progress <= total (" + j3 + "))");
        }
        if (isDone()) {
            throw new IllegalStateException("complete already");
        }
        notifyProgressiveListeners(j2, j3);
        return this;
    }

    @Override // io.netty.util.concurrent.ProgressivePromise
    public boolean tryProgress(long j2, long j3) {
        if (j3 < 0) {
            if (j2 < 0 || isDone()) {
                return false;
            }
            j3 = -1;
        } else if (j2 < 0 || j2 > j3 || isDone()) {
            return false;
        }
        notifyProgressiveListeners(j2, j3);
        return true;
    }

    public DefaultProgressivePromise() {
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.channel.ChannelPromise
    public ProgressivePromise<V> setFailure(Throwable th) {
        super.setFailure(th);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.channel.ChannelPromise
    public ProgressivePromise<V> setSuccess(V v) {
        super.setSuccess((Object) v);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener */
    public ProgressivePromise<V> addListener2(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        super.addListener2((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners */
    public ProgressivePromise<V> addListeners2(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr) {
        super.addListeners2((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: await */
    public ProgressivePromise<V> await2() throws InterruptedException {
        super.await2();
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: awaitUninterruptibly */
    public ProgressivePromise<V> awaitUninterruptibly2() {
        super.awaitUninterruptibly2();
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener */
    public ProgressivePromise<V> removeListener2(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        super.removeListener2((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners */
    public ProgressivePromise<V> removeListeners2(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr) {
        super.removeListeners2((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: sync */
    public ProgressivePromise<V> sync2() throws Throwable {
        super.sync2();
        return this;
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: syncUninterruptibly */
    public ProgressivePromise<V> syncUninterruptibly2() throws Throwable {
        super.syncUninterruptibly2();
        return this;
    }
}
