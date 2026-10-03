package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wt7;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleToFlowable<T> extends wt7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s6h<? extends T> f20619j;

    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements l6h<T> {
        private static final long serialVersionUID = 187782011903685568L;
        a upstream;

        public SingleToFlowableObserver(v2j<? super T> v2jVar) {
            super(v2jVar);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void cancel() {
            super.cancel();
            this.upstream.dispose();
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(a aVar) {
            if (DisposableHelper.validate(this.upstream, aVar)) {
                this.upstream = aVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            complete(t);
        }
    }

    public SingleToFlowable(s6h<? extends T> s6hVar) {
        this.f20619j = s6hVar;
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        this.f20619j.b(new SingleToFlowableObserver(v2jVar));
    }
}
