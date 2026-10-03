package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.bu7;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMap$ConcatMapInner<R> extends SubscriptionArbiter implements wu7<R> {
    private static final long serialVersionUID = 897683679971470653L;
    final bu7<R> parent;
    long produced;

    public FlowableConcatMap$ConcatMapInner(bu7<R> bu7Var) {
        super(false);
        this.parent = bu7Var;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        long j2 = this.produced;
        if (j2 != 0) {
            this.produced = 0L;
            produced(j2);
        }
        this.parent.innerComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        long j2 = this.produced;
        if (j2 != 0) {
            this.produced = 0L;
            produced(j2);
        }
        this.parent.innerError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(R r) {
        this.produced++;
        this.parent.innerNext(r);
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        setSubscription(c3jVar);
    }
}
