package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableUnsubscribeOn$UnsubscribeSubscriber<T> extends AtomicBoolean implements wu7<T>, c3j {
    private static final long serialVersionUID = 1015244841293359600L;
    final v2j<? super T> downstream;
    final zeg scheduler;
    c3j upstream;

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FlowableUnsubscribeOn$UnsubscribeSubscriber.this.upstream.cancel();
        }
    }

    public FlowableUnsubscribeOn$UnsubscribeSubscriber(v2j<? super T> v2jVar, zeg zegVar) {
        this.downstream = v2jVar;
        this.scheduler = zegVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (compareAndSet(false, true)) {
            this.scheduler.c(new a());
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (get()) {
            return;
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (get()) {
            h4g.r(th);
        } else {
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (get()) {
            return;
        }
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        this.upstream.request(j2);
    }
}
