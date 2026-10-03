package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableConcatArray$ConcatInnerObserver extends AtomicInteger implements bs3 {
    private static final long serialVersionUID = -7965400327305809232L;
    final bs3 downstream;
    int index;
    final SequentialDisposable sd = new SequentialDisposable();
    final es3[] sources;

    public CompletableConcatArray$ConcatInnerObserver(bs3 bs3Var, es3[] es3VarArr) {
        this.downstream = bs3Var;
        this.sources = es3VarArr;
    }

    public void next() {
        if (!this.sd.isDisposed() && getAndIncrement() == 0) {
            es3[] es3VarArr = this.sources;
            while (!this.sd.isDisposed()) {
                int i = this.index;
                this.index = i + 1;
                if (i == es3VarArr.length) {
                    this.downstream.onComplete();
                    return;
                } else {
                    es3VarArr[i].a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        next();
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        this.sd.replace(cv5Var);
    }
}
