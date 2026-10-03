package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.g7f;
import com.oplus.aiunit.vision.tu7;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSequenceEqual$EqualSubscriber<T> extends AtomicReference<c3j> implements vu7<T> {
    private static final long serialVersionUID = 4804128302091633067L;
    volatile boolean done;
    final int limit;
    final tu7 parent;
    final int prefetch;
    long produced;
    volatile f4h<T> queue;
    int sourceMode;

    public FlowableSequenceEqual$EqualSubscriber(tu7 tu7Var, int i) {
        this.parent = tu7Var;
        this.limit = i - (i >> 2);
        this.prefetch = i;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void clear() {
        f4h<T> f4hVar = this.queue;
        if (f4hVar != null) {
            f4hVar.clear();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        this.parent.drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.parent.innerError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.sourceMode != 0 || this.queue.offer(t)) {
            this.parent.drain();
        } else {
            onError(new MissingBackpressureException());
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            if (c3jVar instanceof g7f) {
                g7f g7fVar = (g7f) c3jVar;
                int iRequestFusion = g7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.sourceMode = iRequestFusion;
                    this.queue = g7fVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = g7fVar;
                    c3jVar.request(this.prefetch);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.prefetch);
            c3jVar.request(this.prefetch);
        }
    }

    public void request() {
        if (this.sourceMode != 1) {
            long j2 = this.produced + 1;
            if (j2 < this.limit) {
                this.produced = j2;
            } else {
                this.produced = 0L;
                get().request(j2);
            }
        }
    }
}
