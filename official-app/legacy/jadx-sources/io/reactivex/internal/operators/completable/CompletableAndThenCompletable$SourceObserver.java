package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.sr3;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableAndThenCompletable$SourceObserver extends AtomicReference<cv5> implements bs3, cv5 {
    private static final long serialVersionUID = -4101678820158072998L;
    final bs3 actualObserver;
    final es3 next;

    public CompletableAndThenCompletable$SourceObserver(bs3 bs3Var, es3 es3Var) {
        this.actualObserver = bs3Var;
        this.next = es3Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        this.next.a(new sr3(this, this.actualObserver));
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.actualObserver.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            this.actualObserver.onSubscribe(this);
        }
    }
}
