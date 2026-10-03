package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableUnsubscribeOn$UnsubscribeObserver<T> extends AtomicBoolean implements bed<T>, cv5 {
    private static final long serialVersionUID = 1015244841293359600L;
    final bed<? super T> downstream;
    final zeg scheduler;
    cv5 upstream;

    public final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ObservableUnsubscribeOn$UnsubscribeObserver.this.upstream.dispose();
        }
    }

    public ObservableUnsubscribeOn$UnsubscribeObserver(bed<? super T> bedVar, zeg zegVar) {
        this.downstream = bedVar;
        this.scheduler = zegVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (compareAndSet(false, true)) {
            this.scheduler.c(new a());
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (get()) {
            return;
        }
        this.downstream.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (get()) {
            h4g.r(th);
        } else {
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (get()) {
            return;
        }
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }
}
