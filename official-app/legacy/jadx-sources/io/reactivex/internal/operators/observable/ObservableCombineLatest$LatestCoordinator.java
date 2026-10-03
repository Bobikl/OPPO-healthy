package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableCombineLatest$LatestCoordinator<T, R> extends AtomicInteger implements cv5 {
    private static final long serialVersionUID = 8567835998786448817L;
    int active;
    volatile boolean cancelled;
    final j08<? super Object[], ? extends R> combiner;
    int complete;
    final boolean delayError;
    volatile boolean done;
    final bed<? super R> downstream;
    final AtomicThrowable errors = new AtomicThrowable();
    Object[] latest;
    final ObservableCombineLatest$CombinerObserver<T, R>[] observers;
    final yki<Object[]> queue;

    public ObservableCombineLatest$LatestCoordinator(bed<? super R> bedVar, j08<? super Object[], ? extends R> j08Var, int i, int i2, boolean z) {
        this.downstream = bedVar;
        this.combiner = j08Var;
        this.delayError = z;
        this.latest = new Object[i];
        ObservableCombineLatest$CombinerObserver<T, R>[] observableCombineLatest$CombinerObserverArr = new ObservableCombineLatest$CombinerObserver[i];
        for (int i3 = 0; i3 < i; i3++) {
            observableCombineLatest$CombinerObserverArr[i3] = new ObservableCombineLatest$CombinerObserver<>(this, i3);
        }
        this.observers = observableCombineLatest$CombinerObserverArr;
        this.queue = new yki<>(i2);
    }

    public void cancelSources() {
        for (ObservableCombineLatest$CombinerObserver<T, R> observableCombineLatest$CombinerObserver : this.observers) {
            observableCombineLatest$CombinerObserver.dispose();
        }
    }

    public void clear(yki<?> ykiVar) {
        synchronized (this) {
            this.latest = null;
        }
        ykiVar.clear();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        cancelSources();
        if (getAndIncrement() == 0) {
            clear(this.queue);
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        yki<Object[]> ykiVar = this.queue;
        bed<? super R> bedVar = this.downstream;
        boolean z = this.delayError;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            if (!z && this.errors.get() != null) {
                cancelSources();
                clear(ykiVar);
                bedVar.onError(this.errors.terminate());
                return;
            }
            boolean z2 = this.done;
            Object[] objArrPoll = ykiVar.poll();
            boolean z3 = objArrPoll == null;
            if (z2 && z3) {
                clear(ykiVar);
                Throwable thTerminate = this.errors.terminate();
                if (thTerminate == null) {
                    bedVar.onComplete();
                    return;
                } else {
                    bedVar.onError(thTerminate);
                    return;
                }
            }
            if (z3) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    bedVar.onNext((Object) abd.d(this.combiner.apply(objArrPoll), "The combiner returned a null value"));
                } catch (Throwable th) {
                    iu6.b(th);
                    this.errors.addThrowable(th);
                    cancelSources();
                    clear(ykiVar);
                    bedVar.onError(this.errors.terminate());
                    return;
                }
            }
        }
        clear(ykiVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0019 A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0007, B:12:0x0011, B:15:0x001b, B:14:0x0019), top: B:23:0x0001 }] */
    public void innerComplete(int i) {
        synchronized (this) {
            Object[] objArr = this.latest;
            if (objArr == null) {
                return;
            }
            boolean z = objArr[i] == null;
            if (z) {
                this.done = true;
            } else {
                int i2 = this.complete + 1;
                this.complete = i2;
                if (i2 == objArr.length) {
                    this.done = true;
                }
            }
            if (z) {
                cancelSources();
            }
            drain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025 A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0014, B:16:0x001d, B:19:0x0027, B:18:0x0025), top: B:29:0x000e }] */
    public void innerError(int i, Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        boolean z = true;
        if (this.delayError) {
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                boolean z2 = objArr[i] == null;
                if (z2) {
                    this.done = true;
                } else {
                    int i2 = this.complete + 1;
                    this.complete = i2;
                    if (i2 == objArr.length) {
                        this.done = true;
                    }
                }
                z = z2;
            }
        }
        if (z) {
            cancelSources();
        }
        drain();
    }

    public void innerNext(int i, T t) {
        boolean z;
        synchronized (this) {
            Object[] objArr = this.latest;
            if (objArr == null) {
                return;
            }
            Object obj = objArr[i];
            int i2 = this.active;
            if (obj == null) {
                i2++;
                this.active = i2;
            }
            objArr[i] = t;
            if (i2 == objArr.length) {
                this.queue.offer((Object[]) objArr.clone());
                z = true;
            } else {
                z = false;
            }
            if (z) {
                drain();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    public void subscribe(kdd<? extends T>[] kddVarArr) {
        ObservableCombineLatest$CombinerObserver<T, R>[] observableCombineLatest$CombinerObserverArr = this.observers;
        int length = observableCombineLatest$CombinerObserverArr.length;
        this.downstream.onSubscribe(this);
        for (int i = 0; i < length && !this.done && !this.cancelled; i++) {
            kddVarArr[i].subscribe(observableCombineLatest$CombinerObserverArr[i]);
        }
    }
}
