package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.yf8;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableMergeWithCompletable$MergeWithObserver<T> extends AtomicInteger implements aed<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -4592979584110982903L;
    final aed<? super T> downstream;
    volatile boolean mainDone;
    volatile boolean otherDone;
    final AtomicReference<io.reactivex.rxjava3.disposables.a> mainDisposable = new AtomicReference<>();
    final OtherObserver otherObserver = new OtherObserver(this);
    final AtomicThrowable errors = new AtomicThrowable();

    public static final class OtherObserver extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements as3 {
        private static final long serialVersionUID = -2935427570954647017L;
        final ObservableMergeWithCompletable$MergeWithObserver<?> parent;

        public OtherObserver(ObservableMergeWithCompletable$MergeWithObserver<?> observableMergeWithCompletable$MergeWithObserver) {
            this.parent = observableMergeWithCompletable$MergeWithObserver;
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            this.parent.otherComplete();
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }
    }

    public ObservableMergeWithCompletable$MergeWithObserver(aed<? super T> aedVar) {
        this.downstream = aedVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this.mainDisposable);
        DisposableHelper.dispose(this.otherObserver);
        this.errors.tryTerminateAndReport();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.mainDisposable.get());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.mainDone = true;
        if (this.otherDone) {
            yf8.a(this.downstream, this, this.errors);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.otherObserver);
        yf8.c(this.downstream, th, this, this.errors);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        yf8.e(this.downstream, t, this, this.errors);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this.mainDisposable, aVar);
    }

    public void otherComplete() {
        this.otherDone = true;
        if (this.mainDone) {
            yf8.a(this.downstream, this, this.errors);
        }
    }

    public void otherError(Throwable th) {
        DisposableHelper.dispose(this.mainDisposable);
        yf8.c(this.downstream, th, this, this.errors);
    }
}
