package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.bx2;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fu7;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableCreate$SerializedEmitter<T> extends AtomicInteger implements fu7<T> {
    private static final long serialVersionUID = 4883307006032401862L;
    volatile boolean done;
    final FlowableCreate$BaseEmitter<T> emitter;
    final AtomicThrowable error = new AtomicThrowable();
    final c4h<T> queue = new yki(16);

    public FlowableCreate$SerializedEmitter(FlowableCreate$BaseEmitter<T> flowableCreate$BaseEmitter) {
        this.emitter = flowableCreate$BaseEmitter;
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            drainLoop();
        }
    }

    public void drainLoop() {
        FlowableCreate$BaseEmitter<T> flowableCreate$BaseEmitter = this.emitter;
        c4h<T> c4hVar = this.queue;
        AtomicThrowable atomicThrowable = this.error;
        int iAddAndGet = 1;
        while (!flowableCreate$BaseEmitter.isCancelled()) {
            if (atomicThrowable.get() != null) {
                c4hVar.clear();
                flowableCreate$BaseEmitter.onError(atomicThrowable.terminate());
                return;
            }
            boolean z = this.done;
            T tPoll = c4hVar.poll();
            boolean z2 = tPoll == null;
            if (z && z2) {
                flowableCreate$BaseEmitter.onComplete();
                return;
            } else if (z2) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                flowableCreate$BaseEmitter.onNext(tPoll);
            }
        }
        c4hVar.clear();
    }

    public boolean isCancelled() {
        return this.emitter.isCancelled();
    }

    @Override // com.oplus.aiunit.vision.ll6
    public void onComplete() {
        if (this.emitter.isCancelled() || this.done) {
            return;
        }
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.ll6
    public void onError(Throwable th) {
        if (tryOnError(th)) {
            return;
        }
        h4g.r(th);
    }

    @Override // com.oplus.aiunit.vision.ll6
    public void onNext(T t) {
        if (this.emitter.isCancelled() || this.done) {
            return;
        }
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.emitter.onNext(t);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            c4h<T> c4hVar = this.queue;
            synchronized (c4hVar) {
                c4hVar.offer(t);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        drainLoop();
    }

    public long requested() {
        return this.emitter.requested();
    }

    public fu7<T> serialize() {
        return this;
    }

    public void setCancellable(bx2 bx2Var) {
        this.emitter.setCancellable(bx2Var);
    }

    public void setDisposable(cv5 cv5Var) {
        this.emitter.setDisposable(cv5Var);
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.emitter.toString();
    }

    public boolean tryOnError(Throwable th) {
        if (!this.emitter.isCancelled() && !this.done) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.error.addThrowable(th)) {
                this.done = true;
                drain();
                return true;
            }
        }
        return false;
    }
}
