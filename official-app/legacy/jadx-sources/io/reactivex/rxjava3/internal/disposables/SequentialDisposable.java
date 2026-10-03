package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class SequentialDisposable extends AtomicReference<a> implements a {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean replace(a aVar) {
        return DisposableHelper.replace(this, aVar);
    }

    public boolean update(a aVar) {
        return DisposableHelper.set(this, aVar);
    }

    public SequentialDisposable(a aVar) {
        lazySet(aVar);
    }
}
