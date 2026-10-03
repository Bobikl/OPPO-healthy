package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import com.oplus.aiunit.vision.ytg;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableThrottleFirstTimed<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20588j;
    public final TimeUnit k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cfg f20589l;

    public static final class DebounceTimedObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<T>, io.reactivex.rxjava3.disposables.a, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        final aed<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final TimeUnit unit;
        io.reactivex.rxjava3.disposables.a upstream;
        final cfg.c worker;

        public DebounceTimedObserver(aed<? super T> aedVar, long j2, TimeUnit timeUnit, cfg.c cVar) {
            this.downstream = aedVar;
            this.timeout = j2;
            this.unit = timeUnit;
            this.worker = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.worker.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.gate) {
                return;
            }
            this.gate = true;
            this.downstream.onNext(t);
            io.reactivex.rxjava3.disposables.a aVar = get();
            if (aVar != null) {
                aVar.dispose();
            }
            DisposableHelper.replace(this, this.worker.c(this, this.timeout, this.unit));
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.upstream, aVar)) {
                this.upstream = aVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }
    }

    public ObservableThrottleFirstTimed(jdd<T> jddVar, long j2, TimeUnit timeUnit, cfg cfgVar) {
        super(jddVar);
        this.f20588j = j2;
        this.k = timeUnit;
        this.f20589l = cfgVar;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new DebounceTimedObserver(new ytg(aedVar), this.f20588j, this.k, this.f20589l.c()));
    }
}
