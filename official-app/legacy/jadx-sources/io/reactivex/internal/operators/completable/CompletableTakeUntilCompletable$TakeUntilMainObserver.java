package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableTakeUntilCompletable$TakeUntilMainObserver extends AtomicReference<cv5> implements bs3, cv5 {
    private static final long serialVersionUID = 3533011714830024923L;
    final bs3 downstream;
    final OtherObserver other = new OtherObserver(this);
    final AtomicBoolean once = new AtomicBoolean();

    public static final class OtherObserver extends AtomicReference<cv5> implements bs3 {
        private static final long serialVersionUID = 5176264485428790318L;
        final CompletableTakeUntilCompletable$TakeUntilMainObserver parent;

        public OtherObserver(CompletableTakeUntilCompletable$TakeUntilMainObserver completableTakeUntilCompletable$TakeUntilMainObserver) {
            this.parent = completableTakeUntilCompletable$TakeUntilMainObserver;
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onComplete() {
            this.parent.innerComplete();
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public CompletableTakeUntilCompletable$TakeUntilMainObserver(bs3 bs3Var) {
        this.downstream = bs3Var;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.other);
        }
    }

    public void innerComplete() {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this);
            this.downstream.onComplete();
        }
    }

    public void innerError(Throwable th) {
        if (!this.once.compareAndSet(false, true)) {
            h4g.r(th);
        } else {
            DisposableHelper.dispose(this);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.once.get();
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.other);
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        if (!this.once.compareAndSet(false, true)) {
            h4g.r(th);
        } else {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
