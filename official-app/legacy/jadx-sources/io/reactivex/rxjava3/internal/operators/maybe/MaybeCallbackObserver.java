package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.o14;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -6076952298809384986L;
    final Cdo onComplete;
    final o14<? super Throwable> onError;
    final o14<? super T> onSuccess;

    public MaybeCallbackObserver(o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo) {
        this.onSuccess = o14Var;
        this.onError = o14Var2;
        this.onComplete = cdo;
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
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            hu6.b(th2);
            g4g.u(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            hu6.b(th);
            g4g.u(th);
        }
    }
}
