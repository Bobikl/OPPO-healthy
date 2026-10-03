package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableFlatMapCompletable$FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements aed<T> {
    private static final long serialVersionUID = 8443155186132538303L;
    final boolean delayErrors;
    volatile boolean disposed;
    final aed<? super T> downstream;
    final d08<? super T, ? extends ds3> mapper;
    io.reactivex.rxjava3.disposables.a upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final xs3 set = new xs3();

    public final class InnerObserver extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements as3, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 8606673141535671828L;

        public InnerObserver() {
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            ObservableFlatMapCompletable$FlatMapCompletableMainObserver.this.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            ObservableFlatMapCompletable$FlatMapCompletableMainObserver.this.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }
    }

    public ObservableFlatMapCompletable$FlatMapCompletableMainObserver(aed<? super T> aedVar, d08<? super T, ? extends ds3> d08Var, boolean z) {
        this.downstream = aedVar;
        this.mapper = d08Var;
        this.delayErrors = z;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public void clear() {
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.disposed = true;
        this.upstream.dispose();
        this.set.dispose();
        this.errors.tryTerminateAndReport();
    }

    public void innerComplete(ObservableFlatMapCompletable$FlatMapCompletableMainObserver<T>.InnerObserver innerObserver) {
        this.set.b(innerObserver);
        onComplete();
    }

    public void innerError(ObservableFlatMapCompletable$FlatMapCompletableMainObserver<T>.InnerObserver innerObserver, Throwable th) {
        this.set.b(innerObserver);
        onError(th);
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public boolean isEmpty() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (decrementAndGet() == 0) {
            this.errors.tryTerminateConsumer(this.downstream);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (this.delayErrors) {
                if (decrementAndGet() == 0) {
                    this.errors.tryTerminateConsumer(this.downstream);
                }
            } else {
                this.disposed = true;
                this.upstream.dispose();
                this.set.dispose();
                this.errors.tryTerminateConsumer(this.downstream);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        try {
            ds3 ds3VarApply = this.mapper.apply(t);
            Objects.requireNonNull(ds3VarApply, "The mapper returned a null CompletableSource");
            ds3 ds3Var = ds3VarApply;
            getAndIncrement();
            InnerObserver innerObserver = new InnerObserver();
            if (this.disposed || !this.set.a(innerObserver)) {
                return;
            }
            ds3Var.a(innerObserver);
        } catch (Throwable th) {
            hu6.b(th);
            this.upstream.dispose();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
    public T poll() {
        return null;
    }

    @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.e7f
    public int requestFusion(int i) {
        return i & 2;
    }
}
