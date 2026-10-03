package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTake$TakeSubscriber<T> extends AtomicBoolean implements wu7<T>, c3j {
    private static final long serialVersionUID = -5636543848937116287L;
    boolean done;
    final v2j<? super T> downstream;
    final long limit;
    long remaining;
    c3j upstream;

    public FlowableTake$TakeSubscriber(v2j<? super T> v2jVar, long j2) {
        this.downstream = v2jVar;
        this.limit = j2;
        this.remaining = j2;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        this.upstream.cancel();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        long j2 = this.remaining;
        long j3 = j2 - 1;
        this.remaining = j3;
        if (j2 > 0) {
            boolean z = j3 == 0;
            this.downstream.onNext(t);
            if (z) {
                this.upstream.cancel();
                onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            if (this.limit != 0) {
                this.downstream.onSubscribe(this);
                return;
            }
            c3jVar.cancel();
            this.done = true;
            EmptySubscription.complete(this.downstream);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            if (get() || !compareAndSet(false, true) || j2 < this.limit) {
                this.upstream.request(j2);
            } else {
                this.upstream.request(Long.MAX_VALUE);
            }
        }
    }
}
