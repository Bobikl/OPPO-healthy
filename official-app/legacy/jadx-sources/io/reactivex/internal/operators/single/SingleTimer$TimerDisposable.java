package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.m6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleTimer$TimerDisposable extends AtomicReference<cv5> implements cv5, Runnable {
    private static final long serialVersionUID = 8465401857522493082L;
    final m6h<? super Long> downstream;

    public SingleTimer$TimerDisposable(m6h<? super Long> m6hVar) {
        this.downstream = m6hVar;
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
