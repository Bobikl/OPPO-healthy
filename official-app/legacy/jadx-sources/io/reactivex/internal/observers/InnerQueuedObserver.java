package io.reactivex.internal.observers;

import com.oplus.aiunit.vision.b7f;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.d7f;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.z8a;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<cv5> implements bed<T>, cv5 {
    private static final long serialVersionUID = -5417183359794346637L;
    volatile boolean done;
    int fusionMode;
    final z8a<T> parent;
    final int prefetch;
    g4h<T> queue;

    public InnerQueuedObserver(z8a<T> z8aVar, int i) {
        this.parent = z8aVar;
        this.prefetch = i;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public int fusionMode() {
        return this.fusionMode;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            if (cv5Var instanceof b7f) {
                b7f b7fVar = (b7f) cv5Var;
                int iRequestFusion = b7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = b7fVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = b7fVar;
                    return;
                }
            }
            this.queue = d7f.a(-this.prefetch);
        }
    }

    public g4h<T> queue() {
        return this.queue;
    }

    public void setDone() {
        this.done = true;
    }
}
