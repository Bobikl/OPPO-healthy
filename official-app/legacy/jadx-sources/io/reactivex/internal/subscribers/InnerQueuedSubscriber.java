package io.reactivex.internal.subscribers;

import com.oplus.aiunit.vision.b9a;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d7f;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<c3j> implements wu7<T>, c3j {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final b9a<T> parent;
    final int prefetch;
    long produced;
    volatile g4h<T> queue;

    public InnerQueuedSubscriber(b9a<T> b9aVar, int i) {
        this.parent = b9aVar;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t);
        } else {
            this.parent.drain();
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = h7fVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = h7fVar;
                    d7f.f(c3jVar, this.prefetch);
                    return;
                }
            }
            this.queue = d7f.a(this.prefetch);
            d7f.f(c3jVar, this.prefetch);
        }
    }

    public g4h<T> queue() {
        return this.queue;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (this.fusionMode != 1) {
            long j3 = this.produced + j2;
            if (j3 < this.limit) {
                this.produced = j3;
            } else {
                this.produced = 0L;
                get().request(j3);
            }
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j2 = this.produced + 1;
            if (j2 != this.limit) {
                this.produced = j2;
            } else {
                this.produced = 0L;
                get().request(j2);
            }
        }
    }

    public void setDone() {
        this.done = true;
    }
}
