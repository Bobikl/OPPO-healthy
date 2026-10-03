package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableDoFinally$DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements wu7<T> {
    private static final long serialVersionUID = 4109457741734051389L;
    final v2j<? super T> downstream;
    final eo onFinally;
    h7f<T> qs;
    boolean syncFused;
    c3j upstream;

    public FlowableDoFinally$DoFinallySubscriber(v2j<? super T> v2jVar, eo eoVar) {
        this.downstream = v2jVar;
        this.onFinally = eoVar;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.upstream.cancel();
        runFinally();
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public void clear() {
        this.qs.clear();
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.qs.isEmpty();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.downstream.onComplete();
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.downstream.onError(th);
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            if (c3jVar instanceof h7f) {
                this.qs = (h7f) c3jVar;
            }
            this.downstream.onSubscribe(this);
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public T poll() throws Exception {
        T tPoll = this.qs.poll();
        if (tPoll == null && this.syncFused) {
            runFinally();
        }
        return tPoll;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        this.upstream.request(j2);
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        h7f<T> h7fVar = this.qs;
        if (h7fVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = h7fVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.syncFused = iRequestFusion == 1;
        }
        return iRequestFusion;
    }

    public void runFinally() {
        if (compareAndSet(0, 1)) {
            try {
                this.onFinally.run();
            } catch (Throwable th) {
                iu6.b(th);
                h4g.r(th);
            }
        }
    }
}
