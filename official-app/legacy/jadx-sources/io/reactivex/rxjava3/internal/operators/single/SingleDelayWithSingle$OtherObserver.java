package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.cvf;
import com.oplus.aiunit.vision.l6h;
import com.oplus.aiunit.vision.s6h;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleDelayWithSingle$OtherObserver<T, U> extends AtomicReference<a> implements l6h<U>, a {
    private static final long serialVersionUID = -8565274649390031272L;
    final l6h<? super T> downstream;
    final s6h<T> source;

    public SingleDelayWithSingle$OtherObserver(l6h<? super T> l6hVar, s6h<T> s6hVar) {
        this.downstream = l6hVar;
        this.source = s6hVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(U u) {
        this.source.b(new cvf(this, this.downstream));
    }
}
