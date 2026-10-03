package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.kdd;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableWindowBoundarySupplier$WindowBoundaryMainObserver<T, B> extends AtomicInteger implements bed<T>, cv5, Runnable {
    static final i<Object, Object> BOUNDARY_DISPOSED = new i<>(null);
    static final Object NEXT_WINDOW = new Object();
    private static final long serialVersionUID = 2233020065421370272L;
    final int capacityHint;
    volatile boolean done;
    final bed<? super kbd<T>> downstream;
    final Callable<? extends kdd<B>> other;
    cv5 upstream;
    UnicastSubject<T> window;
    final AtomicReference<i<T, B>> boundaryObserver = new AtomicReference<>();
    final AtomicInteger windows = new AtomicInteger(1);
    final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
    final AtomicThrowable errors = new AtomicThrowable();
    final AtomicBoolean stopWindows = new AtomicBoolean();

    public ObservableWindowBoundarySupplier$WindowBoundaryMainObserver(bed<? super kbd<T>> bedVar, int i, Callable<? extends kdd<B>> callable) {
        this.downstream = bedVar;
        this.capacityHint = i;
        this.other = callable;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.stopWindows.compareAndSet(false, true)) {
            disposeBoundary();
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }
    }

    public void disposeBoundary() {
        AtomicReference<i<T, B>> atomicReference = this.boundaryObserver;
        i<Object, Object> iVar = BOUNDARY_DISPOSED;
        i<T, B> andSet = atomicReference.getAndSet((i<T, B>) iVar);
        if (andSet == null || andSet == iVar) {
            return;
        }
        andSet.dispose();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        bed<? super kbd<T>> bedVar = this.downstream;
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
                bedVar.onError(thTerminate);
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
                    bedVar.onComplete();
                    return;
                }
                if (unicastSubject != null) {
                    this.window = null;
                    unicastSubject.onError(thTerminate2);
                }
                bedVar.onError(thTerminate2);
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
                    UnicastSubject<T> unicastSubjectJ = UnicastSubject.J(this.capacityHint, this);
                    this.window = unicastSubjectJ;
                    this.windows.getAndIncrement();
                    try {
                        kdd kddVar = (kdd) abd.d(this.other.call(), "The other Callable returned a null ObservableSource");
                        i iVar = new i(this);
                        if (fue.a(this.boundaryObserver, null, iVar)) {
                            kddVar.subscribe(iVar);
                            bedVar.onNext(unicastSubjectJ);
                        }
                    } catch (Throwable th) {
                        iu6.b(th);
                        atomicThrowable.addThrowable(th);
                        this.done = true;
                    }
                }
            }
        }
        mpscLinkedQueue.clear();
        this.window = null;
    }

    public void innerComplete() {
        this.upstream.dispose();
        this.done = true;
        drain();
    }

    public void innerError(Throwable th) {
        this.upstream.dispose();
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
        } else {
            this.done = true;
            drain();
        }
    }

    public void innerNext(i<T, B> iVar) {
        fue.a(this.boundaryObserver, iVar, null);
        this.queue.offer(NEXT_WINDOW);
        drain();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.stopWindows.get();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        disposeBoundary();
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        disposeBoundary();
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
        } else {
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.queue.offer(t);
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.windows.decrementAndGet() == 0) {
            this.upstream.dispose();
        }
    }
}
