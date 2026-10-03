package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.n6;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableSubscribeOn<T> extends n6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zeg f20486j;

    public static final class SubscribeOnObserver<T> extends AtomicReference<cv5> implements bed<T>, cv5 {
        private static final long serialVersionUID = 8094547886072529208L;
        final bed<? super T> downstream;
        final AtomicReference<cv5> upstream = new AtomicReference<>();

        public SubscribeOnObserver(bed<? super T> bedVar) {
            this.downstream = bedVar;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this.upstream, cv5Var);
        }

        public void setDisposable(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
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

    public ObservableSubscribeOn(kdd<T> kddVar, zeg zegVar) {
        super(kddVar);
        this.f20486j = zegVar;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(bedVar);
        bedVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.setDisposable(this.f20486j.c(new a(subscribeOnObserver)));
    }
}
