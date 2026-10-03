package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kbd;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableWindow$WindowExactObserver<T> extends AtomicInteger implements bed<T>, cv5, Runnable {
    private static final long serialVersionUID = -7481782523886138128L;
    volatile boolean cancelled;
    final int capacityHint;
    final long count;
    final bed<? super kbd<T>> downstream;
    long size;
    cv5 upstream;
    UnicastSubject<T> window;

    public ObservableWindow$WindowExactObserver(bed<? super kbd<T>> bedVar, long j2, int i) {
        this.downstream = bedVar;
        this.count = j2;
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
        UnicastSubject<T> unicastSubject = this.window;
        if (unicastSubject != null) {
            this.window = null;
            unicastSubject.onComplete();
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        UnicastSubject<T> unicastSubject = this.window;
        if (unicastSubject != null) {
            this.window = null;
            unicastSubject.onError(th);
        }
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        UnicastSubject<T> unicastSubjectJ = this.window;
        if (unicastSubjectJ == null && !this.cancelled) {
            unicastSubjectJ = UnicastSubject.J(this.capacityHint, this);
            this.window = unicastSubjectJ;
            this.downstream.onNext(unicastSubjectJ);
        }
        if (unicastSubjectJ != null) {
            unicastSubjectJ.onNext(t);
            long j2 = this.size + 1;
            this.size = j2;
            if (j2 >= this.count) {
                this.size = 0L;
                this.window = null;
                unicastSubjectJ.onComplete();
                if (this.cancelled) {
                    this.upstream.dispose();
                }
            }
        }
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
        if (this.cancelled) {
            this.upstream.dispose();
        }
    }
}
