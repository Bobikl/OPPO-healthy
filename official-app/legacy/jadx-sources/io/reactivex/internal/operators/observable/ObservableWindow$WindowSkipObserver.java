package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kbd;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableWindow$WindowSkipObserver<T> extends AtomicBoolean implements bed<T>, cv5, Runnable {
    private static final long serialVersionUID = 3366976432059579510L;
    volatile boolean cancelled;
    final int capacityHint;
    final long count;
    final bed<? super kbd<T>> downstream;
    long firstEmission;
    long index;
    final long skip;
    cv5 upstream;
    final AtomicInteger wip = new AtomicInteger();
    final ArrayDeque<UnicastSubject<T>> windows = new ArrayDeque<>();

    public ObservableWindow$WindowSkipObserver(bed<? super kbd<T>> bedVar, long j2, long j3, int i) {
        this.downstream = bedVar;
        this.count = j2;
        this.skip = j3;
        this.capacityHint = i;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.cancelled = true;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
        while (!arrayDeque.isEmpty()) {
            arrayDeque.poll().onComplete();
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
        while (!arrayDeque.isEmpty()) {
            arrayDeque.poll().onError(th);
        }
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        ArrayDeque<UnicastSubject<T>> arrayDeque = this.windows;
        long j2 = this.index;
        long j3 = this.skip;
        if (j2 % j3 == 0 && !this.cancelled) {
            this.wip.getAndIncrement();
            UnicastSubject<T> unicastSubjectJ = UnicastSubject.J(this.capacityHint, this);
            arrayDeque.offer(unicastSubjectJ);
            this.downstream.onNext(unicastSubjectJ);
        }
        long j4 = this.firstEmission + 1;
        Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
        while (it.hasNext()) {
            it.next().onNext(t);
        }
        if (j4 >= this.count) {
            arrayDeque.poll().onComplete();
            if (arrayDeque.isEmpty() && this.cancelled) {
                this.upstream.dispose();
                return;
            }
            this.firstEmission = j4 - j3;
        } else {
            this.firstEmission = j4;
        }
        this.index = j2 + 1;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.wip.decrementAndGet() == 0 && this.cancelled) {
            this.upstream.dispose();
        }
    }
}
