package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.b7f;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableDoFinally$DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements bed<T> {
    private static final long serialVersionUID = 4109457741734051389L;
    final bed<? super T> downstream;
    final eo onFinally;
    b7f<T> qd;
    boolean syncFused;
    cv5 upstream;

    public ObservableDoFinally$DoFinallyObserver(bed<? super T> bedVar, eo eoVar) {
        this.downstream = bedVar;
        this.onFinally = eoVar;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public void clear() {
        this.qd.clear();
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.dispose();
        runFinally();
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return this.qd.isEmpty();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.downstream.onComplete();
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.downstream.onError(th);
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            if (cv5Var instanceof b7f) {
                this.qd = (b7f) cv5Var;
            }
            this.downstream.onSubscribe(this);
        }
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public T poll() throws Exception {
        T tPoll = this.qd.poll();
        if (tPoll == null && this.syncFused) {
            runFinally();
        }
        return tPoll;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        b7f<T> b7fVar = this.qd;
        if (b7fVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = b7fVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.syncFused = iRequestFusion == 1;
        }
        return iRequestFusion;
    }

    public void runFinally() {
        if (compareAndSet(0, 1)) {
            try {
                this.onFinally.run();
            } catch (Throwable th) {
                iu6.b(th);
                h4g.r(th);
            }
        }
    }
}
