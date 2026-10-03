package io.reactivex.internal.disposables;

import com.oplus.aiunit.vision.cv5;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class SequentialDisposable extends AtomicReference<cv5> implements cv5 {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean replace(cv5 cv5Var) {
        return DisposableHelper.replace(this, cv5Var);
    }

    public boolean update(cv5 cv5Var) {
        return DisposableHelper.set(this, cv5Var);
    }

    public SequentialDisposable(cv5 cv5Var) {
        lazySet(cv5Var);
    }
}
