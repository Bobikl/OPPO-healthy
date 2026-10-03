package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.p14;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<cv5> implements mob<T>, cv5 {
    private static final long serialVersionUID = -6076952298809384986L;
    final eo onComplete;
    final p14<? super Throwable> onError;
    final p14<? super T> onSuccess;

    public MaybeCallbackObserver(p14<? super T> p14Var, p14<? super Throwable> p14Var2, eo eoVar) {
        this.onSuccess = p14Var;
        this.onError = p14Var2;
        this.onComplete = eoVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.ON_ERROR_MISSING;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            iu6.b(th);
            h4g.r(th);
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            iu6.b(th2);
            h4g.r(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            iu6.b(th);
            h4g.r(th);
        }
    }
}
