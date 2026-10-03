package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.ys3;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableMergeArray$InnerCompletableObserver extends AtomicInteger implements bs3 {
    private static final long serialVersionUID = -8360547806504310570L;
    final bs3 downstream;
    final AtomicBoolean once;
    final ys3 set;

    public CompletableMergeArray$InnerCompletableObserver(bs3 bs3Var, AtomicBoolean atomicBoolean, ys3 ys3Var, int i) {
        this.downstream = bs3Var;
        this.once = atomicBoolean;
        this.set = ys3Var;
        lazySet(i);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        if (decrementAndGet() == 0 && this.once.compareAndSet(false, true)) {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.set.dispose();
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onError(th);
        } else {
            h4g.r(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        this.set.a(cv5Var);
    }
}
