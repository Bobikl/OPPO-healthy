package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.pu7;
import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableRepeatWhen$RepeatWhenSubscriber<T> extends FlowableRepeatWhen$WhenSourceSubscriber<T, Object> {
    private static final long serialVersionUID = -2680129890138081029L;

    public FlowableRepeatWhen$RepeatWhenSubscriber(v2j<? super T> v2jVar, pu7<Object> pu7Var, c3j c3jVar) {
        super(v2jVar, pu7Var, c3jVar);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber, com.oplus.aiunit.vision.v2j
    public void onComplete() {
        again(0);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen$WhenSourceSubscriber, com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.receiver.cancel();
        this.downstream.onError(th);
    }
}
