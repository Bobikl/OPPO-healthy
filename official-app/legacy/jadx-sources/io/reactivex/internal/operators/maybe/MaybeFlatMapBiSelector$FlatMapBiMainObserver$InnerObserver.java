package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.nd1;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver<T, U, R> extends AtomicReference<cv5> implements mob<U> {
    private static final long serialVersionUID = -2897979525538174559L;
    final mob<? super R> downstream;
    final nd1<? super T, ? super U, ? extends R> resultSelector;
    T value;

    public MaybeFlatMapBiSelector$FlatMapBiMainObserver$InnerObserver(mob<? super R> mobVar, nd1<? super T, ? super U, ? extends R> nd1Var) {
        this.downstream = mobVar;
        this.resultSelector = nd1Var;
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(U u) {
        T t = this.value;
        this.value = null;
        try {
            this.downstream.onSuccess(abd.d(this.resultSelector.apply(t, u), "The resultSelector returned a null value"));
        } catch (Throwable th) {
            iu6.b(th);
            this.downstream.onError(th);
        }
    }
}
