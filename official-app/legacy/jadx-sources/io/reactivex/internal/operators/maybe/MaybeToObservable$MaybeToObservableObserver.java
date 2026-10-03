package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeToObservable$MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements mob<T> {
    private static final long serialVersionUID = 7603343402964826922L;
    cv5 upstream;

    public MaybeToObservable$MaybeToObservableObserver(bed<? super T> bedVar) {
        super(bedVar);
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        complete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        error(th);
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
