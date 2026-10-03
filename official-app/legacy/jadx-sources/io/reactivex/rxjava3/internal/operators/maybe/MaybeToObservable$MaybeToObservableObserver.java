package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeToObservable$MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements lob<T> {
    private static final long serialVersionUID = 7603343402964826922L;
    io.reactivex.rxjava3.disposables.a upstream;

    public MaybeToObservable$MaybeToObservableObserver(aed<? super T> aedVar) {
        super(aedVar);
    }

    @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public void dispose() {
        super.dispose();
        this.upstream.dispose();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        complete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        error(th);
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
