package io.netty.util.concurrent;

/* JADX INFO: loaded from: classes10.dex */
public interface ProgressivePromise<V> extends Promise<V>, ProgressiveFuture<V> {
    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener */
    ProgressivePromise<V> addListener2(GenericFutureListener<? extends Future<? super V>> genericFutureListener);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners */
    ProgressivePromise<V> addListeners2(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: await */
    ProgressivePromise<V> await2() throws InterruptedException;

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: awaitUninterruptibly */
    ProgressivePromise<V> awaitUninterruptibly2();

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener */
    ProgressivePromise<V> removeListener2(GenericFutureListener<? extends Future<? super V>> genericFutureListener);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners */
    ProgressivePromise<V> removeListeners2(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr);

    @Override // io.netty.util.concurrent.Promise, io.netty.channel.ChannelPromise
    ProgressivePromise<V> setFailure(Throwable th);

    ProgressivePromise<V> setProgress(long j2, long j3);

    @Override // io.netty.util.concurrent.Promise, io.netty.channel.ChannelPromise
    ProgressivePromise<V> setSuccess(V v);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: sync */
    ProgressivePromise<V> sync2() throws InterruptedException;

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: syncUninterruptibly */
    ProgressivePromise<V> syncUninterruptibly2();

    boolean tryProgress(long j2, long j3);
}
