package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelJoin$JoinInnerSubscriber<T> extends AtomicReference<c3j> implements wu7<T> {
    private static final long serialVersionUID = 8410034718427740355L;
    final int limit;
    final ParallelJoin$JoinSubscriptionBase<T> parent;
    final int prefetch;
    long produced;
    volatile c4h<T> queue;

    public ParallelJoin$JoinInnerSubscriber(ParallelJoin$JoinSubscriptionBase<T> parallelJoin$JoinSubscriptionBase, int i) {
        this.parent = parallelJoin$JoinSubscriptionBase;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    public boolean cancel() {
        return SubscriptionHelper.cancel(this);
    }

    public c4h<T> getQueue() {
        c4h<T> c4hVar = this.queue;
        if (c4hVar != null) {
            return c4hVar;
        }
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        this.queue = spscArrayQueue;
        return spscArrayQueue;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.parent.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.parent.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.parent.onNext(this, t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, this.prefetch);
    }

    public void request(long j2) {
        long j3 = this.produced + j2;
        if (j3 < this.limit) {
            this.produced = j3;
        } else {
            this.produced = 0L;
            get().request(j3);
        }
    }

    public void requestOne() {
        long j2 = this.produced + 1;
        if (j2 != this.limit) {
            this.produced = j2;
        } else {
            this.produced = 0L;
            get().request(j2);
        }
    }
}
