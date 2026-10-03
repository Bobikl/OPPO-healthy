package io.reactivex.internal.observers;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.p14;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class LambdaObserver<T> extends AtomicReference<cv5> implements bed<T>, cv5 {
    private static final long serialVersionUID = -7251123623727029452L;
    final eo onComplete;
    final p14<? super Throwable> onError;
    final p14<? super T> onNext;
    final p14<? super cv5> onSubscribe;

    public LambdaObserver(p14<? super T> p14Var, p14<? super Throwable> p14Var2, eo eoVar, p14<? super cv5> p14Var3) {
        this.onNext = p14Var;
        this.onError = p14Var2;
        this.onComplete = eoVar;
        this.onSubscribe = p14Var3;
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
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            iu6.b(th);
            h4g.r(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (isDisposed()) {
            h4g.r(th);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            iu6.b(th2);
            h4g.r(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            iu6.b(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                iu6.b(th);
                cv5Var.dispose();
                onError(th);
            }
        }
    }
}
