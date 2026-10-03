package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.zf8;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableTakeUntil$TakeUntilMainObserver<T, U> extends AtomicInteger implements bed<T>, cv5 {
    private static final long serialVersionUID = 1418547743690811973L;
    final bed<? super T> downstream;
    final AtomicReference<cv5> upstream = new AtomicReference<>();
    final ObservableTakeUntil$TakeUntilMainObserver<T, U>.OtherObserver otherObserver = new OtherObserver();
    final AtomicThrowable error = new AtomicThrowable();

    public final class OtherObserver extends AtomicReference<cv5> implements bed<U> {
        private static final long serialVersionUID = -8693423678067375039L;

        public OtherObserver() {
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            ObservableTakeUntil$TakeUntilMainObserver.this.otherComplete();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            ObservableTakeUntil$TakeUntilMainObserver.this.otherError(th);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(U u) {
            DisposableHelper.dispose(this);
            ObservableTakeUntil$TakeUntilMainObserver.this.otherComplete();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public ObservableTakeUntil$TakeUntilMainObserver(bed<? super T> bedVar) {
        this.downstream = bedVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this.otherObserver);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        DisposableHelper.dispose(this.otherObserver);
        zf8.a(this.downstream, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.otherObserver);
        zf8.c(this.downstream, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        zf8.e(this.downstream, t, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this.upstream, cv5Var);
    }

    public void otherComplete() {
        DisposableHelper.dispose(this.upstream);
        zf8.a(this.downstream, this, this.error);
    }

    public void otherError(Throwable th) {
        DisposableHelper.dispose(this.upstream);
        zf8.c(this.downstream, th, this, this.error);
    }
}
