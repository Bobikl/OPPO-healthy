package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.hu6;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableConcatIterable$ConcatInnerObserver extends AtomicInteger implements as3 {
    private static final long serialVersionUID = -7965400327305809232L;
    final as3 downstream;
    final SequentialDisposable sd = new SequentialDisposable();
    final Iterator<? extends ds3> sources;

    public CompletableConcatIterable$ConcatInnerObserver(as3 as3Var, Iterator<? extends ds3> it) {
        this.downstream = as3Var;
        this.sources = it;
    }

    public void next() {
        if (!this.sd.isDisposed() && getAndIncrement() == 0) {
            Iterator<? extends ds3> it = this.sources;
            while (!this.sd.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        this.downstream.onComplete();
                        return;
                    }
                    try {
                        ds3 next = it.next();
                        Objects.requireNonNull(next, "The CompletableSource returned is null");
                        next.a(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (Throwable th) {
                        hu6.b(th);
                        this.downstream.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    hu6.b(th2);
                    this.downstream.onError(th2);
                    return;
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
