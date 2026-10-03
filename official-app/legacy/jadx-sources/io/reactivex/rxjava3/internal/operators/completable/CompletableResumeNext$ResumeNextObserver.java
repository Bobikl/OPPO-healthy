package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.hu6;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableResumeNext$ResumeNextObserver extends AtomicReference<a> implements as3, a {
    private static final long serialVersionUID = 5018523762564524046L;
    final as3 downstream;
    final d08<? super Throwable, ? extends ds3> errorMapper;
    boolean once;

    public CompletableResumeNext$ResumeNextObserver(as3 as3Var, d08<? super Throwable, ? extends ds3> d08Var) {
        this.downstream = as3Var;
        this.errorMapper = d08Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        if (this.once) {
            this.downstream.onError(th);
            return;
        }
        this.once = true;
        try {
            ds3 ds3VarApply = this.errorMapper.apply(th);
            Objects.requireNonNull(ds3VarApply, "The errorMapper returned a null CompletableSource");
            ds3VarApply.a(this);
        } catch (Throwable th2) {
            hu6.b(th2);
            this.downstream.onError(new CompositeException(th, th2));
        }
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        DisposableHelper.replace(this, aVar);
    }
}
