package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTakeLast$TakeLastSubscriber<T> extends ArrayDeque<T> implements vu7<T>, c3j {
    private static final long serialVersionUID = 7240042530241604978L;
    volatile boolean cancelled;
    final int count;
    volatile boolean done;
    final v2j<? super T> downstream;
    c3j upstream;
    final AtomicLong requested = new AtomicLong();
    final AtomicInteger wip = new AtomicInteger();

    public FlowableTakeLast$TakeLastSubscriber(v2j<? super T> v2jVar, int i) {
        this.downstream = v2jVar;
        this.count = i;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
    }

    public void drain() {
        if (this.wip.getAndIncrement() == 0) {
            v2j<? super T> v2jVar = this.downstream;
            long jE = this.requested.get();
            while (!this.cancelled) {
                if (this.done) {
                    long j2 = 0;
                    while (j2 != jE) {
                        if (this.cancelled) {
                            return;
                        }
                        T tPoll = poll();
                        if (tPoll == null) {
                            v2jVar.onComplete();
                            return;
                        } else {
                            v2jVar.onNext(tPoll);
                            j2++;
                        }
                    }
                    if (isEmpty()) {
                        v2jVar.onComplete();
                        return;
                    } else if (j2 != 0) {
                        jE = vr0.e(this.requested, j2);
                    }
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.count == size()) {
            poll();
        }
        offer(t);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            drain();
        }
    }
}
