package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.f5h;
import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleTimer extends f5h<Long> {
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimeUnit f20618j;
    public final cfg k;

    public static final class TimerDisposable extends AtomicReference<a> implements a, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final l6h<? super Long> downstream;

        public TimerDisposable(l6h<? super Long> l6hVar) {
            this.downstream = l6hVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.downstream.onSuccess(0L);
        }

        public void setFuture(a aVar) {
            DisposableHelper.replace(this, aVar);
        }
    }

    public SingleTimer(long j2, TimeUnit timeUnit, cfg cfgVar) {
        this.i = j2;
        this.f20618j = timeUnit;
        this.k = cfgVar;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super Long> l6hVar) {
        TimerDisposable timerDisposable = new TimerDisposable(l6hVar);
        l6hVar.onSubscribe(timerDisposable);
        timerDisposable.setFuture(this.k.h(timerDisposable, this.i, this.f20618j));
    }
}
