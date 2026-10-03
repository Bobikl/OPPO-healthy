package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTake$TakeSubscriber<T> extends AtomicLong implements vu7<T>, c3j {
    private static final long serialVersionUID = 2288246011222124525L;
    final v2j<? super T> downstream;
    long remaining;
    c3j upstream;

    public FlowableTake$TakeSubscriber(v2j<? super T> v2jVar, long j2) {
        this.downstream = v2jVar;
        this.remaining = j2;
        lazySet(j2);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.remaining > 0) {
            this.remaining = 0L;
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.remaining <= 0) {
            g4g.u(th);
        } else {
            this.remaining = 0L;
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        long j2 = this.remaining;
        if (j2 > 0) {
            long j3 = j2 - 1;
            this.remaining = j3;
            this.downstream.onNext(t);
            if (j3 == 0) {
                this.upstream.cancel();
                this.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            if (this.remaining == 0) {
                c3jVar.cancel();
                EmptySubscription.complete(this.downstream);
            } else {
                this.upstream = c3jVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        long j3;
        long jMin;
        if (SubscriptionHelper.validate(j2)) {
            do {
                j3 = get();
                if (j3 == 0) {
                    return;
                } else {
                    jMin = Math.min(j3, j2);
                }
            } while (!compareAndSet(j3, j3 - jMin));
            this.upstream.request(jMin);
        }
    }
}
