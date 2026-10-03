package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.jdd;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableAndThenObservable$AndThenObservableObserver<R> extends AtomicReference<a> implements aed<R>, as3, a {
    private static final long serialVersionUID = -8948264376121066672L;
    final aed<? super R> downstream;
    jdd<? extends R> other;

    public CompletableAndThenObservable$AndThenObservableObserver(aed<? super R> aedVar, jdd<? extends R> jddVar) {
        this.other = jddVar;
        this.downstream = aedVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        jdd<? extends R> jddVar = this.other;
        if (jddVar == null) {
            this.downstream.onComplete();
        } else {
            this.other = null;
            jddVar.subscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        DisposableHelper.replace(this, aVar);
    }
}
