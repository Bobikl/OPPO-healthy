package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.uu7;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableSequenceEqual$EqualSubscriber<T> extends AtomicReference<c3j> implements wu7<T> {
    private static final long serialVersionUID = 4804128302091633067L;
    volatile boolean done;
    final int limit;
    final uu7 parent;
    final int prefetch;
    long produced;
    volatile g4h<T> queue;
    int sourceMode;

    public FlowableSequenceEqual$EqualSubscriber(uu7 uu7Var, int i) {
        this.parent = uu7Var;
        this.limit = i - (i >> 2);
        this.prefetch = i;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public void clear() {
        g4h<T> g4hVar = this.queue;
        if (g4hVar != null) {
            g4hVar.clear();
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

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.sourceMode = iRequestFusion;
                    this.queue = h7fVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceMode = iRequestFusion;
                    this.queue = h7fVar;
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
