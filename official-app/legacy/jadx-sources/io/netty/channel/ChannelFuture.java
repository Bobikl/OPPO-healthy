package io.netty.channel;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

/* JADX INFO: loaded from: classes10.dex */
public interface ChannelFuture extends Future<Void> {
    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener, reason: merged with bridge method [inline-methods] */
    Future<Void> addListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners, reason: merged with bridge method [inline-methods] */
    Future<Void> addListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: await, reason: merged with bridge method [inline-methods] */
    Future<Void> await2() throws InterruptedException;

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: awaitUninterruptibly, reason: merged with bridge method [inline-methods] */
    Future<Void> awaitUninterruptibly2();

    Channel channel();

    boolean isVoid();

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener, reason: merged with bridge method [inline-methods] */
    Future<Void> removeListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners, reason: merged with bridge method [inline-methods] */
    Future<Void> removeListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: sync, reason: merged with bridge method [inline-methods] */
    Future<Void> sync2() throws InterruptedException;

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: syncUninterruptibly, reason: merged with bridge method [inline-methods] */
    Future<Void> syncUninterruptibly2();
}
