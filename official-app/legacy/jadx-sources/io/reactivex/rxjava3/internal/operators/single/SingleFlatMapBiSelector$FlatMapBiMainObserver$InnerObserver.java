package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.md1;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> extends AtomicReference<a> implements l6h<U> {
    private static final long serialVersionUID = -2897979525538174559L;
    final l6h<? super R> downstream;
    final md1<? super T, ? super U, ? extends R> resultSelector;
    T value;

    public SingleFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver(l6h<? super R> l6hVar, md1<? super T, ? super U, ? extends R> md1Var) {
        this.downstream = l6hVar;
        this.resultSelector = md1Var;
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(U u) {
        T t = this.value;
        this.value = null;
        try {
            R rApply = this.resultSelector.apply(t, u);
            Objects.requireNonNull(rApply, "The resultSelector returned a null value");
            this.downstream.onSuccess(rApply);
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }
}
