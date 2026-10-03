package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableDoFinally$DoFinallyObserver extends AtomicInteger implements bs3, cv5 {
    private static final long serialVersionUID = 4109457741734051389L;
    final bs3 downstream;
    final eo onFinally;
    cv5 upstream;

    public CompletableDoFinally$DoFinallyObserver(bs3 bs3Var, eo eoVar) {
        this.downstream = bs3Var;
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

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        this.downstream.onComplete();
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.downstream.onError(th);
        runFinally();
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            this.downstream.onSubscribe(this);
        }
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
