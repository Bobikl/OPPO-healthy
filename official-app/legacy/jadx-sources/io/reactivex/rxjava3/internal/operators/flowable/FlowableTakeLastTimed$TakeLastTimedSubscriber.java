package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTakeLastTimed$TakeLastTimedSubscriber<T> extends AtomicInteger implements vu7<T>, c3j {
    private static final long serialVersionUID = -5677354903406201275L;
    volatile boolean cancelled;
    final long count;
    final boolean delayError;
    volatile boolean done;
    final v2j<? super T> downstream;
    Throwable error;
    final xki<Object> queue;
    final AtomicLong requested = new AtomicLong();
    final cfg scheduler;
    final long time;
    final TimeUnit unit;
    c3j upstream;

    public FlowableTakeLastTimed$TakeLastTimedSubscriber(v2j<? super T> v2jVar, long j2, long j3, TimeUnit timeUnit, cfg cfgVar, int i, boolean z) {
        this.downstream = v2jVar;
        this.count = j2;
        this.time = j3;
        this.unit = timeUnit;
        this.scheduler = cfgVar;
        this.queue = new xki<>(i);
        this.delayError = z;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.cancel();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public boolean checkTerminated(boolean z, v2j<? super T> v2jVar, boolean z2) {
        if (this.cancelled) {
            this.queue.clear();
            return true;
        }
        if (z2) {
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                v2jVar.onError(th);
            } else {
                v2jVar.onComplete();
            }
            return true;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            this.queue.clear();
            v2jVar.onError(th2);
            return true;
        }
        if (!z) {
            return false;
        }
        v2jVar.onComplete();
        return true;
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super T> v2jVar = this.downstream;
        xki<Object> xkiVar = this.queue;
        boolean z = this.delayError;
        int iAddAndGet = 1;
        do {
            if (this.done) {
                if (checkTerminated(xkiVar.isEmpty(), v2jVar, z)) {
                    return;
                }
                long j2 = this.requested.get();
                long j3 = 0;
                while (true) {
                    if (checkTerminated(xkiVar.peek() == null, v2jVar, z)) {
                        return;
                    }
                    if (j2 == j3) {
                        if (j3 == 0) {
                            break;
                        }
                        vr0.e(this.requested, j3);
                        break;
                    } else {
                        xkiVar.poll();
                        v2jVar.onNext(xkiVar.poll());
                        j3++;
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        trim(this.scheduler.f(this.unit), this.queue);
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.delayError) {
            trim(this.scheduler.f(this.unit), this.queue);
        }
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        xki<Object> xkiVar = this.queue;
        long jF = this.scheduler.f(this.unit);
        xkiVar.l(Long.valueOf(jF), t);
        trim(jF, xkiVar);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            drain();
        }
    }

    public void trim(long j2, xki<Object> xkiVar) {
        long j3 = this.time;
        long j4 = this.count;
        boolean z = j4 == Long.MAX_VALUE;
        while (!xkiVar.isEmpty()) {
            if (((Long) xkiVar.peek()).longValue() >= j2 - j3 && (z || (xkiVar.n() >> 1) <= j4)) {
                return;
            }
            xkiVar.poll();
            xkiVar.poll();
        }
    }
}
