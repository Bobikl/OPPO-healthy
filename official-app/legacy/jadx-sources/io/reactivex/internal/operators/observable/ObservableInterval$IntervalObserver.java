package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableInterval$IntervalObserver extends AtomicReference<cv5> implements cv5, Runnable {
    private static final long serialVersionUID = 346773832286157679L;
    long count;
    final bed<? super Long> downstream;

    public ObservableInterval$IntervalObserver(bed<? super Long> bedVar) {
        this.downstream = bedVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() != DisposableHelper.DISPOSED) {
            bed<? super Long> bedVar = this.downstream;
            long j2 = this.count;
            this.count = 1 + j2;
            bedVar.onNext(Long.valueOf(j2));
        }
    }

    public void setResource(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
