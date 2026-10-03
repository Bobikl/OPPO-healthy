package io.reactivex.rxjava3.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.vr0;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
abstract class ParallelRunOn$BaseRunOnSubscriber<T> extends AtomicInteger implements vu7<T>, c3j, Runnable {
    private static final long serialVersionUID = 9222303586456402150L;
    volatile boolean cancelled;
    int consumed;
    volatile boolean done;
    Throwable error;
    final int limit;
    final int prefetch;
    final SpscArrayQueue<T> queue;
    final AtomicLong requested = new AtomicLong();
    c3j upstream;
    final cfg.c worker;

    public ParallelRunOn$BaseRunOnSubscriber(int i, SpscArrayQueue<T> spscArrayQueue, cfg.c cVar) {
        this.prefetch = i;
        this.queue = spscArrayQueue;
        this.limit = i - (i >> 2);
        this.worker = cVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
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

    @Override // com.oplus.aiunit.vision.v2j
    public final void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        schedule();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public final void onError(Throwable th) {
        if (this.done) {
            g4g.u(th);
            return;
        }
        this.error = th;
        this.done = true;
        schedule();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public final void onNext(T t) {
        if (this.done) {
            return;
        }
        if (this.queue.offer(t)) {
            schedule();
        } else {
            this.upstream.cancel();
            onError(new MissingBackpressureException("Queue is full?!"));
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public abstract /* synthetic */ void onSubscribe(c3j c3jVar);

    @Override // com.oplus.aiunit.vision.c3j
    public final void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.a(this.requested, j2);
            schedule();
        }
    }

    public final void schedule() {
        if (getAndIncrement() == 0) {
            this.worker.b(this);
        }
    }
}
