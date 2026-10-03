package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.dvf;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleDelayWithObservable$OtherSubscriber<T, U> extends AtomicReference<cv5> implements bed<U>, cv5 {
    private static final long serialVersionUID = -8565274649390031272L;
    boolean done;
    final m6h<? super T> downstream;
    final t6h<T> source;

    public SingleDelayWithObservable$OtherSubscriber(m6h<? super T> m6hVar, t6h<T> t6hVar) {
        this.downstream = m6hVar;
        this.source = t6hVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.source.a(new dvf(this, this.downstream));
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(U u) {
        get().dispose();
        onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.set(this, cv5Var)) {
            this.downstream.onSubscribe(this);
        }
    }
}
