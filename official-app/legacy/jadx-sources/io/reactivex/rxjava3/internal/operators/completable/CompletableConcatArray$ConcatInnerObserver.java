package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.ds3;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableConcatArray$ConcatInnerObserver extends AtomicInteger implements as3 {
    private static final long serialVersionUID = -7965400327305809232L;
    final as3 downstream;
    int index;
    final SequentialDisposable sd = new SequentialDisposable();
    final ds3[] sources;

    public CompletableConcatArray$ConcatInnerObserver(as3 as3Var, ds3[] ds3VarArr) {
        this.downstream = as3Var;
        this.sources = ds3VarArr;
    }

    public void next() {
        if (!this.sd.isDisposed() && getAndIncrement() == 0) {
            ds3[] ds3VarArr = this.sources;
            while (!this.sd.isDisposed()) {
                int i = this.index;
                this.index = i + 1;
                if (i == ds3VarArr.length) {
                    this.downstream.onComplete();
                    return;
                } else {
                    ds3VarArr[i].a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        next();
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        this.sd.replace(aVar);
    }
}
