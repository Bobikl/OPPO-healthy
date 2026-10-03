package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableDoFinally$DoFinallyObserver extends AtomicInteger implements as3, a {
    private static final long serialVersionUID = 4109457741734051389L;
    final as3 downstream;
    final Cdo onFinally;
    a upstream;

    public CompletableDoFinally$DoFinallyObserver(as3 as3Var, Cdo cdo) {
        this.downstream = as3Var;
        this.onFinally = cdo;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.upstream.dispose();
        runFinally();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        this.downstream.onComplete();
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        this.downstream.onError(th);
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            this.downstream.onSubscribe(this);
        }
    }

    public void runFinally() {
        if (compareAndSet(0, 1)) {
            try {
                this.onFinally.run();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }
    }
}
