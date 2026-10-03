package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableTimer$TimerDisposable extends AtomicReference<cv5> implements cv5, Runnable {
    private static final long serialVersionUID = 3167244060586201109L;
    final bs3 downstream;

    public CompletableTimer$TimerDisposable(bs3 bs3Var) {
        this.downstream = bs3Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // java.lang.Runnable
    public void run() {
        this.downstream.onComplete();
    }

    public void setFuture(cv5 cv5Var) {
        DisposableHelper.replace(this, cv5Var);
    }
}
