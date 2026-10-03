package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableSkipLastTimed$SkipLastTimedObserver<T> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -5677354903406201275L;
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final aed<? super T> downstream;
    Throwable error;
    final xki<Object> queue;
    final cfg scheduler;
    final long time;
    final TimeUnit unit;
    io.reactivex.rxjava3.disposables.a upstream;

    public ObservableSkipLastTimed$SkipLastTimedObserver(aed<? super T> aedVar, long j2, TimeUnit timeUnit, cfg cfgVar, int i, boolean z) {
        this.downstream = aedVar;
        this.time = j2;
        this.unit = timeUnit;
        this.scheduler = cfgVar;
        this.queue = new xki<>(i);
        this.delayError = z;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        aed<? super T> aedVar = this.downstream;
        xki<Object> xkiVar = this.queue;
        boolean z = this.delayError;
        TimeUnit timeUnit = this.unit;
        cfg cfgVar = this.scheduler;
        long j2 = this.time;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z2 = this.done;
            Long l2 = (Long) xkiVar.peek();
            boolean z3 = l2 == null;
            long jF = cfgVar.f(timeUnit);
            if (!z3 && l2.longValue() > jF - j2) {
                z3 = true;
            }
            if (z2) {
                if (!z) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        aedVar.onError(th);
                        return;
                    } else if (z3) {
                        aedVar.onComplete();
                        return;
                    }
                } else if (z3) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        aedVar.onError(th2);
                        return;
                    } else {
                        aedVar.onComplete();
                        return;
                    }
                }
            }
            if (z3) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                xkiVar.poll();
                aedVar.onNext(xkiVar.poll());
            }
        }
        this.queue.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.queue.l(Long.valueOf(this.scheduler.f(this.unit)), t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
