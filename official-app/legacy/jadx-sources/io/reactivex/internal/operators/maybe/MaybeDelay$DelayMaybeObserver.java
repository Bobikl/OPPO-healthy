package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeDelay$DelayMaybeObserver<T> extends AtomicReference<cv5> implements mob<T>, cv5, Runnable {
    private static final long serialVersionUID = 5566860102500855068L;
    final long delay;
    final mob<? super T> downstream;
    Throwable error;
    final zeg scheduler;
    final TimeUnit unit;
    T value;

    public MaybeDelay$DelayMaybeObserver(mob<? super T> mobVar, long j2, TimeUnit timeUnit, zeg zegVar) {
        this.downstream = mobVar;
        this.delay = j2;
        this.unit = timeUnit;
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

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        schedule();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.error = th;
        schedule();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.value = t;
        schedule();
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th = this.error;
        if (th != null) {
            this.downstream.onError(th);
            return;
        }
        T t = this.value;
        if (t != null) {
            this.downstream.onSuccess(t);
        } else {
            this.downstream.onComplete();
        }
    }

    public void schedule() {
        DisposableHelper.replace(this, this.scheduler.d(this, this.delay, this.unit));
    }
}
