package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapObservable$FlatMapObserver<T, R> extends AtomicReference<a> implements aed<R>, lob<T>, a {
    private static final long serialVersionUID = -8948264376121066672L;
    final aed<? super R> downstream;
    final d08<? super T, ? extends jdd<? extends R>> mapper;

    public MaybeFlatMapObservable$FlatMapObserver(aed<? super R> aedVar, d08<? super T, ? extends jdd<? extends R>> d08Var) {
        this.downstream = aedVar;
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

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(R r) {
        this.downstream.onNext(r);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        DisposableHelper.replace(this, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        try {
            jdd<? extends R> jddVarApply = this.mapper.apply(t);
            Objects.requireNonNull(jddVarApply, "The mapper returned a null Publisher");
            jdd<? extends R> jddVar = jddVarApply;
            if (isDisposed()) {
                return;
            }
            jddVar.subscribe(this);
        } catch (Throwable th) {
            hu6.b(th);
            this.downstream.onError(th);
        }
    }
}
