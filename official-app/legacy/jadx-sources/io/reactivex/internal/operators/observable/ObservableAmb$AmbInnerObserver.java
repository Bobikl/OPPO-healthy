package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.nbd;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableAmb$AmbInnerObserver<T> extends AtomicReference<cv5> implements bed<T> {
    private static final long serialVersionUID = -1185974347409665484L;
    final bed<? super T> downstream;
    final int index;
    final nbd<T> parent;
    boolean won;

    public ObservableAmb$AmbInnerObserver(nbd<T> nbdVar, int i, bed<? super T> bedVar) {
        this.index = i;
        this.downstream = bedVar;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (!this.won) {
            throw null;
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (!this.won) {
            throw null;
        }
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (!this.won) {
            throw null;
        }
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
