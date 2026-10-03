package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeUnsubscribeOn$UnsubscribeOnMaybeObserver<T> extends AtomicReference<cv5> implements mob<T>, cv5, Runnable {
    private static final long serialVersionUID = 3256698449646456986L;
    final mob<? super T> downstream;
    cv5 ds;
    final zeg scheduler;

    public MaybeUnsubscribeOn$UnsubscribeOnMaybeObserver(mob<? super T> mobVar, zeg zegVar) {
        this.downstream = mobVar;
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

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ds.dispose();
    }
}
