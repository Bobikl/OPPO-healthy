package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapCompletable$FlatMapCompletableObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, as3, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -2177128922851101253L;
    final as3 downstream;
    final d08<? super T, ? extends ds3> mapper;

    public MaybeFlatMapCompletable$FlatMapCompletableObserver(as3 as3Var, d08<? super T, ? extends ds3> d08Var) {
        this.downstream = as3Var;
        this.mapper = d08Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.replace(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        try {
            ds3 ds3VarApply = this.mapper.apply(t);
            Objects.requireNonNull(ds3VarApply, "The mapper returned a null CompletableSource");
            ds3 ds3Var = ds3VarApply;
            if (isDisposed()) {
                return;
            }
            ds3Var.a(this);
        } catch (Throwable th) {
            hu6.b(th);
            onError(th);
        }
    }
}
