package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableGroupBy$State<T, K> extends AtomicInteger implements io.reactivex.rxjava3.disposables.a, jdd<T> {
    static final int ABANDONED = 2;
    static final int ABANDONED_HAS_SUBSCRIBER = 3;
    static final int FRESH = 0;
    static final int HAS_SUBSCRIBER = 1;
    private static final long serialVersionUID = -3852313036005250360L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final K key;
    final ObservableGroupBy$GroupByObserver<?, K, T> parent;
    final xki<T> queue;
    final AtomicBoolean cancelled = new AtomicBoolean();
    final AtomicReference<aed<? super T>> actual = new AtomicReference<>();
    final AtomicInteger once = new AtomicInteger();

    public ObservableGroupBy$State(int i, ObservableGroupBy$GroupByObserver<?, K, T> observableGroupBy$GroupByObserver, K k, boolean z) {
        this.queue = new xki<>(i);
        this.parent = observableGroupBy$GroupByObserver;
        this.key = k;
        this.delayError = z;
    }

    public void cancelParent() {
        if ((this.once.get() & 2) == 0) {
            this.parent.cancel(this.key);
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, aed<? super T> aedVar, boolean z3) {
        if (this.cancelled.get()) {
            this.queue.clear();
            this.actual.lazySet(null);
            cancelParent();
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
                aedVar.onError(th);
            } else {
                aedVar.onComplete();
            }
            return true;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            this.queue.clear();
            this.actual.lazySet(null);
            aedVar.onError(th2);
            return true;
        }
        if (!z2) {
            return false;
        }
        this.actual.lazySet(null);
        aedVar.onComplete();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.actual.lazySet(null);
            cancelParent();
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        xki<T> xkiVar = this.queue;
        boolean z = this.delayError;
        aed<? super T> aedVar = this.actual.get();
        int iAddAndGet = 1;
        while (true) {
            if (aedVar != null) {
                while (true) {
                    boolean z2 = this.done;
                    T tPoll = xkiVar.poll();
                    boolean z3 = tPoll == null;
                    if (checkTerminated(z2, z3, aedVar, z)) {
                        return;
                    }
                    if (z3) {
                        break;
                    } else {
                        aedVar.onNext(tPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (aedVar == null) {
                aedVar = this.actual.get();
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
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

    @Override // com.oplus.aiunit.vision.jdd
    public void subscribe(aed<? super T> aedVar) {
        int i;
        do {
            i = this.once.get();
            if ((i & 1) != 0) {
                EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), aedVar);
                return;
            }
        } while (!this.once.compareAndSet(i, i | 1));
        aedVar.onSubscribe(this);
        this.actual.lazySet(aedVar);
        if (this.cancelled.get()) {
            this.actual.lazySet(null);
        } else {
            drain();
        }
    }

    public boolean tryAbandon() {
        return this.once.get() == 0 && this.once.compareAndSet(0, 2);
    }
}
