package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class LambdaObserver<T> extends AtomicReference<a> implements aed<T>, a {
    private static final long serialVersionUID = -7251123623727029452L;
    final Cdo onComplete;
    final o14<? super Throwable> onError;
    final o14<? super T> onNext;
    final o14<? super a> onSubscribe;

    public LambdaObserver(o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo, o14<? super a> o14Var3) {
        this.onNext = o14Var;
        this.onError = o14Var2;
        this.onComplete = cdo;
        this.onSubscribe = o14Var3;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.ON_ERROR_MISSING;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (isDisposed()) {
            g4g.u(th);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            hu6.b(th2);
            g4g.u(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            hu6.b(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                hu6.b(th);
                aVar.dispose();
                onError(th);
            }
        }
    }
}
