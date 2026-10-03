package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import com.oplus.aiunit.vision.ytg;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableSampleTimed<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20581j;
    public final TimeUnit k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cfg f20582l;
    public final boolean m;

    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        public SampleTimedEmitLast(aed<? super T> aedVar, long j2, TimeUnit timeUnit, cfg cfgVar) {
            super(aedVar, j2, timeUnit, cfgVar);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public SampleTimedNoLast(aed<? super T> aedVar, long j2, TimeUnit timeUnit, cfg cfgVar) {
            super(aedVar, j2, timeUnit, cfgVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void complete() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements aed<T>, io.reactivex.rxjava3.disposables.a, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final aed<? super T> downstream;
        final long period;
        final cfg scheduler;
        final AtomicReference<io.reactivex.rxjava3.disposables.a> timer = new AtomicReference<>();
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.a upstream;

        public SampleTimedObserver(aed<? super T> aedVar, long j2, TimeUnit timeUnit, cfg cfgVar) {
            this.downstream = aedVar;
            this.period = j2;
            this.unit = timeUnit;
            this.scheduler = cfgVar;
        }

        public void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        public abstract void complete();

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            cancelTimer();
            this.upstream.dispose();
        }

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            cancelTimer();
            complete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.upstream, aVar)) {
                this.upstream = aVar;
                this.downstream.onSubscribe(this);
                cfg cfgVar = this.scheduler;
                long j2 = this.period;
                DisposableHelper.replace(this.timer, cfgVar.j(this, j2, j2, this.unit));
            }
        }
    }

    public ObservableSampleTimed(jdd<T> jddVar, long j2, TimeUnit timeUnit, cfg cfgVar, boolean z) {
        super(jddVar);
        this.f20581j = j2;
        this.k = timeUnit;
        this.f20582l = cfgVar;
        this.m = z;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        ytg ytgVar = new ytg(aedVar);
        if (this.m) {
            this.i.subscribe(new SampleTimedEmitLast(ytgVar, this.f20581j, this.k, this.f20582l));
        } else {
            this.i.subscribe(new SampleTimedNoLast(ytgVar, this.f20581j, this.k, this.f20582l));
        }
    }
}
