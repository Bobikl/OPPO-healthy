package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFlatMap$InnerSubscriber<T, U> extends AtomicReference<c3j> implements wu7<U>, cv5 {
    private static final long serialVersionUID = -4606175640614850599L;
    final int bufferSize;
    volatile boolean done;
    int fusionMode;
    final long id;
    final int limit;
    final FlowableFlatMap$MergeSubscriber<T, U> parent;
    long produced;
    volatile g4h<U> queue;

    public FlowableFlatMap$InnerSubscriber(FlowableFlatMap$MergeSubscriber<T, U> flowableFlatMap$MergeSubscriber, long j2) {
        this.id = j2;
        this.parent = flowableFlatMap$MergeSubscriber;
        int i = flowableFlatMap$MergeSubscriber.bufferSize;
        this.bufferSize = i;
        this.limit = i >> 2;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        this.parent.drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        lazySet(SubscriptionHelper.CANCELLED);
        this.parent.innerError(this, th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(U u) {
        if (this.fusionMode != 2) {
            this.parent.tryEmit(u, this);
        } else {
            this.parent.drain();
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = h7fVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = h7fVar;
                }
            }
            c3jVar.request(this.bufferSize);
        }
    }

    public void requestMore(long j2) {
        if (this.fusionMode != 1) {
            long j3 = this.produced + j2;
            if (j3 < this.limit) {
                this.produced = j3;
            } else {
                this.produced = 0L;
                get().request(j3);
            }
        }
    }
}
