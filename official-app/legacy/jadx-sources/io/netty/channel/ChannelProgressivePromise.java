package io.netty.channel;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.ProgressivePromise;
import io.netty.util.concurrent.Promise;

/* JADX INFO: loaded from: classes10.dex */
public interface ChannelProgressivePromise extends ProgressivePromise<Void>, ChannelProgressiveFuture, ChannelPromise {
    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener */
    ChannelProgressivePromise addListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners */
    ChannelProgressivePromise addListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: await */
    ChannelProgressivePromise await2() throws InterruptedException;

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: awaitUninterruptibly */
    ChannelProgressivePromise awaitUninterruptibly2();

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener */
    ChannelProgressivePromise removeListener2(GenericFutureListener<? extends Future<? super Void>> genericFutureListener);

    @Override // io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners */
    ChannelProgressivePromise removeListeners2(GenericFutureListener<? extends Future<? super Void>>... genericFutureListenerArr);

    @Override // io.netty.util.concurrent.Promise, io.netty.channel.ChannelPromise
    ChannelProgressivePromise setFailure(Throwable th);

    @Override // io.netty.util.concurrent.ProgressivePromise
    /* JADX INFO: renamed from: setProgress, reason: merged with bridge method [inline-methods] */
    ProgressivePromise<Void> setProgress2(long j2, long j3);

    @Override // io.netty.channel.ChannelPromise
    ChannelProgressivePromise setSuccess();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.util.concurrent.Promise, io.netty.channel.ChannelPromise
    ChannelProgressivePromise setSuccess(Void r1);

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: sync */
    ChannelProgressivePromise sync2() throws InterruptedException;

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: syncUninterruptibly */
    ChannelProgressivePromise syncUninterruptibly2();

    @Override // io.netty.channel.ChannelPromise
    ChannelProgressivePromise unvoid();

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener */
    /* bridge */ /* synthetic */ default ChannelPromise addListener2(GenericFutureListener genericFutureListener) {
        return addListener2((GenericFutureListener<? extends Future<? super Void>>) genericFutureListener);
    }

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners */
    /* bridge */ /* synthetic */ default ChannelPromise addListeners2(GenericFutureListener[] genericFutureListenerArr) {
        return addListeners2((GenericFutureListener<? extends Future<? super Void>>[]) genericFutureListenerArr);
    }

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener */
    /* bridge */ /* synthetic */ default ChannelPromise removeListener2(GenericFutureListener genericFutureListener) {
        return removeListener2((GenericFutureListener<? extends Future<? super Void>>) genericFutureListener);
    }

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners */
    /* bridge */ /* synthetic */ default ChannelPromise removeListeners2(GenericFutureListener[] genericFutureListenerArr) {
        return removeListeners2((GenericFutureListener<? extends Future<? super Void>>[]) genericFutureListenerArr);
    }

    @Override // io.netty.util.concurrent.ProgressivePromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener */
    /* bridge */ /* synthetic */ default ProgressivePromise addListener2(GenericFutureListener genericFutureListener) {
        return addListener2((GenericFutureListener<? extends Future<? super Void>>) genericFutureListener);
    }

    @Override // io.netty.util.concurrent.ProgressivePromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners */
    /* bridge */ /* synthetic */ default ProgressivePromise addListeners2(GenericFutureListener[] genericFutureListenerArr) {
        return addListeners2((GenericFutureListener<? extends Future<? super Void>>[]) genericFutureListenerArr);
    }

    @Override // io.netty.util.concurrent.ProgressivePromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener */
    /* bridge */ /* synthetic */ default ProgressivePromise removeListener2(GenericFutureListener genericFutureListener) {
        return removeListener2((GenericFutureListener<? extends Future<? super Void>>) genericFutureListener);
    }

    @Override // io.netty.util.concurrent.ProgressivePromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners */
    /* bridge */ /* synthetic */ default ProgressivePromise removeListeners2(GenericFutureListener[] genericFutureListenerArr) {
        return removeListeners2((GenericFutureListener<? extends Future<? super Void>>[]) genericFutureListenerArr);
    }

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListener */
    /* bridge */ /* synthetic */ default Promise addListener2(GenericFutureListener genericFutureListener) {
        return addListener2((GenericFutureListener<? extends Future<? super Void>>) genericFutureListener);
    }

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: addListeners */
    /* bridge */ /* synthetic */ default Promise addListeners2(GenericFutureListener[] genericFutureListenerArr) {
        return addListeners2((GenericFutureListener<? extends Future<? super Void>>[]) genericFutureListenerArr);
    }

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListener */
    /* bridge */ /* synthetic */ default Promise removeListener2(GenericFutureListener genericFutureListener) {
        return removeListener2((GenericFutureListener<? extends Future<? super Void>>) genericFutureListener);
    }

    @Override // io.netty.util.concurrent.Promise, io.netty.util.concurrent.Future
    /* JADX INFO: renamed from: removeListeners */
    /* bridge */ /* synthetic */ default Promise removeListeners2(GenericFutureListener[] genericFutureListenerArr) {
        return removeListeners2((GenericFutureListener<? extends Future<? super Void>>[]) genericFutureListenerArr);
    }
}
