package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeObserveOn$ObserveOnMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a, Runnable {
    private static final long serialVersionUID = 8571289934935992137L;
    final lob<? super T> downstream;
    Throwable error;
    final cfg scheduler;
    T value;

    public MaybeObserveOn$ObserveOnMaybeObserver(lob<? super T> lobVar, cfg cfgVar) {
        this.downstream = lobVar;
        this.scheduler = cfgVar;
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
        DisposableHelper.replace(this, this.scheduler.g(this));
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.error = th;
        DisposableHelper.replace(this, this.scheduler.g(this));
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
        DisposableHelper.replace(this, this.scheduler.g(this));
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
