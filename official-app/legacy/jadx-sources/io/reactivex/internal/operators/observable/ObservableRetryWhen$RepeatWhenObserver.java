package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.r2j;
import com.oplus.aiunit.vision.zf8;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableRetryWhen$RepeatWhenObserver<T> extends AtomicInteger implements bed<T>, cv5 {
    private static final long serialVersionUID = 802743776666017014L;
    volatile boolean active;
    final bed<? super T> downstream;
    final r2j<Throwable> signaller;
    final kdd<T> source;
    final AtomicInteger wip = new AtomicInteger();
    final AtomicThrowable error = new AtomicThrowable();
    final ObservableRetryWhen$RepeatWhenObserver<T>.InnerRepeatObserver inner = new InnerRepeatObserver();
    final AtomicReference<cv5> upstream = new AtomicReference<>();

    public final class InnerRepeatObserver extends AtomicReference<cv5> implements bed<Object> {
        private static final long serialVersionUID = 3254781284376480842L;

        public InnerRepeatObserver() {
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            ObservableRetryWhen$RepeatWhenObserver.this.innerComplete();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            ObservableRetryWhen$RepeatWhenObserver.this.innerError(th);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(Object obj) {
            ObservableRetryWhen$RepeatWhenObserver.this.innerNext();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public ObservableRetryWhen$RepeatWhenObserver(bed<? super T> bedVar, r2j<Throwable> r2jVar, kdd<T> kddVar) {
        this.downstream = bedVar;
        this.signaller = r2jVar;
        this.source = kddVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this.upstream);
        DisposableHelper.dispose(this.inner);
    }

    public void innerComplete() {
        DisposableHelper.dispose(this.upstream);
        zf8.a(this.downstream, this, this.error);
    }

    public void innerError(Throwable th) {
        DisposableHelper.dispose(this.upstream);
        zf8.c(this.downstream, th, this, this.error);
    }

    public void innerNext() {
        subscribeNext();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        DisposableHelper.dispose(this.inner);
        zf8.a(this.downstream, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        DisposableHelper.replace(this.upstream, null);
        this.active = false;
        this.signaller.onNext(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        zf8.e(this.downstream, t, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this.upstream, cv5Var);
    }

    public void subscribeNext() {
        if (this.wip.getAndIncrement() == 0) {
            while (!isDisposed()) {
                if (!this.active) {
                    this.active = true;
                    this.source.subscribe(this);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
