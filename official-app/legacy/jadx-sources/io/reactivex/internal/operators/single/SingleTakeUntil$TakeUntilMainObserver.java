package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.m6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleTakeUntil$TakeUntilMainObserver<T> extends AtomicReference<cv5> implements m6h<T>, cv5 {
    private static final long serialVersionUID = -622603812305745221L;
    final m6h<? super T> downstream;
    final SingleTakeUntil$TakeUntilOtherSubscriber other = new SingleTakeUntil$TakeUntilOtherSubscriber(this);

    public SingleTakeUntil$TakeUntilMainObserver(m6h<? super T> m6hVar) {
        this.downstream = m6hVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
        this.other.dispose();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.other.dispose();
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
            h4g.r(th);
        } else {
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        this.other.dispose();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onSuccess(t);
        }
    }

    public void otherError(Throwable th) {
        cv5 andSet;
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
            h4g.r(th);
            return;
        }
        if (andSet != null) {
            andSet.dispose();
        }
        this.downstream.onError(th);
    }
}
