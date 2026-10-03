package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableSubscribeOn<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cfg f20584j;

    public static final class SubscribeOnObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 8094547886072529208L;
        final aed<? super T> downstream;
        final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream = new AtomicReference<>();

        public SubscribeOnObserver(aed<? super T> aedVar) {
            this.downstream = aedVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this.upstream, aVar);
        }

        public void setDisposable(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }
    }

    public final class a implements Runnable {
        public final SubscribeOnObserver<T> i;

        public a(SubscribeOnObserver<T> subscribeOnObserver) {
            this.i = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            ObservableSubscribeOn.this.i.subscribe(this.i);
        }
    }

    public ObservableSubscribeOn(jdd<T> jddVar, cfg cfgVar) {
        super(jddVar);
        this.f20584j = cfgVar;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(aedVar);
        aedVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.setDisposable(this.f20584j.g(new a(subscribeOnObserver)));
    }
}
