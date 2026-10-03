package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.ou7;
import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRetryWhen$RetryWhenSubscriber<T> extends FlowableRepeatWhen$WhenSourceSubscriber<T, Throwable> {
    private static final long serialVersionUID = -2680129890138081029L;

    public FlowableRetryWhen$RetryWhenSubscriber(v2j<? super T> v2jVar, ou7<Throwable> ou7Var, c3j c3jVar) {
        super(v2jVar, ou7Var, c3jVar);
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.receiver.cancel();
        this.downstream.onComplete();
    }

    @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        again(th);
    }
}
