package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.tbd;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableDebounceTimed$DebounceEmitter<T> extends AtomicReference<cv5> implements Runnable, cv5 {
    private static final long serialVersionUID = 6812032969491025141L;
    final long idx;
    final AtomicBoolean once = new AtomicBoolean();
    final tbd<T> parent;
    final T value;

    public ObservableDebounceTimed$DebounceEmitter(T t, long j2, tbd<T> tbdVar) {
        this.value = t;
        this.idx = j2;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.once.compareAndSet(false, true)) {
            throw null;
        }
    }

    public void setResource(cv5 cv5Var) {
        DisposableHelper.replace(this, cv5Var);
    }
}
