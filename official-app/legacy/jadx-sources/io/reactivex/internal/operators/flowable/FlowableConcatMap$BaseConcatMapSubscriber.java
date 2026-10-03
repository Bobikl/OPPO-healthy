package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.bu7;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableConcatMap$BaseConcatMapSubscriber<T, R> extends AtomicInteger implements wu7<T>, bu7<R>, c3j {
    private static final long serialVersionUID = -3511336836796789179L;
    volatile boolean active;
    volatile boolean cancelled;
    int consumed;
    volatile boolean done;
    final int limit;
    final j08<? super T, ? extends k3f<? extends R>> mapper;
    final int prefetch;
    g4h<T> queue;
    int sourceMode;
    c3j upstream;
    final FlowableConcatMap$ConcatMapInner<R> inner = new FlowableConcatMap$ConcatMapInner<>(this);
    final AtomicThrowable errors = new AtomicThrowable();

    public FlowableConcatMap$BaseConcatMapSubscriber(j08<? super T, ? extends k3f<? extends R>> j08Var, int i) {
        this.mapper = j08Var;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public abstract /* synthetic */ void cancel();

    public abstract void drain();

    @Override // com.oplus.aiunit.vision.bu7
    public final void innerComplete() {
        this.active = false;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bu7
    public abstract /* synthetic */ void innerError(Throwable th);

    @Override // com.oplus.aiunit.vision.bu7
    public abstract /* synthetic */ void innerNext(Object obj);

    @Override // com.oplus.aiunit.vision.v2j
    public final void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // com.oplus.aiunit.vision.v2j
    public final void onNext(T t) {
        if (this.sourceMode == 2 || this.queue.offer(t)) {
            drain();
        } else {
            this.upstream.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public final void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.sourceMode = iRequestFusion;
                    this.queue = h7fVar;
                    this.done = true;
                    subscribeActual();
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = h7fVar;
                    subscribeActual();
                    c3jVar.request(this.prefetch);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.prefetch);
            subscribeActual();
            c3jVar.request(this.prefetch);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public abstract /* synthetic */ void request(long j2);

    public abstract void subscribeActual();
}
