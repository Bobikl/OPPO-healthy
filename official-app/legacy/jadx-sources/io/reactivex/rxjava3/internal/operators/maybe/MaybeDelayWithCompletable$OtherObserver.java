package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import com.oplus.aiunit.vision.znb;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeDelayWithCompletable$OtherObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements as3, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 703409937383992161L;
    final lob<? super T> downstream;
    final pob<T> source;

    public MaybeDelayWithCompletable$OtherObserver(lob<? super T> lobVar, pob<T> pobVar) {
        this.downstream = lobVar;
        this.source = pobVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        this.source.a(new znb(this, this.downstream));
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (DisposableHelper.setOnce(this, aVar)) {
            this.downstream.onSubscribe(this);
        }
    }
}
