package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import com.oplus.aiunit.vision.yf8;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableTakeUntil<T, U> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jdd<? extends U> f20587j;

    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 1418547743690811973L;
        final aed<? super T> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream = new AtomicReference<>();
        final TakeUntilMainObserver<T, U>.OtherObserver otherObserver = new OtherObserver();
        final AtomicThrowable error = new AtomicThrowable();

        public final class OtherObserver extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public OtherObserver() {
            }

            @Override // com.oplus.aiunit.vision.aed
            public void onComplete() {
                TakeUntilMainObserver.this.otherComplete();
            }

            @Override // com.oplus.aiunit.vision.aed
            public void onError(Throwable th) {
                TakeUntilMainObserver.this.otherError(th);
            }

            @Override // com.oplus.aiunit.vision.aed
            public void onNext(U u) {
                DisposableHelper.dispose(this);
                TakeUntilMainObserver.this.otherComplete();
            }

            @Override // com.oplus.aiunit.vision.aed
            public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
                DisposableHelper.setOnce(this, aVar);
            }
        }

        public TakeUntilMainObserver(aed<? super T> aedVar) {
            this.downstream = aedVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            DisposableHelper.dispose(this.otherObserver);
            yf8.a(this.downstream, this, this.error);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.otherObserver);
            yf8.c(this.downstream, th, this, this.error);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            yf8.e(this.downstream, t, this, this.error);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this.upstream, aVar);
        }

        public void otherComplete() {
            DisposableHelper.dispose(this.upstream);
            yf8.a(this.downstream, this, this.error);
        }

        public void otherError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
            yf8.c(this.downstream, th, this, this.error);
        }
    }

    public ObservableTakeUntil(jdd<T> jddVar, jdd<? extends U> jddVar2) {
        super(jddVar);
        this.f20587j = jddVar2;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(aedVar);
        aedVar.onSubscribe(takeUntilMainObserver);
        this.f20587j.subscribe(takeUntilMainObserver.otherObserver);
        this.i.subscribe(takeUntilMainObserver);
    }
}
