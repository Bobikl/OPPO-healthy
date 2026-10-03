package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.m6h;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class SingleDoFinally$DoFinallyObserver<T> extends AtomicInteger implements m6h<T>, cv5 {
    private static final long serialVersionUID = 4109457741734051389L;
    final m6h<? super T> downstream;
    final eo onFinally;
    cv5 upstream;

    public SingleDoFinally$DoFinallyObserver(m6h<? super T> m6hVar, eo eoVar) {
        this.downstream = m6hVar;
        this.onFinally = eoVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.dispose();
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.downstream.onError(th);
        runFinally();
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
        runFinally();
    }

    public void runFinally() {
        if (compareAndSet(0, 1)) {
            try {
                this.onFinally.run();
            } catch (Throwable th) {
                iu6.b(th);
                h4g.r(th);
            }
        }
    }
}
