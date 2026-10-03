package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.mbd;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableAmb$AmbInnerObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<T> {
    private static final long serialVersionUID = -1185974347409665484L;
    final aed<? super T> downstream;
    final int index;
    final mbd<T> parent;
    boolean won;

    public ObservableAmb$AmbInnerObserver(mbd<T> mbdVar, int i, aed<? super T> aedVar) {
        this.index = i;
        this.downstream = aedVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (!this.won) {
            throw null;
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (!this.won) {
            throw null;
        }
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (!this.won) {
            throw null;
        }
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }
}
