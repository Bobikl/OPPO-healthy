package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.disposables.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableMergeIterable$MergeCompletableObserver extends AtomicBoolean implements as3, a {
    private static final long serialVersionUID = -7730517613164279224L;
    final as3 downstream;
    final xs3 set;
    final AtomicInteger wip;

    public CompletableMergeIterable$MergeCompletableObserver(as3 as3Var, xs3 xs3Var, AtomicInteger atomicInteger) {
        this.downstream = as3Var;
        this.set = xs3Var;
        this.wip = atomicInteger;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.set.dispose();
        set(true);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.set.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        if (this.wip.decrementAndGet() == 0) {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        this.set.dispose();
        if (compareAndSet(false, true)) {
            this.downstream.onError(th);
        } else {
            g4g.u(th);
        }
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        this.set.a(aVar);
    }
}
