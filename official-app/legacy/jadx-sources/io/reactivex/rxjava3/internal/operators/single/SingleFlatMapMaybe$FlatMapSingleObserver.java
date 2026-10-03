package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.a6h;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleFlatMapMaybe$FlatMapSingleObserver<T, R> extends AtomicReference<a> implements l6h<T>, a {
    private static final long serialVersionUID = -5843758257109742742L;
    final lob<? super R> downstream;
    final d08<? super T, ? extends pob<? extends R>> mapper;

    public SingleFlatMapMaybe$FlatMapSingleObserver(lob<? super R> lobVar, d08<? super T, ? extends pob<? extends R>> d08Var) {
        this.downstream = lobVar;
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

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        try {
            pob<? extends R> pobVarApply = this.mapper.apply(t);
            Objects.requireNonNull(pobVarApply, "The mapper returned a null MaybeSource");
            pob<? extends R> pobVar = pobVarApply;
            if (isDisposed()) {
                return;
            }
            pobVar.a(new a6h(this, this.downstream));
        } catch (Throwable th) {
            hu6.b(th);
            onError(th);
        }
    }
}
