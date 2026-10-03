package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatWithCompletable$ConcatWithObserver<T> extends AtomicReference<cv5> implements bed<T>, bs3, cv5 {
    private static final long serialVersionUID = -1953724749712440952L;
    final bed<? super T> downstream;
    boolean inCompletable;
    es3 other;

    public ObservableConcatWithCompletable$ConcatWithObserver(bed<? super T> bedVar, es3 es3Var) {
        this.downstream = bedVar;
        this.other = es3Var;
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
        if (this.inCompletable) {
            this.downstream.onComplete();
            return;
        }
        this.inCompletable = true;
        DisposableHelper.replace(this, null);
        es3 es3Var = this.other;
        this.other = null;
        es3Var.a(this);
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
        if (!DisposableHelper.setOnce(this, cv5Var) || this.inCompletable) {
            return;
        }
        this.downstream.onSubscribe(this);
    }
}
