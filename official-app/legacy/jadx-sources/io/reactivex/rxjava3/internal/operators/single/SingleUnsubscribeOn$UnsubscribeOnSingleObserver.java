package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleUnsubscribeOn$UnsubscribeOnSingleObserver<T> extends AtomicReference<a> implements l6h<T>, a, Runnable {
    private static final long serialVersionUID = 3256698449646456986L;
    final l6h<? super T> downstream;
    a ds;
    final cfg scheduler;

    public SingleUnsubscribeOn$UnsubscribeOnSingleObserver(l6h<? super T> l6hVar, cfg cfgVar) {
        this.downstream = l6hVar;
        this.scheduler = cfgVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        a andSet = getAndSet(disposableHelper);
        if (andSet != disposableHelper) {
            this.ds = andSet;
            this.scheduler.g(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ds.dispose();
    }
}
