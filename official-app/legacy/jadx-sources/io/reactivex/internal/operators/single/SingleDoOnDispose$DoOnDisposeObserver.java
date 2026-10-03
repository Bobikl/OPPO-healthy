package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.m6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class SingleDoOnDispose$DoOnDisposeObserver<T> extends AtomicReference<eo> implements m6h<T>, cv5 {
    private static final long serialVersionUID = -8583764624474935784L;
    final m6h<? super T> downstream;
    cv5 upstream;

    public SingleDoOnDispose$DoOnDisposeObserver(m6h<? super T> m6hVar, eo eoVar) {
        this.downstream = m6hVar;
        lazySet(eoVar);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        eo andSet = getAndSet(null);
        if (andSet != null) {
            try {
                andSet.run();
            } catch (Throwable th) {
                iu6.b(th);
                h4g.r(th);
            }
            this.upstream.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        this.downstream.onSuccess(t);
    }
}
