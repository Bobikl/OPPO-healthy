package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.nd1;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableWithLatestFrom$WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements bed<T>, cv5 {
    private static final long serialVersionUID = -312246233408980075L;
    final nd1<? super T, ? super U, ? extends R> combiner;
    final bed<? super R> downstream;
    final AtomicReference<cv5> upstream = new AtomicReference<>();
    final AtomicReference<cv5> other = new AtomicReference<>();

    public ObservableWithLatestFrom$WithLatestFromObserver(bed<? super R> bedVar, nd1<? super T, ? super U, ? extends R> nd1Var) {
        this.downstream = bedVar;
        this.combiner = nd1Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this.other);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        DisposableHelper.dispose(this.other);
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.other);
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        U u = get();
        if (u != null) {
            try {
                this.downstream.onNext(abd.d(this.combiner.apply(t, u), "The combiner returned a null value"));
            } catch (Throwable th) {
                iu6.b(th);
                dispose();
                this.downstream.onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this.upstream, cv5Var);
    }

    public void otherError(Throwable th) {
        DisposableHelper.dispose(this.upstream);
        this.downstream.onError(th);
    }

    public boolean setOther(cv5 cv5Var) {
        return DisposableHelper.setOnce(this.other, cv5Var);
    }
}
