package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.g4g;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableTakeUntilCompletable$TakeUntilMainObserver extends AtomicReference<a> implements as3, a {
    private static final long serialVersionUID = 3533011714830024923L;
    final as3 downstream;
    final OtherObserver other = new OtherObserver(this);
    final AtomicBoolean once = new AtomicBoolean();

    public static final class OtherObserver extends AtomicReference<a> implements as3 {
        private static final long serialVersionUID = 5176264485428790318L;
        final CompletableTakeUntilCompletable$TakeUntilMainObserver parent;

        public OtherObserver(CompletableTakeUntilCompletable$TakeUntilMainObserver completableTakeUntilCompletable$TakeUntilMainObserver) {
            this.parent = completableTakeUntilCompletable$TakeUntilMainObserver;
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            this.parent.innerComplete();
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }
    }

    public CompletableTakeUntilCompletable$TakeUntilMainObserver(as3 as3Var) {
        this.downstream = as3Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
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
            g4g.u(th);
        } else {
            DisposableHelper.dispose(this);
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.once.get();
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            DisposableHelper.dispose(this.other);
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        if (!this.once.compareAndSet(false, true)) {
            g4g.u(th);
        } else {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }
}
