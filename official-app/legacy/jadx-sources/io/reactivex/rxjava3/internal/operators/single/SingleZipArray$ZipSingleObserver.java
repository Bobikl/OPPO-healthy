package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleZipArray$ZipSingleObserver<T> extends AtomicReference<a> implements l6h<T> {
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

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.parent.innerError(th, this.index);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.parent.innerSuccess(t, this.index);
    }
}
