package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatWithSingle$ConcatWithObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<T>, l6h<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -1953724749712440952L;
    final aed<? super T> downstream;
    boolean inSingle;
    s6h<? extends T> other;

    public ObservableConcatWithSingle$ConcatWithObserver(aed<? super T> aedVar, s6h<? extends T> s6hVar) {
        this.downstream = aedVar;
        this.other = s6hVar;
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
        this.inSingle = true;
        DisposableHelper.replace(this, null);
        s6h<? extends T> s6hVar = this.other;
        this.other = null;
        s6hVar.b(this);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (!DisposableHelper.setOnce(this, aVar) || this.inSingle) {
            return;
        }
        this.downstream.onSubscribe(this);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.downstream.onNext(t);
        this.downstream.onComplete();
    }
}
