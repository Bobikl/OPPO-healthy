package io.reactivex.rxjava3.internal.disposables;

import com.oplus.aiunit.vision.ax2;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import io.reactivex.rxjava3.disposables.a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CancellableDisposable extends AtomicReference<ax2> implements a {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(ax2 ax2Var) {
        super(ax2Var);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        ax2 andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == null;
    }
}
