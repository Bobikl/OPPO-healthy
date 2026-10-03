package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableZip$ZipSubscriber<T, R> extends AtomicReference<c3j> implements wu7<T>, c3j {
    private static final long serialVersionUID = -4627193790118206028L;
    volatile boolean done;
    final int limit;
    final FlowableZip$ZipCoordinator<T, R> parent;
    final int prefetch;
    long produced;
    g4h<T> queue;
    int sourceMode;

    public FlowableZip$ZipSubscriber(FlowableZip$ZipCoordinator<T, R> flowableZip$ZipCoordinator, int i) {
        this.parent = flowableZip$ZipCoordinator;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        this.parent.drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.parent.error(this, th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.sourceMode != 2) {
            this.queue.offer(t);
        }
        this.parent.drain();
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(7);
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

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (this.sourceMode != 1) {
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
