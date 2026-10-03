package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableWithLatestFromMany$WithLatestInnerObserver extends AtomicReference<cv5> implements bed<Object> {
    private static final long serialVersionUID = 3256684027868224024L;
    boolean hasValue;
    final int index;
    final ObservableWithLatestFromMany$WithLatestFromObserver<?, ?> parent;

    public ObservableWithLatestFromMany$WithLatestInnerObserver(ObservableWithLatestFromMany$WithLatestFromObserver<?, ?> observableWithLatestFromMany$WithLatestFromObserver, int i) {
        this.parent = observableWithLatestFromMany$WithLatestFromObserver;
        this.index = i;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.parent.innerComplete(this.index, this.hasValue);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.parent.innerError(this.index, th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(Object obj) {
        if (!this.hasValue) {
            this.hasValue = true;
        }
        this.parent.innerNext(this.index, obj);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
