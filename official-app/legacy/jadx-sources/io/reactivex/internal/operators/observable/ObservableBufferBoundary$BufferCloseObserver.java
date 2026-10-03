package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableBufferBoundary$BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<cv5> implements bed<Object>, cv5 {
    private static final long serialVersionUID = -8498650778633225126L;
    final long index;
    final ObservableBufferBoundary$BufferBoundaryObserver<T, C, ?, ?> parent;

    public ObservableBufferBoundary$BufferCloseObserver(ObservableBufferBoundary$BufferBoundaryObserver<T, C, ?, ?> observableBufferBoundary$BufferBoundaryObserver, long j2) {
        this.parent = observableBufferBoundary$BufferBoundaryObserver;
        this.index = j2;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var != disposableHelper) {
            lazySet(disposableHelper);
            this.parent.close(this, this.index);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper) {
            h4g.r(th);
        } else {
            lazySet(disposableHelper);
            this.parent.boundaryError(this, th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(Object obj) {
        cv5 cv5Var = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var != disposableHelper) {
            lazySet(disposableHelper);
            cv5Var.dispose();
            this.parent.close(this, this.index);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
