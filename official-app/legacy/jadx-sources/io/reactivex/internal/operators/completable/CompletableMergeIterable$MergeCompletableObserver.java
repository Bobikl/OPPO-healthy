package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.ys3;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableMergeIterable$MergeCompletableObserver extends AtomicBoolean implements bs3 {
    private static final long serialVersionUID = -7730517613164279224L;
    final bs3 downstream;
    final ys3 set;
    final AtomicInteger wip;

    public CompletableMergeIterable$MergeCompletableObserver(bs3 bs3Var, ys3 ys3Var, AtomicInteger atomicInteger) {
        this.downstream = bs3Var;
        this.set = ys3Var;
        this.wip = atomicInteger;
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        if (this.wip.decrementAndGet() == 0 && compareAndSet(false, true)) {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.set.dispose();
        if (compareAndSet(false, true)) {
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
