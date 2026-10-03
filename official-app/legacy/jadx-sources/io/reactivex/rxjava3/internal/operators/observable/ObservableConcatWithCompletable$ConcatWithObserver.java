package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.ds3;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatWithCompletable$ConcatWithObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<T>, as3, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -1953724749712440952L;
    final aed<? super T> downstream;
    boolean inCompletable;
    ds3 other;

    public ObservableConcatWithCompletable$ConcatWithObserver(aed<? super T> aedVar, ds3 ds3Var) {
        this.downstream = aedVar;
        this.other = ds3Var;
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
        if (this.inCompletable) {
            this.downstream.onComplete();
            return;
        }
        this.inCompletable = true;
        DisposableHelper.replace(this, null);
        ds3 ds3Var = this.other;
        this.other = null;
        ds3Var.a(this);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (!DisposableHelper.setOnce(this, aVar) || this.inCompletable) {
            return;
        }
        this.downstream.onSubscribe(this);
    }
}
