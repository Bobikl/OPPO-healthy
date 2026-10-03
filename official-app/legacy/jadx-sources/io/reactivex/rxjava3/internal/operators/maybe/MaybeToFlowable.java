package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wt7;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeToFlowable<T> extends wt7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pob<T> f20545j;

    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements lob<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        io.reactivex.rxjava3.disposables.a upstream;

        public MaybeToFlowableSubscriber(v2j<? super T> v2jVar) {
            super(v2jVar);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.upstream, aVar)) {
                this.upstream = aVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            complete(t);
        }
    }

    public MaybeToFlowable(pob<T> pobVar) {
        this.f20545j = pobVar;
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        this.f20545j.a(new MaybeToFlowableSubscriber(v2jVar));
    }
}
