package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableGroupBy$State<T, K> extends AtomicInteger implements cv5, kdd<T> {
    private static final long serialVersionUID = -3852313036005250360L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final K key;
    final ObservableGroupBy$GroupByObserver<?, K, T> parent;
    final yki<T> queue;
    final AtomicBoolean cancelled = new AtomicBoolean();
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicReference<bed<? super T>> actual = new AtomicReference<>();

    public ObservableGroupBy$State(int i, ObservableGroupBy$GroupByObserver<?, K, T> observableGroupBy$GroupByObserver, K k, boolean z) {
        this.queue = new yki<>(i);
        this.parent = observableGroupBy$GroupByObserver;
        this.key = k;
        this.delayError = z;
    }

    public boolean checkTerminated(boolean z, boolean z2, bed<? super T> bedVar, boolean z3) {
        if (this.cancelled.get()) {
            this.queue.clear();
            this.parent.cancel(this.key);
            this.actual.lazySet(null);
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            Throwable th = this.error;
            this.actual.lazySet(null);
            if (th != null) {
                bedVar.onError(th);
            } else {
                bedVar.onComplete();
            }
            return true;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            this.queue.clear();
            this.actual.lazySet(null);
            bedVar.onError(th2);
            return true;
        }
        if (!z2) {
            return false;
        }
        this.actual.lazySet(null);
        bedVar.onComplete();
        return true;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.actual.lazySet(null);
            this.parent.cancel(this.key);
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        yki<T> ykiVar = this.queue;
        boolean z = this.delayError;
        bed<? super T> bedVar = this.actual.get();
        int iAddAndGet = 1;
        while (true) {
            if (bedVar != null) {
                while (true) {
                    boolean z2 = this.done;
                    T tPoll = ykiVar.poll();
                    boolean z3 = tPoll == null;
                    if (checkTerminated(z2, z3, bedVar, z)) {
                        return;
                    }
                    if (z3) {
                        break;
                    } else {
                        bedVar.onNext(tPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (bedVar == null) {
                bedVar = this.actual.get();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled.get();
    }

    public void onComplete() {
        this.done = true;
        drain();
    }

    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    public void onNext(T t) {
        this.queue.offer(t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.kdd
    public void subscribe(bed<? super T> bedVar) {
        if (!this.once.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), bedVar);
            return;
        }
        bedVar.onSubscribe(this);
        this.actual.lazySet(bedVar);
        if (this.cancelled.get()) {
            this.actual.lazySet(null);
        } else {
            drain();
        }
    }
}
