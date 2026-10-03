package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.g7f;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ConcatMapXMainSubscriber<T> extends AtomicInteger implements vu7<T> {
    private static final long serialVersionUID = -3214213361171757852L;
    volatile boolean cancelled;
    volatile boolean done;
    final ErrorMode errorMode;
    final AtomicThrowable errors = new AtomicThrowable();
    final int prefetch;
    f4h<T> queue;
    boolean syncFused;
    c3j upstream;

    public ConcatMapXMainSubscriber(int i, ErrorMode errorMode) {
        this.errorMode = errorMode;
        this.prefetch = i;
    }

    public void clearValue() {
    }

    abstract void disposeInner();

    abstract void drain();

    @Override // com.oplus.aiunit.vision.v2j
    public final void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public final void onError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                disposeInner();
            }
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public final void onNext(T t) {
        if (t == null || this.queue.offer(t)) {
            drain();
        } else {
            this.upstream.cancel();
            onError(new MissingBackpressureException("queue full?!"));
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public final void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            if (c3jVar instanceof g7f) {
                g7f g7fVar = (g7f) c3jVar;
                int iRequestFusion = g7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.queue = g7fVar;
                    this.syncFused = true;
                    this.done = true;
                    onSubscribeDownstream();
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.queue = g7fVar;
                    onSubscribeDownstream();
                    this.upstream.request(this.prefetch);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.prefetch);
            onSubscribeDownstream();
            this.upstream.request(this.prefetch);
        }
    }

    public abstract void onSubscribeDownstream();

    final void stop() {
        this.cancelled = true;
        this.upstream.cancel();
        disposeInner();
        this.errors.tryTerminateAndReport();
        if (getAndIncrement() == 0) {
            this.queue.clear();
            clearValue();
        }
    }
}
