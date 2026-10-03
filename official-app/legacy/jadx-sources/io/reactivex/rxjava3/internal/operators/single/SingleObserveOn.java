package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.f5h;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleObserveOn<T> extends f5h<T> {
    public final s6h<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cfg f20616j;

    public static final class ObserveOnSingleObserver<T> extends AtomicReference<a> implements l6h<T>, a, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final l6h<? super T> downstream;
        Throwable error;
        final cfg scheduler;
        T value;

        public ObserveOnSingleObserver(l6h<? super T> l6hVar, cfg cfgVar) {
            this.downstream = l6hVar;
            this.scheduler = cfgVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.g(this));
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(a aVar) {
            if (DisposableHelper.setOnce(this, aVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.value = t;
            DisposableHelper.replace(this, this.scheduler.g(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onSuccess(this.value);
            }
        }
    }

    public SingleObserveOn(s6h<T> s6hVar, cfg cfgVar) {
        this.i = s6hVar;
        this.f20616j = cfgVar;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        this.i.b(new ObserveOnSingleObserver(l6hVar, this.f20616j));
    }
}
