package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableElementAt$ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements wu7<T> {
    private static final long serialVersionUID = 4066607327284737757L;
    long count;
    final T defaultValue;
    boolean done;
    final boolean errorOnFewer;
    final long index;
    c3j upstream;

    public FlowableElementAt$ElementAtSubscriber(v2j<? super T> v2jVar, long j2, T t, boolean z) {
        super(v2jVar);
        this.index = j2;
        this.defaultValue = t;
        this.errorOnFewer = z;
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        T t = this.defaultValue;
        if (t != null) {
            complete(t);
        } else if (this.errorOnFewer) {
            this.downstream.onError(new NoSuchElementException());
        } else {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        long j2 = this.count;
        if (j2 != this.index) {
            this.count = j2 + 1;
            return;
        }
        this.done = true;
        this.upstream.cancel();
        complete(t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }
}
