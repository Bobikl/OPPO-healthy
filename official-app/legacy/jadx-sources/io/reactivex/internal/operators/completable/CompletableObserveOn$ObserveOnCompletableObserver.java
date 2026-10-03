package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableObserveOn$ObserveOnCompletableObserver extends AtomicReference<cv5> implements bs3, cv5, Runnable {
    private static final long serialVersionUID = 8571289934935992137L;
    final bs3 downstream;
    Throwable error;
    final zeg scheduler;

    public CompletableObserveOn$ObserveOnCompletableObserver(bs3 bs3Var, zeg zegVar) {
        this.downstream = bs3Var;
        this.scheduler = zegVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        DisposableHelper.replace(this, this.scheduler.c(this));
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.error = th;
        DisposableHelper.replace(this, this.scheduler.c(this));
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th = this.error;
        if (th == null) {
            this.downstream.onComplete();
        } else {
            this.error = null;
            this.downstream.onError(th);
        }
    }
}
