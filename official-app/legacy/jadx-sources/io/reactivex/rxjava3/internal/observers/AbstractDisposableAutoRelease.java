package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.fv5;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
abstract class AbstractDisposableAutoRelease extends AtomicReference<a> implements a {
    private static final long serialVersionUID = 8924480688481408726L;
    final AtomicReference<fv5> composite;
    final Cdo onComplete;
    final o14<? super Throwable> onError;

    public AbstractDisposableAutoRelease(fv5 fv5Var, o14<? super Throwable> o14Var, Cdo cdo) {
        this.onError = o14Var;
        this.onComplete = cdo;
        this.composite = new AtomicReference<>(fv5Var);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final void dispose() {
        DisposableHelper.dispose(this);
        removeSelf();
    }

    public final boolean hasCustomOnError() {
        return this.onError != Functions.ON_ERROR_MISSING;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public final void onComplete() {
        a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            lazySet(disposableHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
        removeSelf();
    }

    public final void onError(Throwable th) {
        a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            lazySet(disposableHelper);
            try {
                this.onError.accept(th);
            } catch (Throwable th2) {
                hu6.b(th2);
                g4g.u(new CompositeException(th, th2));
            }
        } else {
            g4g.u(th);
        }
        removeSelf();
    }

    public final void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    final void removeSelf() {
        fv5 andSet = this.composite.getAndSet(null);
        if (andSet != null) {
            andSet.b(this);
        }
    }
}
