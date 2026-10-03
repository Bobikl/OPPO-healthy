package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.ax2;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeCreate$Emitter<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -2467358622224974244L;
    final lob<? super T> downstream;

    public MaybeCreate$Emitter(lob<? super T> lobVar) {
        this.downstream = lobVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public void onComplete() {
        io.reactivex.rxjava3.disposables.a andSet;
        io.reactivex.rxjava3.disposables.a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
            return;
        }
        try {
            this.downstream.onComplete();
        } finally {
            if (andSet != null) {
                andSet.dispose();
            }
        }
    }

    public void onError(Throwable th) {
        if (tryOnError(th)) {
            return;
        }
        g4g.u(th);
    }

    public void onSuccess(T t) {
        io.reactivex.rxjava3.disposables.a andSet;
        io.reactivex.rxjava3.disposables.a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
            return;
        }
        try {
            if (t == null) {
                this.downstream.onError(ExceptionHelper.b("onSuccess called with a null value."));
            } else {
                this.downstream.onSuccess(t);
            }
            if (andSet != null) {
                andSet.dispose();
            }
        } catch (Throwable th) {
            if (andSet != null) {
                andSet.dispose();
            }
            throw th;
        }
    }

    public void setCancellable(ax2 ax2Var) {
        setDisposable(new CancellableDisposable(ax2Var));
    }

    public void setDisposable(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.set(this, aVar);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return String.format("%s{%s}", MaybeCreate$Emitter.class.getSimpleName(), super.toString());
    }

    public boolean tryOnError(Throwable th) {
        io.reactivex.rxjava3.disposables.a andSet;
        if (th == null) {
            th = ExceptionHelper.b("onError called with a null Throwable.");
        }
        io.reactivex.rxjava3.disposables.a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        try {
            this.downstream.onError(th);
        } finally {
            if (andSet != null) {
                andSet.dispose();
            }
        }
    }
}
