package io.netty.util.concurrent;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public interface Future<V> extends java.util.concurrent.Future<V> {
    Future<V> addListener(GenericFutureListener<? extends Future<? super V>> genericFutureListener);

    Future<V> addListeners(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr);

    Future<V> await() throws InterruptedException;

    boolean await(long j2) throws InterruptedException;

    boolean await(long j2, TimeUnit timeUnit) throws InterruptedException;

    Future<V> awaitUninterruptibly();

    boolean awaitUninterruptibly(long j2);

    boolean awaitUninterruptibly(long j2, TimeUnit timeUnit);

    boolean cancel(boolean z);

    Throwable cause();

    V getNow();

    boolean isCancellable();

    boolean isSuccess();

    Future<V> removeListener(GenericFutureListener<? extends Future<? super V>> genericFutureListener);

    Future<V> removeListeners(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr);

    Future<V> sync() throws InterruptedException;

    Future<V> syncUninterruptibly();
}
