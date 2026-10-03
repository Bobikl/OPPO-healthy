package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.xt7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeToFlowable<T> extends xt7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qob<T> f20480j;

    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements mob<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        cv5 upstream;

        public MaybeToFlowableSubscriber(v2j<? super T> v2jVar) {
            super(v2jVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.upstream, cv5Var)) {
                this.upstream = cv5Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.mob
        public void onSuccess(T t) {
            complete(t);
        }
    }

    public MaybeToFlowable(qob<T> qobVar) {
        this.f20480j = qobVar;
    }

    @Override // com.oplus.aiunit.vision.xt7
    public void g(v2j<? super T> v2jVar) {
        this.f20480j.a(new MaybeToFlowableSubscriber(v2jVar));
    }
}
