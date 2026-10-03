package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeDelay$DelayMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a, Runnable {
    private static final long serialVersionUID = 5566860102500855068L;
    final long delay;
    final boolean delayError;
    final lob<? super T> downstream;
    Throwable error;
    final cfg scheduler;
    final TimeUnit unit;
    T value;

    public MaybeDelay$DelayMaybeObserver(lob<? super T> lobVar, long j2, TimeUnit timeUnit, cfg cfgVar, boolean z) {
        this.downstream = lobVar;
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

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        schedule(this.delay);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.error = th;
        schedule(this.delayError ? this.delay : 0L);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.value = t;
        schedule(this.delay);
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

    public void schedule(long j2) {
        DisposableHelper.replace(this, this.scheduler.h(this, j2, this.unit));
    }
}
