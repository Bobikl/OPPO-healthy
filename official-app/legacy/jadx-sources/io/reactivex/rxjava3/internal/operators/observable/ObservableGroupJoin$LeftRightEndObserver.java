package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableGroupJoin$LeftRightEndObserver extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<Object>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 1883890389173668373L;
    final int index;
    final boolean isLeft;
    final b parent;

    public ObservableGroupJoin$LeftRightEndObserver(b bVar, boolean z, int i) {
        this.parent = bVar;
        this.isLeft = z;
        this.index = i;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.parent.innerClose(this.isLeft, this);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.parent.innerCloseError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(Object obj) {
        if (DisposableHelper.dispose(this)) {
            this.parent.innerClose(this.isLeft, this);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }
}
