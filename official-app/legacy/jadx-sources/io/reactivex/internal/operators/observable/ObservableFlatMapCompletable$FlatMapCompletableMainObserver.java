package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.ys3;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableFlatMapCompletable$FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements bed<T> {
    private static final long serialVersionUID = 8443155186132538303L;
    final boolean delayErrors;
    volatile boolean disposed;
    final bed<? super T> downstream;
    final j08<? super T, ? extends es3> mapper;
    cv5 upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final ys3 set = new ys3();

    public final class InnerObserver extends AtomicReference<cv5> implements bs3, cv5 {
        private static final long serialVersionUID = 8606673141535671828L;

        public InnerObserver() {
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onComplete() {
            ObservableFlatMapCompletable$FlatMapCompletableMainObserver.this.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onError(Throwable th) {
            ObservableFlatMapCompletable$FlatMapCompletableMainObserver.this.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public ObservableFlatMapCompletable$FlatMapCompletableMainObserver(bed<? super T> bedVar, j08<? super T, ? extends es3> j08Var, boolean z) {
        this.downstream = bedVar;
        this.mapper = j08Var;
        this.delayErrors = z;
        lazySet(1);
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public void clear() {
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.disposed = true;
        this.upstream.dispose();
        this.set.dispose();
    }

    public void innerComplete(ObservableFlatMapCompletable$FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
        this.set.b(innerObserver);
        onComplete();
    }

    public void innerError(ObservableFlatMapCompletable$FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, Throwable th) {
        this.set.b(innerObserver);
        onError(th);
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (decrementAndGet() == 0) {
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != null) {
                this.downstream.onError(thTerminate);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (this.delayErrors) {
            if (decrementAndGet() == 0) {
                this.downstream.onError(this.errors.terminate());
                return;
            }
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            this.downstream.onError(this.errors.terminate());
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        try {
            es3 es3Var = (es3) abd.d(this.mapper.apply(t), "The mapper returned a null CompletableSource");
            getAndIncrement();
            InnerObserver innerObserver = new InnerObserver();
            if (this.disposed || !this.set.a(innerObserver)) {
                return;
            }
            es3Var.a(innerObserver);
        } catch (Throwable th) {
            iu6.b(th);
            this.upstream.dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
    public T poll() throws Exception {
        return null;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        return i & 2;
    }
}
