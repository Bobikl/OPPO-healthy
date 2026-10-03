package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeObserveOn$ObserveOnMaybeObserver<T> extends AtomicReference<cv5> implements mob<T>, cv5, Runnable {
    private static final long serialVersionUID = 8571289934935992137L;
    final mob<? super T> downstream;
    Throwable error;
    final zeg scheduler;
    T value;

    public MaybeObserveOn$ObserveOnMaybeObserver(mob<? super T> mobVar, zeg zegVar) {
        this.downstream = mobVar;
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
        DisposableHelper.replace(this, this.scheduler.c(this));
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.error = th;
        DisposableHelper.replace(this, this.scheduler.c(this));
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
        DisposableHelper.replace(this, this.scheduler.c(this));
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th = this.error;
        if (th != null) {
            this.error = null;
            this.downstream.onError(th);
            return;
        }
        T t = this.value;
        if (t == null) {
            this.downstream.onComplete();
        } else {
            this.value = null;
            this.downstream.onSuccess(t);
        }
    }
}
