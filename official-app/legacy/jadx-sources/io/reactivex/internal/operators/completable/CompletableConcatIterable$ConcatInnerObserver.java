package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.iu6;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableConcatIterable$ConcatInnerObserver extends AtomicInteger implements bs3 {
    private static final long serialVersionUID = -7965400327305809232L;
    final bs3 downstream;
    final SequentialDisposable sd = new SequentialDisposable();
    final Iterator<? extends es3> sources;

    public CompletableConcatIterable$ConcatInnerObserver(bs3 bs3Var, Iterator<? extends es3> it) {
        this.downstream = bs3Var;
        this.sources = it;
    }

    public void next() {
        if (!this.sd.isDisposed() && getAndIncrement() == 0) {
            Iterator<? extends es3> it = this.sources;
            while (!this.sd.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        this.downstream.onComplete();
                        return;
                    }
                    try {
                        ((es3) abd.d(it.next(), "The CompletableSource returned is null")).a(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (Throwable th) {
                        iu6.b(th);
                        this.downstream.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    iu6.b(th2);
                    this.downstream.onError(th2);
                    return;
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
