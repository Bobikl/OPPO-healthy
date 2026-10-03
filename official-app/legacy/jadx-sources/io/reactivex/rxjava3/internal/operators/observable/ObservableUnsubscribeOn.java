package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableUnsubscribeOn<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cfg f20597j;

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements aed<T>, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 1015244841293359600L;
        final aed<? super T> downstream;
        final cfg scheduler;
        io.reactivex.rxjava3.disposables.a upstream;

        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeObserver.this.upstream.dispose();
            }
        }

        public UnsubscribeObserver(aed<? super T> aedVar, cfg cfgVar) {
            this.downstream = aedVar;
            this.scheduler = cfgVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.scheduler.g(new a());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (get()) {
                g4g.u(th);
            } else {
                this.downstream.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.upstream, aVar)) {
                this.upstream = aVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableUnsubscribeOn(jdd<T> jddVar, cfg cfgVar) {
        super(jddVar);
        this.f20597j = cfgVar;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new UnsubscribeObserver(aedVar, this.f20597j));
    }
}
