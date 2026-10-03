package io.netty.channel;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Promise;

/* JADX INFO: loaded from: classes10.dex */
public interface ChannelPromise extends ChannelFuture, Promise<Void> {
    @Override // io.netty.channel.ChannelFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener, reason: avoid collision after fix types in other method */
    Future<Void> addListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.netty.channel.ChannelFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners, reason: avoid collision after fix types in other method */
    Future<Void> addListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    @Override // io.netty.channel.ChannelFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: await, reason: avoid collision after fix types in other method */
    Future<Void> await2() throws InterruptedException;

    @Override // io.netty.channel.ChannelFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: awaitUninterruptibly, reason: avoid collision after fix types in other method */
    Future<Void> awaitUninterruptibly2();

    @Override // io.netty.channel.ChannelFuture
    Channel channel();

    @Override // io.netty.channel.ChannelFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener, reason: avoid collision after fix types in other method */
    Future<Void> removeListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.netty.channel.ChannelFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners, reason: avoid collision after fix types in other method */
    Future<Void> removeListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    ChannelPromise setFailure(Throwable th);

    ChannelPromise setSuccess();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // 
    ChannelPromise setSuccess(Void r1);

    @Override // io.netty.channel.ChannelFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: sync, reason: avoid collision after fix types in other method */
    Future<Void> sync2() throws InterruptedException;

    @Override // io.netty.channel.ChannelFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: syncUninterruptibly, reason: avoid collision after fix types in other method */
    Future<Void> syncUninterruptibly2();

    boolean trySuccess();

    ChannelPromise unvoid();
}
