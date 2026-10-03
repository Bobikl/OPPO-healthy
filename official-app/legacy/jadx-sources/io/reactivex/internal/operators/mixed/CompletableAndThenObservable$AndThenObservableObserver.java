package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kdd;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableAndThenObservable$AndThenObservableObserver<R> extends AtomicReference<cv5> implements bed<R>, bs3, cv5 {
    private static final long serialVersionUID = -8948264376121066672L;
    final bed<? super R> downstream;
    kdd<? extends R> other;

    public CompletableAndThenObservable$AndThenObservableObserver(bed<? super R> bedVar, kdd<? extends R> kddVar) {
        this.other = kddVar;
        this.downstream = bedVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        kdd<? extends R> kddVar = this.other;
        if (kddVar == null) {
            this.downstream.onComplete();
        } else {
            this.other = null;
            kddVar.subscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this, cv5Var);
    }
}
