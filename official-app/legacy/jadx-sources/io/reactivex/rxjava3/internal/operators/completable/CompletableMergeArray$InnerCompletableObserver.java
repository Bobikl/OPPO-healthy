package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.disposables.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableMergeArray$InnerCompletableObserver extends AtomicInteger implements as3, a {
    private static final long serialVersionUID = -8360547806504310570L;
    final as3 downstream;
    final AtomicBoolean once;
    final xs3 set;

    public CompletableMergeArray$InnerCompletableObserver(as3 as3Var, AtomicBoolean atomicBoolean, xs3 xs3Var, int i) {
        this.downstream = as3Var;
        this.once = atomicBoolean;
        this.set = xs3Var;
        lazySet(i);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.set.dispose();
        this.once.set(true);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.set.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        if (decrementAndGet() == 0) {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        this.set.dispose();
        if (this.once.compareAndSet(false, true)) {
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
