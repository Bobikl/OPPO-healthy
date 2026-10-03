package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTakeLastTimed$TakeLastTimedObserver<T> extends AtomicBoolean implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -5677354903406201275L;
    volatile boolean cancelled;
    final long count;
    final boolean delayError;
    final aed<? super T> downstream;
    Throwable error;
    final xki<Object> queue;
    final cfg scheduler;
    final long time;
    final TimeUnit unit;
    io.reactivex.rxjava3.disposables.a upstream;

    public ObservableTakeLastTimed$TakeLastTimedObserver(aed<? super T> aedVar, long j2, long j3, TimeUnit timeUnit, cfg cfgVar, int i, boolean z) {
        this.downstream = aedVar;
        this.count = j2;
        this.time = j3;
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
        if (compareAndSet(false, true)) {
            this.queue.clear();
        }
    }

    public void drain() {
        Throwable th;
        if (compareAndSet(false, true)) {
            aed<? super T> aedVar = this.downstream;
            xki<Object> xkiVar = this.queue;
            boolean z = this.delayError;
            long jF = this.scheduler.f(this.unit) - this.time;
            while (!this.cancelled) {
                if (!z && (th = this.error) != null) {
                    xkiVar.clear();
                    aedVar.onError(th);
                    return;
                }
                Object objPoll = xkiVar.poll();
                if (objPoll == null) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        aedVar.onError(th2);
                        return;
                    } else {
                        aedVar.onComplete();
                        return;
                    }
                }
                Object objPoll2 = xkiVar.poll();
                if (((Long) objPoll).longValue() >= jF) {
                    aedVar.onNext(objPoll2);
                }
            }
            xkiVar.clear();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.error = th;
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        xki<Object> xkiVar = this.queue;
        long jF = this.scheduler.f(this.unit);
        long j2 = this.time;
        long j3 = this.count;
        boolean z = j3 == Long.MAX_VALUE;
        xkiVar.l(Long.valueOf(jF), t);
        while (!xkiVar.isEmpty()) {
            if (((Long) xkiVar.peek()).longValue() > jF - j2 && (z || (xkiVar.n() >> 1) <= j3)) {
                return;
            }
            xkiVar.poll();
            xkiVar.poll();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }
}
