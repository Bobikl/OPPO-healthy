package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleTakeUntil$TakeUntilMainObserver<T> extends AtomicReference<a> implements l6h<T>, a {
    private static final long serialVersionUID = -622603812305745221L;
    final l6h<? super T> downstream;
    final SingleTakeUntil$TakeUntilOtherSubscriber other = new SingleTakeUntil$TakeUntilOtherSubscriber(this);

    public SingleTakeUntil$TakeUntilMainObserver(l6h<? super T> l6hVar) {
        this.downstream = l6hVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
        this.other.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.other.dispose();
        a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
            g4g.u(th);
        } else {
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.other.dispose();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onSuccess(t);
        }
    }

    public void otherError(Throwable th) {
        a andSet;
        a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
            g4g.u(th);
            return;
        }
        if (andSet != null) {
            andSet.dispose();
        }
        this.downstream.onError(th);
    }
}
