package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.eob;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeFlatMapSingle$FlatMapMaybeObserver<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 4827726964688405508L;
    final lob<? super R> downstream;
    final d08<? super T, ? extends s6h<? extends R>> mapper;

    public MaybeFlatMapSingle$FlatMapMaybeObserver(lob<? super R> lobVar, d08<? super T, ? extends s6h<? extends R>> d08Var) {
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
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        try {
            s6h<? extends R> s6hVarApply = this.mapper.apply(t);
            Objects.requireNonNull(s6hVarApply, "The mapper returned a null SingleSource");
            s6h<? extends R> s6hVar = s6hVarApply;
            if (isDisposed()) {
                return;
            }
            s6hVar.b(new eob(this, this.downstream));
        } catch (Throwable th) {
            hu6.b(th);
            onError(th);
        }
    }
}
