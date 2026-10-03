package io.reactivex.disposables;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements cv5 {
    private static final long serialVersionUID = 6537757548749041217L;

    public ReferenceDisposable(T t) {
        super(abd.d(t, "value is null"));
    }

    @Override // com.oplus.aiunit.vision.cv5
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        onDisposed(andSet);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public final boolean isDisposed() {
        return get() == null;
    }

    public abstract void onDisposed(T t);
}
