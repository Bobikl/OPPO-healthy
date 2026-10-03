package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableDelay$Delay extends AtomicReference<cv5> implements bs3, Runnable, cv5 {
    private static final long serialVersionUID = 465972761105851022L;
    final long delay;
    final boolean delayError;
    final bs3 downstream;
    Throwable error;
    final zeg scheduler;
    final TimeUnit unit;

    public CompletableDelay$Delay(bs3 bs3Var, long j2, TimeUnit timeUnit, zeg zegVar, boolean z) {
        this.downstream = bs3Var;
        this.delay = j2;
        this.unit = timeUnit;
        this.scheduler = zegVar;
        this.delayError = z;
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
        DisposableHelper.replace(this, this.scheduler.d(this, this.delay, this.unit));
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.error = th;
        DisposableHelper.replace(this, this.scheduler.d(this, this.delayError ? this.delay : 0L, this.unit));
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
        this.error = null;
        if (th != null) {
            this.downstream.onError(th);
        } else {
            this.downstream.onComplete();
        }
    }
}
