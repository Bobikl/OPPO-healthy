package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.l6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleDoOnDispose$DoOnDisposeObserver<T> extends AtomicReference<Cdo> implements l6h<T>, a {
    private static final long serialVersionUID = -8583764624474935784L;
    final l6h<? super T> downstream;
    a upstream;

    public SingleDoOnDispose$DoOnDisposeObserver(l6h<? super T> l6hVar, Cdo cdo) {
        this.downstream = l6hVar;
        lazySet(cdo);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        Cdo andSet = getAndSet(null);
        if (andSet != null) {
            try {
                andSet.run();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
            this.upstream.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
