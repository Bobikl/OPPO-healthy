package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatWithSingle$ConcatWithObserver<T> extends AtomicReference<cv5> implements bed<T>, m6h<T>, cv5 {
    private static final long serialVersionUID = -1953724749712440952L;
    final bed<? super T> downstream;
    boolean inSingle;
    t6h<? extends T> other;

    public ObservableConcatWithSingle$ConcatWithObserver(bed<? super T> bedVar, t6h<? extends T> t6hVar) {
        this.downstream = bedVar;
        this.other = t6hVar;
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
        this.inSingle = true;
        DisposableHelper.replace(this, null);
        t6h<? extends T> t6hVar = this.other;
        this.other = null;
        t6hVar.a(this);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (!DisposableHelper.setOnce(this, cv5Var) || this.inSingle) {
            return;
        }
        this.downstream.onSubscribe(this);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        this.downstream.onNext(t);
        this.downstream.onComplete();
    }
}
