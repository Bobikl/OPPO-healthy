package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.qob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatWithMaybe$ConcatWithObserver<T> extends AtomicReference<cv5> implements bed<T>, mob<T>, cv5 {
    private static final long serialVersionUID = -1953724749712440952L;
    final bed<? super T> downstream;
    boolean inMaybe;
    qob<? extends T> other;

    public ObservableConcatWithMaybe$ConcatWithObserver(bed<? super T> bedVar, qob<? extends T> qobVar) {
        this.downstream = bedVar;
        this.other = qobVar;
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
        if (this.inMaybe) {
            this.downstream.onComplete();
            return;
        }
        this.inMaybe = true;
        DisposableHelper.replace(this, null);
        qob<? extends T> qobVar = this.other;
        this.other = null;
        qobVar.a(this);
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
        if (!DisposableHelper.setOnce(this, cv5Var) || this.inMaybe) {
            return;
        }
        this.downstream.onSubscribe(this);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.downstream.onNext(t);
        this.downstream.onComplete();
    }
}
