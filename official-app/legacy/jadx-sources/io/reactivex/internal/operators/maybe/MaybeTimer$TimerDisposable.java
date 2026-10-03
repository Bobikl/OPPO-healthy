package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTimer$TimerDisposable extends AtomicReference<cv5> implements cv5, Runnable {
    private static final long serialVersionUID = 2875964065294031672L;
    final mob<? super Long> downstream;

    public MaybeTimer$TimerDisposable(mob<? super Long> mobVar) {
        this.downstream = mobVar;
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
        this.downstream.onSuccess(0L);
    }

    public void setFuture(cv5 cv5Var) {
        DisposableHelper.replace(this, cv5Var);
    }
}
