package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.b7f;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableFlatMap$InnerObserver<T, U> extends AtomicReference<cv5> implements bed<U> {
    private static final long serialVersionUID = -4606175640614850599L;
    volatile boolean done;
    int fusionMode;
    final long id;
    final ObservableFlatMap$MergeObserver<T, U> parent;
    volatile g4h<U> queue;

    public ObservableFlatMap$InnerObserver(ObservableFlatMap$MergeObserver<T, U> observableFlatMap$MergeObserver, long j2) {
        this.id = j2;
        this.parent = observableFlatMap$MergeObserver;
    }

    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.done = true;
        this.parent.drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (!this.parent.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        ObservableFlatMap$MergeObserver<T, U> observableFlatMap$MergeObserver = this.parent;
        if (!observableFlatMap$MergeObserver.delayErrors) {
            observableFlatMap$MergeObserver.disposeAll();
        }
        this.done = true;
        this.parent.drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(U u) {
        if (this.fusionMode == 0) {
            this.parent.tryEmit(u, this);
        } else {
            this.parent.drain();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var) && (cv5Var instanceof b7f)) {
            b7f b7fVar = (b7f) cv5Var;
            int iRequestFusion = b7fVar.requestFusion(7);
            if (iRequestFusion == 1) {
                this.fusionMode = iRequestFusion;
                this.queue = b7fVar;
                this.done = true;
                this.parent.drain();
                return;
            }
            if (iRequestFusion == 2) {
                this.fusionMode = iRequestFusion;
                this.queue = b7fVar;
            }
        }
    }
}
