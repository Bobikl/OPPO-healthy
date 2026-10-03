package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableObserveOn$BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements wu7<T>, Runnable {
    private static final long serialVersionUID = -8241002408341274697L;
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final int limit;
    boolean outputFused;
    final int prefetch;
    long produced;
    g4h<T> queue;
    final AtomicLong requested = new AtomicLong();
    int sourceMode;
    c3j upstream;
    final zeg.c worker;

    public FlowableObserveOn$BaseObserveOnSubscriber(zeg.c cVar, boolean z, int i) {
        this.worker = cVar;
        this.delayError = z;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public final void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.upstream.cancel();
        this.worker.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public final boolean checkTerminated(boolean z, boolean z2, v2j<?> v2jVar) {
        if (this.cancelled) {
            clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (this.delayError) {
            if (!z2) {
                return false;
            }
            this.cancelled = true;
            Throwable th = this.error;
            if (th != null) {
                v2jVar.onError(th);
            } else {
                v2jVar.onComplete();
            }
            this.worker.dispose();
            return true;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            this.cancelled = true;
            clear();
            v2jVar.onError(th2);
            this.worker.dispose();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.cancelled = true;
        v2jVar.onComplete();
        this.worker.dispose();
        return true;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public final void clear() {
        this.queue.clear();
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public final boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public final void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        trySchedule();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public final void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.error = th;
        this.done = true;
        trySchedule();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public final void onNext(T t) {
        if (this.done) {
            return;
        }
        if (this.sourceMode == 2) {
            trySchedule();
            return;
        }
        if (!this.queue.offer(t)) {
            this.upstream.cancel();
            this.error = new MissingBackpressureException("Queue is full?!");
            this.done = true;
        }
        trySchedule();
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public abstract /* synthetic */ void onSubscribe(c3j c3jVar);

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public abstract /* synthetic */ Object poll() throws Exception;

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public final void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            wr0.a(this.requested, j2);
            trySchedule();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f7f
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.outputFused) {
            runBackfused();
        } else if (this.sourceMode == 1) {
            runSync();
        } else {
            runAsync();
        }
    }

    public abstract void runAsync();

    public abstract void runBackfused();

    public abstract void runSync();

    public final void trySchedule() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.worker.b(this);
    }
}
