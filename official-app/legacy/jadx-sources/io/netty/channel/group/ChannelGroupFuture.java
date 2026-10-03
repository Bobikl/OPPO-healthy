package io.netty.channel.group;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public interface ChannelGroupFuture extends Future<Void>, Iterable<ChannelFuture> {
    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener */
    Future<Void> addListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners */
    Future<Void> addListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: await */
    Future<Void> await2() throws InterruptedException;

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: awaitUninterruptibly */
    Future<Void> awaitUninterruptibly2();

    @Override // io.netty.util.concurrent.Future
    ChannelGroupException cause();

    ChannelFuture find(Channel channel);

    ChannelGroup group();

    boolean isPartialFailure();

    boolean isPartialSuccess();

    @Override // io.netty.util.concurrent.Future
    boolean isSuccess();

    @Override // java.lang.Iterable
    Iterator<ChannelFuture> iterator();

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener */
    Future<Void> removeListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners */
    Future<Void> removeListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: sync */
    Future<Void> sync2() throws InterruptedException;

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: syncUninterruptibly */
    Future<Void> syncUninterruptibly2();
}
