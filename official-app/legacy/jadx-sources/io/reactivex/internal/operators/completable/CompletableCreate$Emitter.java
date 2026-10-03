package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.bx2;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableCreate$Emitter extends AtomicReference<cv5> implements cv5 {
    private static final long serialVersionUID = -2467358622224974244L;
    final bs3 downstream;

    public CompletableCreate$Emitter(bs3 bs3Var) {
        this.downstream = bs3Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public void onComplete() {
        cv5 andSet;
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
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
        h4g.r(th);
    }

    public void setCancellable(bx2 bx2Var) {
        setDisposable(new CancellableDisposable(bx2Var));
    }

    public void setDisposable(cv5 cv5Var) {
        DisposableHelper.set(this, cv5Var);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return String.format("%s{%s}", CompletableCreate$Emitter.class.getSimpleName(), super.toString());
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
