package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.cvf;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleResumeNext$ResumeMainSingleObserver<T> extends AtomicReference<a> implements l6h<T>, a {
    private static final long serialVersionUID = -5314538511045349925L;
    final l6h<? super T> downstream;
    final d08<? super Throwable, ? extends s6h<? extends T>> nextFunction;

    public SingleResumeNext$ResumeMainSingleObserver(l6h<? super T> l6hVar, d08<? super Throwable, ? extends s6h<? extends T>> d08Var) {
        this.downstream = l6hVar;
        this.nextFunction = d08Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        try {
            s6h<? extends T> s6hVarApply = this.nextFunction.apply(th);
            Objects.requireNonNull(s6hVarApply, "The nextFunction returned a null SingleSource.");
            s6hVarApply.b(new cvf(this, this.downstream));
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
