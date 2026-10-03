package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber<T, B> extends AtomicInteger implements wu7<T>, c3j, Runnable {
    static final f<Object, Object> BOUNDARY_DISPOSED = new f<>(null);
    static final Object NEXT_WINDOW = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    final int capacityHint;
    volatile boolean done;
    final v2j<? super xt7<T>> downstream;
    long emitted;
    final Callable<? extends k3f<B>> other;
    c3j upstream;
    UnicastProcessor<T> window;
    final AtomicReference<f<T, B>> boundarySubscriber = new AtomicReference<>();
    final AtomicInteger windows = new AtomicInteger(1);
    final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicBoolean stopWindows = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();

    public FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber(v2j<? super xt7<T>> v2jVar, int i, Callable<? extends k3f<B>> callable) {
        this.downstream = v2jVar;
        this.capacityHint = i;
        this.other = callable;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (this.stopWindows.compareAndSet(false, true)) {
            disposeBoundary();
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public void disposeBoundary() {
        AtomicReference<f<T, B>> atomicReference = this.boundarySubscriber;
        f<Object, Object> fVar = BOUNDARY_DISPOSED;
        f<T, B> andSet = atomicReference.getAndSet((f<T, B>) fVar);
        if (andSet == null || andSet == fVar) {
            return;
        }
        andSet.dispose();
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
                    if (j2 != this.requested.get()) {
                        UnicastProcessor<T> unicastProcessorJ = UnicastProcessor.j(this.capacityHint, this);
                        this.window = unicastProcessorJ;
                        this.windows.getAndIncrement();
                        try {
                            k3f k3fVar = (k3f) abd.d(this.other.call(), "The other Callable returned a null Publisher");
                            f fVar = new f(this);
                            if (fue.a(this.boundarySubscriber, null, fVar)) {
                                k3fVar.subscribe(fVar);
                                j2++;
                                v2jVar.onNext(unicastProcessorJ);
                            }
                        } catch (Throwable th) {
                            iu6.b(th);
                            atomicThrowable.addThrowable(th);
                            this.done = true;
                        }
                    } else {
                        this.upstream.cancel();
                        disposeBoundary();
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
        this.upstream.cancel();
        this.done = true;
        drain();
    }

    public void innerError(Throwable th) {
        this.upstream.cancel();
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
        } else {
            this.done = true;
            drain();
        }
    }

    public void innerNext(f<T, B> fVar) {
        fue.a(this.boundarySubscriber, fVar, null);
        this.queue.offer(NEXT_WINDOW);
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        disposeBoundary();
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        disposeBoundary();
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
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            this.queue.offer(NEXT_WINDOW);
            drain();
            c3jVar.request(Long.MAX_VALUE);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        wr0.a(this.requested, j2);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.windows.decrementAndGet() == 0) {
            this.upstream.cancel();
        }
    }
}
