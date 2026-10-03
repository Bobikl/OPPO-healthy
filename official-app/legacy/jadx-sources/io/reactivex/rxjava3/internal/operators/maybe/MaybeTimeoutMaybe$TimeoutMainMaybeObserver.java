package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTimeoutMaybe$TimeoutMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -5955289211445418871L;
    final lob<? super T> downstream;
    final pob<? extends T> fallback;
    final MaybeTimeoutMaybe$TimeoutOtherMaybeObserver<T, U> other = new MaybeTimeoutMaybe$TimeoutOtherMaybeObserver<>(this);
    final MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver<T> otherObserver;

    public MaybeTimeoutMaybe$TimeoutMainMaybeObserver(lob<? super T> lobVar, pob<? extends T> pobVar) {
        this.downstream = lobVar;
        this.fallback = pobVar;
        this.otherObserver = pobVar != null ? new MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver<>(lobVar) : null;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
        DisposableHelper.dispose(this.other);
        MaybeTimeoutMaybe$TimeoutFallbackMaybeObserver<T> maybeTimeoutMaybe$TimeoutFallbackMaybeObserver = this.otherObserver;
        if (maybeTimeoutMaybe$TimeoutFallbackMaybeObserver != null) {
            DisposableHelper.dispose(maybeTimeoutMaybe$TimeoutFallbackMaybeObserver);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        DisposableHelper.dispose(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onError(th);
        } else {
            g4g.u(th);
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        DisposableHelper.dispose(this.other);
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (getAndSet(disposableHelper) != disposableHelper) {
            this.downstream.onSuccess(t);
        }
    }

    public void otherComplete() {
        if (DisposableHelper.dispose(this)) {
            pob<? extends T> pobVar = this.fallback;
            if (pobVar == null) {
                this.downstream.onError(new TimeoutException());
            } else {
                pobVar.a(this.otherObserver);
            }
        }
    }

    public void otherError(Throwable th) {
        if (DisposableHelper.dispose(this)) {
            this.downstream.onError(th);
        } else {
            g4g.u(th);
        }
    }
}
