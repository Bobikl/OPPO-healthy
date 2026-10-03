package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableCombineLatest$CombinerObserver<T, R> extends AtomicReference<cv5> implements bed<T> {
    private static final long serialVersionUID = -4823716997131257941L;
    final int index;
    final ObservableCombineLatest$LatestCoordinator<T, R> parent;

    public ObservableCombineLatest$CombinerObserver(ObservableCombineLatest$LatestCoordinator<T, R> observableCombineLatest$LatestCoordinator, int i) {
        this.parent = observableCombineLatest$LatestCoordinator;
        this.index = i;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.parent.innerComplete(this.index);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.parent.innerError(this.index, th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.parent.innerNext(this.index, t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
