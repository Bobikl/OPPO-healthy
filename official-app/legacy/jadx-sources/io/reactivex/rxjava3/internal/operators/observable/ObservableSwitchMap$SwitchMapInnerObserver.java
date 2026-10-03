package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSwitchMap$SwitchMapInnerObserver<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<R> {
    private static final long serialVersionUID = 3837284832786408377L;
    final int bufferSize;
    volatile boolean done;
    final long index;
    final ObservableSwitchMap$SwitchMapObserver<T, R> parent;
    volatile f4h<R> queue;

    public ObservableSwitchMap$SwitchMapInnerObserver(ObservableSwitchMap$SwitchMapObserver<T, R> observableSwitchMap$SwitchMapObserver, long j2, int i) {
        this.parent = observableSwitchMap$SwitchMapObserver;
        this.index = j2;
        this.bufferSize = i;
    }

    public void cancel() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.index == this.parent.unique) {
            this.done = true;
            this.parent.drain();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(R r) {
        if (this.index == this.parent.unique) {
            if (r != null) {
                this.queue.offer(r);
            }
            this.parent.drain();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            if (aVar instanceof a7f) {
                a7f a7fVar = (a7f) aVar;
                int iRequestFusion = a7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.queue = a7fVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                } else if (iRequestFusion == 2) {
                    this.queue = a7fVar;
                    return;
                }
            }
            this.queue = new xki(this.bufferSize);
        }
    }
}
