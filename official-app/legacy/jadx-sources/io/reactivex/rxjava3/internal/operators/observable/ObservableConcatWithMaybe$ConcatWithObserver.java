package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatWithMaybe$ConcatWithObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<T>, lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -1953724749712440952L;
    final aed<? super T> downstream;
    boolean inMaybe;
    pob<? extends T> other;

    public ObservableConcatWithMaybe$ConcatWithObserver(aed<? super T> aedVar, pob<? extends T> pobVar) {
        this.downstream = aedVar;
        this.other = pobVar;
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
        if (this.inMaybe) {
            this.downstream.onComplete();
            return;
        }
        this.inMaybe = true;
        DisposableHelper.replace(this, null);
        pob<? extends T> pobVar = this.other;
        this.other = null;
        pobVar.a(this);
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
        if (!DisposableHelper.setOnce(this, aVar) || this.inMaybe) {
            return;
        }
        this.downstream.onSubscribe(this);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.downstream.onNext(t);
        this.downstream.onComplete();
    }
}
