package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleObserveOn$ObserveOnSingleObserver<T> extends AtomicReference<cv5> implements m6h<T>, cv5, Runnable {
    private static final long serialVersionUID = 3528003840217436037L;
    final m6h<? super T> downstream;
    Throwable error;
    final zeg scheduler;
    T value;

    public SingleObserveOn$ObserveOnSingleObserver(m6h<? super T> m6hVar, zeg zegVar) {
        this.downstream = m6hVar;
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

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.error = th;
        DisposableHelper.replace(this, this.scheduler.c(this));
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        this.value = t;
        DisposableHelper.replace(this, this.scheduler.c(this));
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th = this.error;
        if (th != null) {
            this.downstream.onError(th);
        } else {
            this.downstream.onSuccess(this.value);
        }
    }
}
