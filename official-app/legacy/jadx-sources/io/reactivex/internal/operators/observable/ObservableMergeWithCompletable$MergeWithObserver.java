package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.zf8;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableMergeWithCompletable$MergeWithObserver<T> extends AtomicInteger implements bed<T>, cv5 {
    private static final long serialVersionUID = -4592979584110982903L;
    final bed<? super T> downstream;
    volatile boolean mainDone;
    volatile boolean otherDone;
    final AtomicReference<cv5> mainDisposable = new AtomicReference<>();
    final OtherObserver otherObserver = new OtherObserver(this);
    final AtomicThrowable error = new AtomicThrowable();

    public static final class OtherObserver extends AtomicReference<cv5> implements bs3 {
        private static final long serialVersionUID = -2935427570954647017L;
        final ObservableMergeWithCompletable$MergeWithObserver<?> parent;

        public OtherObserver(ObservableMergeWithCompletable$MergeWithObserver<?> observableMergeWithCompletable$MergeWithObserver) {
            this.parent = observableMergeWithCompletable$MergeWithObserver;
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onComplete() {
            this.parent.otherComplete();
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onError(Throwable th) {
            this.parent.otherError(th);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public ObservableMergeWithCompletable$MergeWithObserver(bed<? super T> bedVar) {
        this.downstream = bedVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this.mainDisposable);
        DisposableHelper.dispose(this.otherObserver);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.mainDisposable.get());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.mainDone = true;
        if (this.otherDone) {
            zf8.a(this.downstream, this, this.error);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        DisposableHelper.dispose(this.mainDisposable);
        zf8.c(this.downstream, th, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        zf8.e(this.downstream, t, this, this.error);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this.mainDisposable, cv5Var);
    }

    public void otherComplete() {
        this.otherDone = true;
        if (this.mainDone) {
            zf8.a(this.downstream, this, this.error);
        }
    }

    public void otherError(Throwable th) {
        DisposableHelper.dispose(this.mainDisposable);
        zf8.c(this.downstream, th, this, this.error);
    }
}
