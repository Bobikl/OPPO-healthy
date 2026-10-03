package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleUnsubscribeOn$UnsubscribeOnSingleObserver<T> extends AtomicReference<cv5> implements m6h<T>, cv5, Runnable {
    private static final long serialVersionUID = 3256698449646456986L;
    final m6h<? super T> downstream;
    cv5 ds;
    final zeg scheduler;

    public SingleUnsubscribeOn$UnsubscribeOnSingleObserver(m6h<? super T> m6hVar, zeg zegVar) {
        this.downstream = m6hVar;
        this.scheduler = zegVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        cv5 andSet = getAndSet(disposableHelper);
        if (andSet != disposableHelper) {
            this.ds = andSet;
            this.scheduler.c(this);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ds.dispose();
    }
}
