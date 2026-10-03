package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.rdd;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTimeout$TimeoutConsumer extends AtomicReference<cv5> implements bed<Object>, cv5 {
    private static final long serialVersionUID = 8708641127342403073L;
    final long idx;
    final rdd parent;

    public ObservableTimeout$TimeoutConsumer(long j2, rdd rddVar) {
        this.idx = j2;
        this.parent = rddVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var != disposableHelper) {
            lazySet(disposableHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper) {
            h4g.r(th);
        } else {
            lazySet(disposableHelper);
            this.parent.onTimeoutError(this.idx, th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(Object obj) {
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var != disposableHelper) {
            cv5Var.dispose();
            lazySet(disposableHelper);
            this.parent.onTimeout(this.idx);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
