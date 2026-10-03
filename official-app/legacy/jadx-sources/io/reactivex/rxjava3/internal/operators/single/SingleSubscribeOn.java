package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.f5h;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleSubscribeOn<T> extends f5h<T> {
    public final s6h<? extends T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cfg f20617j;

    public static final class SubscribeOnObserver<T> extends AtomicReference<a> implements l6h<T>, a, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final l6h<? super T> downstream;
        final s6h<? extends T> source;
        final SequentialDisposable task = new SequentialDisposable();

        public SubscribeOnObserver(l6h<? super T> l6hVar, s6h<? extends T> s6hVar) {
            this.downstream = l6hVar;
            this.source = s6hVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.b(this);
        }
    }

    public SingleSubscribeOn(s6h<? extends T> s6hVar, cfg cfgVar) {
        this.i = s6hVar;
        this.f20617j = cfgVar;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(l6hVar, this.i);
        l6hVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.f20617j.g(subscribeOnObserver));
    }
}
