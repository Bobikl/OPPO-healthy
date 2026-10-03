package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.rr3;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableAndThenCompletable$SourceObserver extends AtomicReference<a> implements as3, a {
    private static final long serialVersionUID = -4101678820158072998L;
    final as3 actualObserver;
    final ds3 next;

    public CompletableAndThenCompletable$SourceObserver(as3 as3Var, ds3 ds3Var) {
        this.actualObserver = as3Var;
        this.next = ds3Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        this.next.a(new rr3(this, this.actualObserver));
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        this.actualObserver.onError(th);
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.actualObserver.onSubscribe(this);
        }
    }
}
