package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.cfg;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableDelay$Delay extends AtomicReference<a> implements as3, Runnable, a {
    private static final long serialVersionUID = 465972761105851022L;
    final long delay;
    final boolean delayError;
    final as3 downstream;
    Throwable error;
    final cfg scheduler;
    final TimeUnit unit;

    public CompletableDelay$Delay(as3 as3Var, long j2, TimeUnit timeUnit, cfg cfgVar, boolean z) {
        this.downstream = as3Var;
        this.delay = j2;
        this.unit = timeUnit;
        this.scheduler = cfgVar;
        this.delayError = z;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        DisposableHelper.replace(this, this.scheduler.h(this, this.delay, this.unit));
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        this.error = th;
        DisposableHelper.replace(this, this.scheduler.h(this, this.delayError ? this.delay : 0L, this.unit));
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
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
