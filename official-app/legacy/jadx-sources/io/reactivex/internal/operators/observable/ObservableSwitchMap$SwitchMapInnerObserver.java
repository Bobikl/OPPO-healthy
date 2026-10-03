package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.b7f;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSwitchMap$SwitchMapInnerObserver<T, R> extends AtomicReference<cv5> implements bed<R> {
    private static final long serialVersionUID = 3837284832786408377L;
    final int bufferSize;
    volatile boolean done;
    final long index;
    final ObservableSwitchMap$SwitchMapObserver<T, R> parent;
    volatile g4h<R> queue;

    public ObservableSwitchMap$SwitchMapInnerObserver(ObservableSwitchMap$SwitchMapObserver<T, R> observableSwitchMap$SwitchMapObserver, long j2, int i) {
        this.parent = observableSwitchMap$SwitchMapObserver;
        this.index = j2;
        this.bufferSize = i;
    }

    public void cancel() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.index == this.parent.unique) {
            this.done = true;
            this.parent.drain();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(R r) {
        if (this.index == this.parent.unique) {
            if (r != null) {
                this.queue.offer(r);
            }
            this.parent.drain();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            if (cv5Var instanceof b7f) {
                b7f b7fVar = (b7f) cv5Var;
                int iRequestFusion = b7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.queue = b7fVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                } else if (iRequestFusion == 2) {
                    this.queue = b7fVar;
                    return;
                }
            }
            this.queue = new yki(this.bufferSize);
        }
    }
}
