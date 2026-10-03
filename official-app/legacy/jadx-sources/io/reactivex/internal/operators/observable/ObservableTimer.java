package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableTimer extends kbd<Long> {
    public final zeg i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20488j;
    public final TimeUnit k;

    public static final class TimerObserver extends AtomicReference<cv5> implements cv5, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final bed<? super Long> downstream;

        public TimerObserver(bed<? super Long> bedVar) {
            this.downstream = bedVar;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onComplete();
        }

        public void setResource(cv5 cv5Var) {
            DisposableHelper.trySet(this, cv5Var);
        }
    }

    public ObservableTimer(long j2, TimeUnit timeUnit, zeg zegVar) {
        this.f20488j = j2;
        this.k = timeUnit;
        this.i = zegVar;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super Long> bedVar) {
        TimerObserver timerObserver = new TimerObserver(bedVar);
        bedVar.onSubscribe(timerObserver);
        timerObserver.setResource(this.i.d(timerObserver, this.f20488j, this.k));
    }
}
