package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements wu7<T>, c3j, Runnable {
    static final Object NEXT_WINDOW = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    final int capacityHint;
    volatile boolean done;
    final v2j<? super xt7<T>> downstream;
    long emitted;
    UnicastProcessor<T> window;
    final e<T, B> boundarySubscriber = new e<>(this);
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicInteger windows = new AtomicInteger(1);
    final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicBoolean stopWindows = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();

    public FlowableWindowBoundary$WindowBoundaryMainSubscriber(v2j<? super xt7<T>> v2jVar, int i) {
        this.downstream = v2jVar;
        this.capacityHint = i;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.stopWindows.compareAndSet(false, true)) {
            this.boundarySubscriber.dispose();
            if (this.windows.decrementAndGet() == 0) {
                SubscriptionHelper.cancel(this.upstream);
            }
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        v2j<? super xt7<T>> v2jVar = this.downstream;
        MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
        AtomicThrowable atomicThrowable = this.errors;
        long j2 = this.emitted;
        int iAddAndGet = 1;
        while (this.windows.get() != 0) {
            UnicastProcessor<T> unicastProcessor = this.window;
            boolean z = this.done;
            if (z && atomicThrowable.get() != null) {
                mpscLinkedQueue.clear();
                Throwable thTerminate = atomicThrowable.terminate();
                if (unicastProcessor != null) {
                    this.window = null;
                    unicastProcessor.onError(thTerminate);
                }
                v2jVar.onError(thTerminate);
                return;
            }
            Object objPoll = mpscLinkedQueue.poll();
            boolean z2 = objPoll == null;
            if (z && z2) {
                Throwable thTerminate2 = atomicThrowable.terminate();
                if (thTerminate2 == null) {
                    if (unicastProcessor != null) {
                        this.window = null;
                        unicastProcessor.onComplete();
                    }
                    v2jVar.onComplete();
                    return;
                }
                if (unicastProcessor != null) {
                    this.window = null;
                    unicastProcessor.onError(thTerminate2);
                }
                v2jVar.onError(thTerminate2);
                return;
            }
            if (z2) {
                this.emitted = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll != NEXT_WINDOW) {
                unicastProcessor.onNext((T) objPoll);
            } else {
                if (unicastProcessor != null) {
                    this.window = null;
                    unicastProcessor.onComplete();
                }
                if (!this.stopWindows.get()) {
                    UnicastProcessor<T> unicastProcessorJ = UnicastProcessor.j(this.capacityHint, this);
                    this.window = unicastProcessorJ;
                    this.windows.getAndIncrement();
                    if (j2 != this.requested.get()) {
                        j2++;
                        v2jVar.onNext(unicastProcessorJ);
                    } else {
                        SubscriptionHelper.cancel(this.upstream);
                        this.boundarySubscriber.dispose();
                        atomicThrowable.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                        this.done = true;
                    }
                }
            }
        }
        mpscLinkedQueue.clear();
        this.window = null;
    }

    public void innerComplete() {
        SubscriptionHelper.cancel(this.upstream);
        this.done = true;
        drain();
    }

    public void innerError(Throwable th) {
        SubscriptionHelper.cancel(this.upstream);
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
        } else {
            this.done = true;
            drain();
        }
    }

    public void innerNext() {
        this.queue.offer(NEXT_WINDOW);
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.boundarySubscriber.dispose();
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.boundarySubscriber.dispose();
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
        } else {
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.queue.offer(t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this.upstream, c3jVar, Long.MAX_VALUE);
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        wr0.a(this.requested, j2);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.windows.decrementAndGet() == 0) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }
}
