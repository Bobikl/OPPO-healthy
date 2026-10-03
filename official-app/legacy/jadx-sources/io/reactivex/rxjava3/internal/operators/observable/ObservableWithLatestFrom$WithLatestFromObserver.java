package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.md1;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableWithLatestFrom$WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -312246233408980075L;
    final md1<? super T, ? super U, ? extends R> combiner;
    final aed<? super R> downstream;
    final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream = new AtomicReference<>();
    final AtomicReference<io.reactivex.rxjava3.disposables.a> other = new AtomicReference<>();

    public ObservableWithLatestFrom$WithLatestFromObserver(aed<? super R> aedVar, md1<? super T, ? super U, ? extends R> md1Var) {
        this.downstream = aedVar;
        this.combiner = md1Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this.other);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        DisposableHelper.dispose(this.other);
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.other);
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        U u = get();
        if (u != null) {
            try {
                R rApply = this.combiner.apply(t, u);
                Objects.requireNonNull(rApply, "The combiner returned a null value");
                this.downstream.onNext(rApply);
            } catch (Throwable th) {
                hu6.b(th);
                dispose();
                this.downstream.onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this.upstream, aVar);
    }

    public void otherError(Throwable th) {
        DisposableHelper.dispose(this.upstream);
        this.downstream.onError(th);
    }

    public boolean setOther(io.reactivex.rxjava3.disposables.a aVar) {
        return DisposableHelper.setOnce(this.other, aVar);
    }
}
