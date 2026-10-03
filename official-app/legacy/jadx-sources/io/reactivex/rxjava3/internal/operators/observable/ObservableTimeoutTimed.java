package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.m6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableTimeoutTimed<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20592j;
    public final TimeUnit k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cfg f20593l;
    public final jdd<? extends T> m;

    public static final class TimeoutFallbackObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<T>, io.reactivex.rxjava3.disposables.a, b {
        private static final long serialVersionUID = 3764492702657003550L;
        final aed<? super T> downstream;
        jdd<? extends T> fallback;
        final long timeout;
        final TimeUnit unit;
        final cfg.c worker;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicLong index = new AtomicLong();
        final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream = new AtomicReference<>();

        public TimeoutFallbackObserver(aed<? super T> aedVar, long j2, TimeUnit timeUnit, cfg.c cVar, jdd<? extends T> jddVar) {
            this.downstream = aedVar;
            this.timeout = j2;
            this.unit = timeUnit;
            this.worker = cVar;
            this.fallback = jddVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                g4g.u(th);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            long j2 = this.index.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (this.index.compareAndSet(j2, j3)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    startTimeout(j3);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this.upstream, aVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j2) {
            if (this.index.compareAndSet(j2, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                jdd<? extends T> jddVar = this.fallback;
                this.fallback = null;
                jddVar.subscribe(new a(this.downstream, this));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j2) {
            this.task.replace(this.worker.c(new c(j2, this), this.timeout, this.unit));
        }
    }

    public static final class TimeoutObserver<T> extends AtomicLong implements aed<T>, io.reactivex.rxjava3.disposables.a, b {
        private static final long serialVersionUID = 3764492702657003550L;
        final aed<? super T> downstream;
        final long timeout;
        final TimeUnit unit;
        final cfg.c worker;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream = new AtomicReference<>();

        public TimeoutObserver(aed<? super T> aedVar, long j2, TimeUnit timeUnit, cfg.c cVar) {
            this.downstream = aedVar;
            this.timeout = j2;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                g4g.u(th);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            long j2 = get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (compareAndSet(j2, j3)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t);
                    startTimeout(j3);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this.upstream, aVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableTimeoutTimed.b
        public void onTimeout(long j2) {
            if (compareAndSet(j2, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.g(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j2) {
            this.task.replace(this.worker.c(new c(j2, this), this.timeout, this.unit));
        }
    }

    public static final class a<T> implements aed<T> {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.a> f20594j;

        public a(aed<? super T> aedVar, AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference) {
            this.i = aedVar;
            this.f20594j = atomicReference;
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.i.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.replace(this.f20594j, aVar);
        }
    }

    public interface b {
        void onTimeout(long j2);
    }

    public static final class c implements Runnable {
        public final b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f20595j;

        public c(long j2, b bVar) {
            this.f20595j = j2;
            this.i = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.i.onTimeout(this.f20595j);
        }
    }

    public ObservableTimeoutTimed(lbd<T> lbdVar, long j2, TimeUnit timeUnit, cfg cfgVar, jdd<? extends T> jddVar) {
        super(lbdVar);
        this.f20592j = j2;
        this.k = timeUnit;
        this.f20593l = cfgVar;
        this.m = jddVar;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        if (this.m == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(aedVar, this.f20592j, this.k, this.f20593l.c());
            aedVar.onSubscribe(timeoutObserver);
            timeoutObserver.startTimeout(0L);
            this.i.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(aedVar, this.f20592j, this.k, this.f20593l.c(), this.m);
        aedVar.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.startTimeout(0L);
        this.i.subscribe(timeoutFallbackObserver);
    }
}
