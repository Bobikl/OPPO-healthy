package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.g4g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableBufferBoundary$BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<Object>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -8498650778633225126L;
    final long index;
    final ObservableBufferBoundary$BufferBoundaryObserver<T, C, ?, ?> parent;

    public ObservableBufferBoundary$BufferCloseObserver(ObservableBufferBoundary$BufferBoundaryObserver<T, C, ?, ?> observableBufferBoundary$BufferBoundaryObserver, long j2) {
        this.parent = observableBufferBoundary$BufferBoundaryObserver;
        this.index = j2;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        io.reactivex.rxjava3.disposables.a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            lazySet(disposableHelper);
            this.parent.close(this, this.index);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        io.reactivex.rxjava3.disposables.a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper) {
            g4g.u(th);
        } else {
            lazySet(disposableHelper);
            this.parent.boundaryError(this, th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(Object obj) {
        io.reactivex.rxjava3.disposables.a aVar = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            lazySet(disposableHelper);
            aVar.dispose();
            this.parent.close(this, this.index);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }
}
