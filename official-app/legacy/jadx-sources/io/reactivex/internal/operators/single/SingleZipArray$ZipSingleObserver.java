package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.m6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleZipArray$ZipSingleObserver<T> extends AtomicReference<cv5> implements m6h<T> {
    private static final long serialVersionUID = 3323743579927613702L;
    final int index;
    final SingleZipArray$ZipCoordinator<T, ?> parent;

    public SingleZipArray$ZipSingleObserver(SingleZipArray$ZipCoordinator<T, ?> singleZipArray$ZipCoordinator, int i) {
        this.parent = singleZipArray$ZipCoordinator;
        this.index = i;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.parent.innerError(th, this.index);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        this.parent.innerSuccess(t, this.index);
    }
}
