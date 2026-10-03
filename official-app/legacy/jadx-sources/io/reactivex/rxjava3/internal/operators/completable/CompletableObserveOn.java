package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.pr3;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CompletableObserveOn extends pr3 {
    public final ds3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cfg f20518j;

    public static final class ObserveOnCompletableObserver extends AtomicReference<a> implements as3, a, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final as3 downstream;
        Throwable error;
        final cfg scheduler;

        public ObserveOnCompletableObserver(as3 as3Var, cfg cfgVar) {
            this.downstream = as3Var;
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

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.g(this));
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            this.error = th;
            DisposableHelper.replace(this, this.scheduler.g(this));
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(a aVar) {
            if (DisposableHelper.setOnce(this, aVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th == null) {
                this.downstream.onComplete();
            } else {
                this.error = null;
                this.downstream.onError(th);
            }
        }
    }

    public CompletableObserveOn(ds3 ds3Var, cfg cfgVar) {
        this.i = ds3Var;
        this.f20518j = cfgVar;
    }

    @Override // com.oplus.aiunit.vision.pr3
    public void k(as3 as3Var) {
        this.i.a(new ObserveOnCompletableObserver(as3Var, this.f20518j));
    }
}
