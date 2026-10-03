package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeUnsubscribeOn$UnsubscribeOnMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a, Runnable {
    private static final long serialVersionUID = 3256698449646456986L;
    final lob<? super T> downstream;
    io.reactivex.rxjava3.disposables.a ds;
    final cfg scheduler;

    public MaybeUnsubscribeOn$UnsubscribeOnMaybeObserver(lob<? super T> lobVar, cfg cfgVar) {
        this.downstream = lobVar;
        this.scheduler = cfgVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        io.reactivex.rxjava3.disposables.a andSet = getAndSet(disposableHelper);
        if (andSet != disposableHelper) {
            this.ds = andSet;
            this.scheduler.g(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ds.dispose();
    }
}
