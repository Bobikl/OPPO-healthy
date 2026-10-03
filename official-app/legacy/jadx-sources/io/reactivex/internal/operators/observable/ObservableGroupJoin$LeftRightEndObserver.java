package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableGroupJoin$LeftRightEndObserver extends AtomicReference<cv5> implements bed<Object>, cv5 {
    private static final long serialVersionUID = 1883890389173668373L;
    final int index;
    final boolean isLeft;
    final b parent;

    public ObservableGroupJoin$LeftRightEndObserver(b bVar, boolean z, int i) {
        this.parent = bVar;
        this.isLeft = z;
        this.index = i;
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
        this.parent.innerClose(this.isLeft, this);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.parent.innerCloseError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(Object obj) {
        if (DisposableHelper.dispose(this)) {
            this.parent.innerClose(this.isLeft, this);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
