package io.netty.util.concurrent;

import io.netty.util.concurrent.ProgressiveFuture;

/* JADX INFO: loaded from: classes10.dex */
public interface GenericProgressiveFutureListener<F extends ProgressiveFuture<?>> extends GenericFutureListener<F> {
    void operationProgressed(F f, long j2, long j3) throws Exception;
}
