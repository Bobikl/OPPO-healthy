package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<cv5> implements bed<T>, cv5 {
    private static final long serialVersionUID = -8612022020200669122L;
    final bed<? super T> downstream;
    final AtomicReference<cv5> upstream = new AtomicReference<>();

    public ObserverResourceWrapper(bed<? super T> bedVar) {
        this.downstream = bedVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        dispose();
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        dispose();
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this.upstream, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }

    public void setResource(cv5 cv5Var) {
        DisposableHelper.set(this, cv5Var);
    }
}
