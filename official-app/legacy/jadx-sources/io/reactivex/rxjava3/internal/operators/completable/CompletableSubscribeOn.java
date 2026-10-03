package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.pr3;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CompletableSubscribeOn extends pr3 {
    public final ds3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cfg f20519j;

    public static final class SubscribeOnObserver extends AtomicReference<a> implements as3, a, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final as3 downstream;
        final ds3 source;
        final SequentialDisposable task = new SequentialDisposable();

        public SubscribeOnObserver(as3 as3Var, ds3 ds3Var) {
            this.downstream = as3Var;
            this.source = ds3Var;
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

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.a(this);
        }
    }

    public CompletableSubscribeOn(ds3 ds3Var, cfg cfgVar) {
        this.i = ds3Var;
        this.f20519j = cfgVar;
    }

    @Override // com.oplus.aiunit.vision.pr3
    public void k(as3 as3Var) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(as3Var, this.i);
        as3Var.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.f20519j.g(subscribeOnObserver));
    }
}
