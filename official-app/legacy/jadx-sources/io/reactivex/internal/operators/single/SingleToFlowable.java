package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.xt7;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleToFlowable<T> extends xt7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t6h<? extends T> f20504j;

    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements m6h<T> {
        private static final long serialVersionUID = 187782011903685568L;
        cv5 upstream;

        public SingleToFlowableObserver(v2j<? super T> v2jVar) {
            super(v2jVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.upstream, cv5Var)) {
                this.upstream = cv5Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSuccess(T t) {
            complete(t);
        }
    }

    public SingleToFlowable(t6h<? extends T> t6hVar) {
        this.f20504j = t6hVar;
    }

    @Override // com.oplus.aiunit.vision.xt7
    public void g(v2j<? super T> v2jVar) {
        this.f20504j.a(new SingleToFlowableObserver(v2jVar));
    }
}
