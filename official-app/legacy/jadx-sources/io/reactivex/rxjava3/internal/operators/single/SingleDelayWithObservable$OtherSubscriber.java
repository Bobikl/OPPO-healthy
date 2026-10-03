package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cvf;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleDelayWithObservable$OtherSubscriber<T, U> extends AtomicReference<a> implements aed<U>, a {
    private static final long serialVersionUID = -8565274649390031272L;
    boolean done;
    final l6h<? super T> downstream;
    final s6h<T> source;

    public SingleDelayWithObservable$OtherSubscriber(l6h<? super T> l6hVar, s6h<T> s6hVar) {
        this.downstream = l6hVar;
        this.source = s6hVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.source.b(new cvf(this, this.downstream));
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(U u) {
        get().dispose();
        onComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }
}
