package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.zdd;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableWindowBoundary$WindowBoundaryMainObserver<T, B> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a, Runnable {
    static final Object NEXT_WINDOW = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    final int capacityHint;
    volatile boolean done;
    final aed<? super lbd<T>> downstream;
    UnicastSubject<T> window;
    final h<T, B> boundaryObserver = new h<>(this);
    final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream = new AtomicReference<>();
    final AtomicInteger windows = new AtomicInteger(1);
    final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicBoolean stopWindows = new AtomicBoolean();

    public ObservableWindowBoundary$WindowBoundaryMainObserver(aed<? super lbd<T>> aedVar, int i) {
        this.downstream = aedVar;
        this.capacityHint = i;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.stopWindows.compareAndSet(false, true)) {
            this.boundaryObserver.dispose();
            if (this.windows.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.upstream);
            }
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        aed<? super lbd<T>> aedVar = this.downstream;
        MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
        AtomicThrowable atomicThrowable = this.errors;
        int iAddAndGet = 1;
        while (this.windows.get() != 0) {
            UnicastSubject<T> unicastSubject = this.window;
            boolean z = this.done;
            if (z && atomicThrowable.get() != null) {
                mpscLinkedQueue.clear();
                Throwable thTerminate = atomicThrowable.terminate();
                if (unicastSubject != null) {
                    this.window = null;
                    unicastSubject.onError(thTerminate);
                }
                aedVar.onError(thTerminate);
                return;
            }
            Object objPoll = mpscLinkedQueue.poll();
            boolean z2 = objPoll == null;
            if (z && z2) {
                Throwable thTerminate2 = atomicThrowable.terminate();
                if (thTerminate2 == null) {
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onComplete();
                    }
                    aedVar.onComplete();
                    return;
                }
                if (unicastSubject != null) {
                    this.window = null;
                    unicastSubject.onError(thTerminate2);
                }
                aedVar.onError(thTerminate2);
                return;
            }
            if (z2) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll != NEXT_WINDOW) {
                unicastSubject.onNext((T) objPoll);
            } else {
                if (unicastSubject != null) {
                    this.window = null;
                    unicastSubject.onComplete();
                }
                if (!this.stopWindows.get()) {
                    UnicastSubject<T> unicastSubjectV1 = UnicastSubject.v1(this.capacityHint, this);
                    this.window = unicastSubjectV1;
                    this.windows.getAndIncrement();
                    zdd zddVar = new zdd(unicastSubjectV1);
                    aedVar.onNext(zddVar);
                    if (zddVar.t1()) {
                        unicastSubjectV1.onComplete();
                    }
                }
            }
        }
        mpscLinkedQueue.clear();
        this.window = null;
    }

    public void innerComplete() {
        DisposableHelper.dispose(this.upstream);
        this.done = true;
        drain();
    }

    public void innerError(Throwable th) {
        DisposableHelper.dispose(this.upstream);
        if (this.errors.tryAddThrowableOrReport(th)) {
            this.done = true;
            drain();
        }
    }

    public void innerNext() {
        this.queue.offer(NEXT_WINDOW);
        drain();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.stopWindows.get();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.boundaryObserver.dispose();
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.boundaryObserver.dispose();
        if (this.errors.tryAddThrowableOrReport(th)) {
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.queue.offer(t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.setOnce(this.upstream, aVar)) {
            innerNext();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.windows.decrementAndGet() == 0) {
            DisposableHelper.dispose(this.upstream);
        }
    }
}
