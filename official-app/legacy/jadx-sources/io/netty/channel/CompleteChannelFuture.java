package io.netty.channel;

import io.netty.util.concurrent.CompleteFuture;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.internal.ObjectUtil;

/* JADX INFO: loaded from: classes10.dex */
abstract class CompleteChannelFuture extends CompleteFuture<Void> implements ChannelFuture {
    private final Channel channel;

    public CompleteChannelFuture(Channel channel, EventExecutor eventExecutor) {
        super(eventExecutor);
        this.channel = (Channel) ObjectUtil.checkNotNull(channel, "channel");
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: await */
    public Future<Void> await2() throws InterruptedException {
        return this;
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: awaitUninterruptibly */
    public Future<Void> awaitUninterruptibly2() {
        return this;
    }

    @Override // io.netty.channel.ChannelFuture
    public Channel channel() {
        return this.channel;
    }

    @Override // io.netty.util.concurrent.CompleteFuture
    public EventExecutor executor() {
        EventExecutor eventExecutorExecutor = super.executor();
        return eventExecutorExecutor == null ? channel().eventLoop() : eventExecutorExecutor;
    }

    @Override // io.netty.util.concurrent.Future
    public Void getNow() {
        return null;
    }

    @Override // io.netty.channel.ChannelFuture
    public boolean isVoid() {
        return false;
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: sync */
    public Future<Void> sync2() throws InterruptedException {
        return this;
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: syncUninterruptibly */
    public Future<Void> syncUninterruptibly2() {
        return this;
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener */
    public Future<Void> addListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        super.addListener2((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners */
    public Future<Void> addListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        super.addListeners2((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener */
    public Future<Void> removeListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        super.removeListener2((GenericFutureListener) genericFutureListener);
        return this;
    }

    @Override // io.netty.util.concurrent.CompleteFuture, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners */
    public Future<Void> removeListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr) {
        super.removeListeners2((GenericFutureListener[]) genericFutureListenerArr);
        return this;
    }
}
