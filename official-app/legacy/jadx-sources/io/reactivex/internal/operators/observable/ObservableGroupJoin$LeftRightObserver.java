package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableGroupJoin$LeftRightObserver extends AtomicReference<cv5> implements bed<Object>, cv5 {
    private static final long serialVersionUID = 1883890389173668373L;
    final boolean isLeft;
    final b parent;

    public ObservableGroupJoin$LeftRightObserver(b bVar, boolean z) {
        this.parent = bVar;
        this.isLeft = z;
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
        this.parent.innerComplete(this);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.parent.innerError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(Object obj) {
        this.parent.innerValue(this.isLeft, obj);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
