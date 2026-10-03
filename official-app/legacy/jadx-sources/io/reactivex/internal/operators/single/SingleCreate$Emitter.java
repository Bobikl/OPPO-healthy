package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.bx2;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.m6h;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleCreate$Emitter<T> extends AtomicReference<cv5> implements cv5 {
    private static final long serialVersionUID = -2467358622224974244L;
    final m6h<? super T> downstream;

    public SingleCreate$Emitter(m6h<? super T> m6hVar) {
        this.downstream = m6hVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public void onError(Throwable th) {
        if (tryOnError(th)) {
            return;
        }
        h4g.r(th);
    }

    public void onSuccess(T t) {
        cv5 andSet;
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
            return;
        }
        try {
            if (t == null) {
                this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
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

    public void setCancellable(bx2 bx2Var) {
        setDisposable(new CancellableDisposable(bx2Var));
    }

    public void setDisposable(cv5 cv5Var) {
        DisposableHelper.set(this, cv5Var);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return String.format("%s{%s}", SingleCreate$Emitter.class.getSimpleName(), super.toString());
    }

    public boolean tryOnError(Throwable th) {
        cv5 andSet;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
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
