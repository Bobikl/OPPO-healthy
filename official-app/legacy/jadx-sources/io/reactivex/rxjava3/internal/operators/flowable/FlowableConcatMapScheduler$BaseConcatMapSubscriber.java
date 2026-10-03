package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.au7;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.g7f;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableConcatMapScheduler$BaseConcatMapSubscriber<T, R> extends AtomicInteger implements vu7<T>, au7<R>, c3j, Runnable {
    private static final long serialVersionUID = -3511336836796789179L;
    volatile boolean active;
    volatile boolean cancelled;
    int consumed;
    volatile boolean done;
    final int limit;
    final d08<? super T, ? extends k3f<? extends R>> mapper;
    final int prefetch;
    f4h<T> queue;
    int sourceMode;
    c3j upstream;
    final cfg.c worker;
    final FlowableConcatMap$ConcatMapInner<R> inner = new FlowableConcatMap$ConcatMapInner<>(this);
    final AtomicThrowable errors = new AtomicThrowable();

    public FlowableConcatMapScheduler$BaseConcatMapSubscriber(d08<? super T, ? extends k3f<? extends R>> d08Var, int i, cfg.c cVar) {
        this.mapper = d08Var;
        this.prefetch = i;
        this.limit = i - (i >> 2);
        this.worker = cVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public abstract /* synthetic */ void cancel();

    @Override // com.oplus.aiunit.vision.au7
    public final void innerComplete() {
        this.active = false;
        schedule();
    }

    @Override // com.oplus.aiunit.vision.au7
    public abstract /* synthetic */ void innerError(Throwable th);

    @Override // com.oplus.aiunit.vision.au7
    public abstract /* synthetic */ void innerNext(Object obj);

    @Override // com.oplus.aiunit.vision.v2j
    public final void onComplete() {
        this.done = true;
        schedule();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // com.oplus.aiunit.vision.v2j
    public final void onNext(T t) {
        if (this.sourceMode == 2 || this.queue.offer(t)) {
            schedule();
        } else {
            this.upstream.cancel();
            onError(new IllegalStateException("Queue full?!"));
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
                    this.sourceMode = iRequestFusion;
                    this.queue = g7fVar;
                    this.done = true;
                    subscribeActual();
                    schedule();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = g7fVar;
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

    public abstract void schedule();

    public abstract void subscribeActual();
}
